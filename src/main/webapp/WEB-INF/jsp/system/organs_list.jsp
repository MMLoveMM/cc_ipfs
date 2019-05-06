<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 机构管理</title>
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
							<li class="active">机构管理</li>
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
									机构管理
								</small>
							</h1>
						</div><!-- /.page-header -->
						<!-- PAGE CONTENT BEGINS -->
						<div>
							<button class='btn btn-xs btn-success openbtn' id="addOrganMess">增加</button>
							<button class='btn btn-xs btn-success openbtn' id="modOrganMess">修改</button>
							<button class='btn btn-xs btn-success openbtn' id="viewOrganMess">查询详情</button>
							<button class='btn btn-danger btn-xs modifybtn' id="delOrganMess">删除</button>
						</div>
						<div title='机构树展示区' region='west' split='true' style=" height:99%; ">
								<ul id="tree" class="ztree"></ul>
						</div>
						
			<form id="addOrgans" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="addOrgan" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">添加机构信息</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>机构名称</label>
												<div class="col-xs-3">
													<input type="text" name="orgname" id="orgname">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>机构号</label>
												<div class="col-xs-3">
													<input type="text" name="orgcode" id="orgname">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>联系人姓名</label>
												<div class="col-xs-4">
													<input type="text" name="conname" id="conname">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>联系人手机</label>
												<div class="col-xs-4">
													<input type="text" name="conmobile" id="conmobile">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人电话</label>
												<div class="col-xs-4">
													<input type="text" name="contel" id="contel">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人传真</label>
												<div class="col-xs-4">
													<input type="text" name="confax" id="confax">
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人邮箱</label>
												<div class="col-xs-4">
													<input type="text" name="conmail" id="conmail">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>机构属性</label>
												<div class="col-xs-4">
														<select name="orgtype" id="orgtype">
													     	<option value="">请选择</option>
															<c:forEach var="dict" items="${dictList}">
																<c:if test="${dict.dictType == 'organstype'}">
																	<option value="${dict.dcode}">${dict.dname}</option>
																</c:if>
															</c:forEach>
													    </select>
													    <label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-14">
										<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>上级机构</label>
											<div class="form-group">
													<select name="pid" id="pid">
												     	<option value="">请选择</option>
														<c:forEach var="orgm" items="${orgmap}">
															<option value="${orgm.id}">${orgm.orgname}</option>
														</c:forEach>
												    </select>
												    <label class="error-tips" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
										<label class="col-xs-4 control-label no-padding-center" for="form-field-1">备注</label>
											<div class="form-group">
												<textarea  name="note" id="note" class="form-control" rows="3"></textarea>
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
			
			<form id="modOrgans" class="form-horizontal">
			<!-- 修改模态框（Modal） -->
				<div class="modal fade" id="modOrgan" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">修改机构信息</h4>
				            </div>
				            <input id="orgId" name="id" type="hidden">
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>机构名称</label>
												<div class="col-xs-3">
													<input type="text" name="orgname" id="orgname1">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>机构号</label>
												<div class="col-xs-3">
													<input type="text" name="orgcode" id="orgcode1">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>	
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>联系人姓名</label>
												<div class="col-xs-3">
													<input type="text" name="conname" id="conname1">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>联系人手机</label>
												<div class="col-xs-3">
													<input type="text" name="conmobile" id="conmobile1">
													<label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人电话</label>
												<div class="col-xs-3">
													<input type="text" name="contel" id="contel1">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人传真</label>
												<div class="col-xs-3">
													<input type="text" name="confax" id="confax1">
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人邮箱</label>
												<div class="col-xs-3">
													<input type="text" name="conmail" id="conmail1">
												</div>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>机构属性</label>
												<div class="col-xs-3">
														<select name="orgtype" id="orgtype1">
													     	<option value="">请选择</option>
															<c:forEach var="dict" items="${dictList}">
																<c:if test="${dict.dictType == 'organstype'}">
																	<option value="${dict.dcode}">${dict.dname}</option>
																</c:if>
															</c:forEach>
													    </select>
													    <label class="error-tips" style="color: red;"></label>
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>上级机构</label>
													<select name="pid" id="pid1">
												     	<option value="">请选择</option>
														<c:forEach var="orgm" items="${orgmap}">
															<option value="${orgm.id}">${orgm.orgname}</option>
														</c:forEach>
												    </select>
												    <label class="error-tips" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-14">
										<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>上级机构</label>
											<div class="form-group">
													<select name="status" id="status">
												     	<option value="">请选择</option>
														<option value="01">启用</option>
														<option value="02">停用</option>
												    </select>
												    <label class="error-tips" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">备注</label>
												<textarea  name="note" id="note1" class="form-control" rows="3"></textarea>
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
			
			<form id="viewOrgans" class="form-horizontal">
			<!-- 模态框（Modal） -->
				<div class="modal fade" id="viewOrgan" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">查看机构信息</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">机构名称</label>
												<div class="col-xs-3">
													<input type="text" name="orgname" id="orgname2">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">机构号</label>
												<div class="col-xs-3">
													<input type="text" name="orgcode" id="orgcode2">
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人姓名</label>
												<div class="col-xs-3">
													<input type="text" name="conname" id="conname2">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人手机</label>
												<div class="col-xs-3">
													<input type="text" name="conmobile" id="conmobile2">
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人邮箱</label>
												<div class="col-xs-3">
													<input type="text" name="conmail" id="conmail2">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">联系人传真</label>
												<div class="col-xs-3">
													<input type="text" name="confax" id="confax2">
												</div>
											</div>
										</div>
									</div>
										
									<input type="hidden" id="dict2" value='${dictList1}'>
									<input type="hidden" id="orgmap2" value='${orgmap1}'>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">机构属性</label>
												<div class="col-xs-3">
													<input type="text" name="orgtype" id="orgtype2">
												</div>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">上级机构</label>
												<input type="text" name="pid" id="pid2">
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">创建人</label>
												<div class="col-xs-3">
													<input type="text" name="cname" id="cname">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
											<label class="col-xs-4 control-label no-padding-center" for="form-field-1">创建时间</label>
												<div class="col-xs-3">
													<input type="text" name="cdate" id="cdate">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">状态</label>
												<div class="col-xs-3">
													<input type="text" name="status" id="status1">
												</div>
											</div>
										</div>
									</div>
								</div>
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
		<script type="text/javascript" src="${appCtx}/static/busi/system/organs_list.js"></script>
		<script type="text/javascript" src="${appCtx}/static/dist/js/JQuery_zTree_v3.5.15/js/jquery.ztree.core-3.5.min.js"></script>
		<script type="text/javascript" src="${appCtx}/static/dist/js/JQuery_zTree_v3.5.15/js/jquery.ztree.excheck-3.5.min.js"></script>
	</body>
</html>
