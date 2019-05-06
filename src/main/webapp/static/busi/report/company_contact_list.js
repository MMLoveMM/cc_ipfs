/**
 * 交易管理
 */
var CompanyContact = CompanyContact || {};
/**
 * jqgrid对象
 */
CompanyContact.jqgrid = CompanyContact.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
CompanyContact.jqgrid.$tableSelector = null;
/**
 * 初始化jqgrid
 */

CompanyContact.jqgrid.init = function () {
	var thisObject = CompanyContact.jqgrid;
	var options = {};
	var grid_selector = "#grid-table";
	var pager_selector = "#grid-pager";
	var colModel = [
		{label : '客户编号', name : 'companynum',index : 'companynum',align : 'center'},
		{label : '企业名称', name : 'companyname',index : 'companyname',align : 'center'},
		{label : '联系人姓名', name : 'contacts',index : 'contacts',align : 'center'},
		{label : '职务', name : 'post',index : 'post',align : 'center'},
		{label : '联系电话', name : 'contactnumber',index : 'contactnumber',align : 'center'},
		{label : '手机号码', name : 'phonenumber',index : 'phonenumber',align : 'center'},
		{label : '传真', name : 'fax',index : 'fax',align : 'center'},
		{label : '电子邮箱', name : 'email',index : 'email',align : 'center'},
		{label : '录入时间', name : 'createTime',index : 'createTime',align : 'center'},
		{label : '操作', name : 'operating',index : 'operating',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var details = "<button class='btn btn-xs btn-success openbtn' onclick=\"CompanyContact.details('" + rowObject.id + "')\">企业详情</button>";
				return '<div class="btn-group btn-group-sm">' + details + '</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/report/company/Contact/list/get",
		p_tableName : "企业客户联系人",
		p_height : "auto",
		p_colModel : colModel
	}).navButtonAdd(pager_selector,{  
		   caption:"导出报表 &nbsp;&nbsp;",   
		   buttonicon:"fa-angle-double-down purple",
		   onClickButton: function(){
			   var fileName = '';
			   $.ajax({
			        url: Global.appCtx + '/report/company/contact/setExcel',
			        type: 'post',
			        data: $("#contactForm").serialize(),
			        dataType: 'json',
			        success: function (data) {
			        	if(data.msg == '0') {
			        		fileName = data.name
			        		if(data.name != '' && data.name != undefined) {
								   bootbox.confirm("确认下载?",function(result){
								    	if(!result) {
								    		$.ajax({
										        url: Global.appCtx + '/report/company/contact/deleteExcel',
										        type: 'post',
										        data: {"fileName" : fileName},
										        dataType: 'json',
										        success: function (data) {
										        },
										    });
								    		return ;
								    	}
								    	
								    	window.location.href = Global.appCtx + "/report/company/contact/downExcel?fileName=" + fileName;
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
CompanyContact.jqgrid.loadData = function (data) {
	var thisObject = CompanyContact.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = CompanyContact.jqgrid;
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
CompanyContact.jqgrid.clearSearch = function () {
	var thisObject = CompanyContact.jqgrid;
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
 * 企业详情
 */
CompanyContact.details = function(id){
	//隐藏联系人表格
	$("#contactForm").hide();
	//隐藏联系人表格
	$("#jqgridTable").hide();
	//显示企业详情
	$("#companysInfo").show();
	var tadas = $("#dataDicts").val();
	var jsonDictList = $.parseJSON(tadas);
	
	    $.ajax({
	        url: Global.appCtx + '/customer/person/companysview',
	        type: 'post',
	        data: {'id' : id},
	        dataType: 'json',
	        success: function (data) {
	        	if (data.res != 0) {
	                bootbox.alert(data);
	            }else{
	            	if(data.customerInfo != null || data.customerInfo != undefined){
	            		 $("#companyname").text(data.customerInfo.companyname);
		            	 $("#shortname").text(data.customerInfo.shortname);
		            	 $("#englishname").text(data.customerInfo.englishname);
		            	 $("#createTime").text(data.customerInfo.createTime);
		            	 $("#registeredcapital").text(data.customerInfo.registeredcapital);
		            	 $("#practicalcapital").text(data.customerInfo.practicalcapital);
		            	 for(var i=0; i<jsonDictList.length; i++){
		            		 if(jsonDictList[i].dictType == 'businesstype' && jsonDictList[i].dcode == data.customerInfo.businesstype){
		            			 $("#businesstype").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'customEnterpriseType' && jsonDictList[i].dcode == data.customerInfo.companytype){
		            			 $("#companytype").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'comSize' && jsonDictList[i].dcode == data.customerInfo.comsize){
		            				 $("#comsize").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'comSize' && jsonDictList[i].dcode == data.customerInfo.customertype){
	            				 $("#customertype").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'customerStatus' && jsonDictList[i].dcode == data.customerInfo.customerstatus){
		            				 $("#customerstatus").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'corporateCapacity' && jsonDictList[i].dcode == data.customerInfo.corporatecapacity){
		            				 $("#corporatecapacity").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'subordination' && jsonDictList[i].dcode == data.customerInfo.subordination){
		            				 $("#subordination").text(jsonDictList[i].dname);
		            		 }
		            		 if(jsonDictList[i].dictType == 'addressList' && jsonDictList[i].dcode == data.customerInfo.county){
		            				 $("#county").text(jsonDictList[i].dname);
		            		 }
		            	 }
		            	 $("#employees").text(data.customerInfo.employees);
		            	 $("#ishighindustry").text(data.customerInfo.ishighindustry);
		            	 $("#mainbusiness").text(data.customerInfo.mainbusiness);
		            	 $("#shareholder").text(data.customerInfo.shareholder);
		            	 $("#managers").text(data.customerInfo.managers);
		            	 $("#comanylegalperson").text(data.customerInfo.comanylegalperson);
		            	 $("#buicontrolperson").text(data.customerInfo.buicontrolperson);
		            	 $("#code").text(data.customerInfo.code);
		            	 $("#companyregisteradd").text(data.customerInfo.companyregisteradd);
		            	 $("#companyofficeadd").text(data.customerInfo.companyofficeadd);
		            	 $("#operateAdd").text(data.customerInfo.operateadd);
		            	 $("#inteproname").text(data.customerInfo.inteproname);
		            	 $("#contacts").text(data.customerInfo.contacts);
		            	 $("#post").text(data.customerInfo.post);
		            	 $("#contactnumber").text(data.customerInfo.contactnumber);
		            	 $("#fax").text(data.customerInfo.fax);
		            	 $("#phoneNumber").text(data.customerInfo.phonenumber);
		            	 $("#email").text(data.customerInfo.email);
		            	 $("#operateAdd").text(data.customerInfo.operateadd);
	            	}
	            	if(data.tCustAcct != null || data.tCustAcct != undefined){
	            		var unitInfos= data.tCustAcct;
	            		initUnitInfo(unitInfos);
	            	}
	            	if(data.tCustCerti != null || data.tCustCerti != undefined){
	            		var tCustCerti= data.tCustCerti;
	            		initTCustCertiInfo(tCustCerti);
	            	}
	            	if(data.accessoryInfos != null || data.accessoryInfos != undefined){
	            		var accessoryInfos= data.accessoryInfos;
	            		initAccessoryInfosInfo(accessoryInfos);
	            	}
	            	if(data.finacialVals != null || data.finacialVals != undefined){
	            		var finacialVals= data.finacialVals;
	            		initfzInfo(finacialVals);
	            		initsyInfo(finacialVals);
	            		initxjInfo(finacialVals);
	            		initcwInfo(finacialVals);
	            	}
	            }
	        },
	        error : function () {
	            bootbox.alert("查询个人客户列表详情异常");
	        }
	    });
}

/**
 * 初始化选项卡
 */
layui.use(['layer', 'form', 'element'], function(exports){
	//加载
  var layer = layui.layer,
      form = layui.form,
      element = layui.element;
});

/**
 * 企业详情
 * @returns
 */
function initUnitInfo(data){
	$.each(data,function(index,val){
		var html = '<tr>'+
						'<td>'+(index+1)+'</td>'+
						'<td>'+val.acctname+'</td>'+
						'<td>'+val.bankacct+'</td>'+
						'<td>'+val.openbank+'</td>'+
					'</tr>';
		$("#zhTable").append(html);
	})
}
/**
 * 证件表
 * @param data
 * @returns
 */
function initTCustCertiInfo(data){
	$.each(data,function(index,val){
		var html = '<tr>'+
						'<td>'+(index+1)+'</td>'+
						'<td>'+val.nation+'</td>'+
						'<td>'+val.idtype+'</td>'+
						'<td>'+val.idno+'</td>'+
						'<td>'+val.idtefdate+'</td>'+
						'<td>'+val.idlefdate+'</td>'+
						'<td>'+val.idasdate+'</td>'+
					'</tr>';
		$("#qyzjTable").append(html);
	})
}

/**
 * 客户附件表
 * @param data
 * @returns
 */
function initAccessoryInfosInfo(data){
	$.each(data,function(index,val){
		var html = '<tr>'+
						'<td>'+(index+1)+'</td>'+
						'<td>'+val.accessoryname+'</td>'+
						'<td>'+val.showname+'</td>'+
						'<td>'+val.accessorytype+'</td>'+
						'<td>'+val.userid+'</td>'+
					'</tr>';
		$("#fjTable").append(html);
	})
}

/**
 * 资产负债表
 * @param data
 * @returns
 */
function initfzInfo(data){
	$.each(data,function(index,val){
		if(val.num < '6000'){
			var html = '<tr>'+
			'<td>'+(index+1)+'</td>'+
			'<td>'+val.num+'</td>'+
			'<td>'+val.val+'</td>'+
			'</tr>';
			$("#zcfzTable").append(html);
		}
	})
}
/**
 * 损益表
 * @param data
 * @returns
 */
function initsyInfo(data){
	$.each(data,function(index,val){
		if(val.num > '6000' && val.num < '7000'){
			var html = '<tr>'+
			'<td>'+(index+1)+'</td>'+
			'<td>'+val.num+'</td>'+
			'<td>'+val.val+'</td>'+
			'</tr>';
			$("#syTable").append(html);
		}
	})
}
/**
 * 现金流程表
 * @param data
 * @returns
 */
function initxjInfo(data){
	$.each(data,function(index,val){
		if(val.num > '7000' && val.num < '8000'){
			var html = '<tr>'+
			'<td>'+(index+1)+'</td>'+
			'<td>'+val.num+'</td>'+
			'<td>'+val.val+'</td>'+
			'</tr>';
			$("#xjTable").append(html);
		}
	})
}
/**
 * 财务比率表
 * @param data
 * @returns
 */
function initcwInfo(data){
	$.each(data,function(index,val){
		if(val.num > '8000'){
			var html = '<tr>'+
			'<td>'+(index+1)+'</td>'+
			'<td>'+val.num+'</td>'+
			'<td>'+val.val+'</td>'+
			'</tr>';
			$("#cwTable").append(html);
		}
	})
}

$(function(){
	
	// 初始化jqgrid
	CompanyContact.jqgrid.init();
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#contactForm")[0]).reset();
	});
	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#contactForm").serialize());
		CompanyContact.jqgrid.loadData(filter);
	});
	//企业详情页面 返回按钮
	$("#search_return_Btn").click(function(){
		window.location.href = Global.appCtx + "/report/company/Contact/list";
	});
	
	//搜索栏时间格式化
	$("#startDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	
});

