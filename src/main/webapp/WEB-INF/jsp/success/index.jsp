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
		<link rel="stylesheet" type="text/css" href="${appCtx}/static/res/Page/css/page.css">
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<div id="successTable" class="container" style="padding-top: 102px;">

		</div>

		<div style="text-align: center;margin:0px auto;">
			<div id="pager" class="pager clearfix">
			</div>
		</div>

		<%-- 加载底部模块  --%>
		<jsp:include page="../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />

		<script src="${appCtx}/static/common/bootstrap_table_page.js"></script>
		<script src="${appCtx}/static/res/Page/js/jquery.z-pager.js" type="text/javascript" charset="utf-8"></script>
		<script src="${appCtx}/static/busi/success/index.js"></script>
	</body>
</html>
