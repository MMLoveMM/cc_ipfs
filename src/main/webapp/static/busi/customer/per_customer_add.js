/**
 * 交易管理
 */
var PersonCustomerInfo = PersonCustomerInfo || {};
/**
 * jqgrid对象
 */
PersonCustomerInfo.jqgrid = PersonCustomerInfo.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
PersonCustomerInfo.jqgrid.$tableSelector = null;

/**
 * 初始化负债信息jqgrid
 */
PersonCustomerInfo.jqgrid.init = function () {
	var thisObject = PersonCustomerInfo.jqgrid;
	var options = {};
	var grid_selector = "#fzGrid-table";
	var pager_selector = "#fzGrid-pager";
	var perid = $("#percustomerId").val();
	var colModel = [
		{label : '序号', name : 'id',index : 'id',align : 'center'},
		{label : '负债类型', name : 'liabtype',index : 'liabtype',align : 'center'},
		{label : '借款金额', name : 'credit',index : 'credit',align : 'center'},
		{label : '已还款', name : 'paid',index : 'paid',align : 'center'},
		{label : '未还款', name : 'nopay',index : 'nopay',align : 'center'},
		{label : '月均需还款', name : 'averagepay',index : 'averagepay',align : 'center'},
		{label : '操作', name : 'myac',index : 'myac',align : 'center',
			formatter : function (cellvalue, options, rowObject) {
				var delfzInfo = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"PersonCustomerInfo.delfzInfo('" + rowObject.id + "')\">删除</button>"
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
PersonCustomerInfo.ViewCustomerJqgrid = {};
PersonCustomerInfo.ViewCustomerJqgrid.$selectTable = null;
PersonCustomerInfo.ViewCustomerJqgrid.init = function () {
	var thisObject = PersonCustomerInfo.ViewCustomerJqgrid;
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
 * 模态框加载数据
 * @param data 搜索条件数据
 */
PersonCustomerInfo.ViewCustomerJqgrid.loadData = function (data) {
	var thisObject = PersonCustomerInfo.ViewCustomerJqgrid;
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
PersonCustomerInfo.ViewCustomerJqgrid.reload = function () {
	var thisObject = PersonCustomerInfo.ViewCustomerJqgrid;
	var $thisJqgrid = $("#grid-table");
	thisObject.$selectTable = $thisJqgrid;
	thisObject.$selectTable.trigger("reloadGrid");
}

/**
 * 模态框清除搜索条件
 */
PersonCustomerInfo.ViewCustomerJqgrid.clearSearch = function () {
	var thisObject = PersonCustomerInfo.ViewCustomerJqgrid;
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
 * 刷新jqgrid
 */
PersonCustomerInfo.jqgrid.reload = function () {
	var thisObject = PersonCustomerInfo.jqgrid;
	thisObject.$tableSelector.trigger("reloadGrid");
}

/**
 * 初始化资产信息jqgrid
 */
PersonCustomerInfo.jqgrid.AssetInfoInit = function () {
	var thisObject = PersonCustomerInfo.jqgrid;
	var options = {};
	var grid_selector = "#zcGrid-table";
	var pager_selector = "#zcGrid-pager";
	var perid = $("#percustomerId").val();
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
				var delzcInfo = "<button class='btn btn-danger btn-xs modifybtn' onclick=\"PersonCustomerInfo.delzcInfo('" + rowObject.id + "')\">删除</button>"
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
PersonCustomerInfo.jqgrid.loadData = function (data) {
	var thisObject = PersonCustomerInfo.jqgrid;
	thisObject.clearSearch();
	data = data || {};
	var thisObject = PersonCustomerInfo.jqgrid;
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
PersonCustomerInfo.jqgrid.clearSearch = function () {
	var thisObject = PersonCustomerInfo.jqgrid;
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
	datas['averagepay' ] = $("#averagepay").val();
	datas['perid'] = $("#percustomerId").val();
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
						PersonCustomerInfo.jqgrid.init();
	            		PersonCustomerInfo.jqgrid.reload();
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
PersonCustomerInfo.delfzInfo = function (id) {
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
	            		PersonCustomerInfo.jqgrid.reload();
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
	datas['perid'] = $("#percustomerId").val();
	
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
						PersonCustomerInfo.jqgrid.AssetInfoInit();
	            		PersonCustomerInfo.jqgrid.reload();
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
PersonCustomerInfo.delzcInfo = function (id) {
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
	            		PersonCustomerInfo.jqgrid.reload();
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
var upload = function(){
		var formData = new FormData();
		var percustomerId = $("#percustomerId").val();
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
		var percustomerId = $("#percustomerId").val();
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
	var perid = $("#percustomerId").val();
	if($.trim(num) == ''){
		bootbox.alert("请填写证件号码!");
		return false;
	}
	
	if($.trim(certtypes) == ''){
		bootbox.alert("请填写证件类型!");
		return false;
	}
	
	var formData = new FormData();
	var percustomerId = $("#percustomerId").val();
    formData.append("myfile", document.getElementById("btn_file3").files[0]); 
    
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
		$('#companys').hide();
		//清除关联企业id
		$("#companyId").val('');
		return false;
	}else{
		$('#companys').show();
		return false;
	}
}



$(function(){
	//初始化关联企业表
	PersonCustomerInfo.ViewCustomerJqgrid.init();
	
	//搜索栏时间格式化
	$("#startDate").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});
	
	
 	//查询
	$("#search_submit_Btn").click(function(){
		var filter = Global.KVToObject($("#addPersonInfoForm").serialize());
		PersonCustomerInfo.ViewCustomerJqgrid.loadData(filter);
	});
	
	//重置
	$("#search_reset_Btn").click(function(){
		($("#addPersonInfoForm")[0]).reset();
	});
	
	
	// 初始化 关联企业jqgrid
	$("#selectcompanys").click(function() {
		$("#companyModal").modal('show');
	});
	
	//选择关联企业
	$("#sureCompanys").click(function() {
		var ids =$("#grid-table").jqGrid("getGridParam","selrow");
		$("#companyId").val(ids);
		
		if(ids){
			 var ret = $("#grid-table").jqGrid("getRowData",ids);
			 $("#companyName").val(ret.companyname);
		}
		$('#companyModal').modal('hide');
	});
	
	
	//提交	
	$("#save").click(function() {
		var res = $("input[name='isrelcus']:checked").val();
		var companyId  = $("#companyId").val();
			if(res == '1' && $.trim(companyId)==""){
				bootbox.alert("请选择关联企业!");
				return false;
			}
			if(res == null || res == undefined){
				//设置默认选中单选框为1的值
				$("input[type=radio]").attr("checked",'1');
				if($.trim(companyId)==""){
					bootbox.alert("请选择关联企业!");
					return false;
				}
			}
			
		var result = $("#addPersonInfoForm").Validform();
		bootbox.confirm("确认提交?",function(result){
			if(!result){
				return ;
			}
		$.ajax({
	        url: Global.appCtx + '/customer/person/add',
	        type: 'post',
	        data: $("#addPersonInfoForm").serialize(),
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
	
	
	/**
	 * 验证表单必输项
	 */
	var demo=$(".addPersonInfoForm").Validform({
		tiptype:3,
		btnSubmit:"#save", 
		showAllError:true,
		callback:function(data){
			return false;
		}
	});
});