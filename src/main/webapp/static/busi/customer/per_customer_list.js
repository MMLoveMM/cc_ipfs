/**
 * 交易管理
 */
var PersonCustomer = PersonCustomer || {};
/**
 * jqgrid对象
 */
PersonCustomer.jqgrid = PersonCustomer.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
PersonCustomer.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */
PersonCustomer.jqgrid.init = function () {
	var thisObject = PersonCustomer.jqgrid;
	var options = {};
	var grid_selector = "#mainGrid-table";
	var pager_selector = "#mainGrid-pager";
	var colModel = [
		{label : '客户编号', name : 'pernum',index : 'pernum',align : 'center'},
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
		{label : '手机号码', name : 'phone',index : 'phone',align : 'center'},
		{label : '居住地址', name : 'address',index : 'address',align : 'center'},
		{label : '工作单位', name : 'workunit',index : 'workunit',align : 'center'},
		{label : '录入人', name : 'name',index : 'name',align : 'center'},
		{label : '录入时间', name : 'createtime',index : 'createtime',align : 'center'},
		{label : '操作', name : 'operating',index : 'operating',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var modPersonInfo = "<button class='btn btn-xs btn-success openbtn' onclick=\"PersonCustomer.modPersonInfo('" + rowObject.id + "')\">修改</button>";
				var delPersonInfo = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"PersonCustomer.delPersonInfo('" + rowObject.id + "')\">删除</button>"
				var details = "<button class='btn btn-xs btn-primary' onclick=\"PersonCustomer.details('" + rowObject.id + "')\">详情</button>";
				
				return '<div class="btn-group btn-group-sm">' + modPersonInfo + delPersonInfo + details + '</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/customer/person/list/get",
		p_tableName : "客户信息管理",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"添加 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   window.location.href = Global.appCtx + "/customer/person/list/add";
		   },   
		   position:"last"
	})
}

/**
 * 加载数据
 * @param data 搜索条件数据
 */
PersonCustomer.jqgrid.loadData = function (data) {
	var thisObject = PersonCustomer.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = PersonCustomer.jqgrid;
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
PersonCustomer.jqgrid.clearSearch = function () {
	var thisObject = PersonCustomer.jqgrid;
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
PersonCustomer.jqgrid.reload = function () {
	var thisObject = PersonCustomer.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}



/**
 * 加载数据
 * @param data 搜索条件数据
 */
PersonCustomer.jqgrid.loadData = function (data) {
	var thisObject = PersonCustomer.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = PersonCustomer.jqgrid;
	thisObject.$tableSelector.setGridParam({
		mtype : "POST",
		datatype : "json",
		postData : data,
		page : 1
	}).trigger("reloadGrid");
}


/**
 * 删除个人客户列表
 */
PersonCustomer.delPersonInfo = function (id) {
	bootbox.confirm("确认删除?",function(result){	
    	if(!result) {
    		return ;
    	}
	    $.ajax({
	        url: Global.appCtx + '/customer/person/del',
	        type: 'post',
	        data: {'id' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }else{
	            	 bootbox.alert("删除成功", function () {
	 	            	location.reload();
	 	            });
	            }
	        },
	        error : function () {
	            bootbox.alert("删除个人客户列表异常");
	        }
	    });
    });
}

/**
 * 修改个人客户信息列表
 */

PersonCustomer.modPersonInfo = function (id) {
	//跳转到修改个人客户信息页面
	window.location.href=Global.appCtx + "/customer/person/list/mod?id=" + id ;
	
}

/**
 * 个人客户信息详情
 */
PersonCustomer.details = function(id){
	window.location.href=Global.appCtx + "/customer/person/list/view?id=" + id ;
}


$(function(){
	
	
	// 初始化jqgrid
	PersonCustomer.jqgrid.init();
	
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#searchForm").serialize());
		PersonCustomer.jqgrid.loadData(filter);
	});
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#searchForm")[0]).reset();
	});
	
	
});