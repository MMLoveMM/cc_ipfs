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
		<link rel="stylesheet" type="text/css" href="${appCtx}/static/res/Page/css/page.css">
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<form id="searchForm" class="form-horizontal" style="padding-top: 102px;">
			<div class="form-group">
				<input type="hidden" id="page" value="1">
				<input type="hidden" id="pageSize" value="20">
				<label class="col-xs-3 control-label" style="line-height: 40px;">企业名称</label>
				<div class="col-xs-2">
					<input id="companyName" type="text" style="height: 50px; width: 350px;" class="col-xs-6" name="companyName">
				</div>

				<label class="col-xs-1 control-label" style="line-height: 40px;">行业分类</label>
				<div class="col-xs-2">
					<select id="type" name="type"  style="height: 50px; width: 350px;" class="col-xs-6">
						<option value=""></option>
						<option value="01">股权</option>
						<option value="02">债权</option>
						<option value="03">股权+债权</option>
					</select>
				</div>

				<div class="col-xs-2" style="text-align: center;">
					<button id="searchBtn" type="button" class="btn btn-lg btn-default">搜索</button>
				</div>
			</div>
		</form>

		<div id="demandTable" class="container" style="padding-top: 51px;">
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
		<script src="${appCtx}/static/busi/demand/index.js"></script>
	</body>
</html>
