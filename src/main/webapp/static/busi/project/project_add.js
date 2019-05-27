/**
 * 交易管理
 */
var Project = Project || {};

layui.use(['layer', 'form', 'element'], function(exports){
	//加载
  var layer = layui.layer,
      form = layui.form,
      element = layui.element;
});


//转换金额为万元
var changeAmt = function(){
	var amt = $("#loanAmt").val()
	$("#loanAmtM").val(amt/10000);
};

//转换万元金额为元
var changeAmt2 = function(){
	var amt = $("#loanAmtM").val()
	$("#loanAmt").val(amt*10000);
};

/**
 * 控制只能输入数字并且最多允许两位小数点
 * @param obj
 * @returns
 */
function clearNoNum(obj){  
    if(obj.value !=''&& obj.value.substr(0,1) == '.'){  
        obj.value="";  
    }  
    obj.value = obj.value.replace(/^0*(0\.|[1-9])/, '$1');//解决 粘贴不生效  
    obj.value = obj.value.replace(/[^\d.]/g,"");  //清除“数字”和“.”以外的字符  
    obj.value = obj.value.replace(/\.{2,}/g,"."); //只保留第一个. 清除多余的       
    obj.value = obj.value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");      
    obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/,'$1$2.$3');//只能输入两个小数       
    if(obj.value.indexOf(".")< 0 && obj.value !=""){//以上已经过滤，此处控制的是如果没有小数点，首位不能为类似于 01、02的金额  
        if(obj.value.substr(0,1) == '0' && obj.value.length == 2){  
            obj.value = obj.value.substr(1,obj.value.length);      
        }  
    }      
} 

//知识产权类型字符串拼接
function zscq(){
	if($("input[name='inteprotype']:checkbox:checked").length>0){
		value = '';
	    $("input[name='inteprotype']:checkbox:checked").each(function(){
	    	value += $(this).val()+',';
	    }) 
	  }
}

// 数字金额大写转换  
function convertCurrency() {
	 var money = $("#loanAmt").val();
	  //汉字的数字
	  var cnNums = new Array('零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖');
	  //基本单位
	  var cnIntRadice = new Array('', '拾', '佰', '仟');
	  //对应整数部分扩展单位
	  var cnIntUnits = new Array('', '万', '亿', '兆');
	  //对应小数部分单位
	  var cnDecUnits = new Array('角', '分', '毫', '厘');
	  //整数金额时后面跟的字符
	  var cnInteger = '整';
	  //整型完以后的单位
	  var cnIntLast = '元';
	  //最大处理的数字
	  var maxNum = 999999999999999.9999;
	  //金额整数部分
	  var integerNum;
	  //金额小数部分
	  var decimalNum;
	  //输出的中文金额字符串
	  var chineseStr = '';
	  //分离金额后用的数组，预定义
	  var parts;
	  if (money == '') { return ''; }
	  money = parseFloat(money);
	  if (money >= maxNum) {
	    //超出最大处理数字
	    return '';
	  }
	  if (money == 0) {
	    chineseStr = cnNums[0] + cnIntLast + cnInteger;
	    return chineseStr;
	  }
	  //转换为字符串
	  money = money.toString();
	  if (money.indexOf('.') == -1) {
	    integerNum = money;
	    decimalNum = '';
	  } else {
	    parts = money.split('.');
	    integerNum = parts[0];
	    decimalNum = parts[1].substr(0, 4);
	  }
	  //获取整型部分转换
	  if (parseInt(integerNum, 10) > 0) {
	    var zeroCount = 0;
	    var IntLen = integerNum.length;
	    for (var i = 0; i < IntLen; i++) {
	      var n = integerNum.substr(i, 1);
	      var p = IntLen - i - 1;
	      var q = p / 4;
	      var m = p % 4;
	      if (n == '0') {
	        zeroCount++;
	      } else {
	        if (zeroCount > 0) {
	          chineseStr += cnNums[0];
	        }
	        //归零
	        zeroCount = 0;
	        chineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
	      }
	      if (m == 0 && zeroCount < 4) {
	        chineseStr += cnIntUnits[q];
	      }
	    }
	    chineseStr += cnIntLast;
	  }
	  //小数部分
	  if (decimalNum != '') {
	    var decLen = decimalNum.length;
	    for (var i = 0; i < decLen; i++) {
	      var n = decimalNum.substr(i, 1);
	      if (n != '0') {
	        chineseStr += cnNums[Number(n)] + cnDecUnits[i];
	      }
	    }
	  }
	  if (chineseStr == '') {
	    chineseStr += cnNums[0] + cnIntLast + cnInteger;
	  } else if (decimalNum == '') {
	    chineseStr += cnInteger;
	  }
	  return  $("#lab").text(chineseStr);
	}


$(function(){
	//显示快速录入
	$("#but").click(function(){
		$("#showMoney").toggle();
	});
	
	
	//选中“评估”复选框才可打开下拉框
	$("#pg").click(function () {
		if($("#pg").is(":checked")) {
			$("#evaluationGs").removeAttr("disabled");
		}else {
			$("#pg").val("");
			$("#evaluationGs").attr("disabled",true);
		}
	});
	
	//选中“担保”复选框才可打开下拉框
	$("#db").click(function () {
		if($("#db").is(":checked")) {
			$("#guaranteeGs").removeAttr("disabled");	
		}else {
			$("#db").val("");
			$("#guaranteeGs").attr("disabled",true);
		}
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
	
	 //表单验证成功后，提交
	var demo = $("#saveProjectForm").Validform({
		tiptype:3,
		btnSubmit:"#sureSave", 
		showAllError:true,
		beforeSubmit:function(curform){
			var result = $("#saveProjectForm").Validform();
			bootbox.confirm("确认提交?",function(result){
				if(!result){
					return ;
				}
			$.ajax({
		        url: Global.appCtx + '/project/add',
		        type: 'post',
		        data: $("#saveProjectForm").serialize(),
		        dataType: 'json',
		        success: function (data) {
		            if (data != 0) {
		                bootbox.alert(data);
		            }else{
		            	bootbox.alert("提交成功", function () {
							$(location).attr('href', Global.appCtx + '/financing/toIWantFinancing')
		            	});
		            }
		        },
		        error : function () {
		            bootbox.alert("提交项目信息异常");
		        }
		    });
		  });
		},
		callback:function(data){
			return false;
		}
	  
	});
	
	
});



