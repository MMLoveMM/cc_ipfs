/**
 * 交易管理
 */
var Customerlist = Customerlist || {};
/**
 * jqgrid对象
 */
Customerlist.jqgrid = Customerlist.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Customerlist.jqgrid.$tableSelector = null;

/**
 * 初始化jqgrid
 */
Customerlist.jqgrid.init = function(){
	var thisObject = Customerlist.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
	  //{label : '附件', name : 'fj',index : 'fj', align : 'left'},           
	    {label : '企业编号', name : 'companynum',index : 'companynum',align : 'left'},
		{label : '企业名称', name : 'companyname',index : 'companyname',align : 'left'},
		{label : '成立时间', name : 'createtime',index : 'createtime',align : 'left'},
		{label : '联系人', name : 'contacts',index : 'contacts',align : 'left'},
		{label : '企业类型', name : 'companytype',index : 'companytype',align : 'left',
			formatter : function (cellValue, options, rowObject) {
				var countyList = $("#countyList").val();
				var jsonDictList = $.parseJSON(countyList);
				if(jsonDictList.length > 0) {
					for(var i = 0; i < jsonDictList.length; i++) {
						if(jsonDictList[i].dictType == 'customEnterpriseType' && jsonDictList[i].dcode == cellValue) {
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
		{label : '联系人电话', name : 'contactnumber',index : 'contactnumber',align : 'left'},
		{label : '录入人', name : 'userid',index : 'userid',align : 'left'},
		{label : '录入时间', name : 'addtime',index : 'addtime',align : 'left'},
		{label : '区县', name : 'county',index : 'county',align : 'left',
			formatter : function (cellValue, options, rowObject) {
				var countyList = $("#countyList").val();
				var jsonDictList = $.parseJSON(countyList);
				if(jsonDictList.length > 0) {
					for(var i = 0; i < jsonDictList.length; i++) {
						if(jsonDictList[i].dictType == 'addressList' && jsonDictList[i].dcode == cellValue) {
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
		{label : '推荐状态', name : 'recommendStatus',index : 'recommendStatus',align : 'left',
			formatter : function (cellValue, options, rowObject) {
				if(rowObject.recommendStatus == '1' || rowObject.recommendStatus == '') {
		    		return "<button class='btn btn-xs btn-success' onclick=\"Customerlist.modType('" + rowObject.id + "','" + rowObject.recommendStatus + "')\">推荐</button>";
	    		}else{
	    			return "<button class='btn btn-xs btn-danger' onclick=\"Customerlist.modType('" + rowObject.id + "','" + rowObject.recommendStatus + "')\">取消推荐</button>";
	    		}
			}
		},
		{label : '操作' , name : 'cz' , index : 'cz' , align : 'left', width : '160px',
			formatter : function(cellvalue, options, rowObject){
				var modCustomer = "<button class='btn btn-xs btn-success openbtn' onclick=\"Customerlist.modCustomer('" + rowObject.id + "')\">修改</button>";
				var listCustomer = "<button class='btn btn-xs btn-success openbtn' onclick=\"Customerlist.listCustomer('" + rowObject.id + "')\">详情</button>";
				var delCustomer = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"Customerlist.delCustomer('" + rowObject.id + "')\">删除</button>"
				
				return '<div class="btn-group btn-group-sm">' + modCustomer + listCustomer + delCustomer + '</div>';
			}
		}
	    ];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/customer/companys/list/get",
		p_tableName : "客户信息管理",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"添加 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   window.location.href=Global.appCtx + "/customer/company/list";
		   },   
		   position:"last"
	}).navButtonAdd(pager_selector,{  
		   caption:"批量导出 &nbsp;&nbsp;",   
		   buttonicon:"fa fa-plus-circle purple",
		   onClickButton: function(){
			   $.ajax({
			        url: Global.appCtx + '/customer/companys/exportExcel',
			        type: 'post',
			        data: $("#listForm").serialize(),
			        dataType: 'json',
			        success: function (data) {
			        	if(data.msg == '0') {
			        		fileName = data.name
			        		if(data.name != '' && data.name != undefined) {
								   bootbox.confirm("确认下载?",function(result){
								    	if(!result) {
								    		$.ajax({
										        url: Global.appCtx + '/customer/companys/deleteExcel',
										        type: 'post',
										        data: {"fileName" : fileName},
										        dataType: 'json',
										        success: function (data) {
										        },
										    });
								    		return ;
								    	}
								    	
								    	window.location.href = Global.appCtx + "/customer/companys/downExcel?fileName=" + fileName;
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
 * @param 
 */
Customerlist.jqgrid.loadData = function (data) {
	var thisObject = Customerlist.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = Customerlist.jqgrid;
	thisObject.$tableSelector.setGridParam({
		mtype : "POST",
		datatype : "json",
		postData : data,
		page : 1
	}).trigger("reloadGrid");
}

/**
 * 刷新jqgrid
 */
Customerlist.jqgrid.reload = function () {
	var thisObject = Customerlist.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

/**
 * 清除搜索条件
 */
Customerlist.jqgrid.clearSearch = function () {
	var thisObject = Customerlist.jqgrid;
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

Customerlist.modType = function(id,recommendStatus){
	$.ajax({
		url : Global.appCtx + '/customer/companys/changeRecommendStatus',
		type : 'post',
		data : {'id' : id , 'recommendStatus' : recommendStatus},
		dataType : 'json',
		success: function (data) {
            if (data != 0) {
                bootbox.alert(data);
            }
            bootbox.alert("更改推荐状态成功", function () {
            	Customerlist.jqgrid.reload();
            });
        },
        error : function () {
            bootbox.alert("更改推荐状态异常");
        }
	});
}

/**
 * 修改客户信息
 */
Customerlist.modCustomer = function(id){
	window.location.href=Global.appCtx + "/customer/companys/customerUpdate?id=" + id;
}

/**
 * 企业客户信息详情
 */
Customerlist.listCustomer = function(id){
	window.location.href=Global.appCtx + "/customer/companys/viewCustomer?id=" + id;
}


/**
 * 删除客户信息
 */
Customerlist.delCustomer = function(id){
	bootbox.confirm("确认删除?",function(result){
		if(!result) {
    		return ;
    	}
		$.ajax({
			url : Global.appCtx + '/customer/companys/delCustomer',
			type : 'post',
			data : {'id' : id},
			dataType : 'json',
			success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }
	            bootbox.alert("删除客户信息成功", function () {
	            	Customerlist.jqgrid.reload();
	            });
	        },
	        error : function () {
	            bootbox.alert("删除客户信息异常");
	        }
		});
	});
}

$(function(){
	// 初始化jqgrid
	
	Customerlist.jqgrid.init();
	
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#listForm").serialize());
		Customerlist.jqgrid.loadData(filter);
	});
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#listForm")[0]).reset();
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
	
	//成立时间
	$("#createTime").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	
});

