<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- basic scripts -->
<%@ include file="taglibs.jsp"%>
<div id="global_loading_div" style="background-color:black;filter:alpha(Opacity=20);-moz-opacity:0.2;opacity: 0.2;position:fixed;top:0;left:0;z-index:99999;width:100%;height:100%;display:none">
	<div style="margin-left:50%;text-align:left;text-indent:-80px;margin-top:21%;width:200px;height:30px;line-height:30px;color:white;">
		<img src="${appCtx}/static/img/loading.gif"/>LOADING..
	</div>
</div>
<script type="text/javascript">
	window.jQuery || document.write("<script src='${appCtx}/static/dist/js/jquery.min.js'>"+"<"+"/script>");
</script>
<script type="text/javascript">
	if('ontouchstart' in document.documentElement) document.write("<script src='${appCtx}/static/dist/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="${appCtx}/static/dist/js/bootstrap.min.js"></script>

<!-- ace scripts -->
<script src="${appCtx}/static/dist/js/ace-elements.min.js"></script>
<script src="${appCtx}/static/dist/js/ace.min.js"></script>
<script src="${appCtx}/static/dist/js/ace-extra.min.js"></script>
<script src="${appCtx}/static/dist/js/jquery.tree.min.js" type="text/javascript"></script>
<script src="${appCtx}/static/dist/js/validator.min.js" type="text/javascript"></script>
<script src="${appCtx}/static/js/jquery.validate.js" type="text/javascript"></script>
<script src="${appCtx}/static/dist/js/bootbox.min.js" type="text/javascript"></script>

<!-- layui -->
<script type="text/javascript" src="${appCtx}/static/res/layerui/layui.js"></script>
<script type="text/javascript" src="${appCtx}/static/res/layerui/layui.all.js"></script>

<!-- bootstrap-select -->
<script type="text/javascript" src="${appCtx}/static/res/bootstrap-select/dist/js/bootstrap-select.min.js"></script>

<!-- validform -->
<script type="text/javascript" src="${appCtx}/static/res/validform/js/Validform_v5.3.2.js"></script>

<script type="text/javascript">
	// 重写ajax全局错误事件
	$(document).ajaxError(function (event,xhr,options,exc) {
		bootbox.alert("系统异常：" + exc + " - " + xhr.status);
		Global.loading(false);
	});
	var Global = Global || {};
	Global.appCtx = "${appCtx}";
	jQuery(function($) {
		//初始化菜单
		$("#menu").tree({
			prefix : '<shiro:principal property="id"/>',
			getTreeDataUrl : "${appCtx}/menus",
			website : '${appCtx}'
		});
	});
	
	/** 
	 *	金额   分转元保留两位小数 
	 */
	Global.Fen2Yuan = function (amount) {
		var str = (amount/100).toFixed(2) + '';
		var intSum = str.substring(0,str.indexOf(".")).replace( /\B(?=(?:\d{3})+$)/g, ',' );//取到整数部分
		var dot = str.substring(str.length,str.indexOf("."))//取到小数部分
		var ret = intSum + dot;
		return ret;
	}
	Global.loading = function (isOn) {
		if (isOn) {
			$("#global_loading_div").slideDown(200);
		} else {
			$("#global_loading_div").slideUp(200);
		}
	}
	
	//手机号码验证  
	jQuery.validator.addMethod("isMobile", function(value, element) {  
	    var length = value.length;  
	    var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;  
	    return this.optional(element) || (length == 11 && mobile.test(value));  
	}, "请正确填写您的手机号码");  
</script>

<!-- 返回顶部js -->
<script>
	$(function() {
		$(function() {
			$(window).scroll(function() {
				if($(window).scrollTop() > 100) {
					$("#gotop").fadeIn(500); //一秒渐入动画
				} else {
					$("#gotop").fadeOut(500); //一秒渐隐动画
				}
			});

			$("#gotop").click(function() {
				$('body,html').animate({
					scrollTop: 0
				}, 500);
			});
		});
	});
</script>