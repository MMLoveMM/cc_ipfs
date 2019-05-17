<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 融资需求</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../../base/new_css-base.jsp" flush="true" />
		
		<style type="text/css">
			.layui-tab-card>.layui-tab-title {
				background-color: #4990E2;
			}
			
			.layui-tab-card{
				box-shadow: 0 0px 0px 0 rgba(0,0,0,.1);
				border: 0px;
			}
		</style>
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../../base/new_header.jsp" flush="true" />

		<div class="container-fluid">
			<!--
            	作者：pangpj
            	时间：2017-12-01
            	描述：背景图片
            -->
			<div class="row">
				<img class="col-xs-12" src="${appCtx}/static/img/banner_img2.png" style="padding: 0 0 0 0;"/>
			</div>
		</div>
		
		<div class="container" style="margin-top: 15px;">
			<div class="row">
				<label style="color: #4A4A4A;">当前位置: 首页 > 融资需求</label>
			</div>
			<div class="row" style="z-index: -1; margin-top: 50px;">
				<div class="col-xs-8 col-xs-offset-2" style="background-image: url(${appCtx}/static/img/line.png); background-repeat: repeat-x;">
					
				</div>
			</div>
			<!--
            	作者：pangpj
            	时间：2017-12-04
            	描述：填写修改查询模块
            -->
			<div class="row" style="margin-top: -10px; z-index: 1;">
				<div class="col-xs-12">
					<div class="row text-center">
						<div class="col-xs-4" style="margin-top: -40px;">
						<c:if test="${not empty customerInfoId}">
								<a href="${appCtx}/customer/companys/customerUpdate?id=${customerInfoId}">
									<img src="${appCtx}/static/img/step_01.png"/>
								</a>
							</c:if>
							<c:if test="${empty customerInfoId}">
								<a href="${appCtx}/customer/enterprise/toAdd">
									<img src="${appCtx}/static/img/step_01.png"/>
								</a>
							</c:if>
						</div>
						<div class="col-xs-4" style="margin-top: -40px;">
							<c:if test="${not empty customerInfoId}">
								<a href="${appCtx}/project/toAdd">
									<img src="${appCtx}/static/img/step_02.png"/>
								</a>
							</c:if>
							<c:if test="${empty customerInfoId}">
								<a href="${appCtx}/customer/enterprise/toAdd">
									<img src="${appCtx}/static/img/step_02.png"/>
								</a>
							</c:if>
							
						</div>
						<div class="col-xs-4" style="margin-top: -40px;">
							<a href="${appCtx}/project/list">
								<img src="${appCtx}/static/img/setp_03.png"/>
							</a>
						</div>
					</div>
					
					<div class="row text-center">
						<div class="col-xs-4" style="margin-top: 5px;">
							<c:if test="${not empty customerInfoId}">
								<a href="${appCtx}/customer/companys/customerUpdate?id=${customerInfoId}">修改企业信息</a>
							</c:if>
							<c:if test="${empty customerInfoId}">
								<a href="${appCtx}/customer/enterprise/toAdd">添加企业信息</a>
							</c:if>
						</div>
						<div class="col-xs-4" style="margin-top: 5px;">
							<c:if test="${not empty customerInfoId}">
								<a href="${appCtx}/project/toAdd">填写融资信息</a>
							</c:if>
							<c:if test="${empty customerInfoId}">
								<a href="${appCtx}/customer/enterprise/toAdd">填写融资信息</a>
							</c:if>
						</div>
						<div class="col-xs-4" style="margin-top: 5px;">
							<a href="${appCtx}/project/list">查看融资进度</a>
						</div>
					</div>
				</div>
				
			</div>
			
			<!--
            	作者：pangpj
            	时间：2017-12-04
            	描述：合作单位模块
            -->
			<div class="row" style="margin-top: 25px; background-color: #E6EEF6;">
				<div class="col-xs-12">
					<div class="row text-center" style="margin-top: 25px;">
						<div class="col-xs-5 text-right">
							<img src="${appCtx}/static/img/line_left.png"/>
						</div>
						<label class="col-xs-2 text-center" style="margin-top: 2.5px;">合作单位</label>
						<div class="col-xs-5 text-left">
							<img src="${appCtx}/static/img/line_right.png"/>
						</div>
					</div>
					
					<div class="row"  style="margin-top: 10px; margin-bottom: 40px; height: 350px;">
						<div class="layui-tab layui-tab-card">
							<ul class="layui-tab-title">
								<li class="layui-this">评</li>
								<li>保</li>
								<li>贷</li>
								<li>投</li>
							</ul>
							<div class="layui-tab-content">
								<!--
                                	作者：pangpj
                                	时间：2017-12-12
                                	描述：评估模块
                                -->
                                <jsp:include page="ping.jsp" flush="true" />
                                
                                <!--
                                	作者：pangpj
                                	时间：2017-12-12
                                	描述：保理模块
                                -->
                                <jsp:include page="bao.jsp" flush="true" />
                                
                                <!--
                                	作者：pangpj
                                	时间：2017-12-12
                                	描述：贷模块
                                -->
                                <jsp:include page="dai.jsp" flush="true" />
                                
                                <!--
                                	作者：pangpj
                                	时间：2017-12-12
                                	描述：投模块
                                -->
                                <jsp:include page="tou.jsp" flush="true" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<script src="${appCtx}/static/busi/user_jsp/financing/i_want_financing.js"></script>
	</body>
</html>
