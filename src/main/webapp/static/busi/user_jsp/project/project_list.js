/**
 * 交易管理
 */
var Project = Project || {};
/**
 * jqgrid对象
 */
Project.jqgrid = Project.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Project.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
Project.jqgrid.init = function () {
	var thisObject = Project.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '项目编号', name : 'projectnum',index : 'projectnum',align : 'center'},
		{label : '项目名称', name : 'projectname',index : 'projectname',align : 'center'},
		{label : '录入时间', name : 'createtime',index : 'createtime',align : 'center'},
		{label : '浏览量', name : 'visitorvolume',index : 'visitorvolume',align : 'center'},
		{label : '知识产权类型', name : 'inteprotype',index : 'inteprotype',align : 'center'},
//		{label : '流程轨迹', name : 'dictType',index : 'dictType',align : 'left',
//			formatter : function (cellValue, options, rowObject) {
//				return "<a href='#'>流程轨迹</a>"
//			}
//		},
// 		{label : '操作', name : 'myac',index : 'myac',align : 'center',
// 			formatter : function (cellvalue, options, rowObject) {
// 				var modDict = "<button class='btn btn-xs btn-primary' onclick=\"Project.modDict('" + rowObject.id + "')\">修改</button>";
// 				var detailsDict = "<button class='btn btn-success btn-xs' onclick=\"Project.detailsDict('" + rowObject.id + "')\">详情</button>";
// 				var delDict = "<button class='btn btn-danger btn-xs' onclick=\"Project.delDict('" + rowObject.id + "')\">删除</button>";
//
// 				return '<div class="btn-group btn-group-sm">' + detailsDict  + '</div>';
// 			}
// 		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/project/list/get",
		p_tableName : "项目列表",
		p_height : "auto",
		p_colModel : colModel
	})
}
/**
 * 加载数据
 * @param data 搜索条件数据
 */
Project.jqgrid.loadData = function (data) {
	var thisObject = Project.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = Project.jqgrid;
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
Project.jqgrid.clearSearch = function () {
	var thisObject = Project.jqgrid;
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
Project.jqgrid.reload = function () {
	var thisObject = Project.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

/**
 * 修改企业项目信息
 */
Project.modDict = function(id) {
	$(window).attr('location', Global.appCtx + '/project/toMod?id=' + id);
}

/**
 * 查看项目详细信息
 */
Project.detailsDict = function(id) {
	$(window).attr('location', Global.appCtx + '/project/toDetail?id=' + id);
}

$(function(){
	
	
	// 初始化jqgrid
	Project.jqgrid.init();
	
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		Dict.jqgrid.loadData(filter);
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
	
});