/**
 * 机构管理
 */
var OrgansReport = OrgansReport || {};
/**
 * jqgrid对象
 */
OrgansReport.jqgrid = OrgansReport.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
OrgansReport.jqgrid.$tableSelector = null;

var zTreeObj;

var setting = { 
		check: {
			enable: true,
			outoCheckTrigger : false,
			chkboxType: { "Y": "", "N": "" },
		},
		data: {
			simpleData: {
				enable: true,
				idKey: "id",
				pIdKey: "pId",
				rootPId: 0
			},
			key : {  
		                name : "name"  
		           } 
		},
		async : {  
            enable : true,  
            url : Global.appCtx + "/system/organs/list/get"  
        },
        callback: {
	        onAsyncSuccess: onAsyncSuccess    
	    }
	};  

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
 * 增加机构信息绑定表单验证
 */
OrgansReport.initAddOrgFormValidate = function () {
    $("#addOrgans").validate({
        rules : {
        	orgname : {required : true},
        	orgcode : {required : true},
        	conname : {required : true},
        	conmobile : {required : true},
        	orgtype : {required : true},
        	pid : {required : true},
        },
        messages : {
        	orgname : {required : "机构名称不能为空"},
        	orgcode : {required : "机构号不能为空"},
        	conname : {required : "联系人姓名不能为空"},
        	conmobile : {required : "联系人手机不能为空"},
        	orgtype : {required : "机构属性不能为空"},
        	pid : {required : "上级机构不能为空"},
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
 * 增加机构信息
 */
OrgansReport.add = function(){
	 var result = $("#addOrgans").valid();
	 if (!result) {
	       return;
	    }
		bootbox.confirm("确认提交?",function(result){
			if(!result){
				return ;
			}
			$.ajax({
		        url: Global.appCtx + '/system/organs/add',
		        type: 'post',
		        data: $("#addOrgans").serialize(),
		        dataType: 'json',
		        success: function (data) {
		            if (data != 0) {
		                bootbox.alert(data);
		            }else{
		            	bootbox.alert("增加机构信息成功", function () {
		            		location.reload();
		            	});
		            }
		        },
		        error : function () {
		            bootbox.alert("增加机构信息异常");
		        }
	    });
		});
}

/**
 * 修改机构信息绑定表单验证
 */
OrgansReport.initModOrgFormValidate = function () {
    $("#modOrgans").validate({
        rules : {
        	orgname : {required : true},
        	orgcode : {required : true},
        	conname : {required : true},
        	conmobile : {required : true},
        	orgtype : {required : true},
        	pid : {required : true},
        },
        messages : {
        	orgname : {required : "机构名称不能为空"},
        	orgcode : {required : "机构号不能为空"},
        	conname : {required : "联系人姓名不能为空"},
        	conmobile : {required : "联系人手机不能为空"},
        	orgtype : {required : "机构属性不能为空"},
        	pid : {required : "上级机构不能为空"},
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
 * 开始修改机构信息
 */
OrgansReport.mod = function(){
	 var result = $("#modOrgans").valid();
	 if (!result) {
	       return;
	    }
	 bootbox.confirm("确认修改?",function(result){	
	    	if(!result) {
	    		return;
	    	}
	    	$.ajax({
		        url: Global.appCtx + '/system/organs/mod',
		        type: 'post',
		        data: $("#modOrgans").serialize(),
		        dataType: 'json',
		        success: function (data) {
		            if (data != 0) {
		                bootbox.alert(data);
		            }else{
		            	bootbox.alert("修改机构信息成功", function () {
		            		location.reload();
		            	});
		            }
		        },
		        error : function () {
		            bootbox.alert("修改机构信息异常");
		        }
	    });
	 });
}

$(function(){
	
	//初始化增加机构信息表单验证
	OrgansReport.initAddOrgFormValidate();
	
	//初始化修改机构信息表单验证
	OrgansReport.initModOrgFormValidate();
	
	 zTreeObj = $.fn.zTree.init($("#tree"), setting);
	 setTimeout(function(){  
	        expandAll("tree");  
	    },1000);//延迟加载 
	 
	 /**
	  * 弹出增加机构信息模态框
	  */
	 $("#addOrganMess").click(function(){
		 $("#addOrgan").modal('show');
	 })
	
	 /**
	  * 增加机构信息
	  */
	 $("#sureAdd").click(function(){
		 OrgansReport.add();
	 })
	 
	 /**
	  * 修改机构信息
	  */
	  $("#modOrganMess").click(function(){
		  var nodes = zTreeObj.getCheckedNodes(true);
		  if(nodes.length !=1 || nodes.length == 0){
			  alert("请选择一条机构");
			  return false;
		  }
		  var orgId = nodes[0].pId;
		  if (orgId == '0') {
				alert('根节点不允许被修改！');
		  }
		  var oid = nodes[0].id;
		  $.ajax({
		        url: Global.appCtx + '/system/organs/list/query',
		        type: 'post',
		        data: {'orgId' : oid},
		        dataType: 'json',
		        success: function (data) {
		        	if(data == '' || data == undefined) {
		        		return false;
		        	}
		        	$("#orgId").val(oid);
		        	$("#orgname1").val(data.orgname);
		            $("#orgcode1").val(data.orgcode);
		            $("#conname1").val(data.conname);
		            $("#conmobile1").val(data.conmobile);
		            $("#contel1").val(data.contel);
		            $("#confax1").val(data.confax);
		            $("#conmail1").val(data.conmail);
		            var list3 = document.getElementById("orgtype1");
		        	var j;
		        	for(j=0; j<list3.options.length; j++){
		        		var s = list3.options[j];
		        		if(data.orgtype.indexOf(s.value.trim())>= 0){
		        			s.selected = true;	
		        		}
		        	}
		        	var list4 = document.getElementById("pid1");
		        	var k;
		        	for(k=0; k<list4.options.length; k++){
		        		var s = list4.options[k];
		        		if(data.pid.indexOf(s.value.trim())>= 0){
		        			s.selected = true;	
		        		}
		        	}
		            $("#status").val(data.status);
		            $("#note1").val(data.note);
		            $("#modOrgan").modal('show');
		        },
		        error : function () {
		            bootbox.alert("获取机构信息异常");
		        }
		    });
	 })
	 
	  /**
	  * 修改机构信息
	  */
	 $("#sureMod").click(function(){
		 OrgansReport.mod();
	 })
	 
	  /**
	  * 查看机构信息详情
	  */
	  $("#viewOrganMess").click(function(){
		  var nodes = zTreeObj.getCheckedNodes(true);
		  if(nodes.length !=1 || nodes.length == 0){
			  alert("请选择一条机构");
			  return false;
		  }
		  var orgId = nodes[0].pId;
		  if (orgId == '0') {
				alert('根节点不允许被操作！');
		  }
		  var oid = nodes[0].id;
		  $.ajax({
		        url: Global.appCtx + '/system/organs/list/query',
		        type: 'post',
		        data: {'orgId' : oid},
		        dataType: 'json',
		        success: function (data) {
		        	if(data == '' || data == undefined) {
		        		return false;
		        	}
		        	$("#orgname2").val(data.orgname);
		            $("#orgcode2").val(data.orgcode);
		            $("#conname2").val(data.conname);
		            $("#conmobile2").val(data.conmobile);
		            $("#conmail2").val(data.conmail);
		            $("#confax2").val(data.confax);
		            var jgsx = document.getElementById("dict2").value;
		            var jsonDictList = $.parseJSON(jgsx);
		            for(var y=0; y<jsonDictList.length; y++){
		        		if(jsonDictList[y].dictType == 'organstype' && jsonDictList[y].dcode == data.orgtype){
		        			 $("#orgtype2").val(jsonDictList[y].dname);
		        		}
		            }
		        	var sjjg = document.getElementById("orgmap2").value;
		        	var jsonOrgList = $.parseJSON(sjjg);
		        	for(var y=0; y<jsonOrgList.length; y++){
		        		if(jsonOrgList[y].id == data.pid){
		        			$("#pid2").val(jsonOrgList[y].orgname);
		        		}
		        	}
		            $("#cname").val(data.cname);
		            $("#cdate").val(data.cdate);
		            if(data.status == "01"){
		            	$("#status1").val('启用');
		            }else{
		            	$("#status1").val('停用');
		            }
		            $("#viewOrgan").modal('show');
		        },
		        error : function () {
		            bootbox.alert("查看机构信息详情异常");
		        }
		    });
	 })
	 
	 /**
	  * 删除机构信息
	  */
	 $("#delOrganMess").click(function(){
		  var nodes = zTreeObj.getCheckedNodes(true);
		  if(nodes.length !=1 || nodes.length == 0){
			  alert("请选择一条机构");
			  return false;
		  }
		  var orgId = nodes[0].pId;
		  if (orgId == '0') {
				alert('根节点不允许被删除！');
		  }
		  bootbox.confirm("确认删除?",function(result){	
		    	if(!result) {
		    		return;
		    	}
		  var oid = nodes[0].id;
		  $.ajax({
		        url: Global.appCtx + '/system/organs/del',
		        type: 'post',
		        data: {'id' : oid},
		        dataType: 'json',
		        success: function (data) {
		            if (data != 0) {
		                bootbox.alert(data);
		            }else{
		            	bootbox.alert("删除机构信息成功", function () {
		            		location.reload();
		            	});
		            }
		        },
		        error : function () {
		            bootbox.alert("删除机构信息异常");
		        }
	    });
		  });
	 })
});