/**
 * 交易管理
 */
var  PersonReport = PersonReport || {};
/**
 * jqgrid对象
 */
PersonReport.jqgrid = PersonReport.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
PersonReport.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
PersonReport.jqgrid.init = function () {
	var thisObject = PersonReport.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '客户编号', name : 'id',index : 'id',align : 'left'},
		{label : '姓名', name : 'username',index : 'username',align : 'left'},
		{label : '负债类型', name : 'liabtype',index : 'liabtype',align : 'left',
			formatter : function (cellValue, options, rowObject) {
				var liabType1 = $("#liabType").val();
				var jsonDictList = $.parseJSON(liabType1);
				if(jsonDictList.length > 0) {
					for(var i = 0; i < jsonDictList.length; i++) {
						if(jsonDictList[i].dcode == cellValue) {
							return jsonDictList[i].dname;
						}else if(cellValue == "" || cellValue == undefined){
							return "";
						}
					}
				}else {
					return "";
				}
			}
		},
		{label : '借款金额', name : 'credit',index : 'credit',align : 'left'},
		{label : '已还款', name : 'paid',index : 'paid',align : 'left'},
		{label : '未还款', name : 'nopay',index : 'nopay',align : 'left'},
		{label : '月均需还款', name : 'averagepay',index : 'averagepay',align : 'left'},
		{label : '操作' , name : 'cz' , index : 'cz' , align : 'left',
			formatter : function(cellvalue, options, rowObject){
				var listReport = "<button class='btn btn-xs btn-success openbtn' onclick=\"PersonReport.listReport('" + rowObject.id + "')\">详情</button>";
				return '<div class="btn-group btn-group-sm">'  + listReport + '</div>';
			}
		}
		];
		thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/report/person/assetReport/get",
		p_tableName : "个人客户负债信息报表",
		p_height : "auto",
		p_colModel : colModel
		}).navButtonAdd(pager_selector,{
			caption:"导出报表 &nbsp;&nbsp;",
			buttonicon:"fa-angle-double-down purple",
			onClickButton: function(){
				var fileName = '';
				$.ajax({
					url: Global.appCtx + '/report/personReport/setExcel',
					type: 'post',
					data: $("#reportForm").serialize(),
					dataType: 'json',
					success: function (data) {
						if(data.msg == '0'){
							fileName = data.name
							if(data.name != '' && data.name != undefined){
								bootbox.confirm("确认下载？",function(result){
									if(!result){
										$.ajax({
											url: Global.appCtx + '/report/personReport/deleteExcel',
									        type: 'post',
									        data: {"fileName" : fileName},
									        dataType: 'json',
									        success: function (data) {
									        },
										});
										return ;
									}
									window.location.href=Global.appCtx + "/report/personReport/downExcel?fileName=" + fileName;
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
 * 查看客户信息详情
 */
PersonReport.listReport = function(id){
	window.location.href=Global.appCtx + "/report/person/list/view?id=" + id ;
}

/**
 * 加载数据
 * @param data 搜索条件数据
 */
PersonReport.jqgrid.loadData = function (data) {
	var thisObject = PersonReport.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = PersonReport.jqgrid;
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
PersonReport.jqgrid.clearSearch = function () {
	var thisObject = PersonReport.jqgrid;
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
PersonReport.jqgrid.reload = function () {
	var thisObject = PersonReport.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

$(function(){
			// 初始化jqgrid
	PersonReport.jqgrid.init();
	//查询
	$("#report_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#reportForm").serialize());
		PersonReport.jqgrid.loadData(filter);
	});
	
	//重置
	$("#report_reset_Btn").click(function(){
		($("#reportForm")[0]).reset();
	});
	
	//搜索栏时间格式化
	$("#startDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
});
