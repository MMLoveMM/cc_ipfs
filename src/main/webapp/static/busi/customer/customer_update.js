/**
 * 交易管理
 */
var Customer = Customer || {};
/**
 * jqgrid对象
 */
Customer.jqgrid = Customer.jqgrid || {};

/**
 * jqgrid 选择器$对象
 */
Customer.jqgrid.$tableSelector = null;

layui.use([ 'layer', 'form', 'element' ], function(exports) {
	// 加载
	var layer = layui.layer, form = layui.form, element = layui.element;
});

// 点击删除按钮删除对应行
Customer.delTableRow = function(n) {
	var tr = n.parentNode.parentNode;// 得到按钮[n]的父元素[td]的父元素[tr]
	tr.parentNode.removeChild(tr);// 从tr的父元素[tbody]移除tr
}

// 转换金额为万元
Customer.changeAmt = function() {
	var amt = $("#registeredcapital").val()
	$("#registeredcapitalM").val(amt / 10000);
};

// 转换金额为万元
Customer.changeAmtSD = function() {
	var amt = $("#practicalcapital").val()
	$("#practicalcapital2").val(amt / 10000);
};

// 转换万元金额为元
Customer.changeAmt2 = function() {
	var amt = $("#registeredcapitalM").val()
	$("#registeredcapital").val(amt * 10000);
};

// 转换万元金额为元
Customer.changeAmtSD1 = function() {
	var amt = $("#practicalcapital2").val()
	$("#practicalcapital").val(amt * 10000);
};

/* 注册资本数字金额大写转换 */
Customer.convertCurrency = function() {
	var money = $("#registeredcapital").val();
	// 汉字的数字
	var cnNums = new Array('零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖');
	// 基本单位
	var cnIntRadice = new Array('', '拾', '佰', '仟');
	// 对应整数部分扩展单位
	var cnIntUnits = new Array('', '万', '亿', '兆');
	// 对应小数部分单位
	var cnDecUnits = new Array('角', '分', '毫', '厘');
	// 整数金额时后面跟的字符
	var cnInteger = '整';
	// 整型完以后的单位
	var cnIntLast = '元';
	// 最大处理的数字
	var maxNum = 999999999999999.9999;
	// 金额整数部分
	var integerNum;
	// 金额小数部分
	var decimalNum;
	// 输出的中文金额字符串
	var chineseStr = '';
	// 分离金额后用的数组，预定义
	var parts;
	if (money == '') {
		return '';
	}
	money = parseFloat(money);
	if (money >= maxNum) {
		// 超出最大处理数字
		return '';
	}
	if (money == 0) {
		chineseStr = cnNums[0] + cnIntLast + cnInteger;
		return chineseStr;
	}
	// 转换为字符串
	money = money.toString();
	if (money.indexOf('.') == -1) {
		integerNum = money;
		decimalNum = '';
	} else {
		parts = money.split('.');
		integerNum = parts[0];
		decimalNum = parts[1].substr(0, 4);
	}
	// 获取整型部分转换
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
				// 归零
				zeroCount = 0;
				chineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
			}
			if (m == 0 && zeroCount < 4) {
				chineseStr += cnIntUnits[q];
			}
		}
		chineseStr += cnIntLast;
	}
	// 小数部分
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
	return $("#lab").text(chineseStr);
}

/* 实到资本数字金额大写转换 */
Customer.currency = function() {
	var money = $("#practicalcapital").val();
	// 汉字的数字
	var cnNums = new Array('零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖');
	// 基本单位
	var cnIntRadice = new Array('', '拾', '佰', '仟');
	// 对应整数部分扩展单位
	var cnIntUnits = new Array('', '万', '亿', '兆');
	// 对应小数部分单位
	var cnDecUnits = new Array('角', '分', '毫', '厘');
	// 整数金额时后面跟的字符
	var cnInteger = '整';
	// 整型完以后的单位
	var cnIntLast = '元';
	// 最大处理的数字
	var maxNum = 999999999999999.9999;
	// 金额整数部分
	var integerNum;
	// 金额小数部分
	var decimalNum;
	// 输出的中文金额字符串
	var chineseStr = '';
	// 分离金额后用的数组，预定义
	var parts;
	if (money == '') {
		return '';
	}
	money = parseFloat(money);
	if (money >= maxNum) {
		// 超出最大处理数字
		return '';
	}
	if (money == 0) {
		chineseStr = cnNums[0] + cnIntLast + cnInteger;
		return chineseStr;
	}
	// 转换为字符串
	money = money.toString();
	if (money.indexOf('.') == -1) {
		integerNum = money;
		decimalNum = '';
	} else {
		parts = money.split('.');
		integerNum = parts[0];
		decimalNum = parts[1].substr(0, 4);
	}
	// 获取整型部分转换
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
				// 归零
				zeroCount = 0;
				chineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
			}
			if (m == 0 && zeroCount < 4) {
				chineseStr += cnIntUnits[q];
			}
		}
		chineseStr += cnIntLast;
	}
	// 小数部分
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
	return $("#lab1").text(chineseStr);
}

