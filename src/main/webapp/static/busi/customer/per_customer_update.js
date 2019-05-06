/**
 * 交易管理
 */
var PersonUpdate = PersonUpdate || {};
/**
 * jqgrid对象
 */
PersonUpdate.jqgrid = PersonUpdate.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
PersonUpdate.jqgrid.$tableSelector = null;

/**
 * 初始化负债信息jqgrid
 */
PersonUpdate.jqgrid.init = function () {
	var thisObject = PersonUpdate.jqgrid;
	var options = {};
	var grid_selector = "#fzGrid-table";
	var pager_selector = "#fzGrid-pager";
	var perid = $("#personId").val();
	var colModel = [
		{label : '序号', name : 'id',index : 'id',align : 'center'},
		{label : '负债类型', name : 'liabtype',index : 'liabtype',align : 'center'},
		{label : '借款金额', name : 'credit',index : 'credit',align : 'center'},
		{label : '已还款', name : 'paid',index : 'paid',align : 'center'},
		{label : '未还款', name : 'nopay',index : 'nopay',align : 'center'},
		{label : '月均需还款', name : 'averagepay',index : 'averagepay',align : 'center'},
		{label : '操作', name : 'myac',index : 'myac',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var delfzInfo = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"PersonUpdate.delfzInfo('" + rowObject.id + "')\">删除</button>"
				return '<div class="btn-group btn-group-sm">' + delfzInfo + '</div>';
			}
		}
	];
	
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/customer/person/list/getLoadLiabs?perid=" + perid,
		p_tableName : "信息列表",
		p_height : "auto",
		p_colModel : colModel
	})
}

/**
 * 关联企业模态框内表格
 */
PersonUpdate.ViewCustomerJqgrid = {};
PersonUpdate.ViewCustomerJqgrid.$selectTable = null;
PersonUpdate.ViewCustomerJqgrid.init = function () {
	var thisObject = PersonUpdate.ViewCustomerJqgrid;
	var $thisJqgrid = $("#grid-table");
	thisObject.$selectTable = $thisJqgrid;
	var width = $thisJqgrid.parent().width();
	var height = 200;
	var colModel = [
		{label : '企业编号', name : 'companynum',index : 'companynum',align : 'center'},
		{label : '企业名称', name : 'companyname',index : 'companyname',align : 'center'},
		{label : '联系人', name : 'contacts',index : 'contacts',align : 'center'},
		{label : '企业类型', name : 'companytype',index : 'companytype',align : 'center'},
		{label : '联系人电话', name : 'contactnumber',index : 'contactnumber',align : 'center'},
		{label : '录入人', name : 'userid',index : 'userid',align : 'center'}
	];
	
	$thisJqgrid.jqGrid({
		url : Global.appCtx + "/customer/person/company/list",
		datatype: "json",
		mtype: 'POST',
		cellEdit : false,
		width : 575,
        height : height,//高度，表格高度。可为数值、百分比或'auto'
        shrinkToFit : true, // 为false使用column width
        colModel : colModel,
        rownumbers : false,//添加左侧行号
        // rownumWidth : 20,
        viewrecords : true,//是否在浏览导航栏显示记录总数
        rowNum : -1,//每页显示记录数   -1为全部
        altRows: true,
		multiselect: false,
        multiboxonly: true,
        jsonReader : {
        	root:"list",
        	page: "pageNum",
        	total: "pages",
        	records: "total"
		}
    });
	return thisObject;
	
}

/**
 * 模态框 加载数据
 * @param data 搜索条件数据
 */
PersonUpdate.ViewCustomerJqgrid.loadData = function (data) {
	var thisObject = PersonUpdate.ViewCustomerJqgrid;
	var $thisJqgrid = $("#grid-table");
	thisObject.$tableSelector = $thisJqgrid;
	thisObject.clearSearch();
	data = data || {};
	thisObject.$tableSelector.setGridParam({
		mtype : "POST",
		datatype : "json",
		postData : data,
		page : 1
	}).trigger("reloadGrid");
}

/**
 * 模态框 刷新jqgrid
 */
