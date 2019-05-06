/**
 * 交易管理
 */
var  PersonAsset = PersonAsset || {};
/**
 * jqgrid对象
 */
PersonAsset.jqgrid = PersonAsset.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
PersonAsset.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
PersonAsset.jqgrid.init = function () {
	var thisObject = PersonAsset.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '客户编号', name : 'id',index : 'id',align : 'left'},
		{label : '姓名', name : 'username',index : 'username',align : 'left'},
		{label : '资产类型', name : 'housingtype',index : 'housingtype',align : 'left',
			formatter : function (cellValue, options, rowObject) {
				var houseType = $("#houseType").val();
				var jsonDictList = $.parseJSON(houseType);
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
		{label : '地址/型号', name : 'addornum',index : 'addornum',align : 'left'},
		{label : '面积/数量', name : 'areaornum',index : 'areaornum',align : 'left'},
		{label : '购买时间', name : 'buytime',index : 'buytime',align : 'left'},
		{label : '购买价值', name : 'purchasevalue',index : 'purchasevalue',align : 'left'},
		{label : '评估价值', name : 'valuationvalue',index : 'valuationvalue',align : 'left'},
		{label : '权证号', name : 'warrantsnum',index : 'warrantsnum',align : 'left'},
		{label : '权属及使用情况', name : 'ownerandusage',index : 'ownerandusage',align : 'left'},
		{label : '操作' , name : 'cz' , index : 'cz' , align : 'left',
			formatter : function(cellvalue, options, rowObject){
				var listAsset = "<button class='btn btn-xs btn-success openbtn' onclick=\"PersonAsset.listAsset('" + rowObject.id + "')\">详情</button>";
				return '<div class="btn-group btn-group-sm">'  + listAsset + '</div>';
			}
		}
		];
		thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/report/person/assetMsg/get",
		p_tableName : "个人客户资产负债信息",
		p_height : "auto",
		p_colModel : colModel
		}).navButtonAdd(pager_selector,{
			caption:"导出报表 &nbsp;&nbsp;",
			buttonicon:"fa-angle-double-down purple",
			onClickButton: function(){
				var fileName = '';
				$.ajax({
					url: Global.appCtx + '/report/person/setExcel',
					type: 'post',
					data: $("#assetForm").serialize(),
					dataType: 'json',
					success: function (data) {
						if(data.msg == '0'){
							fileName = data.name
							if(data.name != '' && data.name != undefined){
								bootbox.confirm("确认下载？",function(result){
									if(!result){
										$.ajax({
											url: Global.appCtx + '/report/person/deleteExcel',
									        type: 'post',
									        data: {"fileName" : fileName},
									        dataType: 'json',
									        success: function (data) {
									        },
										});
										return ;
									}
									window.location.href=Global.appCtx + "/report/person/downExcel?fileName=" + fileName;
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
PersonAsset.listAsset = function(id){
	window.location.href=Global.appCtx + "/report/person/list/view?id=" + id ;
}

/**
 * 加载数据
 * @param data 搜索条件数据
 */
PersonAsset.jqgrid.loadData = function (data) {
	var thisObject = PersonAsset.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = PersonAsset.jqgrid;
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
PersonAsset.jqgrid.clearSearch = function () {
	var thisObject = PersonAsset.jqgrid;
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
PersonAsset.jqgrid.reload = function () {
	var thisObject = PersonAsset.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

$(function(){
			// 初始化jqgrid
	PersonAsset.jqgrid.init();
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#assetForm").serialize());
		PersonAsset.jqgrid.loadData(filter);
	});
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#assetForm")[0]).reset();
	});
	
	//搜索栏时间格式化
	$("#startDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
});