Customer.Show_Hidden = function(obj) {
	if (obj[0].style.display == "block") {
		obj[0].style.display = 'none';
	} else {
		obj[0].style.display = 'block';
	}
}

// 获取上传附件的名称
Customer.change = function() {
	if ($('#attaType').val() == '0') {
		alert("请选择附件类别");
	} else {
		var fileName = document.getElementById('file1').files[0].name;
		$('#attaName').val(fileName);
	}
}

// 将获取的数据分组
Customer.groupParams = function() {
	var queryUrl = Global.appCtx + '/customer/company/query';
	var arr = Customer.query(queryUrl, "");
	var a1 = [];
	var a2 = [];
	var a3 = [];
	var a4 = [];
	var paramArr = [];
	for (var i = 0; i < arr.length; i++) {
		if (arr[i].num < 6000) {
			a1.push(arr[i]);
		} else if (arr[i].num < 7000 && arr[i].num > 6000) {

			a2.push(arr[i]);
		} else if (arr[i].num < 9000 && arr[i].num > 8000) {

			a4.push(arr[i]);
		} else {
			a3.push(arr[i]);
		}
	}
	paramArr[0] = a1;
	paramArr[1] = a2;
	paramArr[2] = a3;
	paramArr[3] = a4;

	return paramArr;

}

Customer.query = function(url, table) {
	var arr = [];
	$.ajax({
		url : url,
		async : false,
		cache : false,
		type : 'post',
		dataType : "json",
		success : function(data) {
			$.each(data, function(i, item) {
				var name = item.name;
				var num = item.num;
				var seqnum = item.seqnum;
				var params = {
					label : num + "	" + name,
					value : num,
					seqnum : seqnum,
					num : num,
					name : name
				}; // label value: autocomplete使用
				arr.push(params);
			});
		}
	});
	return arr;
}

// 自动回填数据

Customer.autoCompleteAudit = function(paramArrs, valInput, numInput, nameInput) {
	$("#" + numInput).autocomplete({
		autoFocus : true,
		minLength : 1,
		source : paramArr,
		select : function(event, ui) {
			$("#" + nameInput).val(ui.item.name);
			$(this).blur();
			// 数据输入框获得焦点
			$(this).parent().siblings(":eq(2)").children().focus();
		},
		focus : function(event, ui) {
			$("#" + nameInput).html(ui.item.name);
		},
		change : function(event, ui) {
			if (ui.item) {
				autoCompleteAudit(paramArr);
				$("#" + valInput).val("");
				$("#" + nameInput).html(ui.item.name);
			}
		}
	});
}

Customer.add = function(dataTb, name, num, val, auditdt) {
	var zid = 1;
	var auditdt = document.getElementById(auditdt).value;
	var name = document.getElementById(name).value;
	var num1 = document.getElementById(num).value;
	var val1 = document.getElementById(val).value;
	if (num1 == "" && val1 == "") {
		alert("没有该编号");
	} else if (auditdt == "") {
		alert("请填写审计日期");
	} else {
		var val2 = Customer.CommaFormatted1(val1, '1');
		var tr = "<tr></tr>";
		tr += "<td>" + zid + "</td>";
		tr += "<td>" + num1 + "</td>";
		tr += "<td>" + name + "</td>"
		tr += "<td>" + val2 + "</td>";
		tr += "<td></td>";
		$(dataTb).append(tr);
		zid++;
		var param = "{'auditdt':'" + auditdt + "','num':'" + num1 + "','val':'"
				+ val2 + "'}";
		b.push(param);
		return b;
	}

}

