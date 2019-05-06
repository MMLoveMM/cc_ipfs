/**
 * 交易管理
 */
var PersonCustomerInfoView = PersonCustomerInfoView || {};
/**
 * jqgrid对象
 */
PersonCustomerInfoView.jqgrid = PersonCustomerInfoView.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
PersonCustomerInfoView.jqgrid.$tableSelector = null;

layui.use(['layer', 'form', 'element'], function(exports){
	//加载
  var layer = layui.layer,
      form = layui.form,
      element = layui.element;
});

$(function(){
	if($("#companyId").val() != ''){
		var id = $("#companyId").val();
		var tadas = $("#dataDicts").val();
		var jsonDictList = $.parseJSON(tadas);
		
		//显示企业信息
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
	}else{
		$("#glqy").hide();
		$("#gl").show();
	}
	
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
	
});