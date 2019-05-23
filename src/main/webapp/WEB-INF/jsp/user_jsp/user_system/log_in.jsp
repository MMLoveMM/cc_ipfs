<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 登录</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../../base/new_css-base.jsp" flush="true" />

		<script src="//captcha.luosimao.com/static/js/api.js"></script>
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../../base/new_header.jsp" flush="true" />

		<div class="container" style="background-color: white; height: 500px; margin-top: 130px;">
			<form id="logInForm" method="post" class="form-horizontal" action="${appCtx}/public/login">
				<div class="form-group">
					<div class="col-xs-12 text-center">
						<h2 style="color: #273568;">登录</h2>
						<label style="color: #273568;">${not empty message ? message : "请输入登录信息"}</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-xs-4 col-xs-offset-4">
						<input type="text" class="form-control" id="username" name="username" placeholder="用户名"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red;"></label>
				</div>
				
				<div class="form-group">
					<div class="col-xs-4 col-xs-offset-4">
						<input type="password" class="form-control" id="password" name="password" placeholder="密码"/>
					</div>
					<label class="error-tips col-xs-3 control-label" style="color: red;"></label>
				</div>
				
				<div class="form-group">
					<div class="col-xs-4 col-xs-offset-4">
						<div id="captcha2"></div>
						<div class="l-captcha" data-site-key="3f02522487a366e2dd7556653c4a464f" data-width="100%"></div>
						<span class="error-icon"></span>
						<span class="error-tips"></span>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-xs-4 col-xs-offset-4">
						<div id="sure_log_in" class="btn btn-primary col-xs-12">
							登录
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-xs-1 col-xs-offset-6 text-center">
						<a href="#">忘记密码</a>
					</div>
					
					<div class="col-xs-1 text-center">
						<a href="${appCtx}/public/toUserLogin">免费注册</a>
					</div>
				</div>
			</form>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<script src="${appCtx}/static/busi/user_jsp/user_system/log_in.js"></script>
	</body>
</html>