/**
 * 显示：金额千分符分割
 */
Customer.CommaFormatted1 = function(amount, flag) {
	if (amount.charAt(amount.length - 1) != ".") {
		amount = amount.replace(/,/g, '');
		var delimiter = ","; // replace comma if desired
		var a = amount.split('.', 2);
		var d = a[1];
		if (d == undefined) {
			if (flag == '1') {
				d = '00';
			} else {
				d = '';
			}
		} else if (d.length > 2) {
			d = d.substring(0, 2);
		}
		var i = parseInt(a[0]);
		if (isNaN(i)) {
			return '';
		}
		var minus = '';
		if (i < 0) {
			minus = '-';
		}
		i = Math.abs(i);
		var n = new String(i);
		var a = [];
		while (n.length > 3) {
			var nn = n.substr(n.length - 3);
			a.unshift(nn);
			n = n.substr(0, n.length - 3);
		}
		if (n.length > 0) {
			a.unshift(n);
		}
		n = a.join(delimiter);
		if (d.length < 1) {
			amount = n;
		} else {
			amount = n + '.' + d;
		}
		amount1 = minus + amount;
	}
	return amount1;
}

/**
 * 修改账户信息
 */
Customer.modTableZH = function(id, zhName, yhNum, yh) {
	bootbox.confirm("确认修改?", function(result) {
		if (!result) {
			return;
		}
		var zhName1 = document.getElementById(zhName).value;
		if (zhName1 == undefined) {
			zhName = '';
		}
		var yhNum1 = document.getElementById(yhNum).value;
		if (yhNum1 == undefined) {
			yhNum1 = '';
		}
		var yh1 = document.getElementById(yh).value;
		if (yh1 == undefined) {
			yh1 = '';
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/modTCustAcct',
			type : 'post',
			data : {
				'zhId' : id,
				'zhName' : zhName1,
				'yhNum' : yhNum1,
				'yh' : yh1
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("修改账户信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("修改账户信息异常");
			}
		});
	});
}

/**
 * 删除账户信息
 */
Customer.delTableZH = function(id) {
	bootbox.confirm("确认删除", function(result) {
		if (!result) {
			return;
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/delTCustAcct',
			type : 'post',
			data : {
				'id' : id
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("删除账户信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("删除账户信息异常");
			}
		});
	});
}

/**
 * 修改证件信息
 */

Customer.modTableZJ = function(id, zjnation, zjtype1, zjno, zjtefdate,
		zjlefdate, zjasdate) {
	bootbox.confirm("确认修改?", function(result) {
		if (!result) {
			return;
		}

		var sel = document.getElementById(zjnation);
		var zjnat = sel.options[sel.selectedIndex].value;
		if (zjnat == undefined) {
			zjnat = '';
		}
		var sel1 = document.getElementById(zjtype1);
		var zjty = sel1.options[sel1.selectedIndex].value;
		if (zjty == undefined) {
			zjty = '';
		}
		var zjno1 = document.getElementById(zjno).value;
		if (zjno1 == undefined) {
			zjno1 = '';
		}
		var zjtefdate1 = document.getElementById(zjtefdate).value;
		if (zjtefdate1 == undefined) {
			zjtefdate1 = '';
		}
		var zjlefdate1 = document.getElementById(zjlefdate).value;
		if (zjlefdate1 == undefined) {
			zjlefdate1 = '';
		}
		var zjasdate1 = document.getElementById(zjasdate).value;
		if (zjasdate1 == undefined) {
			zjasdate1 = '';
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/modTCustCerti',
			type : 'post',
			data : {
				'zjId' : id,
				'zjnation' : zjnat,
				'zjtype' : zjty,
				'zjno' : zjno1,
				'zjtefdate' : zjtefdate1,
				'zjlefdate' : zjlefdate1,
				'zjasdate' : zjasdate1
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("修改证件信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("修改证件信息异常");
			}
		});
	});
}

/**
 * 删除证件信息
 */
Customer.delTableZJ = function(id) {
	bootbox.confirm("确认删除?", function(result) {
		if (!result) {
			return;
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/delTCustCerti',
			type : 'post',
			data : {
				'id' : id
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("删除证件信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("删除证件信息异常");
			}
		});
	});
}

