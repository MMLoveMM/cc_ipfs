<jsp:useBean id="news" scope="request" type="cn.net.sinodata.model.News"/>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 资讯详情</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/new_css-base.jsp" flush="true" />
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<div class="container" style="padding-top: 102px;">
			<div class="row" style="text-align: center;">
				<label style="font-size: 24px;">${news.title}</label>
			</div>
			<div class="row" style="margin-top: 15px;">
				<hr style="width: 90%; height: 3px; margin-left: 5.2%;" />
			</div>
			<div class="row" style="margin-top: 10px;">
				<label style="margin-left: 28%;">时间：<fmt:formatDate value="${news.updateDate}" pattern="yyyy-MM-dd" /></label>
				<label style="margin-left: 8%">文章来源：${news.source}</label>
			</div>
			<div class="row" style="margin-top: 20px;">
				<label>
					${news.context}
				</label>
			</div>

			<div class="row" style="margin-top: 50px; text-align: center;">
				<div onclick="javascript:history.back(-1);" class="btn btn-lg btn-info">返回</div>
			</div>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		<script src="${appCtx}/static/busi/news/detail.js"></script>
	</body>
</html>