PersonUpdate.ViewCustomerJqgrid.reload = function () {
	var thisObject = PersonUpdate.ViewCustomerJqgrid;
	var $thisJqgrid = $("#grid-table");
	thisObject.$selectTable = $thisJqgrid;
	thisObject.$selectTable.trigger("reloadGrid");
}

/**
 * 模态框清除搜索条件
 */
PersonUpdate.ViewCustomerJqgrid.clearSearch = function () {
	var thisObject = PersonUpdate.ViewCustomerJqgrid;
	var $thisJqgrid = $("#grid-table");
	var oriData = $thisJqgrid.jqGrid("getGridParam","postData");
	var colms = $thisJqgrid.jqGrid("getGridParam","colModel");
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
 * 负债刷新jqgrid
 */
PersonUpdate.jqgrid.reload = function () {
	var thisObject = PersonUpdate.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}


/**
 * 初始化资产信息jqgrid
 */
PersonUpdate.jqgrid.AssetInfoInit = function () {
	var thisObject = PersonUpdate.jqgrid;
	var options = {};
	var grid_selector = "#zcGrid-table";
	var pager_selector = "#zcGrid-pager";
	var perid = $("#personId").val();
	var colModel = [
		{label : '序号', name : 'id',index : 'id',align : 'center'},
		{label : '资产类型', name : 'housingtype',index : 'housingtype',align : 'center'},
		{label : '地址/型号', name : 'addornum',index : 'addornum',align : 'center'},
		{label : '面积/数量', name : 'areaornum',index : 'areaornum',align : 'center'},
		{label : '购买时间', name : 'buytime',index : 'buytime',align : 'center'},
		{label : '购买价值', name : 'purchasevalue',index : 'purchasevalue',align : 'center'},
		{label : '评估价值', name : 'valuationvalue',index : 'valuationvalue',align : 'center'},
		{label : '权证号', name : 'warrantsnum',index : 'warrantsnum',align : 'center'},
		{label : '权属及使用情况', name : 'ownerandusage',index : 'ownerandusage',align : 'center'},
		{label : '操作', name : 'myac',index : 'myac',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var delzcInfo = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"PersonUpdate.delzcInfo('" + rowObject.id + "')\">删除</button>"
				return '<div class="btn-group btn-group-sm">' + delzcInfo + '</div>';
			}
		}
	];
	thisObject.$tableSelector = Global.initTable({
		p_grid_selector : grid_selector,
		p_pager_selector : pager_selector,
		p_url : Global.appCtx + "/customer/person/list/getLoadAssetInfo?perid=" + perid,
		p_tableName : "信息列表",
		p_height : "auto",
		p_colModel : colModel
	})
}


/**
 * 加载数据
 * 
 * @param data
 *            搜索条件数据
 */
PersonUpdate.jqgrid.loadData = function (data) {
	var thisObject = PersonUpdate.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = PersonUpdate.jqgrid;
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
PersonUpdate.jqgrid.clearSearch = function () {
	var thisObject = PersonUpdate.jqgrid;
	var oriData = thisObject.$tableSelector.jqGrid("getGridParam","postData");
	var colms = thisObject.$tableSelector.jqGrid("getGridParam","colModel");
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
 * 添加负债信息
 * 
 * @returns
 */
function addLiab(liabtype,credit,paid,nopay,averagepay,perid){
	var liabtype = $('input[name="liabtype"]:checked').val();
	if($.trim(liabtype)==""){
		bootbox.alert("请选择负债类型!");
		return ;
	}
	var credit = $("#credit").val();
	if($.trim(credit)==""){
		bootbox.alert("请输入借款金额!");
		return ;
	}
	var paid = $("#paid").val();
	if($.trim(paid)==""){
		bootbox.alert("请输入已还款!");
		return ;
	}
	var nopay = $("#nopay").val();
	if($.trim(nopay)==""){
		bootbox.alert("请输入未还款!");
		return ;
	}
	var averagepay = $("#averagepay").val();
	if($.trim(averagepay)==""){
		bootbox.alert("请输入月均需还款!");
		return ;
	}
	var datas = new Object();
	
	datas['liabtype']=$('input[name="liabtype"]:checked').val();
	datas['credit']=$("#credit").val();
	datas['paid']=$("#paid").val();
	datas['nopay' ]=$("#nopay").val();
	datas['averagepay' ]=$("#averagepay").val();
	datas['perid'] = $("#personId").val();
	  $.ajax({
	        url: Global.appCtx + '/customer/person/list/addLoadLiabs',
	        type: 'post',
	        data: datas,
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }else{
	            	bootbox.alert("添加成功",function(){
	            		$("input[type='radio']").removeAttr('checked');
						$("#credit").val('');
						$("#paid").val('');
						$("#nopay").val('');
						$("#averagepay").val('');
						PersonUpdate.jqgrid.init();
						PersonUpdate.jqgrid.reload();
	            	});
	            }
	        },
	        error : function () {
	            bootbox.alert("添加负债信息异常");
	        }
	    });
}

