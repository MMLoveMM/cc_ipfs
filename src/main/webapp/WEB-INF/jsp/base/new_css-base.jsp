<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="taglibs.jsp"%>

<!-- 自定义导航栏样式 -->
<style>
	.navbar {
	  background-color:white !important;
	  border-color: white !important;
	}
	.navbar-inverse .navbar-nav>li>a:hover, .navbar-inverse .navbar-nav>li>a:focus {
	    color: black !important;
	    background-color: transparent !important;
	}
	.navbar-inverse .navbar-toggle:hover, .navbar-inverse .navbar-toggle:focus {
	    background-color: white !important;
	}
	.navbar-inverse .navbar-toggle .icon-bar {
	    background-color: black !important;
	}
</style>

<!-- bootstrap & fontawesome & bootstrap-select -->
<link rel="stylesheet" href="${appCtx}/static/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="${appCtx}/static/dist/css/font-awesome.min.css" />
<link rel="stylesheet" href="${appCtx}/static/res/bootstrap-select/dist/css/bootstrap-select.min.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<%-- <link rel="stylesheet" href="${appCtx}/static/dist/css/ace-fonts.min.css" /> --%>

<!-- ace styles -->
<%-- <link rel="stylesheet" href="${appCtx}/static/dist/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" /> --%>

<!-- layui -->
<link rel="stylesheet" href="${appCtx}/static/res/layerui/css/layui.css">

<!-- validform-style -->
<%-- <link rel="stylesheet" href="${appCtx}/static/res/validform/css/style.css"> --%>

<!--[if lte IE 9]>
	<link rel="stylesheet" href="${appCtx}/static/dist/css/ace-part2.min.css" class="ace-main-stylesheet" />
<![endif]-->

<!--[if lte IE 9]>
  <link rel="stylesheet" href="${appCtx}/static/dist/css/ace-ie.min.css" />
<![endif]-->

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
<script src="${appCtx}/static/dist/js/html5shiv.min.js"></script>
<script src="${appCtx}/static/dist/js/respond.min.js"></script>
<![endif]-->