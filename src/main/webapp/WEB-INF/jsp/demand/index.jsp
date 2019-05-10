<jsp:useBean id="projectInfoList" scope="request" type="java.lang.String"/>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 融资需求</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/new_css-base.jsp" flush="true" />
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<form class="form-horizontal" style="padding-top: 102px;">
			<div class="form-group">
				<label class="col-xs-3 control-label" style="line-height: 40px;">企业名称</label>
				<div class="col-xs-2">
					<input type="text" style="height: 50px; width: 350px;" class="col-xs-6" name="companyName">
				</div>

				<label class="col-xs-1 control-label" style="line-height: 40px;">行业分类</label>
				<div class="col-xs-2">
					<input type="text" style="height: 50px; width: 350px;" class="col-xs-6" name="ype">
				</div>

				<div class="col-xs-2" style="text-align: center;">
					<div class="btn btn-lg btn-default">搜索</div>
				</div>
			</div>
		</form>

		<div id="demandTable" class="container" style="padding-top: 51px;">
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<input id="projectInfos" type="hidden" value='${projectInfoList}'>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		<script src="${appCtx}/static/common/bootstrap_table_page.js"></script>
		<script src="${appCtx}/static/busi/demand/index.js"></script>
	</body>
</html>
