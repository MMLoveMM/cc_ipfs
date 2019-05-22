<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 项目管理</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../../base/css-table.jsp" flush="true" />
		<jsp:include page="../../base/css-base.jsp" flush="true" />
	</head>

	<body class="no-skin">

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			
			<!-- /.main-content  -->
			<div class="main-content">
				<div class="main-content-inner">

						<div class="row">
							<div class="col-xs-12">
								
								<div id="search"></div>
								
								<table id="grid-table"></table>

								<div id="grid-pager"></div>
								
							</div><!-- /.col -->
						</div><!-- /.row -->
						
						<!-- PAGE CONTENT ENDS -->
					</div><!-- /.page-content -->
				</div>
			</div>

		<!-- basic scripts -->
		
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<%-- 加载table脚本模块，最后加载  --%>
		<jsp:include page="../../base/script-table.jsp" flush="true" />
		<script type="text/javascript" src="${appCtx}/static/busi/user_jsp/project/project_list.js"></script>
	</body>
</html>
