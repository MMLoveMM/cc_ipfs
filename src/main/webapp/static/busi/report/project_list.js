/**
 * 交易管理
 */
var  Project= Project || {};
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
		{label : '编号', name : 'id',index : 'id',align : 'left'},
		{label : '项目编号', name : 'projectnum',index : 'projectnum',align : 'left'},
		{label : '项目名称', name : 'projectname',index : 'projectname',align : 'left'},
		{label : '融资金额', name : 'loanamt',index : 'loanamt',align : 'left'},
		{label : '融资期限', name : 'loandeadline',index : 'loandeadline',align : 'left'},
		{label : '融资类型', name : 'loantype',index : 'loantype',align : 'left'},
		{label : '已融额度', name : 'hasloanamt',index : 'hasloanamt',align : 'left'},
		{label : '费率', name : 'rate',index : 'rate',align : 'left'},
		{label : '知识产权类型', name : 'inteprotype',index : 'inteprotype',align : 'left'}
		];
		thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/report/project/list/get",
		p_tableName : "项目融资信息",
		p_height : "auto",
		p_colModel : colModel
		}).navButtonAdd(pager_selector,{
			caption:"导出报表 &nbsp;&nbsp;",
			buttonicon:"fa-angle-double-down purple",
			onClickButton: function(){
				var fileName = '';
				$.ajax({
					url: Global.appCtx + '/report/project/setExcel',
					type: 'post',
					data: $("#searchForm").serialize(),
					dataType: 'json',
					success: function (data) {
						if(data.msg == '0'){
							fileName = data.name
							if(data.name != '' && data.name != undefined){
								bootbox.confirm("确认下载？",function(result){
									if(!result){
										$.ajax({
											url: Global.appCtx + '/report/project/deleteExcel',
									        type: 'post',
									        data: {"fileName" : fileName},
									        dataType: 'json',
									        success: function (data) {
									        },
										});
										return ;
									}
									window.location.href=Global.appCtx + "/report/project/downExcel?fileName=" + fileName;
								});
							}
						}else{
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

$(function(){
			// 初始化jqgrid
	Project.jqgrid.init();
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		Project.jqgrid.loadData(filter);
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
