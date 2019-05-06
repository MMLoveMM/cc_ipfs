/**
 * 交易管理
 */
var Dict = Dict || {};
/**
 * jqgrid对象
 */
Dict.jqgrid = Dict.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Dict.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
Dict.jqgrid.init = function () {
	var thisObject = Dict.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '代码', name : 'dcode',index : 'dcode',align : 'center'},
		{label : '名称', name : 'dname',index : 'dname',align : 'center'},
		{label : '类型', name : 'dictType',index : 'dictType',align : 'left',
			formatter : function (cellValue, options, rowObject) {
				var dictList = $("#dictList").val();
				var jsonDictList = $.parseJSON(dictList);
				if(jsonDictList.length > 0) {
					for(var i = 0; i < jsonDictList.length; i++) {
						if(jsonDictList[i].dcode == cellValue) {
							return jsonDictList[i].dname;
						}
					}
				}else {
					return "";
				}
			}
		},
		{label : '操作', name : 'myac',index : 'myac',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var modDict = "<button class='btn btn-xs btn-success openbtn' onclick=\"Dict.modDict('" + rowObject.id + "')\">修改</button>";
				var delDict = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"Dict.delDict('" + rowObject.id + "')\">删除</button>";
				
				return '<div class="btn-group btn-group-sm">' + modDict +  delDict + '</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/dict/list/get",
		p_tableName : "数据字典维护",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"添加 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   $("#addDictModal").modal('show');
		   },   
		   position:"last"
	})
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
Dict.jqgrid.loadData = function (data) {
	var thisObject = Dict.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = Dict.jqgrid;
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
Dict.jqgrid.clearSearch = function () {
	var thisObject = Dict.jqgrid;
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
Dict.jqgrid.reload = function () {
	var thisObject = Dict.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

/**
 * 修改字典表数据
 */
Dict.modDict = function (id) {
	$.ajax({
        url: Global.appCtx + '/dict/getModDict',
        type: 'post',
        data: {'dictId' : id},
        dataType: 'json',
        success: function (data) {
        	if(data == '' || data == undefined) {
        		return false;
        	}
        	$("#modId").val(id);
            $("#modDcode").val(data.dcode);
            $("#modDname").val(data.dname);
            $("#modDictType").val(data.dictType);
            $("#modStatus").val(data.status);
            $("#modNote").val(data.note);
            $("#modDictModal").modal('show');
        },
        error : function () {
            bootbox.alert("获取数据字典信息异常");
        }
    });
}

/**
 * 删除字典表数据
 */
Dict.delDict = function (id) {
	bootbox.confirm("确认删除?",function(result){	
    	if(!result) {
    		return false;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/dict/delDict',
	        type: 'post',
	        data: {'dictId' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("删除成功", function () {
	            	Dict.jqgrid.reload();
	            });
	        },
	        error : function () {
	            bootbox.alert("删除数据字典异常");
	        }
	    });
    });
}

/**
 * 添加数据字典表单绑定jquery validate
 */
Dict.initAddDictFormValidate = function () {
    $("#addDictForm").validate({
        rules : {
        	dcode : {required : true},
        	dname : {required : true},
        	dictType : {required : true},
        	status : {required : true},
        },
        messages : {
        	dcode : {required : "代码不能为空"},
        	dname : {required : "名称不能为空"},
        	dictType : {required : "类型不能为空"},
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
 * 开始添加数据字典 action
 */
Dict.addDict = function () {
    var result = $("#addDictForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认添加?",function(result){	
    	if(!result) {
    		return false;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/dict/addDict',
	        type: 'post',
	        data: $("#addDictForm").serialize(),
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
	            bootbox.alert("添加数据字典异常");
	        }
	    });
    });
}

/**
 * 修改数据字典表单绑定jquery validate
 */
Dict.initModDictFormValidate = function () {
    $("#modDictForm").validate({
        rules : {
        	dcode : {required : true},
        	dname : {required : true},
        	dictType : {required : true},
        	status : {required : true},
        },
        messages : {
        	dcode : {required : "代码不能为空"},
        	dname : {required : "名称不能为空"},
        	dictType : {required : "类型不能为空"},
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
 * 开始修改数据字典 action
 */
Dict.modDictAction = function () {
    var result = $("#modDictForm").valid();
    if (!result) {
       return;
    }
    bootbox.confirm("确认修改?",function(result){	
    	if(!result) {
    		return false;
    	}
    	
	    $.ajax({
	        url: Global.appCtx + '/dict/modDict',
	        type: 'post',
	        data: $("#modDictForm").serialize(),
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
	            bootbox.alert("修改数据字典异常");
	        }
	    });
    });
}

$(function(){
	
	
	// 初始化jqgrid
	Dict.jqgrid.init();
	
	//初始化添加数据字典表单验证
	Dict.initAddDictFormValidate();
	
	//初始化修改数据字典表单验证
	Dict.initModDictFormValidate();
	
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		Dict.jqgrid.loadData(filter);
	});
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#searchForm")[0]).reset();
	});

	//开始添加数据字典
	$("#sureAdd").click(function() {
		Dict.addDict();
	});
	
	$("#sureMod").click(function() {
		Dict.modDictAction();
	});
	
	//搜索栏时间格式化
	$("#startDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	$("#endDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	
});