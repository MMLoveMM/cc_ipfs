/**
 * 交易管理
 */
var RoleManagement = RoleManagement || {};
/**
 * jqgrid对象
 */
RoleManagement.jqgrid = RoleManagement.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
RoleManagement.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
RoleManagement.jqgrid.init = function () {
	var thisObject = RoleManagement.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '角色名称', name : 'name',index : 'name',align : 'center'},
		{label : '角色类别', name : 'dname',index : 'dname',align : 'center'},
		{label : '状态', name : 'status',index : 'status',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				if(cellvalue == '01'){
					return "启用";
				}else{
					return "禁用";
				}
			}
		
		},
		{label : '创建时间', name : 'cdate',index : 'cdate',align : 'center'},
		{label : '操作', name : 'operating',index : 'operating',align : 'left',
			formatter : function (cellvalue, options, rowObject) {
				var modRoles = "<button class='btn btn-xs btn-success openbtn' onclick=\"RoleManagement.modRoles('" + rowObject.id + "')\">修改</button>";
				var delRoles = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"RoleManagement.delRoles('" + rowObject.id + "')\">删除</button>"
				var assignRoles = "<button class='btn btn-xs btn-warning openbtn' onclick=\"RoleManagement.assignRoles('" + rowObject.id + "')\">分配人员</button>"
				var assignFunc = "<button class='btn btn-xs btn-primary openbtn' onclick=\"RoleManagement.assignFunc('" + rowObject.id + "')\">分配功能</button>"
				return '<div class="btn-group btn-group-sm">' + modRoles + delRoles + assignFunc + '</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/system/roleManagement/list/get",
		p_tableName : "角色信息管理",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"添加 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   $("#addRoleModal").modal('show');
		   },
		   position:"last"
	})
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
RoleManagement.jqgrid.loadData = function (data) {
	var thisObject = RoleManagement.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = RoleManagement.jqgrid;
	thisObject.$tableSelector.setGridParam({
		mtype : "POST",
		datatype : "json",
		postData : data,
		page : 1
	}).trigger("reloadGrid");
}
/**
 * 清除搜索条件
 */
RoleManagement.jqgrid.clearSearch = function () {
	var thisObject = RoleManagement.jqgrid;
	var oriData = thisObject.$tableSelector.jqGrid("getGridParam", "postData");
	var colms = thisObject.$tableSelector.jqGrid("getGridParam", "colModel");
		colms.push({"name" : "flow_no"});
		colms.push({"name" : "startDate"});
		colms.push({"name" : "endDate"});
		colms.push({"name" : "mer_id"});
		colms.push({"name" : "serviceId"});
		colms.push({"name" : "pay_status"});
	$.each(colms, function (k, v) {
        delete oriData[v.name];
    });
}

/**
 * 刷新jqgrid
 */
RoleManagement.jqgrid.reload = function () {
	var thisObject = RoleManagement.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}



/**
 * 添加角色 绑定jquery validate
 */
RoleManagement.initAddRoleFormValidate = function () {
    $("#addRoleForm").validate({
        rules : {
        	name : {required : true},
        	rtype : {required : true},
        },
        messages : {
        	name : {required : "角色名称不能为空"},
        	rtype : {required : "角色类别不能为空"},
        },
        focusCleanup : true,
        focusInvalid : false,
        errorPlacement : function(error, element) {
            if ($(error).html() == "") {
                return;
            }
            $(element).parent().find(".error-tips").html(error.html());
        },
        success : function(error, element) {
            $(element).parent().find(".error-tips").html("");
        }
    });
}

/**
 * 开始添加角色
 */
