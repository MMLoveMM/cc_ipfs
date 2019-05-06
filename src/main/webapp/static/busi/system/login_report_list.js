/**
 * 交易管理
 */
var LoginReport = LoginReport || {};
/**
 * jqgrid对象
 */
LoginReport.jqgrid = LoginReport.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
LoginReport.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
LoginReport.jqgrid.init = function () {
	var thisObject = LoginReport.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '登录名', name : 'opeperson',index : 'opeperson',align : 'center'},
		{label : '用户姓名', name : 'opename',index : 'opename',align : 'center'},
		{label : '公司', name : 'orgname',index : 'orgname',align : 'left'},
		{label : '登录次数', name : 'count',index : 'count',align : 'left'},
		{label : '操作', name : 'myac',index : 'myac',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var details = "<button class='btn btn-xs btn-success openbtn' onclick=\"LoginReport.details('" + rowObject.opeperson + "')\">详情</button>";
				
				return '<div class="btn-group btn-group-sm">' + details + '</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/system/loginReport/list/get",
		p_tableName : "登录统计",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"导出Excel &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   var fileName = '';
			   $.ajax({
			        url: Global.appCtx + '/system/loginReport/setLogExcel',
			        type: 'post',
			        data: $("#searchForm").serialize(),
			        dataType: 'json',
			        success: function (data) {
			        	if(data.msg == '0') {
			        		fileName = data.name
			        		if(data.name != '' && data.name != undefined) {
								   bootbox.confirm("确认导出?",function(result){
								    	if(!result) {
								    		$.ajax({
										        url: Global.appCtx + '/system/loginReport/deleteLogExcel',
										        type: 'post',
										        data: {"fileName" : fileName},
										        dataType: 'json',
										        success: function (data) {
										        },
										    });
								    		return ;
								    	}
								    	
								    	window.location.href = Global.appCtx + "/system/loginReport/downLogExcel?fileName=" + fileName;
								   });
							   }
			        	}else {
			        		bootbox.alert("导出报表失败");
			        	}
			        },
			        error : function () {
			            bootbox.alert("导出报表异常");
			        }
			    });
		   },
		   position:"last"
	})
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
LoginReport.jqgrid.loadData = function (data) {
	var thisObject = LoginReport.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = LoginReport.jqgrid;
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
LoginReport.jqgrid.clearSearch = function () {
	var thisObject = LoginReport.jqgrid;
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
LoginReport.jqgrid.reload = function () {
	var thisObject = LoginReport.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

/**
 * 查看报表详情
 */
LoginReport.details = function (opeperson) {
	$("#t_application_log_mod").modal('show');
	$("#downLogId").val(opeperson);
	LoginReport.ChanServJqgrid.init(opeperson);
	LoginReport.ChanServJqgrid.loadData();
}



LoginReport.ChanServJqgrid = {};
LoginReport.ChanServJqgrid.$selectTable = null;
LoginReport.ChanServJqgrid.init = function (opeperson) {
	var thisObject = LoginReport.ChanServJqgrid;
	var $thisJqgrid = $("#grid_table_view");
	var postData = {
			"opeperson" : opeperson,
	};
	if (thisObject.$selectTable) {
		thisObject.loadData(postData);
		return;
	}
	thisObject.$selectTable = $thisJqgrid;
	var width = $thisJqgrid.parent().width();
	var height = 200;
	var colModel = [
		{label : '登录名', name : 'opeperson',index : 'opeperson', width : 120,align : 'center'},
		{label : '用户姓名', name : 'opename',index : 'opename', align : 'center'},
		{label : '登录时间', name : 'opedate',index : 'opedate', align : 'center'},
		{label : '登录IP', name : 'ip',index : 'ip', align : 'center'}
	];
	$thisJqgrid.jqGrid({
		url : Global.appCtx + "/system/loginReport/list/getDetails",
		datatype: "json",
		mtype: 'POST',
		postData : postData,
		cellEdit : false,
        height : height,//高度，表格高度。可为数值、百分比或'auto'
        autowidth : true,
        shrinkToFit : true, // 为false使用column width
        width : width,
        colModel : colModel,
        rownumbers : false,//添加左侧行号
        // rownumWidth : 20,
        viewrecords : true,//是否在浏览导航栏显示记录总数
        rowNum : -1,//每页显示记录数   -1为全部
        altRows: true,
		multiselect: false,
        multiboxonly: true,
        jsonReader : {
        	root:"list",
        	page: "pageNum",
        	total: "pages",
        	records: "total"
		}
    });
	return thisObject;
}

/**
 * 加载数据
 * @param data 搜索条件数据
 */
LoginReport.ChanServJqgrid.loadData = function (data) {
	var thisObject = LoginReport.ChanServJqgrid;
	data = data || {};
	thisObject.$selectTable.setGridParam({
		mtype : "POST",
		datatype : "json",
		postData : data,
		page : 1
	}).trigger("reloadGrid");
}

/**
 * 刷新jqgrid
 */
LoginReport.ChanServJqgrid.reload = function () {
	var thisObject = LoginReport.ChanServJqgrid;
	thisObject.$selectTable.trigger("reloadGrid");
}

$(function(){
	
	
	// 初始化jqgrid
	LoginReport.jqgrid.init();
	
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		LoginReport.jqgrid.loadData(filter);
	});
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#searchForm")[0]).reset();
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
	
	$("#downLog").click(function () {
		var opeperson = $("#downLogId").val();
		
		var fileName = '';
		   $.ajax({
		        url: Global.appCtx + '/system/loginReport/setLogDetailsExcel',
		        type: 'post',
		        data: {"opeperson" : opeperson},
		        dataType: 'json',
		        success: function (data) {
		        	if(data.msg == '0') {
		        		fileName = data.name
		        		if(data.name != '' && data.name != undefined) {
							   bootbox.confirm("确认导出?",function(result){
							    	if(!result) {
							    		$.ajax({
									        url: Global.appCtx + '/system/loginReport/deleteLogDetailsExcel',
									        type: 'post',
									        data: {"fileName" : fileName},
									        dataType: 'json',
									        success: function (data) {
									        },
									    });
							    		return ;
							    	}
							    	
							    	window.location.href = Global.appCtx + "/system/loginReport/downLogDetailsExcel?fileName=" + fileName;
							   });
						   }
		        	}else {
		        		bootbox.alert("导出报表失败");
		        	}
		        },
		        error : function () {
		            bootbox.alert("导出报表异常");
		        }
		    });
	});
	
});