<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 更新企业信息</title>
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
				<label style="color: #4A4A4A;">当前位置: 首页 > 我要融资 > 更新企业信息</label>
			</div>
		</div>
		<div class="container" style="padding-top: 50px;">
			<form name="search_form" id="searchForm" class="form-horizontal">

			<div class="layui-tab layui-tab-card">
				<ul class="layui-tab-title" style="background-color: #428bca">
					<li class="layui-this" lay-id="custMsg">企业信息</li>
					<li lay-id="custAcct">财务情况(年度)</li>
					<li lay-id="custCerti">人员情况</li>
					<li lay-id="user">近三年知识产权情况(件)</li>
					<li lay-id="asset">上传附件(pdf)</li>
				</ul>

				<div class="layui-tab-content" style="height: 100px;">
					<!-- 企业信息 -->
					<div class="layui-tab-item layui-show">
						<input type="hidden" name="enterpriseInfo.id" value="${enterpriseInfo.id}">
						<div class="form-group">
							<label class="col-xs-2 control-label">企业名称</label>
							<div class="col-xs-4">
								<input type="text" datatype="*" id="name" name="enterpriseInfo.name" value="${enterpriseInfo.name}" class="col-xs-7">
							</div>

							<label class="col-xs-2 control-label">统一社会信用代码</label>
							<div class="col-xs-4">
								<input type="text" id="creditCode" name="enterpriseInfo.creditCode" value="${enterpriseInfo.creditCode}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">企业成立日期</label>
							<div class="col-xs-4">
								<input type="text" id="enterpriseCreateDate" name="enterpriseInfo.enterpriseCreateDate" value="${enterpriseInfo.enterpriseCreateDateStr}" class="col-xs-7" readonly>
							</div>
							<label class="col-xs-2 control-label">企业类别</label>
							<div class="col-xs-4">
								<input type="text" id="type" name="enterpriseInfo.type" value="${enterpriseInfo.type}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">注册地址</label>
							<div class="col-xs-4">
								<input type="text" id="registeredAddress" name="enterpriseInfo.registeredAddress" value="${enterpriseInfo.registeredAddress}" class="col-xs-7">
							</div>
							<label class="col-xs-2 control-label">注册资本</label>
							<div class="col-xs-4">
								<input type="text" id="registeredCapital" name="enterpriseInfo.registeredCapital" value="${enterpriseInfo.registeredCapital}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">登记机关</label>
							<div class="col-xs-4">
								<input type="text" id="registrationAuthority" name="enterpriseInfo.registrationAuthority" value="${enterpriseInfo.registrationAuthority}" class="col-xs-7">
							</div>

							<label class="col-xs-2 control-label">企业所在地</label>
							<div class="col-xs-4">
								<select id="location" name="enterpriseInfo.location"  value="${enterpriseInfo.location}" class="col-xs-7">
									<option value="">请选择</option>
									<option value="吉林省">吉林省</option>
									<option value="长春市">长春市</option>
									<option value="朝阳区">朝阳区</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">认定情况</label>
							<div class="col-xs-4">
								<select id="identificationSituation" name="enterpriseInfo.identificationSituation"  value="${enterpriseInfo.identificationSituation}" class="col-xs-7">
									<option value="">请选择</option>
									<option value="国家高新技术企业">国家高新技术企业</option>
									<option value="吉林省科技型“小巨人”企业">吉林省科技型“小巨人”企业</option>
									<option value="长春市高新技术企业">长春市高新技术企业</option>
									<option value="长春市科技型“小巨人”企业">长春市科技型“小巨人”企业</option>
									<option value="其它">其它</option>
								</select>
							</div>
							<label class="col-xs-2 control-label">行业类型</label>
							<div class="col-xs-4">
								<input type="text" id="industryType" name="enterpriseInfo.industryType"  value="${enterpriseInfo.industryType}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">主要产品</label>
							<div class="col-xs-4">
								<input type="text" id="mainProducts" name="enterpriseInfo.mainProducts"  value="${enterpriseInfo.mainProducts}" class="col-xs-7">
							</div>
							<label class="col-xs-2 control-label">是否上市或挂牌</label>
							<div class="col-xs-4">
								<div class="col-xs-2 text-center">
									<input type="radio" id="whetherListed" name="enterpriseInfo.whetherListed"
										   <c:if test="${enterpriseInfo.whetherListed == 是}">checked</c:if> value="是" title="是"> 是
								</div>
								<div class="col-xs-2 text-center">
									<input type="radio" id="whetherListed2" name="enterpriseInfo.whetherListed"
										   <c:if test="${enterpriseInfo.whetherListed == 否}">checked</c:if>value="否" title="否"> 否
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">上市类型</label>
							<div class="col-xs-4">
								<input type="text" id="listedType" name="enterpriseInfo.listedType"  value="${enterpriseInfo.listedType}" class="col-xs-7" disabled>
							</div>
							<label class="col-xs-2 control-label">股票代码</label>
							<div class="col-xs-4">
								<input type="text" id="stockCode" name="enterpriseInfo.stockCode"  value="${enterpriseInfo.stockCode}" class="col-xs-7" disabled>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">上市时间</label>
							<div class="col-xs-4">
								<input type="text" id="listedDate" name="enterpriseInfo.listedDate"  value="${enterpriseInfo.listedDateStr}" class="col-xs-7" readonly disabled>
							</div>
							<label class="col-xs-2 control-label">法人姓名</label>
							<div class="col-xs-4">
								<input type="text" id="legalName" name="enterpriseInfo.legalName" value="${enterpriseInfo.legalName}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">证件类型</label>
							<div class="col-xs-4">
								<select id="carType" name="enterpriseInfo.carType" value="${enterpriseInfo.carType}" class="col-xs-7">
									<option value="">请选择</option>
									<option value="身份证">身份证</option>
								</select>
							</div>
							<label class="col-xs-2 control-label">证件号码</label>
							<div class="col-xs-4">
								<input type="text" id="carNumber" name="enterpriseInfo.carNumber" value="${enterpriseInfo.carNumber}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">法人固定电话</label>
							<div class="col-xs-4">
								<input type="text" id="legalTelephone" name="enterpriseInfo.legalTelephone" value="${enterpriseInfo.legalTelephone}" class="col-xs-7">
							</div>
							<label class="col-xs-2 control-label">法人手机</label>
							<div class="col-xs-4">
								<input type="text" id="legalPhone" name="enterpriseInfo.legalPhone" value="${enterpriseInfo.legalPhone}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">法人邮箱</label>
							<div class="col-xs-4">
								<input type="text" id="legalEmail" name="enterpriseInfo.legalEmail" value="${enterpriseInfo.legalEmail}" class="col-xs-7">
							</div>
							<label class="col-xs-2 control-label">联系人姓名</label>
							<div class="col-xs-4">
								<input type="text" id="contactName" name="enterpriseInfo.contactName" value="${enterpriseInfo.contactName}" class="col-xs-7">
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">联系人手机</label>
							<div class="col-xs-4">
								<input type="text" datatype="*" id="contactPhone" name="enterpriseInfo.contactPhone" value="${enterpriseInfo.contactPhone}" class="col-xs-7">
							</div>
							<label class="col-xs-2 control-label">联系人邮箱</label>
							<div class="col-xs-4">
								<input type="text" id="contactEmail" name="enterpriseInfo.contactEmail" value="${enterpriseInfo.contactEmail}" class="col-xs-7">
							</div>
						</div>
					</div>
					<!-- 财务情况 -->
					<div class="layui-tab-item">
						<input type="hidden" name="enterpriseFinance.id" value="${enterpriseFinance.id}">
						<div class="form-group">
							<label class="col-xs-2 control-label">营业收入</label>
							<div class="col-xs-4">
								<input type="text" datatype="*" id="operatingIncome" name="enterpriseFinance.operatingIncome" value="${enterpriseFinance.operatingIncome}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>

							<label class="col-xs-2 control-label">主营业务收入</label>
							<div class="col-xs-4">
								<input type="text" id="mainBusinessIncome" name="enterpriseFinance.mainBusinessIncome" value="${enterpriseFinance.mainBusinessIncome}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">营业成本</label>
							<div class="col-xs-4">
								<input type="text" id="operatingCost" name="enterpriseFinance.operatingCost" value="${enterpriseFinance.operatingCost}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
							<label class="col-xs-2 control-label">税金总计</label>
							<div class="col-xs-4">
								<input type="text" id="totalTax" name="enterpriseFinance.totalTax" value="${enterpriseFinance.totalTax}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">利润总额</label>
							<div class="col-xs-4">
								<input type="text" id="totalProfit" name="enterpriseFinance.totalProfit" value="${enterpriseFinance.totalProfit}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
							<label class="col-xs-2 control-label">资产总计</label>
							<div class="col-xs-4">
								<input type="text" id="totalAssets" name="enterpriseFinance.totalAssets" value="${enterpriseFinance.totalAssets}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">固定资产合计</label>
							<div class="col-xs-4">
								<input type="text" id="totalFixedAssets" name="enterpriseFinance.totalFixedAssets" value="${enterpriseFinance.totalFixedAssets}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
							<label class="col-xs-2 control-label">负债总计</label>
							<div class="col-xs-4">
								<input type="text" id="totalLiabilities" name="enterpriseFinance.totalLiabilities" value="${enterpriseFinance.totalLiabilities}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">研究开发费用</label>
							<div class="col-xs-4">
								<input type="text" id="researchCost" name="enterpriseFinance.researchCost" value="${enterpriseFinance.researchCost}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
							<label class="col-xs-2 control-label">其中政府资助研发费用</label>
							<div class="col-xs-4">
								<input type="text" id="governmentFunding" name="enterpriseFinance.governmentFunding" value="${enterpriseFinance.governmentFunding}" class="col-xs-7">
								<label class="col-xs-3 control-label">（万元）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">研发费用占营业收入比</label>
							<div class="col-xs-4">
								<input type="text" id="proportion" name="enterpriseFinance.proportion" value="${enterpriseFinance.proportion}" class="col-xs-7">
								<label class="col-xs-3 control-label">（%）</label>
							</div>
						</div>
					</div>
					<!-- 人员情况 -->
					<div class="layui-tab-item">
						<input type="hidden" name="enterprisePerson.id" value="${enterprisePerson.id}">
						<div class="form-group">
							<label class="col-xs-2 control-label">职工总数</label>
							<div class="col-xs-4">
								<input type="text" datatype="*" id="totalStaff" name="enterprisePerson.totalStaff" value="${enterprisePerson.totalStaff}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>

							<label class="col-xs-2 control-label">科技人员</label>
							<div class="col-xs-4">
								<input type="text" id="technologyPerson" name="enterprisePerson.technologyPerson" value="${enterprisePerson.technologyPerson}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">科技人员占职工总数比</label>
							<div class="col-xs-4">
								<input type="text" id="proportion2" name="enterprisePerson.proportion" value="${enterprisePerson.proportion}" class="col-xs-7">
								<label class="col-xs-3 control-label">（%）</label>
							</div>
							<label class="col-xs-2 control-label">在职人员</label>
							<div class="col-xs-4">
								<input type="text" id="inService" name="enterprisePerson.inService" value="${enterprisePerson.inService}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">兼职人员</label>
							<div class="col-xs-4">
								<input type="text" id="partTime" name="enterprisePerson.partTime" value="${enterprisePerson.partTime}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
							<label class="col-xs-2 control-label">临时聘用人员</label>
							<div class="col-xs-4">
								<input type="text" id="temporary" name="enterprisePerson.temporary" value="${enterprisePerson.temporary}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">博士</label>
							<div class="col-xs-4">
								<input type="text" id="doctor" name="enterprisePerson.doctor" value="${enterprisePerson.doctor}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
							<label class="col-xs-2 control-label">硕士</label>
							<div class="col-xs-4">
								<input type="text" id="masterDegree" name="enterprisePerson.masterDegree" value="${enterprisePerson.masterDegree}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">本科</label>
							<div class="col-xs-4">
								<input type="text" id="bachelor" name="enterprisePerson.bachelor" value="${enterprisePerson.bachelor}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
							<label class="col-xs-2 control-label">大专及以下学历</label>
							<div class="col-xs-4">
								<input type="text" id="collegeAndBelow" name="enterprisePerson.collegeAndBelow" value="${enterprisePerson.collegeAndBelow}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">高级职称</label>
							<div class="col-xs-4">
								<input type="text" id="seniorTitle" name="enterprisePerson.seniorTitle" value="${enterprisePerson.seniorTitle}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
							<label class="col-xs-2 control-label">中级职称</label>
							<div class="col-xs-4">
								<input type="text" id="intermediateTitle" name="enterprisePerson.intermediateTitle" value="${enterprisePerson.intermediateTitle}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">初级职称</label>
							<div class="col-xs-4">
								<input type="text" id="primaryTitle" name="enterprisePerson.primaryTitle" value="${enterprisePerson.primaryTitle}" class="col-xs-7">
								<label class="col-xs-3 control-label">（人）</label>
							</div>
						</div>
					</div>
					<!-- 近三年知识产权情况 -->
					<div class="layui-tab-item">
						<input type="hidden" name="enterpriseIntellectualProperty.id" value="${enterpriseIntellectualProperty.id}">
						<div class="form-group">
							<label class="col-xs-2 control-label">发明专利</label>
							<div class="col-xs-4">
								<input type="text" datatype="*" id="patent" name="enterpriseIntellectualProperty.patent" value="${enterpriseIntellectualProperty.patent}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>

							<label class="col-xs-2 control-label">实用新型专利</label>
							<div class="col-xs-4">
								<input type="text" id="utilityModelPatents" name="enterpriseIntellectualProperty.utilityModelPatents" value="${enterpriseIntellectualProperty.utilityModelPatents}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">外观设计专利</label>
							<div class="col-xs-4">
								<input type="text" id="designPatent" name="enterpriseIntellectualProperty.designPatent" value="${enterpriseIntellectualProperty.designPatent}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
							<label class="col-xs-2 control-label">软件著作权</label>
							<div class="col-xs-4">
								<input type="text" id="softwareCopyright" name="enterpriseIntellectualProperty.softwareCopyright" value="${enterpriseIntellectualProperty.softwareCopyright}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">国家新药</label>
							<div class="col-xs-4">
								<input type="text" id="nationalNewDrug" name="enterpriseIntellectualProperty.nationalNewDrug" value="${enterpriseIntellectualProperty.nationalNewDrug}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
							<label class="col-xs-2 control-label">国家一级中药保护品种</label>
							<div class="col-xs-4">
								<input type="text" id="medicine" name="enterpriseIntellectualProperty.medicine" value="${enterpriseIntellectualProperty.medicine}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">植物新品种</label>
							<div class="col-xs-4">
								<input type="text" id="newPlantVariety" name="enterpriseIntellectualProperty.newPlantVariety" value="${enterpriseIntellectualProperty.newPlantVariety}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
							<label class="col-xs-2 control-label">国家级农作物品种</label>
							<div class="col-xs-4">
								<input type="text" id="cropVariety" name="enterpriseIntellectualProperty.cropVariety" value="${enterpriseIntellectualProperty.cropVariety}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">集成电路布图设计专有权</label>
							<div class="col-xs-4">
								<input type="text" id="integratedCircuit" name="enterpriseIntellectualProperty.integratedCircuit" value="${enterpriseIntellectualProperty.integratedCircuit}" class="col-xs-7">
								<label class="col-xs-3 control-label">（件）</label>
							</div>
						</div>
					</div>
					<!-- 上传附件 -->
					<div class="layui-tab-item">
						<div class="form-group">
							<input type="hidden" name="enterpriseFilePdf.id" value="${enterpriseFilePdf.id}">
							<label class="col-xs-2 control-label">营业执照副本</label>
							<div class="col-xs-4">
								<input type="file" id="businessLicenseCopy">
								<input type="button" id="businessLicenseCopyUpload" value="上传" />
							</div>
							<input type="hidden" id="businessLicenseCopyVal" name="enterpriseFilePdf.businessLicenseCopy">
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">知识产权相关证明材料</label>
							<div class="col-xs-4">
								<input type="file" id="intellectualProperty">
								<input type="button" id="intellectualPropertyUpload" value="上传" />
							</div>
							<input type="hidden" id="intellectualPropertyVal" name="enterpriseFilePdf.intellectualProperty">
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">财务审计报告</label>
							<div class="col-xs-4">
								<input type="file" id="financialAuditReport">
								<input type="button" id="financialAuditReportUpload" value="上传" />
							</div>
							<input type="hidden" id="financialAuditReportVal" name="enterpriseFilePdf.financialAuditReport">
						</div>

						<div class="form-group">
							<label class="col-xs-2 control-label">说明书</label>
							<div class="col-xs-4">
								<input type="file" id="instructionManual">
								<input type="button" id="instructionManualUpload" value="上传" />
							</div>
							<input type="hidden" id="instructionManualVal" name="enterpriseFilePdf.instructionManual">
						</div>

					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-12 text-center">
					<button type="button" id="search_submit_Btn" class="btn btn-primary">提交</button>
					<button type="button" class="btn btn-default" id="search_return_Btn" onClick="self.location=document.referrer;" >返回</button>
				</div>
			</div>
		</form>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../../base/new_footer.jsp" flush="true" />

		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<script src="${appCtx}/static/busi/user_jsp/enter/enterprise_update.js"></script>
	</body>
</html>
