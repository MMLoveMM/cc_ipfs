<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 用户管理</title>
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
							<li class="active">用户管理</li>
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
									用户管理
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
			
			<form id="addUserForm" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="addUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">添加用户信息</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>用户账号</label>
												<input type="text" name="userid" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>用户密码</label>
												<input type="text" name="password" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>用户名</label>
												<input type="text" name="name" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>手机号</label>
												<input type="tel" name="mobile" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">电话</label>
												<input type="text" name="telephone" class="col-xs-4">
											</div>
										</div>
									</div>	
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">传真</label>
												<input type="text" name="fax" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>邮箱</label>
												<input type="email" name="mail" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>	
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>所属机构</label>
												<select name="organsid"  class="selectpicker pull-left" data-live-search="true">
											    	<optgroup label="评估">
													    <c:forEach  var="tOrgan" items="${tOrgans}">
												    		<c:if test="${tOrgan.pid == 1}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
												    		</c:if>
												    	</c:forEach>
													</optgroup>
												    <optgroup label="银行">
												    	<c:forEach  var="tOrgan" items="${tOrgans}">
													    	<c:if test="${tOrgan.pid == 2}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
													    	</c:if>
													    </c:forEach>
													</optgroup>
											    	<optgroup label="基金">
											    		<c:forEach  var="tOrgan" items="${tOrgans}">
													    	<c:if test="${tOrgan.pid == 3}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
													    	</c:if>
													    </c:forEach>
													</optgroup>
											    	<optgroup label="担保">
											    		<c:forEach  var="tOrgan" items="${tOrgans}">
													    	<c:if test="${tOrgan.pid == 4}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
													    	</c:if>
													    </c:forEach>
													</optgroup>
												</select>
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>是否领导</label>
												<select class="col-xs-4" name="isleader" >
											     	<option value="">请选择</option>
													<option value="0">是</option>
													<option value="1">否</option>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>生效日期</label>
												<input type="text" id="newEffectDate" name="newEffectDate" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">备注</label>
												<input type="text" name="note" class="col-xs-4">
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
			
			<form id="modUserForm" class="form-horizontal">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="modUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">修改用户信息</h4>
				            </div>
				            <div class="modal-body">
				            	<div class="container-fluid">
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">用户账号</label>
												<label id="modUserId" class="col-xs-4 control-label no-padding-center" style="text-align: left;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>用户名</label>
												<input type="text" id="modName" name="name" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>手机号</label>
												<input type="tel" id="modMobile" name="mobile" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">电话</label>
												<input type="text" id="modTelephone" name="telephone" class="col-xs-4">
											</div>
										</div>
									</div>	
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">传真</label>
												<input type="text" id="modFax" name="fax" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>邮箱</label>
												<input type="email" id="modMail" name="mail" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>	
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>所属机构</label>
												<select id="modOrgansId" name="organsid"  class="selectpicker pull-left" data-live-search="true">
											    	<optgroup label="评估">
													    <c:forEach  var="tOrgan" items="${tOrgans}">
												    		<c:if test="${tOrgan.pid == 1}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
												    		</c:if>
												    	</c:forEach>
													</optgroup>
												    <optgroup label="银行">
												    	<c:forEach  var="tOrgan" items="${tOrgans}">
													    	<c:if test="${tOrgan.pid == 2}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
													    	</c:if>
													    </c:forEach>
													</optgroup>
											    	<optgroup label="基金">
											    		<c:forEach  var="tOrgan" items="${tOrgans}">
													    	<c:if test="${tOrgan.pid == 3}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
													    	</c:if>
													    </c:forEach>
													</optgroup>
											    	<optgroup label="担保">
											    		<c:forEach  var="tOrgan" items="${tOrgans}">
													    	<c:if test="${tOrgan.pid == 4}">
														    	<option value="${tOrgan.orgcode}">${tOrgan.orgname}</option>
													    	</c:if>
													    </c:forEach>
													</optgroup>
												</select>
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>是否领导</label>
												<select class="col-xs-4" id="modIsLeader" name="isleader" >
											     	<option value="">请选择</option>
													<option value="0">是</option>
													<option value="1">否</option>
											    </select>
											    <label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
										
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1"><span style="color: red;">*</span>生效日期</label>
												<input type="text" id="ModEffectDate" name="newEffectDate" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-4 control-label no-padding-center" for="form-field-1">备注</label>
												<input type="text" id="modNote" name="note" class="col-xs-4">
												<label class="error-tips col-xs-3" style="color: red;"></label>
											</div>
										</div>
									</div>
									
									<input type="hidden" id="modId" name="id">
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
			
			<form id="addRoleForm">
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="t_user_role_mod" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				                <h4 class="modal-title" id="myModalLabel">分配角色</h4>
				            </div>
				            <div class="modal-body">
								<div class="row">
										
									<div id="roleCheckbox" class="col-xs-12" style="padding-top: 10px;">
									</div>
									
									<input type="hidden" id="userId" name="addUserId">
								</div>
							</div>				
				            <div class="modal-footer">
				                <button type="button" class="btn btn-default" id="cancelAdd" data-dismiss="modal">关闭
								</button>
								<button type="button" id="sureAddRole" class="btn btn-primary">
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
		<script type="text/javascript" src="${appCtx}/static/busi/system/user_list.js"></script>
	</body>
</html>