/**
 * 删除负债信息
 */
PersonUpdate.delfzInfo = function (id) {
	    $.ajax({
	        url: Global.appCtx + '/customer/person/list/delLoadLiabs',
	        type: 'post',
	        data: {'id' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }else{
	            	bootbox.alert("删除成功",function(){
	            		PersonUpdate.jqgrid.reload();
	            	});
	            }
	        },
	        error : function () {
	            bootbox.alert("删除负债信息异常");
	        }
	    });
}

/**
 * 添加资产信息
 * 
 * @returns
 */
function addAssetInfo(housingtype,addornum,areaornum,buytime,purchasevalue,valuationvalue,warrantsnum,ownerandusage,perid){
	
	var housingtype = $('input[name="housingtype"]:checked').val();
	if($.trim(housingtype)==""){
		bootbox.alert("请选择资产类型!");
		return ;
	}
	var addornum = $("#addornum").val();
	if($.trim(addornum)==""){
		bootbox.alert("请输入地址/型号!");
		return ;
	}
	var areaornum = $("#areaornum").val();
	if($.trim(areaornum)==""){
		bootbox.alert("请输入面积/数量!");
		return ;
	}
	var buytime = $("#startDate").val();
	if($.trim(buytime)==""){
		bootbox.alert("请输入购买时间!");
		return ;
	}
	var purchasevalue = $("#purchasevalue").val();
	if($.trim(purchasevalue)==""){
		bootbox.alert("请输入购买价值!");
		return ;
	}
	var valuationvalue = $("#valuationvalue").val();
	if($.trim(valuationvalue)==""){
		bootbox.alert("请输入评估价值!");
		return ;
	}
	var warrantsnum = $("#warrantsnum").val();
	if($.trim(warrantsnum)==""){
		bootbox.alert("请输入权证号!");
		return ;
	}
	var ownerandusage = $("#ownerandusage").val();
	if($.trim(ownerandusage)==""){
		bootbox.alert("请输入权属及使用情况!");
		return ;
	}
	
	var datas = new Object();
	datas['housingtype']=$('input[name="housingtype"]:checked').val();
	datas['addornum']=$("#addornum").val();
	datas['areaornum']=$("#areaornum").val();
	datas['buytime']=$("#startDate").val();
	datas['purchasevalue'] = $("#purchasevalue").val();
	datas['valuationvalue'] = $("#valuationvalue").val();
	datas['warrantsnum'] = $("#warrantsnum").val();
	datas['ownerandusage'] = $("#ownerandusage").val();
	datas['perid'] = $("#personId").val();
	  $.ajax({
	        url: Global.appCtx + '/customer/person/list/addAssetInfo',
	        type: 'post',
	        data: datas,
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }else{
	            	bootbox.alert("添加成功", function () {
	            		$("input[type='radio']").removeAttr('checked');
						$("#addornum").val('');
						$("#areaornum").val('');
						$("#startDate").val('');
						$("#purchasevalue").val('');
						$("#valuationvalue").val('');
						$("#warrantsnum").val('');
						$("#ownerandusage").val('');
						PersonUpdate.jqgrid.AssetInfoInit();
						PersonUpdate.jqgrid.reload();
	            	});
	            }
	        },
	        error : function () {
	            bootbox.alert("添加资产信息异常");
	        }
	    });
}

/**
 * 删除资产信息
 */
