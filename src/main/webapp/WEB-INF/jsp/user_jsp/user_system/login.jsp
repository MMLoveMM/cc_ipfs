<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 注册</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../../base/new_css-base.jsp" flush="true" />
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../../base/new_header.jsp" flush="true" />

		<div class="container" style="background-color: white; height: 500px; margin-top: 130px;">
			<form id="loginForm" method="post" class="form-horizontal">
				<div class="form-group">
					<div class="col-xs-12 text-center">
						<h2 style="color: #273568;">注册</h2>
						<label style="color: #273568;">${not empty message ? message : "请输入注册信息"}</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-xs-1 col-xs-offset-4 control-label"><span style="color: red;">*</span>用户名</label>
					<div class="col-xs-3">
						<input type="text" minlength="5" maxlength="64" class="form-control" id="userid" name="userid" placeholder="作为登录账号"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red; text-align: left;"></label>
				</div>
				
				<div class="form-group">
					<label class="col-xs-1 col-xs-offset-4 control-label"><span style="color: red;">*</span>名称</label>
					<div class="col-xs-3">
						<input type="text" class="form-control" id="name" name="name" placeholder="用户昵称"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red; text-align: left;"></label>
				</div>
				
				<div class="form-group">
					<label class="col-xs-1 col-xs-offset-4 control-label"><span style="color: red;">*</span>密码</label>
					<div class="col-xs-3">
						<input type="password" class="form-control" id="password" name="password" placeholder="密码"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red; text-align: left;"></label>
				</div>
				
				<div class="form-group">
					<label class="col-xs-1 col-xs-offset-4 control-label"><span style="color: red;">*</span>确认密码</label>
					<div class="col-xs-3">
						<input type="password" class="form-control" id="sure_password" name="sure_password" placeholder="确认密码"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red; text-align: left;"></label>
				</div>
				
				<div class="form-group">
					<label class="col-xs-1 col-xs-offset-4 control-label"><span style="color: red;">*</span>手机号码</label>
					<div class="col-xs-3">
						<input type="text" class="form-control col-xs-12" id="mobile" name="mobile" placeholder="手机号码"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red; text-align: left;"></label>
				</div>
				
				<div class="form-group">
					<label class="col-xs-1 col-xs-offset-4 control-label"><span style="color: red;">*</span>电子邮箱</label>
					<div class="col-xs-3">
						<input type="email" class="form-control col-xs-12" id="mail" name="mail" placeholder="电子邮箱"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red; text-align: left;"></label>
				</div>
				
				<div class="form-group">
					<div class="col-xs-4 col-xs-offset-4">
						<div id="sure_login" class="btn btn-primary col-xs-12">
							注册
						</div>
					</div>
				</div>
			</form>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<script src="${appCtx}/static/busi/user_jsp/user_system/login.js"></script>
	</body>
</html>
