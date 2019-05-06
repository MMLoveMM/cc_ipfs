<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 数据字典</title>
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
							<li class="active">数据字典维护</li>
						</ul>
					</div>
					<!-- 面包屑导航结束 -->

					<!-- 页面内容 -->
					<div class="page-content" style="position: relative;">
						<!-- /.page-header -->
						<div class="page-header">
							<h1>
								基础信息维护
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									数据字典维护
								</small>
							</h1>
						</div><!-- /.page-header -->
						<!-- PAGE CONTENT BEGINS -->
						
						<form action="" method="POST" name="search_form" id="searchForm" onsubmit="return false" class="form-horizontal" > 
							<div class="col-xs-5">
								<div class="form-group">
									<label for="useremail" class="col-xs-3 control-label">数据字典类型</label>
										<div class="col-sm-9">
											<select class="col-sm-12" name="dictType" id="dictType">
												<option value="">全部</option>
												<c:forEach var="dict" items="${dicts}">
													<option value="${dict.dcode}">${dict.dname}</option>
												</c:forEach>
											</select>
										</div>
								</div>
							</div>
							<div class="col-xs-5">
								<button class="btn btn-default btn-sm pull-right" id="search_reset_Btn" style="margin-left:10px">重置</button>
								<button class="btn btn-info btn-sm pull-right" id="search_submit_Btn">搜索</button>
							</div>
					</form>
					
						<input type="hidden" id="dictList" value='${dictList}' />
						
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
			
			<form id="addDictForm" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="addDictModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">添加数据字典</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>代码</label>
												<input type="number" name="dcode" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>名称</label>
												<input type="text" name="dname" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>类型</label>
												<select class="col-xs-4" name="dictType" >
											     	<option value="">请选择</option>
													<c:forEach var="dict" items="${dicts}">
														<option value="${dict.dcode}">${dict.dname}</option>
													</c:forEach>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>状态</label>
												<select class="col-xs-4" name="status" >
											     	<option value="">请选择</option>
													<option value="0">启用</option>
													<option value="1">停用</option>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">描述</label>
												<input type="text" name="note" class="col-xs-4">
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
			
			<form id="modDictForm" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="modDictModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">修改数据字典</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
				            		<input type="hidden" name="id" id="modId" class="col-xs-4">
				            	
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>代码</label>
												<input type="number" name="dcode" id="modDcode" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>名称</label>
												<input type="text" name="dname" id="modDname" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>类型</label>
												<select class="col-xs-4" name="dictType" id="modDictType">
											     	<option value="">请选择</option>
													<c:forEach var="dict" items="${dicts}">
														<option value="${dict.dcode}">${dict.dname}</option>
													</c:forEach>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>状态</label>
												<select class="col-xs-4" name="status" id="modStatus">
											     	<option value="">请选择</option>
													<option value="0">启用</option>
													<option value="1">停用</option>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">描述</label>
												<input type="text" name="note" id="modNote" class="col-xs-4">
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
		<script type="text/javascript" src="${appCtx}/static/busi/dict/dict_list.js"></script>
	</body>
</html>
