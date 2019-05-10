<jsp:useBean id="rzMap" scope="request" type="java.util.Map"/>
<jsp:useBean id="projectInfo" scope="request" type="cn.net.sinodata.model.ProjectInfo"/>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 融资需求详情</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="widtd=device-widtd, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/new_css-base.jsp" flush="true" />
		<style>
			tr>td:nth-child(1), tr>td:nth-child(3){text-align: center;}
		</style>
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<div class="container" style="padding-top: 102px;">
			<div class="row" style="text-align: center;">
				<label style="font-size: 24px;">${projectInfo.projectname}</label>
			</div>
			<div class="row" style="text-align: right; margin-top: 10px;">
				<label>发布时间：<fmt:formatDate value="${projectInfo.createtime}" pattern="yyyy-MM-dd" /></label>
			</div>
			<div class="row" style="margin-top: 15px;">
				<label style="font-size: 18px;">&nbsp;&nbsp;&nbsp;| 融资需求</label>
			</div>
			<table class="table table-bordered" style="margin-top: 20px; padding: 0px;">
				<tbody>
					<tr>
						<td style="width: 20%;">本次融资金额</td>
						<td style="width: 30%">${projectInfo.loanamt}</td>
						<td style="width: 20%">融资用途</td>
						<td style="width: 30%">${projectInfo.loanuse}</td>
					</tr>
					<tr>
						<td>费率</td>
						<td>${projectInfo.rate}</td>
						<td>融资类型</td>
						<td>${projectInfo.loantype}</td>
					</tr>
					<tr>
						<td>融资期限</td>
						<td>${projectInfo.loandeadline}</td>
						<td>知识产权类型</td>
						<td>${projectInfo.inteprotype}</td>
					</tr>
					<tr>
						<td>已融额度</td>
						<td>${projectInfo.hasloanamt}</td>
						<td>实际用款企业名称</td>
						<td>${projectInfo.usemoneycompany}</td>
					</tr>
					<tr>
						<td>总资产</td>
						<td>${projectInfo.totalAssets}</td>
						<td>总负额</td>
						<td>${projectInfo.totalLiability}</td>
					</tr>
					<tr>
						<td>上年度营业收入</td>
						<td>${projectInfo.lastYearIncome}</td>
						<td>当贷款情况</td>
						<td>${projectInfo.currentLoanSituation}</td>
					</tr>
					<tr>
						<td>贷款额度</td>
						<td>${projectInfo.loanAmount}</td>
						<td>股权融资额度</td>
						<td>${projectInfo.equityFinancingAmount}</td>
					</tr>
					<tr>
						<td>拟上市融资时间</td>
						<td><fmt:formatDate value="${projectInfo.toBeListedFinancingTime}" pattern="yyyy-MM-dd" /></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>

			<div class="row" style="margin-top: 15px;">
				<label style="font-size: 18px;">&nbsp;&nbsp;&nbsp;| 五位一体金融服务机构</label>
			</div>
			<table class="table table-bordered" style="margin-top: 20px; padding: 0px;">
				<tbody>
					<tr>
						<td style="width: 20%;">银行</td>
						<td>${rzMap.pl}</td>
					</tr>
					<tr>
						<td>评估</td>
						<td>${rzMap.pg}</td>
					</tr>
					<tr>
						<td>担保</td>
						<td>${rzMap.db}</td>
					</tr>
					<tr>
						<td>基金</td>
						<td>${rzMap.jj}</td>
					</tr>
				</tbody>
			</table>

			<div class="row" style="margin-top: 15px;">
				<label style="font-size: 18px;">&nbsp;&nbsp;&nbsp;| 其它需求</label>
			</div>
			<table class="table table-bordered" style="margin-top: 20px; padding: 0px;">
				<tbody>
				<tr>
					<td style="height: 166px; text-align: left;">${projectInfo.remark}</td>
				</tr>
				</tbody>
			</table>

			<div class="row" style="margin-top: 50px; text-align: center;">
				<div onclick="javascript:history.back(-1);" class="btn btn-lg btn-info">返回</div>
			</div>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<script src="${appCtx}/static/busi/demand/detail.js"></script>
	</body>
</html>