/**
 * 删除原有附件信息
 */
Customer.delAccessTable = function(id) {
	bootbox.confirm("确认删除?", function(result) {
		if (!result) {
			return;
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/delAccess',
			type : 'post',
			data : {
				'id' : id
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("删除附件信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("删除附件信息异常");
			}
		});
	});
}

/**
 * 修改审计数据
 */
Customer.modTable = function(id, num, val) {
	bootbox.confirm("确认修改?", function(result) {
		if (!result) {
			return;
		}
		var fnum = $('#' + num).val();
		if (fnum == undefined) {
			fnum = '';
		}
		var fval = $('#' + val).val();
		if (fval == undefined) {
			fval = '';
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/modFinal',
			type : 'post',
			data : {
				'sjId' : id,
				'num' : fnum,
				'val' : fval
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("修改审计信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("修改审计信息异常");
			}
		});
	});
}

/**
 * 删除审计数据
 */
Customer.delTable = function(id) {
	bootbox.confirm("确认删除?", function(result) {
		if (!result) {
			return;
		}
		$.ajax({
			url : Global.appCtx + '/customer/companys/delFinal',
			type : 'post',
			data : {
				'id' : id
			},
			dataType : 'json',
			success : function(data) {
				if (data != 0) {
					bootbox.alert(data);
				}
				bootbox.alert("删除审计信息成功", function() {
					location.reload();
				});
			},
			error : function() {
				bootbox.alert("删除审计信息异常");
			}
		});
	});
}

/**
 * 增加账户信息
 */
var zhid = 1;
Customer.addAustAcc = function() {
	var acctname = document.getElementById("acctname").value;
	var bankacct = document.getElementById("bankacct").value;
	var openbank = document.getElementById("openbank").value;
	var delZH = "<button class=\"btn btn-info btn-sm pull-right\" id=\"search_delZh_Btn\" onclick=\"Customer.delTableRow(this)\">删除</button>";
	if (acctname == "" && bankacct == "" && openbank == "") {
		alert("不能添加空的账户信息");
	} else {
		var tr = "<tr></tr>";
		tr += "<td>" + zhid + "</td>";
		tr += "<td>" + acctname + "</td>";
		tr += "<td>" + bankacct + "</td>";
		tr += "<td>" + openbank + "</td>";
		tr += "<td>" + delZH + "</td>";
		$("#tbody1").append(tr);
		zhid++;
		var param = "{'acctName':'" + acctname + "','bankAcct':'" + bankacct
				+ "','openBank':'" + openbank + "'}";
		return param;
	}
}

/**
 * 增加证件信息
 */
var id = 1;
Customer.addAustAric = function() {
	var nation = document.getElementById("nation").value;
	var idtype = document.getElementById("idtype").value;
	var idno = document.getElementById("idno").value;
	var idtefdate = document.getElementById("idtefdate").value;
	var idlefdate = document.getElementById("idlefdate").value;
	var idasdate = document.getElementById("idasdate").value;
	var delZH = "<button class=\"btn btn-info btn-sm pull-right\" id=\"search_delZJ_Btn\" onclick=\"Customer.delTableRow(this)\">删除</button>";
	if (nation == "" && idtype == "" && idno == "" && idtefdate == ""
			&& idlefdate == "" && idasdate == "") {
		alert("不能添加空的证件信息");
	} else {
		var tr = "<tr></tr>";
		tr += "<td>" + id + "</td>";
		tr += "<td>" + nation + "</td>";
		tr += "<td>" + idtype + "</td>";
		tr += "<td>" + idno + "</td>";
		tr += "<td>" + idtefdate + "</td>";
		tr += "<td>" + idlefdate + "</td>";
		tr += "<td>" + idasdate + "</td>";
		tr += "<td>" + delZH + "</td>";
		$("#tbody2").append(tr);
		id++;
		var param = "{'nation':'" + nation + "','idtype':'" + idtype
				+ "','idno':'" + idno + "','idTefdate':'" + idtefdate
				+ "','idLefdate':'" + idlefdate + "','idAsdate':'" + idasdate
				+ "'}";
		return param;
	}
}