RoleManagement.addRole = function () {
    var result = $("#addRoleForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认添加?",function(result){	
    	if(!result) {
    		return ;
    	}
	    $.ajax({
	        url: Global.appCtx + '/system/roleManagement/addRole',
	        type: 'post',
	        data: $("#addRoleForm").serialize(),
	        dataType: 'json',
	        success: function (data) {
	        	if(data.msg == '1'){
	        		bootbox.alert("角色名称已存在,请更换角色名称!");
	        		return false;
	        	}
	            if (data.res != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("添加成功", function () {
	            	location.reload();
	            });
	        },
	        error : function () {
	            bootbox.alert("添加角色信息异常");
	        }
	    });
    });
}

/**
 * 修改角色 绑定jquery validate
 */
RoleManagement.initModRoleFormValidate = function () {
    $("#modRoleForm").validate({
        rules : {
        	name : {required : true},
        	rtype : {required : true},
        	status : {required : true},
        },
        messages : {
        	name : {required : "角色名称不能为空"},
        	rtype : {required : "角色类别不能为空"},
        	status : {required : "状态不能为空"},
        },
        focusCleanup : true,
        focusInvalid : false,
        errorPlacement : function(error, element) {
            if ($(error).html() == "") {
                return;
            }
            $(element).parent().find(".error-tips").html(error.html());
        },
        success : function(error, element) {
            $(element).parent().find(".error-tips").html("");
        }
    });
}

/**
 * 获取修改角色数据
 */
RoleManagement.modRoles = function (id) {
	$.ajax({
        url: Global.appCtx + '/system/roleManagement/getModRole',
        type: 'post',
        data: {'roleId' : id},
        dataType: 'json',
        success: function (data) {
        	if(data == '' || data == undefined) {
        		return false;
        	}
        	$("#roleId").val(data.id);
            $("#modName").val(data.name);
            $("#modRtype").val(data.rtype);
            $("#modStatus").val(data.status);
            $("#modNote").val(data.note);
            $("#modRoleModal").modal('show');
        },
        error : function () {
            bootbox.alert("获取角色信息异常");
        }
    });
}

/**
 * 开始修改角色信息 action
 */
RoleManagement.modRole = function(){
	var result = $("#modRoleForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认修改?",function(result){	
    	if(!result) {
    		return ;
    	}
		$.ajax({
	        url: Global.appCtx + '/system/roleManagement/modRole',
	        type: 'post',
	        data: $("#modRoleForm").serialize(),
	        dataType: 'json',
	        success: function (data) {
	        	 if(data.msg == '1'){
	        		 bootbox.alert("角色名称已存在,请更换角色名称");
		             return false;
	        	 }
	        	 if(data.res != 0) {
		                bootbox.alert(data);
		                return false;
		         }
		         	bootbox.alert("修改成功", function () {
		            	location.reload();
		         });
	        },
	        error : function () {
	            bootbox.alert("修改角色信息异常");
	        }
	    });
    });
}

/**
 * 删除角色
 */
RoleManagement.delRoles = function(id){
	bootbox.confirm("确认删除?",function(result){	
    	if(!result) {
    		return ;
    	}
	    $.ajax({
	        url: Global.appCtx + '/system/roleManagement/delRole',
	        type: 'post',
	        data: {'roleId' : id},
	        dataType: 'json',
	        success: function (data) {
	        	if(data.msg == 1){
	        		bootbox.alert("角色信息已被使用,未能删除");
	        		return false;
	        	}
	            if(data.res != 0 ){
	            	bootbox.alert(data);
	            	return false;
	            }
	            bootbox.alert("删除成功", function () {
	            	RoleManagement.jqgrid.reload();
	 	         });
	        },
	        error : function () {
	            bootbox.alert("删除角色信息异常");
	        }
	    });
    });
}

/**
 * 分配用户
 */
RoleManagement.assignRoles = function(id){
     //展示分配用户模态框
	 $("#assignModal").modal('show');
	 var treeObj = $.fn.zTree.getZTreeObj("tree");
	 //将所有选中的节点设置为未选中的状态
	 treeObj.checkAllNodes(false);
	 
	 $("#assignRoleId").val(id);
	 //根据roleId回显该角色下的用户信息
	 $.ajax({
		 url: Global.appCtx + '/system/roleManagement/showUserInfo',
	        type: 'post',
	        data: {'roleId' : id},
	        dataType: 'json',
	        success: function (data) {
	        	var userId = "";
	        	$.each(data,function(index,val){
	        		userId += val.userId + "," 
	        	})
	        	userId = userId.substring(0,userId.length-1);
	        	var uId = userId.split(",");
	        	for(var i=0;i<uId.length;i++){
	        		var node = treeObj.getNodeByParam("id", uId[i], null);
	        		if(node !=null){
	        			treeObj.checkNode(node, true, true)
	        		}
	        	}
	        },
	        error : function () {
	            bootbox.alert("获取角色下用户信息异常");
	        }
	 })
	
}

/**
 * 执行分配角色
 */
RoleManagement.sureAssignRoles = function(){
	var treeObj = $.fn.zTree.getZTreeObj("tree");
	var roleId = $("#assignRoleId").val();
	var userIds = '';
	 //获取所有被选中的节点
	var children = treeObj.getCheckedNodes(true);
	//至少选中一个节点
	if(children.length > 1){
		for(var  i=0; i<children.length; i++){
			//如果为最底层节点
			if(!children[i].isParent){
				var id = children[i].id;
				userIds = userIds + id + ",";
			}
		}
		//提交
		 $.ajax({
		        url: Global.appCtx + '/system/roleManagement/assignUser',
		        type: 'post',
		        data: {'roleId' : roleId,
		        	   'userId': userIds
		        },
		        dataType: 'json',
		        success: function (data) {
		            if(data != 0){
		            	bootbox.alert(data);
		            	return false;
		            }
		            bootbox.alert("分配人员成功", function () {
		            	location.reload();
		 	         });
		        },
		        error : function () {
		            bootbox.alert("分配人员信息异常");
		            return false;
		        }
		    });
		
		
	}else{
		bootbox.alert("系统提示:请选择人员!");
		return false;
	}
	
}

/**
 * 分配功能
 */
RoleManagement.assignFunc = function(id){
	//展示分配功能模态框
	 $("#assignFunModal").modal('show');
	 
	 var treeObj = $.fn.zTree.getZTreeObj("funZtree");
	 //将所有选中的节点设置为未选中的状态
	 treeObj.checkAllNodes(false);
	 
	 $("#assignFunId").val(id);
	 //根据roleId回显该角色下的菜单信息
	 $.ajax({
		 url: Global.appCtx + '/system/roleManagement/showRoleFunInfo',
	        type: 'post',
	        data: {'roleId' : id},
	        dataType: 'json',
	        success: function (data) {
	        	var funId = "";
	        	$.each(data,function(index,val){
	        		funId += val.funId + "," 
	        	})
	        	funId = funId.substring(0,funId.length-1);
	        	var fId = funId.split(",");
	        	for(var i=0;i<fId.length;i++){
	        		var node = treeObj.getNodeByParam("id", fId[i], null);
	        		if(node !=null){
	        			treeObj.checkNode(node, true, true)
	        		}
	        	}
	        },
	        error : function () {
	            bootbox.alert("获取角色菜单信息异常");
	        }
	 })
}

/**
 * 执行分配功能
 */
RoleManagement.sureAssignFun = function(){
	var treeObj = $.fn.zTree.getZTreeObj("funZtree");
	var roleId = $("#assignFunId").val();
	var funIds = '';
	 //获取所有被选中的节点
	var children = treeObj.getCheckedNodes(true);
	if(children.length > 1){
		for(var  i=0; i<children.length; i++){
				var id = children[i].id;
				funIds = funIds + id + ",";
		}
	}
	//提交 
	 $.ajax({
	        url: Global.appCtx + '/system/roleManagement/assignFun',
	        type: 'post',
	        data: {'roleId' : roleId,
	        	   'funId': funIds
	        },
	        dataType: 'json',
	        success: function (data) {
	            if(data != 0 ){
	            	bootbox.alert(data);
	            	return false;
	            }
	            bootbox.alert("分配功能成功", function () {
	            	location.reload();
	 	         });
	        },
	        error : function () {
	            bootbox.alert("分配功能信息异常");
	            return false;
	        }
	    });
}





/**
 * 展开分配人员---所有节点
 */
function onAsyncSuccess(event, treeId, treeNode, msg) {  
    curAsyncCount--;  
    if (curStatus == "expand") {  
        expandNodes(treeNode.children);  
    } else if (curStatus == "async") {  
        asyncNodes(treeNode.children);  
    }  

    if (curAsyncCount <= 0) {  
        curStatus = "";  
    }  
}  

var curStatus = "init", curAsyncCount = 0, goAsync = false;  
function expandAll() {  
    if (!check()) {  
        return;  
    }  
    var zTree = $.fn.zTree.getZTreeObj("tree");  
    expandNodes(zTree.getNodes());  
    if (!goAsync) {  
        curStatus = "";  
    }  
}  

/**
 * 递归
 * @param nodes
 * @returns
 */
function expandNodes(nodes) {  
    if (!nodes) return;  
    curStatus = "expand";  
    var zTree = $.fn.zTree.getZTreeObj("tree");  
    for (var i=0, l=nodes.length; i<l; i++) {  
    	zTree.expandNode(nodes[i], true, false, false);//展开节点就会调用后台查询子节点  
        if (nodes[i].isParent && nodes[i].zAsync) {  
            expandNodes(nodes[i].children);//递归  
        } else {  
            goAsync = true;  
        }  
    }  
}  

function check() {  
    if (curAsyncCount > 0) {  
        return false;  
    }  
    return true;  
}  

/**
 * 展开分配功能--全部节点
 * 
 */
function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {  
    curAsyncCount--;  
    if (curStatus == "expand") {  
        expandNodes(treeNode.children);  
    } else if (curStatus == "async") {  
        asyncNodes(treeNode.children);  
    }  

    if (curAsyncCount <= 0) {  
        curStatus = "";  
    }  
}  

var curStatus = "init", curAsyncCount = 0, goAsync = false;  
function expandFunAll() {  
    if (!check()) {  
        return;  
    }  
    var zTree = $.fn.zTree.getZTreeObj("funZtree");  
    expandFunNodes(zTree.getNodes());  
    if (!goAsync) {  
        curStatus = "";  
    }  
}  

/**
 * 递归
 * @param nodes
 * @returns
 */
function expandFunNodes(nodes) {  
    if (!nodes) return;  
    curStatus = "expand";  
    var zTree = $.fn.zTree.getZTreeObj("funZtree");  
    for (var i=0, l=nodes.length; i<l; i++) {  
    	zTree.expandNode(nodes[i], true, false, false);//展开节点就会调用后台查询子节点  
        if (nodes[i].isParent && nodes[i].zAsync) {  
            expandNodes(nodes[i].children);//递归  
        } else {  
            goAsync = true;  
        }  
    }  
}  

$(function(){
	// 初始化jqgrid
	RoleManagement.jqgrid.init();
	// 初始化 添加角色验证
	RoleManagement.initAddRoleFormValidate();
	// 初始化 修改角色验证
	RoleManagement.initModRoleFormValidate();
	
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#roleForm").serialize());
		RoleManagement.jqgrid.loadData(filter);
	});
	
	//提交角色分配
	$("#sureAssign").click(function(){
		RoleManagement.sureAssignRoles();
	});
	
	//提交功能分配
	$("#sureAssignFun").click(function(){
		RoleManagement.sureAssignFun();
	});
	
	
	//重置
	$("#search_reset_Btn").click(function(){
//		($("#roleForm")[0]).reset();
		location.reload();
	});

	//添加角色
	$("#sureAdd").click(function() {
		RoleManagement.addRole();
	});
	
	//修改角色
	$("#sureMod").click(function() {
		RoleManagement.modRole();
	});
   
	//设置分配人员zTree全局变量
	var setting = {
			check: {
				enable: true,
				chkStyle :"checkbox"
			},
			callback: {
		        onAsyncSuccess: onAsyncSuccess    
		    },
			async: {
				enable: true,
				url: Global.appCtx +"/system/roleManagement/showZtree",
			},
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pId",
					rootPId: 0
				},
			}
		};
	 //分配人员zTree初始化
	 $.fn.zTree.init($("#tree"), setting);
	 //延迟加载 
	 setTimeout(function(){  
		 expandAll("tree");  
	 },1000);
	 
	 /**
	  * 分配功能ztree配置
	  */
		var setting = {
				check: {
					enable: true,
					chkStyle :"checkbox"
				},
				callback: {
			        onAsyncSuccess: zTreeOnAsyncSuccess      
			    },
				async: {
					enable: true,
					url: Global.appCtx +"/system/roleManagement/showFunZtree",
				},
				data: {
					simpleData: {
						enable: true,
						idKey: "id",
						pIdKey: "pId",
						rootPId: 0
					},
				}
			};
		
	 //分配功能zTree初始化
	 $.fn.zTree.init($("#funZtree"), setting);
	 //延迟加载
	 setTimeout(function(){  
		 expandFunAll("funZtree");  
	 },1000);
});