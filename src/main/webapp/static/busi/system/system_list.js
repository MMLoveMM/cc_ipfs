/**
 * 交易管理
 */
var Tfunc = Tfunc || {};
/**
 * jqgrid对象
 */
Tfunc.jqgrid = Tfunc.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Tfunc.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */

Tfunc.jqgrid.init = function () {
	var thisObject = Tfunc.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '编号', name : 'id',index : 'id',align : 'center'},
		{label : '名称', name : 'funcName',index : 'funcName',align : 'center'},
		{label : '类型', name : 'ftype',index : 'ftype',align : 'center'},
		{label : '排序', name : 'findex',index : 'findex',align : 'center'},
		{label : '父菜单名', name : 'funcParentId',index : 'funcParentId',align : 'center',
			formatter : function (cellValue, options, rowObject) {
				var funcParentNames = $("#funcParentName").val();
				var jsonfuncParentNames = $.parseJSON(funcParentNames);
				if(jsonfuncParentNames.length > 0) {
					if(cellValue != 0) {
						for(var i = 0; i < jsonfuncParentNames.length; i++) {
							if(jsonfuncParentNames[i].id == cellValue) {
								return jsonfuncParentNames[i].funcName;
							}
						}
					}else {
						return "根菜单";
					}
				}else {
					return "";
				}
			}
		},
		{label : '状态', name : 'status',index : 'status',align : 'center'},
		
		{label : '操作', name : 'myac',index : 'myac',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var modFunc = "<button class='btn btn-xs btn-success openbtn' onclick=\"Tfunc.modFunc('" + rowObject.id + "', '" + rowObject.funcParentId + "')\">修改</button>";
				var delFunc = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"Tfunc.delFunc('" + rowObject.id + "', '" + rowObject.funcParentId + "')\">删除</button>"
				return '<div class="btn-group btn-group-sm">' + modFunc +  delFunc + '</div>';
			}
				
			
				
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/system/resources/list/get",
		p_tableName : "功能菜单",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"添加 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   $("#addFuncModal").modal('show');
		   },   
		   position:"last"
	})
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
Tfunc.jqgrid.loadData = function (data) {
	var thisObject = Tfunc.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = Tfunc.jqgrid;
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
Tfunc.jqgrid.clearSearch = function () {
	var thisObject = Tfunc.jqgrid;
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
 * 添加功能菜单表单绑定jquery validate
 */
Tfunc.initAddFuncFormValidate = function () {
    $("#addFuncForm").validate({
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
 * 开始添加功能菜单 action
 */
Tfunc.addFunc = function () {
    var result = $("#addFuncForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认添加?",function(result){	
    	if(!result) {
    		return false;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/resources/addFunc',
	        type: 'post',
	        data: $("#addFuncForm").serialize(),
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
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
 * 修改功能菜单
 */
Tfunc.modFunc = function (id, funcParentId) {
	if(funcParentId == '0') {
		bootbox.alert('根菜单无法修改');
		return false;
	}
	$.ajax({
        url: Global.appCtx + '/system/resources/getModFunc',
        type: 'post',
        data: {'tfuncId' : id},
        dataType: 'json',
        success: function (data) {
        	if(data == '' || data == undefined) {
        		return false;
        	}
        	$("#modId").val(id);
            $("#modFuncName").val(data.funcName);
            $("#modUrl").val(data.url);
            $("#modFtype").val(data.ftype);
            $("#modFindex").val(data.findex);
            $("#modFuncParentId").val(data.funcParentId);
            $("#modFuncModal").modal('show');
        },
        error : function () {
            bootbox.alert("获取功能菜单信息异常");
        }
    });
}

/**
 * 修改功能菜单绑定jquery validate
 */
Tfunc.initModFuncFormValidate = function () {
    $("#modFuncForm").validate({
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
 * 开始修改数据字典 action
 */
Tfunc.modFuncAction = function () {
    var result = $("#modFuncForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认修改?",function(result){	
    	if(!result) {
    		return ;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/resources/modFunc',
	        type: 'post',
	        data: $("#modFuncForm").serialize(),
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
 * 删除字典表数据
 */
Tfunc.delFunc = function (id, funcParentId) {
	if(funcParentId == '0') {
		bootbox.alert("根菜单无法删除");
		return false;
	}
	
	bootbox.confirm("确认删除?",function(result){	
    	if(!result) {
    		return ;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/system/resources/delFunc',
	        type: 'post',
	        data: {'tfuncId' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("删除成功", function () {
	            	location.reload();
	            });
	        },
	        error : function () {
	            bootbox.alert("删除功能菜单异常");
	        }
	    });
    });
}

	

$(function(){
	
	// 初始化jqgrid
	Tfunc.jqgrid.init();
	
	//初始化添加 功能菜单表单验证
	Tfunc.initAddFuncFormValidate();
	
	//初始化添加功能菜单表单验证
	Tfunc.initModFuncFormValidate();
	
	//开始添加功能菜单
	$("#sureAdd").click(function(){
		Tfunc.addFunc();
	});
	
	//开始修改功能菜单
	$("#sureMod").click(function() {
		Tfunc.modFuncAction();
	});
	
	
});

