/**
 * 交易管理
 */
var User = User || {};
/**
 * jqgrid对象
 */
User.jqgrid = User.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
User.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */

User.jqgrid.init = function () {
	var thisObject = User.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '用户编号', name : 'id',index : 'id',align : 'center'},
		{label : '用户账号', name : 'userid',index : 'userid',align : 'left'},
		{label : '用户名', name : 'name',index : 'name',align : 'left'},
		{label : '所属机构', name : 'organsid',index : 'organsid',align : 'left'},
		{label : '手机', name : 'mobile',index : 'mobile',align : 'center'},
		{label : '邮箱', name : 'mail',index : 'mail',align : 'left'},
		{label : '电话', name : 'telephone',index : 'telephone',align : 'center'},
		{label : '传真', name : 'fax',index : 'fax',align : 'center'},
		{label : '状态', name : 'status',index : 'status',align : 'center',
			formatter : function (cellValue, options, rowObject) {
				return cellValue == '0' ? '启用' : cellValue == '1' ? '停用' : cellValue == '2' ? '失效' : '';
			}
		},
		{label : '操作', name : 'myac',index : 'myac',align : 'center',width : '350',
			formatter : function (cellvalue, options, rowObject) {
				var modUser = 	"<button class='btn btn-xs btn-success openbtn' onclick=\"User.modUser('" + rowObject.id + "', '" + rowObject.userid + "', " +
								"'" + rowObject.name + "', '" + rowObject.mobile + "', '" + rowObject.telephone + "', '" + rowObject.fax + "', " +
								"'" + rowObject.mail + "', '" + rowObject.organsid + "', '" + rowObject.isleader + "', '" + rowObject.effectDate + "', " +
								"'" + rowObject.note + "')\">修改</button>";
				var delUser = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"User.delUser('" + rowObject.id + "')\">删除</button>"
				var resPassword = "<button class='btn btn-warning btn-xs modifybtn' onclick=\"User.resPassword('" + rowObject.id + "')\">重置密码</button>"
				var disRole = "<button class='btn btn-primary btn-xs modifybtn' onclick=\"User.disRole('" + rowObject.id + "')\">分配角色</button>"
				var modStatus =  '';
				if(rowObject.status == '0') {
					modStatus = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"User.modStatus('" + rowObject.id + "', '" + 1 + "')\">停用</button>"
				}else if(rowObject.status == '1') {
					modStatus = "<button class='btn btn-success btn-xs modifybtn' onclick=\"User.modStatus('" + rowObject.id + "', '" + 0 + "')\">启用</button>"
				}else{
					modStatus = "<button class='btn btn-danger btn-xs modifybtn')\">失效</button>"
				}
				return '<div class="btn-group btn-group-sm">' + modUser +  delUser + modStatus + resPassword + disRole +'</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/system/user/list/get",
		p_tableName : "用户信息管理",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"添加 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   $("#addUserModal").modal('show');
		   },   
		   position:"last"
	})
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
User.jqgrid.loadData = function (data) {
	var thisObject = User.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = User.jqgrid;
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
User.jqgrid.clearSearch = function () {
	var thisObject = User.jqgrid;
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
 * 添加用户jquery validate
 */
User.initAddUserFormValidate = function () {
    $("#addUserForm").validate({
        rules : {
        	funcName : {required : true},
        	url : {required : true},
        	findex : {required : true},
        	funcParentId : {required : true},
        	ftype : {required : true},
        },
        messages : {
        	funcName : {required : "功能菜单名称不能为空"},
        	url : {required : "功能菜单URL不能为空"},
        	findex : {required : "资源顺序不能为空"},
        	funcParentId : {required : "父功能菜单不能为空"},
        	ftype : {required : "资源类型不能为空"},
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
 * 开始添加用户 action
 */
User.addUser = function () {
    var result = $("#addUserForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认添加?",function(result){	
    	if(!result) {
    		return false;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/user/addUser',
	        type: 'post',
	        data: $("#addUserForm").serialize(),
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	                return;
	            }
	            bootbox.alert("添加成功", function () {
	            	location.reload();
	            });
	        },
	        error : function () {
	            bootbox.alert("添加功能菜单异常");
	        }
	    });
    });
}

/**
 * 修改用户信息
 */
User.modUser = function (id, userid, name, mobile, telephone, fax, mail, organsid, isleader, effectDate, note) {
	$("#modId").val(id);
	$("#modUserId").html(userid);
    $("#modName").val(name);
    $("#modMobile").val(mobile);
    $("#modTelephone").val(telephone);
    $("#modFax").val(fax);
    $("#modMail").val(mail);
    $("#modOrgansId").val(organsid);
    $("#modIsLeader").val(isleader);
    $("#ModEffectDate").val(effectDate);
    $("#modNote").val(note);
    $("#modUserModal").modal('show');
}

/**
 * 修改用户信息表单绑定jquery validate
 */
User.initModUserFormValidate = function () {
    $("#modUserForm").validate({
        rules : {
        	funcName : {required : true},
        	url : {required : true},
        	findex : {required : true},
        	funcParentId : {required : true},
        	ftype : {required : true},
        },
        messages : {
        	funcName : {required : "功能菜单名称不能为空"},
        	url : {required : "功能菜单URL不能为空"},
        	findex : {required : "资源顺序不能为空"},
        	funcParentId : {required : "父功能菜单不能为空"},
        	ftype : {required : "资源类型不能为空"},
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
 * 开始修改用户信息 action
 */
User.modUserAction = function () {
    var result = $("#modUserForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认修改?",function(result){	
    	if(!result) {
    		return;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/user/modUser',
	        type: 'post',
	        data: $("#modUserForm").serialize(),
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("修改成功", function () {
	            	location.reload();
	            });
	        },
	        error : function () {
	            bootbox.alert("修改功能菜单异常");
	        }
	    });
    });
}

/**
 * 修改用户状态
 */
User.modStatus = function(id, status) {
	var message = ''; 
	if(status == 1) {
		message = '确认停用?';
	}else{
		message = '确认启用?';
	}
	bootbox.confirm(message, function(result){	
		$.ajax({
	        url: Global.appCtx + '/system/user/modStatus',
	        type: 'post',
	        data: {'id' : id, 'status' : status},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("修改成功", function () {
	            	User.jqgrid.loadData();
	            });
	        },
	        error : function () {
	            bootbox.alert("修改状态异常");
	        }
	    });
	})
}


/**
 * 删除用户信息
 */
User.delUser = function (id) {
	bootbox.confirm("确认删除?",function(result){	
    	if(!result) {
    		return ;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/user/delUser',
	        type: 'post',
	        data: {'userId' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("删除成功", function () {
	            	User.jqgrid.loadData();
	            });
	        },
	        error : function () {
	            bootbox.alert("删除功能菜单异常");
	        }
	    });
    });
}

/**
 * 重置用户密码
 */
User.resPassword = function(id) {
	bootbox.confirm("确认重置?",function(result){	
    	if(!result) {
    		return ;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/user/resetUserPassword',
	        type: 'post',
	        data: {'id' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	                return;
	            }
	            bootbox.alert("重置成功", function () {
	            	User.jqgrid.loadData();
	            });
	        },
	        error : function () {
	            bootbox.alert("重置用户密码异常");
	        }
	    });
    });
}

User.getRoleCheckbox = function (id) {
	$.ajax({
        url: Global.appCtx + '/system/user/getRoleCheckbox',
        type: 'post',
        data: {'id' : id},
        dataType: 'json',
        success: function (data) {
            if (data != "" && data != undefined) {
                var checkbox = '';
                for(var i = 0; i < data.length; i++) {
                	 if(data[i].check) {
                     	checkbox += '<input type="checkbox" checked="checked" value="'+ data[i].id +'" id="roleCheck" name="roleCheck"> '+ data[i].name +' &nbsp;&nbsp;';
                     }else{
                     	checkbox += '<input type="checkbox" value="'+ data[i].id +'" id="roleCheck" name="roleCheck">'+ data[i].name +' &nbsp;&nbsp;';
                     }
                }
                $('#roleCheckbox').html(checkbox);
            }
        },
        error : function () {
            bootbox.alert("获取角色信息失败");
        }
    });
}

/**
 * 显示分配角色窗口
 */
User.disRole = function(id) {
	$("#t_user_role_mod").modal('show');
	User.getRoleCheckbox(id);
	$("#userId").val(id);
}

User.addRoles = function() {
	if($('input[id="roleCheck"]:checked').length < 1){
		bootbox.alert("请至少选择一个角色");
		return;
	}
	bootbox.confirm("确认分配?",function(result){	
    	if(!result) {
    		return ;
    	}
		$.ajax({
	        url: Global.appCtx + '/system/user/addUsersRoles',
	        type: 'post',
	        data: $('#addRoleForm').serialize(),
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	                return;
	            }
	            bootbox.alert("分配角色成功", function () {
	            	$("#t_user_role_mod").modal('hide');
	            });
	        },
	        error : function () {
	            bootbox.alert("分配角色异常");
	        }
	    });
	});
}

$(function(){
	
	// 初始化jqgrid
	User.jqgrid.init();
	
	//初始化添加用户信息表单验证
	User.initAddUserFormValidate();
	
	//初始化修改用户信息表单验证
	User.initModUserFormValidate();
	
	//开始添加用户信息
	$("#sureAdd").click(function(){
		User.addUser();
	});
	
	//开始修改用户信息
	$("#sureMod").click(function() {
		User.modUserAction();
	});
	
	//开始添加用户角色
	$("#sureAddRole").click(function() {
		User.addRoles();
	});
	
	$("#newEffectDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	
	$("#ModEffectDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
});

