/**
 * 交易管理
 */
var  Company= Company || {};
/**
 * jqgrid对象
 */
Company.jqgrid = Company.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Company.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
Company.jqgrid.init = function () {
	var thisObject = Company.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '编号', name : 'id',index : 'id',align : 'left'},
		{label : '客户编号', name : 'companynum',index : 'companynum',align : 'left'},
		{label : '企业名称', name : 'companyname',index : 'companyname',align : 'left'},
		{label : '成立时间', name : 'createtime',index : 'createtime',align : 'left'},
		{label : '注册资本', name : 'registeredcapital',index : 'registeredcapital',align : 'left'},
		{label : '实到资本', name : 'practicalcapital',index : 'practicalcapital',align : 'left'},
		{label : '企业类型', name : 'companytype',index : 'companytype',align : 'left'},
		{label : '行业类型', name : 'businesstype',index : 'businesstype',align : 'left'},
		{label : '内外部标识', name : 'mark',index : 'mark',align : 'left'},
		{label : '类别划分', name : 'area',index : 'area',align : 'left'},
		{label : '是否高新技术企业', name : 'ishighindustry',index : 'ishighindustry',align : 'left'},
		{label : '主营业务', name : 'mainbusiness',index : 'mainbusiness',align : 'left'},
		{label : '法定代表人', name : 'comanylegalperson',index : 'comanylegalperson',align : 'left'},
		{label : '实际控制人', name : 'buicontrolperson',index : 'buicontrolperson',align : 'left'}
		];
	
		thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/report/company/list/get",
		p_tableName : "企业客户基本信息",
		p_height : "auto",
		p_colModel : colModel
		}).navButtonAdd(pager_selector,{  
			   caption:"导出报表 &nbsp;&nbsp;",   
			   buttonicon:"fa-angle-double-down purple",
			   onClickButton: function(){
				   var fileName = '';
				   $.ajax({
				        url: Global.appCtx + '/report/company/setExcel',
				        type: 'post',
				        data: $("#searchForm").serialize(),
				        dataType: 'json',
				        success: function (data) {
				        	if(data.msg == '0') {
				        		fileName = data.name
				        		if(data.name != '' && data.name != undefined) {
									   bootbox.confirm("确认下载?",function(result){
									    	if(!result) {
									    		$.ajax({
											        url: Global.appCtx + '/report/company/deleteExcel',
											        type: 'post',
											        data: {"fileName" : fileName},
											        dataType: 'json',
											        success: function (data) {
											        },
											    });
									    		return ;
									    	}
									    	
									    	window.location.href = Global.appCtx + "/report/company/downExcel?fileName=" + fileName;
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
Company.jqgrid.loadData = function (data) {
	var thisObject = Company.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = Company.jqgrid;
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
Company.jqgrid.clearSearch = function () {
	var thisObject = Company.jqgrid;
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
Company.jqgrid.reload = function () {
	var thisObject = Company.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

$(function(){
			// 初始化jqgrid
	Company.jqgrid.init();
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		Company.jqgrid.loadData(filter);
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
