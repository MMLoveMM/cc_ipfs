/**
 * 交易管理
 */
var Journaling = Journaling || {};
/**
 * jqgrid对象
 */
Journaling.jqgrid = Journaling.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Journaling.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */

Journaling.jqgrid.init = function () {
	var thisObject = Journaling.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '客户编号', name : 'id',index : 'id',align : 'center'},
		{label : '姓名', name : 'username',index : 'username',align : 'center'},
		{label : '性别', name : 'sex',index : 'sex',align : 'center',
			formatter : function (cellValue, options, rowObject) {
				if(cellValue == '01'){
					return "男";
				}else if(cellValue == '02'){
					return "女"
				}else{
					return "";
				}
			}
		},
		{label : '年龄', name : 'age',index : 'age',align : 'center'},
		{label : '民族', name : 'people',index : 'people',align : 'center'},
		{label : '手机号码', name : 'phone',index : 'phone',align : 'center'},
		{label : '电子邮箱', name : 'email',index : 'email',align : 'center'},
		{label : '居住地址', name : 'address',index : 'address',align : 'center'},
		{label : '工作单位', name : 'workunit',index : 'workunit',align : 'center'},
		{label : '家庭背景', name : 'familybackground',index : 'familybackground',align : 'center'},
		{label : '教育背景', name : 'education',index : 'education',align : 'center'},
		{label : '工作背景', name : 'work',index : 'work',align : 'center'},
		{label : '社会背景', name : 'socialcontext',index : 'socialcontext',align : 'center'},	
		{label : '信用状况', name : 'creditstanding',index : 'creditstanding',align : 'center'},	
		{label : '其他情况', name : 'otherinfos',index : 'otherinfos',align : 'center'},
		{label : '录入时间', name : 'createtime',index : 'createtime',align : 'center'}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/report/customer/list/get",
		p_tableName : "个人客户录入时间查询",
		p_height : "auto",
		p_colModel : colModel
	})
	
/**
 * 加载数据
 * @param data 搜索条件数据
 */
Journaling.jqgrid.loadData = function (data) {
	var thisObject = Journaling.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = Journaling.jqgrid;
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
Journaling.jqgrid.clearSearch = function () {
	var thisObject = Journaling.jqgrid;
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
	
}

$(function(){
	
	// 初始化jqgrid
	Journaling.jqgrid.init();
	//重置
	$("#search_reset_Btn").click(function(){
		($("#searchForm")[0]).reset();
	});
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		Journaling.jqgrid.loadData(filter);
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