window.onload = function() {
	// 企业
	var qytype1 = document.getElementById("qytype").value;
	var list = document.getElementsByName("companytype");
	var i;
	for (i = 0; i < list.length; i++) {
		if (qytype1.indexOf(list[i].value) >= 0) {
			list[i].checked = true;
		}
	}

	// 行业
	var hytype1 = document.getElementById("butype").value;
	var list1 = document.getElementsByName("businesstype");
	var h;
	for (h = 0; h < list1.length; h++) {
		if (hytype1.indexOf(list1[h].value) >= 0) {
			list1[h].checked = true;
		}
	}

	// 公司规模
	var gsgm1 = document.getElementById("gsgm").value;
	var list3 = document.getElementById("comsize");
	var j;
	for (j = 0; j < list3.options.length; j++) {
		var s = list3.options[j];
		if (gsgm1.indexOf(s.value.trim()) >= 0) {
			s.selected = true;
		}
	}

	// 客户种类
	var kezl = document.getElementById("khtype").value;
	var list4 = document.getElementById("customertype");
	var k;
	for (k = 0; k < list4.options.length; k++) {
		var o = list4.options[k];
		if (kezl.indexOf(o.value.trim()) >= 0) {
			o.selected = true;
		}
	}

	// 客户状态
	var kezt = document.getElementById("khstatus").value;
	var list5 = document.getElementById("customertype");
	var e;
	for (e = 0; e < list5.options.length; e++) {
		var p = list5.options[e];
		if (kezt.indexOf(p.value.trim()) >= 0) {
			p.selected = true;
		}
	}

	// 法人资格
	var frzg1 = document.getElementById("frzg").value;
	var list6 = document.getElementById("corporatecapacity");
	var f;
	for (f = 0; f < list6.options.length; f++) {
		var t = list6.options[f];
		if (frzg1.indexOf(t.value.trim()) >= 0) {
			t.selected = true;
		}
	}

	// 隶属关系
	var lsgx1 = document.getElementById("lsgx").value;
	var list7 = document.getElementById("subordination");
	var l;
	for (l = 0; l < list7.options.length; l++) {
		var n = list7.options[l];
		if (lsgx1.indexOf(n.value.trim()) >= 0) {
			n.selected = true;
		}
	}

	// 区县
	var qx1 = document.getElementById("qx").value;
	var list8 = document.getElementById("county");
	var q;
	for (q = 0; q < list8.options.length; q++) {
		var m = list8.options[q];
		if (qx1.indexOf(m.value.trim()) >= 0) {
			m.selected = true;
		}
	}

	// 认定情况
	var rdqk1 = document.getElementById("rdqk").value;
	var list9 = document.getElementById("ldentifyTheSituation");
	var b;
	for (b = 0; b < list9.options.length; b++) {
		var v = list9.options[b];
		if (rdqk1.indexOf(v.value.trim()) >= 0) {
			v.selected = true;
		}
	}
}

