/**
 * 交易管理
 */
var Customerview = Customerview || {};
/**
 * jqgrid对象
 */
Customerview.jqgrid = Customerview.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Customerview.jqgrid.$tableSelector = null;

layui.use(['layer', 'form', 'element'], function(exports){
	//加载
  var layer = layui.layer,
      form = layui.form,
      element = layui.element;
});

window.onload = function(){
	var tadas = $("#tdata").val();
	var jsonDictList = $.parseJSON(tadas);
	var hylx1 = $("#hylx").val();
	var qylx1 = $("#qylx").val();
	var gsgm1 = $("#gsgm").val();
	var khzl1 = $("#khzl").val();
	var khzt1 = $("#khzt").val();
	var frzg1 = $("#frzg").val();
	var lsgx1 = $("#lsgx").val();
	var qx1 = $("#qx").val();
	var zjbf1 = $("#zjbfgj").val();
	var zjlx1 = $("#zjlx").val();
	for(var i=0; i<jsonDictList.length; i++){
		if(jsonDictList[i].dictType == 'businesstype' && jsonDictList[i].dcode == hylx1){
			document.getElementById("businesstype").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'customEnterpriseType' && jsonDictList[i].dcode == qylx1){
			document.getElementById("companytype").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'comSize' && jsonDictList[i].dcode == gsgm1){
			document.getElementById("comsize").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'customerType' && jsonDictList[i].dcode == khzl1){
			document.getElementById("customertype").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'customerStatus' && jsonDictList[i].dcode == khzt1){
			document.getElementById("customerstatus").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'corporateCapacity' && jsonDictList[i].dcode == frzg1){
			document.getElementById("corporatecapacity").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'subordination' && jsonDictList[i].dcode == lsgx1){
			document.getElementById("subordination").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'addressList' && jsonDictList[i].dcode == qx1){
			document.getElementById("county").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'nation' && jsonDictList[i].dcode == zjbf1){
			document.getElementById("zjbfdq").innerHTML = jsonDictList[i].dname;
		}
		if(jsonDictList[i].dictType == 'custIdType' && jsonDictList[i].dcode == zjlx1){
			document.getElementById("zjtype").innerHTML = jsonDictList[i].dname;
		}
	}
}

$(function(){
	
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

