<jsp:useBean id="successList" scope="request" type="java.lang.String"/>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 成功案例</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/new_css-base.jsp" flush="true" />
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<div id="successTable" class="container" style="padding-top: 102px;">

		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />

		<input id="successList" type="hidden" value='${successList}'>
		<script src="${appCtx}/static/common/bootstrap_table_page.js"></script>
		<script src="${appCtx}/static/busi/success/index.js"></script>
	</body>
</html>
