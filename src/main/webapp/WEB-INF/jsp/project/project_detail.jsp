<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>长春市科技金融服务平台 - 项目管理</title>
<meta name="description" content="overview &amp; stats" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<%-- 加载css模块  --%>
<jsp:include page="../base/css-table.jsp" flush="true" />
<jsp:include page="../base/css-base.jsp" flush="true" />

<style type="text/css">
	.control-align{
		text-align: left !important;
	}
</style>
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
						try {
							ace.settings.check('breadcrumbs', 'fixed')
						} catch (e) {
						}
					</script>

					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">首页</a>
						</li>
						<li class="active">项目管理</li>
					</ul>
				</div>
				<!-- 面包屑导航结束 -->

				<!-- 页面内容 -->
				<div class="page-content" style="position: relative;">
					<!-- /.page-header -->
					<div class="page-header">
						<h1>
							项目管理 <small> <i class="ace-icon fa fa-angle-double-right"></i>
								项目详情
							</small>
						</h1>
					</div>
					<!-- /.page-header -->
					<!-- PAGE CONTENT BEGINS -->
					<!-- form-horizontal -->
					<form id="saveProjectForm" class="saveProjectForm form-horizontal">
						<div class="layui-tab layui-tab-card">
							<ul class="layui-tab-title" style="background-color: #428bca">
								<li class="layui-this">项目概况</li>
								<li>融资需求</li>
								<li>公开权限</li>
								<li>项目附件</li>
								<li>客户信息</li>
								<li>项目评价详情</li>
								<li>审批意见</li>
								<li>还款计划</li>
								<li>项目评价</li>
							</ul>
							<div class="layui-tab-content">
								<!-- 融资概况 -->
								<div class="layui-tab-item layui-show">
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">项目名称</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.projectname}</label>
											
											<label class="col-xs-2 control-label">是否有基金托底等安全要素</label>
											<label class="col-xs-4 control-label control-align">
												<c:if test="${issureness == 0}">是</c:if>
												<c:if test="${issureness == 1}">否</c:if>
											</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">托底机构名称</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.underpinorgname}</label>
										</div>
									</div>
									
									<c:if test="${userId == 'admin'}">
										<c:forEach var="sCI" items="${sCIs}">
											<div class="form-group">
												<div class="col-xs-12">
													<label class="col-xs-2 control-label">金融机构名称</label>
													<label class="col-xs-4 control-label control-align">${sCI.orgname}</label>
													
													<label class="col-xs-2 control-label">放款金额</label>
													<label class="col-xs-4 control-label control-align">${sCI.loansMoney}</label>
												</div>
											</div>
											<div class="form-group">
												<div class="col-xs-12">
													<label class="col-xs-2 control-label">持股比例</label>
													<label class="col-xs-4 control-label control-align">${sCI.shareholdingRatio}</label>
													
													<label class="col-xs-2 control-label">抵押物</label>
													<label class="col-xs-4 control-label control-align">${sCI.pawn}</label>
												</div>
											</div>
										</c:forEach>	
									</c:if>
									
								</div><!-- layui-tab-item layui-show end -->

								<!-- 融资需求 -->
								<div class="layui-tab-item">
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">融资金额</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.loanamt} 元</label>
											
											<label class="col-xs-2 control-label">融资期限</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.loandeadline} 月</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">融资用途</label>
											<label class="col-xs-4 control-label control-align">
												<c:forEach var="tdata" items="${tdata}">
													<c:if test="${tdata.dictType == 'loanUse'}">
														<c:if test="${tdata.dcode == projectInfo.loanuse}">
															${tdata.dname}
														</c:if>
													</c:if>
												</c:forEach>
											</label>
											
											<label class="col-xs-2 control-label">费率</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.rate} %</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">融资类型</label>
											<label class="col-xs-4 control-label control-align">
												<c:forEach var="tdata" items="${tdata}">
													<c:if test="${tdata.dictType == 'loanType'}">
														<c:if test="${tdata.dcode == projectInfo.loantype}">
															${tdata.dname}
														</c:if>
													</c:if>
												</c:forEach>
											</label>
											
											<label class="col-xs-2 control-label">已融额度</label>
											<label class="col-xs-4 control-label control-align control-align">${projectInfo.hasloanamt} 元</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">知识产权类型</label> 
											<label class="col-xs-4 control-label control-align control-align">
												<c:forEach var="tdata" items="${tdata}">
													<c:if test="${tdata.dictType == 'inteProType'}">
														<c:if test="${tdata.dcode == projectInfo.inteprotype}">
															${tdata.dname}
														</c:if>
													</c:if>
												</c:forEach>
											</label>
											
											<label class="col-xs-2 control-label">实际用款企业名称</label>
											<label class="col-xs-4 control-label control-align control-align">${projectInfo.usemoneycompany}</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">总资产</label>
											<label class="col-xs-4 control-label control-align control-align">${projectInfo.totalAssets} 元</label>
											
											<label class="col-xs-2 control-label">总负债</label>
											<label class="col-xs-4 control-label control-align control-align">${projectInfo.totalLiability} 元</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">上年度营业收入</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.lastYearIncome} 元</label>
											
											<label class="col-xs-2 control-label">当前贷款情况</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.currentLoanSituation} 元</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">贷款额度</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.loanAmount} 元</label>
											
											<label class="col-xs-2 control-label">股权融资额度</label>
											<label class="col-xs-4 control-label control-align">${projectInfo.equityFinancingAmount} 元</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">其他需求</label>
											<label class="col-xs-10 control-label control-align">${projectInfo.remark}</label>
										</div>
									</div>
									
								</div><!-- layui-tab-item end -->
								
								<!-- 公开权限 -->
								<div class="layui-tab-item">
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">人员公开</label>
											<label class="col-xs-10 control-label control-align">
												<c:forEach var="user" items="${tUsers}">
													${user.name}
												</c:forEach>
											</label>
										</div>
									</div>
								</div><!-- layui-tab-item end -->
								
								<!-- 项目附件 -->
								<div class="layui-tab-item">
									
									
								</div><!-- layui-tab-item end -->
								
								<!-- 客户信息 -->
								<div class="layui-tab-item">
									<jsp:include page="../customer/customer_view.jsp" flush="true" />
								</div><!-- layui-tab-item end -->
								
								<!-- 项目评价详情 -->
								<div class="layui-tab-item">
									
									
								</div><!-- layui-tab-item end -->
								
								<!-- 审批意见 -->
								<div class="layui-tab-item">
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">ip确权评意见</label>
											<label class="col-xs-10 control-label control-align">暂无信息</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">保理流程意见</label>
											<label class="col-xs-10 control-label control-align">暂无信息</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">基金流程意见</label>
											<label class="col-xs-10 control-label control-align">暂无信息</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">评估流程意见</label>
											<label class="col-xs-10 control-label control-align">暂无信息</label>
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-xs-2 control-label">担保流程意见</label>
											<label class="col-xs-10 control-label control-align">暂无信息</label>
										</div>
									</div>
									
								</div><!-- layui-tab-item end -->
								
								<!-- 还款计划 -->
								<div class="layui-tab-item">
									
									
								</div><!-- layui-tab-item end -->
								
								<!-- 项目评价 -->
								<div class="layui-tab-item">
									<c:forEach var="sCI" items="${sCIs}">
										<c:if test="${sCI.status == -1}">
											<div class="form-group">
												<div class="col-xs-12">
													<label class="col-xs-2 control-label">机构名称</label>
													<label class="col-xs-4 control-label control-align">${sCI.orgname}</label>
													
													<label class="col-xs-2 control-label">取消原因</label>
													<label class="col-xs-4 control-label control-align">${sCI.reasonForCancellation}</label>
												</div>
											</div>
											<div class="form-group">
												<div class="col-xs-12">
													<label class="col-xs-2 control-label">评价时间</label>
													<label class="col-xs-4 control-label control-align">${sCI.evaluationTime}</label>
												</div>
											</div>
										</c:if>
										
										<c:if test="${sCI.status != -1}">
											<div class="form-group">
												<div class="col-xs-12">
													<label class="col-xs-2 control-label">机构名称</label>
													<label class="col-xs-4 control-label control-align">${sCI.orgname}</label>
													
													<label class="col-xs-2 control-label">取消原因</label>
													<label class="col-xs-4 control-label control-align">${sCI.reasonForCancellation}</label>
												</div>
											</div>
											<div class="form-group">
												<div class="col-xs-12">
													<label class="col-xs-2 control-label">评价时间</label>
													<label class="col-xs-4 control-label control-align">${sCI.evaluationTime}</label>
												</div>
											</div>
										</c:if>
									</c:forEach>
								</div><!-- layui-tab-item end -->
								
							</div><!-- layui-tab layui-tab-card end  -->
							
						</div><!-- layui-tab layui-tab-card end -->
						<div class="col-xs-12 text-center">
							<button type="button" id="sureSave" class="btn btn-sm btn-primary">提交</button>
							<button type="button" class="btn btn-sm btn-default" id="cancelAdd"
								onClick="self.location=document.referrer;">返回</button>
						</div>
					</form>
					<!-- PAGE CONTENT ENDS -->
				</div>
				<!-- /.page-content -->
			</div>
			</div>
			<%-- 加载底部模块  --%>
			<jsp:include page="../base/footer.jsp" flush="true" />

			<!-- 回到顶部  -->
			<a href="#" id="btn-scroll-up"
				class="btn-scroll-up btn btn-sm btn-inverse"> <i
				class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div>
		<!-- /.main-content -->


		<!-- basic scripts -->

		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		<%-- 加载table脚本模块，最后加载  --%>
		<jsp:include page="../base/script-table.jsp" flush="true" />
		<script type="text/javascript"
			src="${appCtx}/static/busi/project/project_add.js"></script>
		<script type="text/javascript"
			src="${appCtx}/static/res/validform/js/Validform_v5.3.2.js"></script>
</body>
</html>
