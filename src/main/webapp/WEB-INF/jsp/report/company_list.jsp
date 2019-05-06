<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 企业客户基本信息</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/css-table.jsp" flush="true" />
		<jsp:include page="../base/css-base.jsp" flush="true" />
		
	</head>

	<body class="no-skin">
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/header.jsp" flush="true" />

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<%-- 加载左侧菜单模块 --%>
			<jsp:include page="../base/left.jsp" flush="true" />
			
			<!-- /.main-content  -->
			<div class="main-content">
				<div class="main-content-inner">
					<!-- 面包屑导航 -->
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#">首页</a>
							</li>
							<li class="active">企业客户基本信息</li>
						</ul>
					</div>
					<!-- 面包屑导航结束 -->

					<!-- 页面内容 -->
					<div class="page-content" style="position: relative;">
						<!-- /.page-header -->
						<div class="page-header">
							<h1>
								统计信息
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									企业客户基本信息
								</small>
							</h1>
						</div><!-- /.page-header -->
						<!-- PAGE CONTENT BEGINS -->
						
						<form action="" method="POST" name="search_form" id="searchForm" onsubmit="return false" class="form-horizontal" > 
							<div class="col-xs-5">
								<div class="form-group">
									<label for="startTime" class="col-md-3 col-sm-3 control-label">录入时间</label>
									<div class="col-xs-4">
										<input type="text" id="startDate" name="startDate"
											class="form-control hasDatepicker" autocomplete="off">
									</div>
									<label for="endTime" class="col-xs-1 control-label" style="text-align: center;">-</label>
									<div class="col-xs-4">
										<input type="text" id="endDate" name="endDate"
											class="form-control hasDatepicker">
									</div>
								</div>
							</div>
							<div class="col-xs-5">
								<button class="btn btn-default btn-sm pull-right" id="search_reset_Btn" style="margin-left:10px">重置</button>
								<button class="btn btn-info btn-sm pull-right" id="search_submit_Btn">查询</button>
							</div>
					</form>
					
						<div class="row">
							<div class="col-xs-12" id="table">
								
								<div id="search"></div>
								
								<table id="grid-table"></table>

								<div id="grid-pager"></div>
								
								
							</div><!-- /.col -->
						</div><!-- /.row -->
						
						<!-- PAGE CONTENT ENDS -->
					</div><!-- /.page-content -->
				</div>
			</div>
			<%-- 加载底部模块  --%>
			<jsp:include page="../base/footer.jsp" flush="true" />
			
			<!-- 回到顶部  -->
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<input type="hidden" id="fileName">

		<!-- basic scripts -->
		
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		<%-- 加载table脚本模块，最后加载  --%>
		<jsp:include page="../base/script-table.jsp" flush="true" />
		 <script type="text/javascript" src="${appCtx}/static/busi/report/company_list.js"></script>
	</body>
</html>