$(function() {

	// 注册资本快速录入
	$("#search_qWrite_Btn").click(function() {
		var registered = $("#registered");
		Customer.Show_Hidden(registered);
	});

	// 实到资金快速录入
	$("#search_qwrite1_Btn").click(function() {
		var practical = $("#practical");
		Customer.Show_Hidden(practical);
	});

	// 长期有效
	$("#search_longTerm_Btn").click(function() {
		$("#idlefdate").val('2199-12-31');
	});

	var austAcc = [];
	// 点击增加按钮在表格中添加账户信息
	$("#search_add_Btn").click(function() {
		austAcc.push(Customer.addAustAcc());
	});

	var auctAric = [];
	// 点击增加按钮在表格中添加证件信息
	$("#search_put_Btn").click(function() {
		auctAric.push(Customer.addAustAric());
	});

	var paramArrs = Customer.groupParams();

	/*
	 * Customer.autoCompleteAudit(paramArr[0],"num","name","val");
	 * Customer.autoCompleteAudit(paramArr[1],"num1","name1","val1");
	 * Customer.autoCompleteAudit(paramArr[2],"num2","name2","val2");
	 * Customer.autoCompleteAudit(paramArr[3],"num3","name3","val3");
	 */

	var dataArr = [];
	// 点击增加按钮为资产负债表增加一行
	$("#search_putall_Btn").click(function() {
		dataArr.push(Customer.add("#tbody3", "name", "num", "val", "auditdt"));
	});

	$("#search_putall1_Btn").click(
			function() {
				dataArr.push(Customer.add("#tbody4", "name1", "num1", "val1",
						"auditdt1"));
			});

	$("#search_putall2_Btn").click(
			function() {
				dataArr.push(Customer.add("#tbody5", "name2", "num2", "val2",
						"auditdt2"));
			});

	$("#search_putall3_Btn").click(
			function() {
				dataArr.push(Customer.add("#tbody6", "name3", "num3", "val3",
						"auditdt3"));
			});

	// 上传文件
	$("#upload").click(
			function() {
				var id = document.getElementById("allid").value;
				var formData = new FormData();
				formData.append("myfile",
						document.getElementById("file1").files[0]);
				$.ajax({
					url : Global.appCtx
							+ '/customer/companys/updateAccess?customerId='
							+ id,
					type : "POST",
					data : formData,
					/**
					 * 必须false才会自动加上正确的Content-Type
					 */
					contentType : false,
					/**
					 * 必须false才会避开jQuery对 formdata 的默认处理 XMLHttpRequest会对
					 * formdata 进行正确的处理
					 */
					processData : false,
					success : function(data) {
						if (data != 0) {
							bootbox.alert(data);
						} else {
							bootbox.alert("上传成功", function() {
							});
						}
					},
					error : function() {
						alert("上传失败！");
					}
				});
			});

	// 点击删除按钮删除审计数据
	$('#search_ZCdel_Btn').click(function() {
		Customer.delSj("#auditdt");
	});
	// 点击删除损益表审计数据
	$('#search_SYdel_Btn').click(function() {
		Customer.delSj("#auditdt1");
	});
	// 点击删除现金流量表数据
	$('#search_XJdel_Btn').click(function() {
		Customer.delSj("#auditdt2");
	});
	// 点击删除财务比率表数据
	$('#search_CWdel_Btn').click(function() {
		Customer.delSj("#auditdt3");
	});
	Customer.delSj = function(auditdt) {
		var date = $(auditdt).val();
		if (date == "") {
			alert("请输入审计日期");
		} else {
			bootbox.confirm("确认删除?", function(result) {
				if (!result) {
					return false;
				}

				$.ajax({
					url : Global.appCtx + '/customer/company/delDate',
					type : 'post',
					data : {
						'sjdate' : date
					},
					dataType : 'json',
					success : function(data) {
						if (data != 0) {
							bootbox.alert(data);
						} else {
							bootbox.alert("删除审计数据成功", function() {
								location.reload();
							});
						}
					},
					error : function() {
						bootbox.alert("删除审计数据失败");
					}
				});
			});
		}
	}

	// 搜索栏时间格式化
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

	var demo = $("#modForm").Validform({
		tiptype : 3,
		btnSubmit : "#mod_submit_Btn",
		showAllError : true,
		beforeSubmit : function(curform) {
			var result = $("#modForm").Validform();
			bootbox.confirm("确认提交?", function(result) {
				if (!result) {
					return;
				}

				// 账户信息
				$("#acctStrInput").val(austAcc);

				// 证件信息
				$("#certiStrInput").val(auctAric);

				// 保存财务数据;
				$("#dataStrInput").val(dataArr);
				$.ajax({
					url : Global.appCtx + '/customer/companys/modCustomer',
					type : 'post',
					data : $("#modForm").serialize(),
					dataType : 'json',
					success : function(data) {
						if (data != 0) {
							bootbox.alert(data);
						} else {
							bootbox.alert("企业客户修改成功", function() {
								// location.reload();
								self.location = document.referrer;
							});
						}
					},
					error : function() {
						bootbox.alert("企业客户修改异常");
					}
				});
			});
		},
		callback : function(data) {
			return false;
		}

	});

	// 提交企业客户信息
	var de = $("#modForm").Validform({
		tiptype : 3,
		btnSubmit : "#mod_submit_Btn",
		showAllError : true,
		callback : function(data) {
			return false;
		}
	});

	// 成立时间
	$("#createTime").datepicker({
		showOtherMonths : true,
		selectOtherMonths : false,
		format : 'yyyy-mm-dd',
	});

});
