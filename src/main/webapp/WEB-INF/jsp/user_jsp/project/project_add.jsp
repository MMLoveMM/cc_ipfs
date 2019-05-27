<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 填写融资信息</title>
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

			input[type="text"] {
				height: 30px;
			}

			select {
				height: 30px;
			}

		</style>
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../../base/new_header.jsp" flush="true" />


		
		<div class="container" style="margin-top: 15px;">
			<div class="row">
				<label style="color: #4A4A4A;">当前位置: 首页 > 我要融资 > 填写融资信息 </label>
			</div>
		</div>

		<div class="container" style="padding-top: 50px;">
			<form id="saveProjectForm" class="saveProjectForm form-horizontal">
				<div class="layui-tab layui-tab-card">
					<ul class="layui-tab-title" style="background-color: #428bca">
						<li class="layui-this">项目信息</li>
						<%--<li>融资需求</li>--%>
					</ul>
					<div class="layui-tab-content">
						<div class="layui-tab-item layui-show">
							<!-- 项目信息表单 -->
							<div id="proInfoDiv">
								<div class="container-fluid">
									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-md-3 col-sm-3 control-label">企业名称</label>
											<input type="text" readonly="readonly" class="col-xs-4"
												   name="projectName" value='${projectName}'>
										</div>
									</div>


									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-md-3 col-sm-3 control-label"><span
													style="color: red;">*</span>项目名称</label> <input type="text"
																									autocomplete="off" id="projectname" name="projectname"
																									datatype="*" class="col-xs-4"> <label
												class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>

									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-md-3 col-sm-3 control-label">托底机构名称</label>
											<input type="text" name="underpinorgname" class="col-xs-4">
										</div>
									</div>

									<div class="form-group">
										<div class="col-xs-12">
											<label class="col-md-3 col-sm-3 control-label"><span
													style="color: red;">*</span>是否有基金托底等安全要素</label> <select
												class="col-xs-4" name="issureness" datatype="*">
											<option value="">请选择</option>
											<option value="0">是</option>
											<option value="1">否</option>
										</select> <label class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>


									<div id="financingDiv">
										<!-- <input type="hidden" id="dcode"> -->
										<br>
										融资需求
										<hr>
										<div class="col-xs-12">
											<div class="form-group">
												<label class="col-xs-2 control-label">本次申请融资金额</label>
												<div class="col-xs-4">
													<input type="text" id="loanAmt" name="loanamt"
														   class="col-xs-6"
														   onkeyup="clearNoNum(this),changeAmt(),convertCurrency()"
														   onblur="convertCurrency()" /> <label
														class="col-xs-2 text-center control-label">元</label>
													<div class="col-xs-4 text-center">
														<input id="but" type="button" value="快速录入"
															   class="btn btn-xs btn-primary">
													</div>
												</div>

											</div>

											<div class="form-group" style="display: none;" id="showMoney">
												<label class="col-xs-2 control-label">快速录入金额</label>
												<div class="col-xs-4">
													<input type="text" id="loanAmtM" name="loanAmtM"
														   class="col-xs-6" onblur="convertCurrency()"
														   onkeyup="clearNoNum(this),changeAmt2(),convertCurrency()" />
													<label class="col-xs-2 text-center control-label">万元</label>
												</div>

												<label class="col-xs-2 control-label">金额大写:</label> <label
													id="lab" class="col-xs-4 control-label"
													style="text-align: left;"></label>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label">融资用途</label>
												<div class="col-xs-4">
													<select class="col-xs-6" name="loanuse">
														<option value="">请选择</option>
														<c:forEach var="tdataDict" items="${tdataDicts}">
															<c:if test="${tdataDict.dictType == 'loanUse'}">
																<option value='${tdataDict.dcode}'>${tdataDict.dname}</option>
															</c:if>
														</c:forEach>
													</select>
												</div>

												<label class="col-xs-2 control-label">费率</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6"
														   onkeyup="clearNoNum(this)" name="rate">
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label">融资类型</label>
												<div class="col-xs-4">
													<select class="col-xs-6" name="loantype">
														<option value="">请选择</option>
														<c:forEach var="tdataDict" items="${tdataDicts}">
															<c:if test="${tdataDict.dictType == 'loanType'}">
																<option value='${tdataDict.dcode}'>${tdataDict.dname}</option>
															</c:if>
														</c:forEach>
													</select>
												</div>

												<label class="col-xs-2 control-label">融资期限</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" name="loandeadline"
														   maxlength="2" max="99"> <label
														class="col-xs-2 text-center control-label">月</label>
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label">知识产权类型</label>
												<div class="col-xs-4">
													<div class="col-xs-6">
														<c:forEach var="tdataDict" items="${tdataDicts}">
															<c:if test="${tdataDict.dictType == 'inteProType'}">
																<div class="col-xs-4">
																	<input type="checkbox" name="inteprotype" onblur="zscq()" value='${tdataDict.dcode}'>${tdataDict.dname}
																</div>
															</c:if>
														</c:forEach>
													</div>
												</div>

												<label class="col-xs-2 control-label">已融资额度</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6"
														   onkeyup="clearNoNum(this)" name="hasloanamt"> <label
														class="col-xs-2 text-center control-label">元</label>
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label">实际用款企业名称</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" name="usemoneycompany">
												</div>

												<label class="col-xs-2 control-label"><span
														style="color: red;">*</span>总资产</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" autocomplete="off"
														   onkeyup="clearNoNum(this)" datatype="*" name="totalAssets">
													<label class="col-xs-2 text-center control-label">元</label>
													<label class="Validform_checktip" style="color: red;"></label>
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label"><span
														style="color: red;">*</span>总负债</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" autocomplete="off"
														   onkeyup="clearNoNum(this)" datatype="*"
														   name="totalLiability"> <label
														class="col-xs-2 text-center control-label">元</label> <label
														class="Validform_checktip" style="color: red;"></label>
												</div>

												<label class="col-xs-2 control-label"><span
														style="color: red;">*</span>上年度营业收入</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" datatype="*"
														   autocomplete="off" onkeyup="clearNoNum(this)"
														   name="lastYearIncome"> <label
														class="col-xs-2 text-center control-label">元</label> <label
														class="Validform_checktip" style="color: red;"></label>
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label"><span
														style="color: red;">*</span>当前贷款情况</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" autocomplete="off"
														   onkeyup="clearNoNum(this)" datatype="*"
														   name="currentLoanSituation"> <label
														class="col-xs-2 text-center control-label">元</label> <label
														class="Validform_checktip" style="color: red;"></label>
												</div>

												<label class="col-xs-2 control-label"><span
														style="color: red;">*</span>贷款额度</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" autocomplete="off"
														   onkeyup="clearNoNum(this)" datatype="*" name="loanAmount">
													<label class="col-xs-2 text-center control-label">元</label>
													<label class="Validform_checktip" style="color: red;"></label>
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label"><span
														style="color: red;">*</span>股权融资额度</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" autocomplete="off"
														   onkeyup="clearNoNum(this)" datatype="*"
														   name="equityFinancingAmount"> <label
														class="col-xs-2 text-center control-label">元</label> <label
														class="Validform_checktip" style="color: red;"></label>
												</div>

												<label class="col-xs-2 control-label">拟上市融资时间</label>
												<div class="col-xs-4">
													<input type="text" class="col-xs-6" id="startDate" name="newToBeListedFinancingTime">
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label">五位一体金融服务机构</label>
												<div class="col-xs-9">
													<div class="form-group">
														<label class="col-xs-1">银行 : </label>
														<div class="col-xs-11">
															<c:forEach var="organ" items="${organs}">
																<c:if test="${organ.pid == '2'}">
																	<div class="col-xs-3">
																		<input id="factoringGS" name="factoringGS" type="checkbox" value='${organ.orgcode}'>${organ.orgname}
																	</div>
																</c:if>
															</c:forEach>
														</div>
													</div>
													<div class="form-group">
														<label class="col-xs-1">基金 : </label>
														<div class="col-xs-11">
															<c:forEach var="organ" items="${organs}">
																<c:if test="${organ.pid == '3'}">
																	<div class="col-xs-3">
																		<input id="fundGS" name="fundGS" type="checkbox" value='${organ.orgcode}' />${organ.orgname}
																	</div>
																</c:if>
															</c:forEach>
														</div>
													</div>
													<div id="check" class="form-group">
														<div class="col-xs-1">
															<input type="checkbox" name="business" value="11" id="pg">评估:
														</div>
														<div class="col-xs-5">
															<select id="evaluationGs" name="evaluationGs"
																	class="col-xs-5" disabled="disabled">
																<option value="">请选择</option>
																<c:forEach var="organ" items="${organs}">
																	<c:if test="${organ.pid == '1'}">
																		<option value='${organ.orgcode}'>${organ.orgname}</option>
																	</c:if>
																</c:forEach>
															</select>
														</div>
													</div>
													<div id="check" class="row">
														<div class="col-xs-1">
															<input type="checkbox" name="business" value="13" id="db">担保:
														</div>
														<div class="col-xs-5">
															<select id="guaranteeGs" name="guaranteeGs"
																	class="col-xs-5" disabled="disabled">
																<option value="">请选择</option>
																<c:forEach var="organ" items="${organs}">
																	<c:if test="${organ.pid == '4'}">
																		<option value='${organ.orgcode}'>${organ.orgname}</option>
																	</c:if>
																</c:forEach>
															</select>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-xs-2 control-label">其他需求</label>
												<div class="col-xs-10">
													<textarea name="remark" class="col-xs-12"
															  style="height: 150px;"></textarea>
												</div>
											</div>
										</div>
										<!--financingDiv end---!>
									</div>

									<!-- container-fluid end -->
								</div>
								<!-- proInfoDiv end -->
							</div>
							<!-- layui-tab-item layui-show end -->
						</div>


<%--						<div class="layui-tab-item">--%>
<%--							<!-- 融资需求表单 -->--%>
<%--							<!-- layui-tab-item  end -->--%>
<%--						</div>--%>
						<!-- layui-tab-content end -->
					</div>
					<!-- layui-tab layui-tab-card end  -->
				</div>
				<!-- form-group -->
				<div class="col-xs-12 text-center">
					<button type="button" id="sureSave" class="btn btn-sm btn-primary">提交</button>
					<button type="button" class="btn btn-sm btn-default" id="cancelAdd"
							onClick="self.location=document.referrer;">返回</button>
				</div>
		</form>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<script type="text/javascript" src="${appCtx}/static/busi/project/project_add.js"></script>
	</body>
</html>
