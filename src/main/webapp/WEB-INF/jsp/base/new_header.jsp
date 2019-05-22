<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="taglibs.jsp"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 

<span name="gotop"></span>
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target=".navbar-collapse">
	          <span class="sr-only">Toggle navigation</span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	        </button>
			<a class="navbar-brand " href="${appCtx}/public/toUserIndex"><img src="${appCtx}/static/img/logo_changchun.png" style="margin-top: -8px;"/></a>
			</div>
			<div class="navbar-collapse collapse" >
				<ul class="nav navbar-nav">
					<li>
						<a href="${appCtx}/public/toUserIndex">首页</a>
					</li>
					<li>
						<a href="${appCtx}/public/demand/index">融资需求</a>
					</li>
					<li>
						<a href="${appCtx}/public/success/index">成功案例</a>
					</li>
<%--					<li>--%>
<%--						<a href="#">金融产品</a>--%>
<%--					</li>--%>
					<li>
						<a href="${appCtx}/public/news/index">通知公告</a>
					</li>
					<li>
						<a target="_blank" href="${appCtx}/static/pdf/sysc.pdf">使用手册</a>
					</li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<shiro:user>
						<li>
							<a href="${appCtx}/financing/toIWantFinancing" style="height: 50px;">
								<div class="text-right" style="margin-top: -4px; height: 29px; width: 93px; background-image: url('${appCtx}/static/img/rz_btn.png');"></div>
							</a>
						</li>
<%--						<li>--%>
<%--							<a href="#"><img src="${appCtx}/static/img/information.png"/></a>--%>
<%--						</li>--%>
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle" style="background-color: #00000"><img src="${appCtx}/static/img/user.png"/></a>
							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close" style="min-width: 30px;">
								<shiro:lacksRole name="普通用户">
									<li>
										<a href="${appCtx}/index">
											<i class="ace-icon fa fa-cog"></i>
											进入后台
										</a>
									</li>
			
									<li class="divider"></li>
								</shiro:lacksRole>
								<li>
									<a href="${appCtx}/auth/logout2">
										<i class="ace-icon fa fa-power-off"></i>
										安全退出
									</a>
								</li>
							</ul>
						</li>
					</shiro:user>
					<shiro:guest>
						<li>
							<a href="${appCtx}/public/toUserLogIn">登录</a>
						</li>
						<li>
							<a href="${appCtx}/public/toUserLogin">注册</a>
						</li>
					</shiro:guest>
					
				</ul>
			</div>
		</div>
</div>