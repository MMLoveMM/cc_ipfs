<jsp:useBean id="enterpriseFilePdf" scope="request" type="cn.net.sinodata.model.EnterpriseFilePdf"/>
<jsp:useBean id="enterpriseIntellectualProperty" scope="request" type="cn.net.sinodata.model.EnterpriseIntellectualProperty"/>
<jsp:useBean id="enterprisePerson" scope="request" type="cn.net.sinodata.model.EnterprisePerson"/>
<jsp:useBean id="enterpriseFinance" scope="request" type="cn.net.sinodata.model.EnterpriseFinance"/>
<jsp:useBean id="enterpriseInfo" scope="request" type="cn.net.sinodata.model.EnterpriseInfo"/>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<div class="layui-tab layui-tab-card">
	<ul class="layui-tab-title" style="background-color:#428bca">
			<li class="layui-this" lay-id="custMsg">企业信息</li>
			<li lay-id="custAcct">财务情况(年度)</li>
			<li lay-id="custCerti">人员情况</li>
			<li lay-id="user">近三年知识产权情况(件)</li>
			<li lay-id="lxr">上传附件(pdf)</li>
	</ul>
	<!-- 企业信息 -->
	<div class="layui-tab-content">
		<div class="layui-tab-item layui-show">
			<table id="enterpriseInfoTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
				<tr>
					<td align="right" class="td1"  width="24%">企业名称</td>
					<td id="name" width="25%">${enterpriseInfo.name}</td>
					<td align="right" class="td1"  width="25%">统一社会信用代码</td>
					<td id="creditCode"  width="25%">${enterpriseInfo.creditCode}</td>
				</tr>
				<tr>
					<td align="right" class="td1">企业成立日期</td>
					<td id="enterpriseCreateDate">${enterpriseInfo.enterpriseCreateDateStr}</td>
					<td align="right" class="td1">企业类别</td>
					<td id="type">${enterpriseInfo.type}</td>
				</tr>
				<tr>
					<td align="right" class="td1">注册地址</td>
					<td id="registeredAddress">${enterpriseInfo.registeredAddress}</td>
					<td align="right" class="td1">注册资本</td>
					<td id="registeredCapital">${enterpriseInfo.registeredCapital} 万元</td>
				</tr>
				<tr>
					<td align="right" class="td1">登记机关</td>
					<td id="registrationAuthority">${enterpriseInfo.registrationAuthority}</td>
					<td align="right" class="td1">企业所在地</td>
					<td id="location">${enterpriseInfo.location}</td>
				</tr>
				<tr>
					<td align="right" class="td1"><nobr><span>认定情况</span></nobr></td>
					<td id="identificationSituation">${enterpriseInfo.identificationSituation}</td>
					<td align="right" class="td1">行业类型</td>
					<td id="industryType">${enterpriseInfo.industryType}</td>
				</tr>
				<tr>
					<td align="right" class="td1">主要产品</td>
					<td id="mainProducts">${enterpriseInfo.mainProducts}</td>
					<td align="right" class="td1">是否上市或挂牌</td>
					<td id="ishighindustry">${enterpriseInfo.whetherListed}</td>
				</tr>
				<tr>
					<td align="right" class="td1">上市类型</td>
					<td id="customertype">${enterpriseInfo.listedType}</td>
					<td align="right" class="td1">股票代码</td>
					<td id="customerstatus">${enterpriseInfo.stockCode}</td>
				</tr>
				<tr>
					<td align="right" class="td1">上市时间</td>
					<td id="corporatecapacity">${enterpriseInfo.listedDateStr}</td>
					<td align="right" class="td1">法人姓名</td>
					<td id="subordination">${enterpriseInfo.legalName}</td>
				</tr>
				<tr>
					<td align="right" class="td1">证件类型</td>
					<td id="mainbusiness">${enterpriseInfo.carType}</td>
					<td align="right" class="td1">证件号码</td>
					<td id="shareholder">${enterpriseInfo.carNumber}</td>

				</tr>
				<tr>
					<td align="right" class="td1">法人固定电话</td>
					<td id="director">${enterpriseInfo.legalTelephone}</td>
					<td align="right" class="td1">法人手机</td>
					<td id="managers">${enterpriseInfo.legalPhone}</td>
				</tr>
				<tr>
					<td align="right" class="td1">法人邮箱</td>
					<td id="comanylegalperson">${enterpriseInfo.legalEmail}</td>
					<td align="right"  class="td1">联系人姓名</td>
					<td id="buicontrolperson" colspan="3">${enterpriseInfo.contactName}</td>
				</tr>
				<tr>
					<td align="right" class="td1">联系人手机</td>
					<td id="code">${enterpriseInfo.contactPhone}</td>
					<td align="right"  class="td1">联系人邮箱</td>
					<td id="county" colspan="3">${enterpriseInfo.contactEmail}</td>
				</tr>
			</table>
		</div>
		<!-- 财务情况 -->
	    	<div class="layui-tab-item">
				<table id="enterpriseFinanceTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
					<tr>
						<td align="right" class="td1"  width="24%">营业收入</td>
						<td id="operatingIncome" width="25%">${enterpriseFinance.operatingIncome} 万元</td>
						<td align="right" class="td1"  width="25%">主营业务收入</td>
						<td id="mainBusinessIncome"  width="25%">${enterpriseFinance.mainBusinessIncome} 万元</td>
					</tr>
					<tr>
						<td align="right" class="td1">营业成本</td>
						<td id="operatingCost">${enterpriseFinance.operatingCost} 万元</td>
						<td align="right" class="td1">税金总计</td>
						<td id="totalTax">${enterpriseFinance.totalTax} 万元</td>
					</tr>
					<tr>
						<td align="right" class="td1">利润总额</td>
						<td id="totalProfit">${enterpriseFinance.totalProfit} 万元</td>
						<td align="right" class="td1">资产总计</td>
						<td id="totalAssets">${enterpriseFinance.totalAssets} 万元</td>
					</tr>
					<tr>
						<td align="right" class="td1">固定资产合计</td>
						<td id="totalFixedAssets">${enterpriseFinance.totalFixedAssets} 万元</td>
						<td align="right" class="td1">负债总计</td>
						<td id="totalLiabilities">${enterpriseFinance.totalLiabilities} 万元</td>
					</tr>
					<tr>
						<td align="right" class="td1"><nobr><span>研究开发费用</span></nobr></td>
						<td id="researchCost">${enterpriseFinance.researchCost} 万元</td>
						<td align="right" class="td1">其中政府资助研发费用</td>
						<td id="governmentFunding">${enterpriseFinance.governmentFunding} 万元</td>
					</tr>
					<tr>
						<td align="right" class="td1">研发费用占营业收入比</td>
						<td id="proportion">${enterpriseFinance.proportion}%</td>
					</tr>
				</table>
	    	</div>
	    <!-- 人员情况 -->
	    	<div class="layui-tab-item">
				<table id="enterprisePersonTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
					<tr>
						<td align="right" class="td1"  width="24%">职工总数</td>
						<td id="totalStaff" width="25%">${enterprisePerson.totalStaff} 人</td>
						<td align="right" class="td1"  width="25%">科技人员</td>
						<td id="technologyPerson"  width="25%">${enterprisePerson.technologyPerson} 人</td>
					</tr>
					<tr>
						<td align="right" class="td1">科技人员占职工总数比</td>
						<td id="proportion2">${enterprisePerson.proportion} %</td>
						<td align="right" class="td1">在职人员</td>
						<td id="inService">${enterprisePerson.inService} 人</td>
					</tr>
					<tr>
						<td align="right" class="td1">兼职人员</td>
						<td id="partTime">${enterprisePerson.partTime} 人</td>
						<td align="right" class="td1">临时聘用人</td>
						<td id="temporary">${enterprisePerson.temporary} 人</td>
					</tr>
					<tr>
						<td align="right" class="td1">博士</td>
						<td id="doctor">${enterprisePerson.doctor} 人</td>
						<td align="right" class="td1">硕士</td>
						<td id="masterDegree">${enterprisePerson.masterDegree} 人</td>
					</tr>
					<tr>
						<td align="right" class="td1"><nobr><span>本科</span></nobr></td>
						<td id="bachelor">${enterprisePerson.bachelor} 人</td>
						<td align="right" class="td1">大专及以下学历</td>
						<td id="collegeAndBelow">${enterprisePerson.collegeAndBelow} 人</td>
					</tr>
					<tr>
						<td align="right" class="td1">高级职称</td>
						<td id="seniorTitle">${enterprisePerson.seniorTitle} 人</td>
						<td align="right" class="td1">中级职称</td>
						<td id="intermediateTitle">${enterprisePerson.intermediateTitle} 人</td>
					</tr>
					<tr>
						<td align="right" class="td1">初级职称</td>
						<td id="primaryTitle">${enterprisePerson.primaryTitle} 人</td>
					</tr>
				</table>
	    	</div>
	    <!-- 近三年知识产权情况 -->
	    	<div class="layui-tab-item">
				<table id="companyTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
					<tr>
						<td align="right" class="td1"  width="24%">发明专利</td>
						<td id="patent" width="25%">${enterpriseIntellectualProperty.patent} 件</td>
						<td align="right" class="td1"  width="25%">实用新型专利</td>
						<td id="utilityModelPatents"  width="25%">${enterpriseIntellectualProperty.utilityModelPatents} 件</td>
					</tr>
					<tr>
						<td align="right" class="td1">外观设计专利</td>
						<td id="designPatent">${enterpriseIntellectualProperty.designPatent} 件</td>
						<td align="right" class="td1">软件著作权</td>
						<td id="softwareCopyright">${enterpriseIntellectualProperty.softwareCopyright} 件</td>
					</tr>
					<tr>
						<td align="right" class="td1">国家新药</td>
						<td id="nationalNewDrug">${enterpriseIntellectualProperty.nationalNewDrug} 件</td>
						<td align="right" class="td1">国家一级中药保护品种</td>
						<td id="medicine">${enterpriseIntellectualProperty.medicine} 件</td>
					</tr>
					<tr>
						<td align="right" class="td1">植物新品种</td>
						<td id="newPlantVariety">${enterpriseIntellectualProperty.newPlantVariety} 件</td>
						<td align="right" class="td1">国家级农作物品种</td>
						<td id="cropVariety">${enterpriseIntellectualProperty.cropVariety} 件</td>
					</tr>
					<tr>
						<td align="right" class="td1">集成电路布图设计专有权</td>
						<td id="integratedCircuit">${enterpriseIntellectualProperty.integratedCircuit} 件</td>
					</tr>
				</table>
	    	</div>
	    <!-- 附件 -->
	    	<div class="layui-tab-item">
	    		<table id="lxrTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
						<td align="right" class="td1" width="24%">营业执照副本</td>
						<td id="businessLicenseCopy" width="25%"><a class="btn btn-info" href="${appCtx}${enterpriseFilePdf.businessLicenseCopy}" download>下载</a></td>
						<td align="right" class="td1" width="25%">知识产权相关证明材料</td>
						<td id="intellectualProperty" width="25%"><a class="btn btn-info" href="${appCtx}${enterpriseFilePdf.intellectualProperty}" download>下载</a></td>
					</tr>
					<tr>
						<td align="right" class="td1">财务审计报告</td>
						<td id="financialAuditReport"><a class="btn btn-info" href="${appCtx}${enterpriseFilePdf.financialAuditReport}" download>下载</a></td>
						<td align="right" class="td1">说明书</td>
						<td id="instructionManual"><a class="btn btn-info" href="${appCtx}${enterpriseFilePdf.instructionManual}" download>下载</a></td>
					</tr>
	    		</table>
	    	</div>
	</div>
</div>