PersonUpdate.delzcInfo = function (id) {
	    $.ajax({
	        url: Global.appCtx + '/customer/person/list/delLoadAssInfo',
	        type: 'post',
	        data: {'id' : id},
	        dataType: 'json',
	        success: function (data) {
	            if (data != 0) {
	                bootbox.alert(data);
	            }else{
	            	bootbox.alert("删除成功", function () {
	            		PersonUpdate.jqgrid.reload();
	            	});
	            }
	        },
	        error : function () {
	            bootbox.alert("删除资产信息异常");
	        }
	    });
}

/**
 * 获取负债信息上传附件名称
 */
var getFileName = function(){
	$("#btn_file").click();
	$("#btn_file").change(function(){
		var fileName = document.getElementById('btn_file').files[0].name;
		$("#fjmc").val(fileName);
		if($("#fjmc").val() != ''){
			$("#uploadFile").show();
		}else{
			$("#uploadFile").hide();
		}
	});
}

/**
 * 获取资产信息上传附件名称
 */
var getFileName2 = function(){
	$("#btn_file2").click();
	$("#btn_file2").change(function(){
		var fileName = document.getElementById('btn_file2').files[0].name;
		$("#fjmc2").val(fileName);
		if($("#fjmc2").val() != ''){
			$("#uploadFile2").show();
		}else{
			$("#uploadFile2").hide();
		}
	});
}



/**
 * 获取证件信息上传附件名称
 */
var getAnnexFileName = function(){
	$("#btn_file3").click();
	$("#btn_file3").change(function(){
		var fileName = document.getElementById('btn_file3').files[0].name;
		$("#fjmc3").val(fileName);
		if($("#fjmc3").val() != ''){
			$("#uploadFile3").show();
		}else{
			$("#uploadFile3").hide();
		}
	});
}

/**
 * 上传附件(负债信息)
 */
var uploadLiab = function(){
		var formData = new FormData();
		var percustomerId = $("#personId").val();
	    formData.append("myfile", document.getElementById("btn_file").files[0]); 
	    $.ajax({
	   	 url: Global.appCtx + '/customer/company/upload?customerId='+ percustomerId,
	        type: "POST",
	        data: formData,
	        contentType: false,
	        processData: false,
	        success: function (data) {
	        	if(data != 0) {
		                bootbox.alert(data);
		        }else{
		            	bootbox.alert("上传成功!");
		        }
	        },
	        error: function () {
	        	bootbox.alert("上传失败!");
	        }
	    });
}

/**
 * 上传附件(资产信息)
 */
var uploadAsset = function(){
		var formData = new FormData();
		var percustomerId = $("#personId").val();
	    formData.append("myfile", document.getElementById("btn_file2").files[0]); 
	    $.ajax({
	   	 url: Global.appCtx + '/customer/company/upload?customerId='+ percustomerId,
	        type: "POST",
	        data: formData,
	        contentType: false,
	        processData: false,
	        success: function (data) {
	        	if(data != 0) {
		                bootbox.alert(data);
		        }else{
		            	bootbox.alert("上传成功!");
		        }
	        },
	        error: function () {
	        	bootbox.alert("上传失败!");
	        }
	    });
}


/**
 * 上传证件信息---包含附件
 */
var uploadAnnex = function(){
	var num = $("#num").val();//证件号码
	var certtypes = $("#certtypes").val();//证件类型
	var perid = $("#personId").val();
	if($.trim(num) == ''){
		bootbox.alert("请填写证件号码!");
		return false;
	}
	
	if($.trim(certtypes) == ''){
		bootbox.alert("请填写证件类型!");
		return false;
	}
	
	var formData = new FormData();
    formData.append("myfile", document.getElementById("btn_file3").files[0]); 
    
    $.ajax({
   	 url: Global.appCtx + '/customer/company/upload?customerId='+ perid,
        type: "POST",
        data: formData,
        contentType: false,
        processData: false,
        success: function (data) {
        	if(data != 0) {
	                bootbox.alert(data);
	        }else{
	        		//保存证件信息
	        		saveAnnex(num,certtypes,perid);
	        }
        },
        error: function () {
        	bootbox.alert("上传失败!");
        }
    });
}


