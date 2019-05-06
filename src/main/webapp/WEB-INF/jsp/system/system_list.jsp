<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 资源管理</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/css-table.jsp" flush="true" />
		<jsp:include page="../base/css-base.jsp" flush="true" />
	    <link rel="stylesheet" href="${appCtx}/static/dist/js/JQuery_zTree_v3.5.15/css/zTreeStyle/zTreeStyle.css" />
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
							<li class="active">资源管理</li>
						</ul>
					</div>
					<!-- 面包屑导航结束 -->

					<!-- 页面内容 -->
					<div class="page-content" style="position: relative;">
						<!-- /.page-header -->
						<div class="page-header">
							<h1>
								系统管理
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									资源管理
								</small>
							</h1>
						</div><!-- /.page-header -->
						<!-- PAGE CONTENT BEGINS -->
						
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
			<!-- /.main-content -->
			
			<form id="addFuncForm" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="addFuncModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">功能菜单添加</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>功能菜单名称</label>
												<input type="text" name="funcName" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>功能菜单URL</label>
												<input type="text" name="url" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>资源顺序</label>
												<input type="text" name="findex" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>父功能菜单</label>
												<select class="col-xs-4" name="funcParentId" >
											     	<option value="">请选择</option>
													<c:forEach var="tfunc" items="${tfuncs}">
														<option value="${tfunc.id}">${tfunc.funcName}</option>
													</c:forEach>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>资源类型</label>
												<select class="col-xs-4" name="ftype" >
											     	<option value="">请选择</option>
													<option value="MENU">菜单</option>
													<option value="BUTTON">按钮</option>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
								</div>
							</div>
				            <div class="modal-footer">
				                <button type="button" class="btn btn-default" id="cancelAdd" data-dismiss="modal">取消
								</button>
								<button type="button" id="sureAdd" class="btn btn-primary">
									确认
								</button>
				            </div>
				        </div><!-- /.modal-content -->
				    </div><!-- /.modal -->
				</div>
			</form>
			
			<form id="modFuncForm" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="modFuncModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">修改功能菜单</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
				            		<input type="hidden" name="id" id="modId" class="col-xs-4">
				            	
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>功能菜单名称</label>
												<input type="text" name="funcName" id="modFuncName" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>功能菜单URL</label>
												<input type="text" name="url" id="modUrl" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>资源类型</label>
												<select class="col-xs-4" name="ftype" id="modFtype">
											     	<option value="">请选择</option>
													<option value="MENU">菜单</option>
													<option value="BUTTON">按钮</option>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>资源顺序</label>
												<input type="text" name="findex" id="modFindex" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>父功能菜单</label>
												<select class="col-xs-4" name="funcParentId" id="modFuncParentId">
											     	<option value="">请选择</option>
													<c:forEach var="tfunc" items="${tfuncs}">
														<option value="${tfunc.id}">${tfunc.funcName}</option>
													</c:forEach>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
								</div>
							</div>
				            <div class="modal-footer">
				                <button type="button" class="btn btn-default" id="cancelMod" data-dismiss="modal">取消
								</button>
								<button type="button" id="sureMod" class="btn btn-primary">
									确认
								</button>
				            </div>
				        </div><!-- /.modal-content -->
				    </div><!-- /.modal -->
				</div>
			</form>
			
			<input type="hidden" id="funcParentName" value='${funcParentName}'>
			
			<%-- 加载底部模块  --%>
			<jsp:include page="../base/footer.jsp" flush="true" />
			
			<!-- 回到顶部  -->
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->
		
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		<%-- 加载table脚本模块，最后加载  --%>
		<jsp:include page="../base/script-table.jsp" flush="true" />
		<script type="text/javascript" src="${appCtx}/static/busi/system/system_list.js"></script>
		<script type="text/javascript" src="${appCtx}/static/dist/js/JQuery_zTree_v3.5.15/js/jquery.ztree.core-3.5.min.js"></script>
	</body>
</html>