var saveAnnex = function(num,certtypes,perid,cc){
	$.ajax({
	   	 	url: Global.appCtx + '/customer/person/addAnnexdocs',
	        type: "post",
	        data: {
	        	'num' : num,
	        	'certtypes' : certtypes,
	        	'perid' : perid
	        },
	        dataType: 'json',
	        success: function (data) {
	        	if(data != 0) {
		                bootbox.alert(data);
		        }else{
		            	bootbox.alert("保存证件信息成功!");
		        }
	        },
	        error: function () {
	        	bootbox.alert("保存证件信息失败!");
	        }
	    });
}


//根据是否关联企业 显示or隐藏模态框
var affiliated = function(){
	var res = $('input[name="isrelcus"]:checked').val();
	if(res == '0'){
		//隐藏企业名称
		$('#companys').hide();
		//清除关联企业id
		$("#companyId").val('');
		return false;
	}else{
		$('#companys').show();
		return false;
	}
}

var checK = function(){
	var res = $('input[name="isrelcus"]:checked').val();
	var companyId  = $("#companyId").val();
		if(res == '1' && $.trim(companyId)==""){
			bootbox.alert("请选择关联企业!");
			return false;
		}
	return true;
}

$(function(){
	//初始化关联企业表
	PersonUpdate.ViewCustomerJqgrid.init();
	//初始化负债信息表格
	PersonUpdate.jqgrid.init();
	//初始化资产信息表格
	PersonUpdate.jqgrid.AssetInfoInit();
	
	//是否关联企业 单选按钮
	if($("#companyName").val() != ''){
		$("#yesCompanys").attr("checked","checked");
	}else{
		$("#noCompanys").attr("checked","checked");
		//隐藏企业名称
		$('#companys').hide();
	}
	
	
	//显示性别
	var xb1 = document.getElementById("xb").value;
	var sexValue = document.getElementById("sex");
	var k;
	for(k=0; k<sexValue.options.length; k++){
		var o = sexValue.options[k];
		if(xb1.indexOf(o.value.trim()) >= 0){
			o.selected = true;	
		}
	}
	
	//搜索栏时间格式化
	$("#startDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	
	
 	//查询
	$("#search").click(function(){
		var filter = Global.KVToObject($("#updatePersonInfoForm").serialize());
		PersonUpdate.ViewCustomerJqgrid.loadData(filter);
	});
	
	//重置
	$("#resetSelect").click(function(){
		($("#updatePersonInfoForm")[0]).reset();
	});
	
	//提交
	$("#saveUpdate").click(function(){
		var res = $('input[name="isrelcus"]:checked').val();
		var companyId  = $("#companyId").val();
			if(res == '1' && $.trim(companyId)==""){
				bootbox.alert("请选择关联企业!");
				return false;
			}
		var result = $("#updatePersonInfoForm").Validform();
		bootbox.confirm("确认提交?",function(result){
			if(!result){
				return ;
			}
			$.ajax({
		        url: Global.appCtx + '/customer/person/modPersonInfo',
		        type: 'post',
		        data: $("#updatePersonInfoForm").serialize(),
		        dataType: 'json',
		        success: function (data) {
		            if (data != 0) {
		                bootbox.alert(data);
		            }else{
		            	bootbox.alert("提交成功", function () {
		            		location.reload();
		            	});
		            }
		        },
		        error : function () {
		            bootbox.alert("提交项目信息异常");
		        }
		    });
		});
	});
	
	// 初始化 关联企业jqgrid
	$("#selectcompanys").click(function() {
		$("#companyModal").modal('show');
	});
	
	//选择关联企业
	$("#sureCompanys").click(function() {
		var ids =$("#grid-table").jqGrid("getGridParam","selrow");
		$("#companyId").val(ids);
		
		if($("#companyId").val()!= ''){
			 var ret = $("#grid-table").jqGrid("getRowData",ids);
			 $("#companyName").val(ret.companyname);
		}
		$('#companyModal').modal('hide');
		return false;
	});
	//表单验证成功后，提交
	var demo=$(".updatePersonInfoForm").Validform({
		tiptype:3,
		btnSubmit:"#saveUpdate", 
		showAllError:true,
		callback:function(data){
			return false;
		}
	});
});