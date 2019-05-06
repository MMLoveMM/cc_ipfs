<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>长春市科技金融服务平台 - 企业客户录入</title>
<meta name="description" content="overview &amp; stats" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<%-- 加载css模块  --%>
<jsp:include page="../base/css-table.jsp" flush="true" />
<jsp:include page="../base/css-base.jsp" flush="true" />

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
						<li class="active">企业客户录入</li>
					</ul>
				</div>
				<!-- 面包屑导航结束 -->

				<!-- 页面内容 -->
				<div class="page-content" style="position: relative;">
					<!-- /.page-header -->
					<div class="page-header">
						<h1>
							企业客户管理 <small> <i
								class="ace-icon fa fa-angle-double-right"></i> 新增管理
							</small>
						</h1>
					</div>
					<!-- /.page-header -->
					<!-- PAGE CONTENT BEGINS -->

					<form name="search_form" id="searchForm" class="form-horizontal">

						<input name="id" id="id" value='${id}' type="hidden" /> <input
							name="dataStr" id="dataStrInput" type="hidden" /> <input
							name="acctStr" id="acctStrInput" type="hidden" /> <input
							name="certiStr" id="certiStrInput" type="hidden" />
						<div class="layui-tab layui-tab-card">
							<ul class="layui-tab-title" style="background-color: #428bca">
								<li class="layui-this" lay-id="custMsg">企业信息</li>
								<li lay-id="custAcct">账户信息</li>
								<li lay-id="custCerti">证件信息</li>
								<li lay-id="user">客户附件</li>
								<li lay-id="asset">资产负债表</li>
								<li lay-id="pal">损益表</li>
								<li lay-id="cash">现金流量表</li>
								<li lay-id="accratio">账务比率</li>
							</ul>
							
							<div class="layui-tab-content" style="height: 100px;">
								<!-- 企业信息 -->
								<div class="layui-tab-item layui-show">
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>企业名称</label>
										<div class="col-xs-4">
											<input type="text" datatype="*" id="companyname" name="companyname" class="col-xs-7">
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
										
										<label class="col-xs-2 control-label">企业简称</label>
										<div class="col-xs-4">
												<input type="text" id="shortname" name="shortname" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">英文名称</label>
										<div class="col-xs-4">
											<input type="text" id="englishname" name="englishname" class="col-xs-7">
										</div>
										<label class="col-xs-2 control-label">成立时间</label>
										<div class="col-xs-4">
											<input type="text" id="createTime" name="createtime" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>注册资本</label>
										<div class="col-xs-4">
											<input type="text" datatype="*" id="registeredcapital"
												name="registeredcapital" class="col-xs-7"
												onkeyup="Customer.changeAmt(),Customer.convertCurrency()"
												onblur="Customer.convertCurrency()">
											<label class="col-xs-1 control-label">元</label>
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
										<div class="col-xs-6">
											<button class="btn btn-sm btn-primary" id="search_qWrite_Btn">快速录入</button>
										</div>
									</div>
									
									<div class="form-group" style="display: none;" id="registered">
										<label class="col-xs-2 control-label">注册资本快速录入</label>
										<div class="col-xs-4">
											<input type="text" id="registeredcapitalM" class="col-xs-7" onkeyup="Customer.changeAmt2()">
											<label class="col-xs-2 control-label">万元</label>
										</div>
										<label class="col-xs-2 control-label">大写金额</label> 
										<label class="col-xs-4 text-center" id="lab"></label>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">实到资本</label>
										<div class="col-xs-4">
											<input type="text" id="practicalcapital" name="practicalcapital" class="col-xs-7"
												onkeyup="Customer.changeAmtSD(),Customer.currency()" onblur="Customer.currency()">
											<label class="col-xs-1 control-label">元</label>
										</div>
										<div class="col-xs-6">
											<button class="btn btn-sm btn-primary" id="search_qwrite1_Btn">快速录入</button>
										</div>
									</div>
									
									<div class="form-group" style="display: none;" id="practical">
										<label class="col-xs-2 control-label">实到资本快速录入</label>
										<div class="col-xs-4">
											<input type="text" id="practicalcapital2" class="col-xs-7" onkeyup="Customer.changeAmtSD1()">
											<label class="col-xs-2 control-label">万元</label>
										</div>
										<label class="col-xs-2 control-label">大写金额</label> 
										<label class="col-xs-4 text-center" id="lab1"></label>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">公司法律责任形式</label>
										<div class="col-xs-4">
											<select class="col-xs-7">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'companytype'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select>
										</div>
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>公司规模</label>
										<div class="col-xs-4">
											<select name="comsize" class="col-xs-7" id="comsize" datatype="*">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'comSize'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select> 
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-xs-2 control-label">企业类型</label>
										<div class="col-xs-10">
											<c:forEach var="tData" items="${tDatas}">
												<c:if test="${tData.dictType == 'customEnterpriseType'}">
													<div class="col-xs-4">
														<input type="checkbox" name="companytype" value="${tData.dcode}">${tData.dname}
													</div>
									        	</c:if>
											</c:forEach>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>行业类型</label>
										<div class="col-xs-10">
											<c:forEach var="tData" items="${tDatas}">
												<c:if test="${tData.dictType == 'businesstype'}">
													<div class="col-xs-4">
														<input type="checkbox" name="businesstype" datatype="*" id="businesstype" value="${tData.dcode}">${tData.dname}
													</div>
											    </c:if>
											</c:forEach>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-xs-2 control-label">职工人数</label>
										<div class="col-xs-4">
											<input type="text" id="employees" name="employees" class="col-xs-7">
											<label class="col-xs-1 control-label">人</label>
										</div>
										<label class="col-xs-2 control-label">是否高新技术企业</label>
										<div class="col-xs-4">
											<div class="col-xs-2 text-center">
												<input type="radio" name="ishighindustry" value="是" title="是">是 
											</div>
											<div class="col-xs-2 text-center">
												<input type="radio" name="ishighindustry" value="否" title="否">否
											</div>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-xs-2 control-label">客户种类</label>
										<div class="col-xs-4">
											<select class="col-xs-7" name="customertype">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'customerType'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select>
										</div>
										<label class="col-xs-2 control-label">客户状态</label>
										<div class="col-xs-4">
											<select class="col-xs-7" name="customerstatus">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'customerStatus'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-xs-2 control-label">法人资格</label>
										<div class="col-xs-4">
											<select class="col-xs-7" name="corporatecapacity">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'corporateCapacity'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select>
										</div>
										<label class="col-xs-2 control-label">隶属关系</label>
										<div class="col-xs-4">
											<select class="col-xs-7" name="subordination">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'subordination'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-xs-2 control-label">主营业务</label>
										<div class="col-xs-4">
											<input type="text" id="mainbusiness" name="mainbusiness" class="col-xs-7">
										</div>
										<label class="col-xs-2 control-label">主要管理者</label>
										<div class="col-xs-4">
											<input type="text" id="managers" name="managers" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">主要股东</label>
										<div class="col-xs-4">
											<input type="text" id="shareholder" name="shareholder" class="col-xs-7">
										</div>
										<label class="col-xs-2 control-label">主要董事</label>
										<div class="col-xs-4">
											<input type="text" id="director" name="director" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">法定代表人</label>
										<div class="col-xs-4">
											<input type="text" id="comanylegalperson" name="comanylegalperson" class="col-xs-7">
										</div>
										<label class="col-xs-2 control-label">企业实际控制人</label>
										<div class="col-xs-4">
											<input type="text" id="buicontrolperson" name="buicontrolperson" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>街镇</label>
										<div class="col-xs-4">
											<select class="col-xs-7" name="county" id="county" datatype="*">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'addressList'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select> 
											
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>认定情况</label>
										<div class="col-xs-4">
											<select class="col-xs-7" name="ldentifyTheSituation"
												id="ldentifyTheSituation" datatype="*">
												<option value="">请选择</option>
												<c:forEach var="tData" items="${tDatas}">
													<c:if test="${tData.dictType == 'identifiedList'}">
														<option value="${tData.dcode}">${tData.dname}</option>
													</c:if>
												</c:forEach>
											</select> 
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>企业注册地址</label>
										<div class="col-xs-10">
											<input type="text" datatype="*" id="companyregisteradd" name="companyregisteradd" class="col-xs-8"> 
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">企业办公地址</label>
										<div class="col-xs-10">
											<input type="text" id="companyofficeadd" name="companyofficeadd" class="col-xs-8">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">企业经营信息</label>
										<div class="col-xs-10">
											<input type="text" id="emInformation" class="col-xs-8">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">知识产权名称</label>
										<div class="col-xs-10">
											<textarea name="inteproname" placeholder="专利名(专利号)、著作权名(著作权号)、专业技术等" class="col-xs-8" rows="3"></textarea>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">国家统计局标准客户四位行业代码</label>
										<div class="col-xs-10">
											<input type="text" id="code" name="code" class="col-xs-8">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>企业主要联系人姓名</label>
										<div class="col-xs-4">
											<input type="text" datatype="*" id="contacts" name="contacts" class="col-xs-7">
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
										<label class="col-xs-2 control-label">职务</label>
										<div class="col-xs-4">
											<input type="text" id="post" name="post" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>联系人电话</label>
										<div class="col-xs-4">
											<input type="text" datatype="*" id="contactnumber" name="contactnumber" class="col-xs-7">
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
										<label class="col-xs-2 control-label">传真</label>
										<div class="col-xs-4">
											<input type="text" id="fax" name="fax" class="col-xs-7">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>手机号</label>
										<div class="col-xs-4">
											<input type="text" datatype="*" id="phonenumber" name="phonenumber" class="col-xs-7">
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
										<label class="col-xs-2 control-label"><span style="color: red;">*</span>电子邮箱</label>
										<div class="col-xs-4">
											<input type="text" datatype="*" id="email" name="email" class="col-xs-7">
											<div class="col-xs-offset-1"></div>
											<label class="Validform_checktip" style="color: red;"></label>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-xs-2 control-label">推荐人</label>
										<div class="col-xs-4">
											<input type="text" id="recommend" class="col-xs-7">
										</div>
									</div>
								</div>
								<!-- 账户信息 -->
								<div class="layui-tab-item">
									<div class="col-xs-8">
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">账户名称</label>
											<div class="col-xs-3">
												<input type="text" id="acctname" name="acctname"
													class="form-control hasDatepicker">
											</div>
											<label class="col-md-3 col-sm-3 control-label">银行账号</label>
											<div class="col-xs-3">
												<input type="text" id="bankacct" name="bankacct"
													class="form-control hasDatepicker">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">开户行</label>
											<div class="col-xs-3">
												<input type="text" id="openbank" name="openbank"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-3">
												<button class="btn btn-info btn-sm pull-right"
													id="search_add_Btn">添加</button>
											</div>
										</div>
										<div class="form-group">
											<div
												style="width: 97%; padding: 10px; background: #fff; border: 1px solid #ccc; margin-left: 100px;">
												<table id="custAcctTable" border="1"
													style="width: 99%; margin: auto;"
													class="table table-bordered">
													<tr>
														<td style="background-color: #F5F5F5;" width="5%">序号</td>
														<td style="background-color: #F5F5F5;" width="20%">账户名称</td>
														<td style="background-color: #F5F5F5;" width="20%">银行账号</td>
														<td style="background-color: #F5F5F5;" width="20%">开户行</td>
														<td style="background-color: #F5F5F5;" width="15%">操作</td>
													</tr>
													<tbody id="tbody1"></tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
								<!-- 证件信息 -->
								<div class="layui-tab-item">
									<div class="col-xs-8">
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">证件颁布国家/地区</label>
											<div class="col-xs-3">
												<select name="nation" id="nation">
													<option value="">请选择</option>
													<c:forEach var="tData" items="${tDatas}">
														<c:if test="${tData.dictType == 'nation'}">
															<option value="${tData.dcode}">${tData.dname}</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
											<label class="col-md-3 col-sm-3 control-label">证件类型</label>
											<div class="col-xs-3">
												<select name="idtype" id="idtype">
													<option value="">请选择</option>
													<c:forEach var="tData" items="${tDatas}">
														<c:if test="${tData.dictType == 'custIdType'}">
															<option value="${tData.dcode}">${tData.dname}</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">证件号码</label>
											<div class="col-xs-3">
												<input type="text" id="idno" name="idno"
													class="form-control hasDatepicker">
											</div>
											<label class="col-md-3 col-sm-3 control-label">证件生效日期</label>
											<div class="col-xs-3">
												<input type="text" id="idtefdate" name="idtefdate"
													class="form-control hasDatepicker">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">证件失效日期</label>
											<div class="col-xs-3">
												<input type="text" id="idlefdate" name="idlefdate"
													class="form-control hasDatepicker">
											</div>
											<label class="col-md-3 col-sm-3 control-label"></label>
											<div class="col-xs-3">
												<button class="layui-btn layui-btn-radius layui-btn-normal"
													id="search_longTerm_Btn">长期有效</button>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">证件年检日期</label>
											<div class="col-xs-3">
												<input type="text" id="idasdate" name="idasdate"
													class="form-control hasDatepicker">
											</div>
											<label class="col-md-3 col-sm-3 control-label"></label>
											<div class="col-xs-3">
												<button class="btn btn-info btn-sm pull-right"
													id="search_put_Btn">增加</button>
											</div>
										</div>
										<div class="form-group">
											<div
												style="width: 99%; padding: 10px; background: #fff; border: 1px solid #ccc; margin-left: 100px;">
												<table id="custCertiTable" border="1"
													style="width: 99%; margin: auto;"
													class="table table-bordered">
													<tr>
														<td style="background-color: #F5F5F5;" width="5%">序号</td>
														<td style="background-color: #F5F5F5;" width="15%">证件颁发国家/地区</td>
														<td style="background-color: #F5F5F5;" width="16%">证件类型</td>
														<td style="background-color: #F5F5F5;" width="18%">证件号码</td>
														<td style="background-color: #F5F5F5;" width="15%">证件生效日期</td>
														<td style="background-color: #F5F5F5;" width="15%">证件失效日期</td>
														<td style="background-color: #F5F5F5;" width="15%">证件年检日期</td>
														<td style="background-color: #F5F5F5;" width="7%">操作</td>
													</tr>
													<tbody id="tbody2"></tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
								<!-- 客户附件 -->
								<div class="layui-tab-item">
									<div class="col-xs-8">
										<div class="form-group">
											<label class="col-md-3 col-sm-3 control-label">附件类别</label>
											<div class="col-xs-3">
												<select id="attaType" name="accessorytype">
													<option value="0">请选择</option>
													<c:forEach var="tData" items="${tDatas}">
														<c:if test="${tData.dictType == 'accessoryBusiType'}">
															<option value="${tData.dcode}">${tData.dname}</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
											<label class="col-md-3 col-sm-3 control-label">附件名称</label>
											<div class="col-xs-3">
												<input type="text" id="attaName"
													class="form-control hasDatepicker"> <input
													type="file" id="file1" onchange="Customer.change()">
												<input type="button" id="upload" value="上传" />
											</div>
										</div>
									</div>
								</div>
								<!-- 资产负债表 -->
								<div class="layui-tab-item">
									<div class="col-xs-10">
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">审计时间</label>
											<div class="col-xs-2">
												<input type="text" id="auditdt" name="auditdt"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_ZCdel_Btn">删除</button>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">顺序号</label> <label
												class="col-md-2 col-sm-2 control-label">编号</label> <label
												class="col-md-2 col-sm-2 control-label">要素名称</label> <label
												class="col-md-2 col-sm-2 control-label">数据值</label> <label
												class="col-md-2 col-sm-2 control-label">操作</label>
										</div>
										<div class="form-group">
											<div id="numSeq" class="col-xs-3"></div>
											<div class="col-xs-1">
												<input type="text" id="num" name="num"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-3" id="name"></div>
											<div class="col-xs-1">
												<input type="text" id="val" name="val"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_putall_Btn">增加</button>
											</div>
										</div>
										<div class="form-group">
											<div
												style="width: 99%; padding: 10px; background: #fff; border: 1px solid #ccc; margin-left: 100px;">
												<table id="finacialTable" border="1"
													style="width: 99%; margin: auto;"
													class="table table-bordered">
													<tr>
														<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
														<td style="background-color: #F5F5F5;" width="20%">编号</td>
														<td style="background-color: #F5F5F5;" width="20%">要素名称</td>
														<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
													</tr>
													<tbody id="tbody3"></tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
								<!-- 损益表 -->
								<div class="layui-tab-item">
									<div class="col-xs-10">
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">审计时间</label>
											<div class="col-xs-2">
												<input type="text" id="auditdt1" name="auditdt"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_SYdel_Btn">删除</button>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">顺序号</label> <label
												class="col-md-2 col-sm-2 control-label">编号</label> <label
												class="col-md-2 col-sm-2 control-label">要素名称</label> <label
												class="col-md-2 col-sm-2 control-label">数据值</label> <label
												class="col-md-2 col-sm-2 control-label">操作</label>
										</div>
										<div class="form-group">
											<div id="numSeq" class="col-xs-3"></div>
											<div class="col-xs-1">
												<input type="text" id="num1" name="num"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-3" id="name1"></div>
											<div class="col-xs-1">
												<input type="text" id="val1" name="val"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_putall1_Btn">增加</button>
											</div>
										</div>
										<div class="form-group">
											<div
												style="width: 99%; padding: 10px; background: #fff; border: 1px solid #ccc; margin-left: 100px;">
												<table id="finacial1Table" border="1"
													style="width: 99%; margin: auto;"
													class="table table-bordered">
													<tr>
														<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
														<td style="background-color: #F5F5F5;" width="20%">编号</td>
														<td style="background-color: #F5F5F5;" width="20%">要素名称</td>
														<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
													</tr>
													<tbody id="tbody4"></tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
								<!-- 现金流量表 -->
								<div class="layui-tab-item">
									<div class="col-xs-10">
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">审计时间</label>
											<div class="col-xs-2">
												<input type="text" id="auditdt2" name="auditdt"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_XJdel_Btn">删除</button>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">顺序号</label> <label
												class="col-md-2 col-sm-2 control-label">编号</label> <label
												class="col-md-2 col-sm-2 control-label">要素名称</label> <label
												class="col-md-2 col-sm-2 control-label">数据值</label> <label
												class="col-md-2 col-sm-2 control-label">操作</label>
										</div>
										<div class="form-group">
											<div id="numSeq" class="col-xs-3"></div>
											<div class="col-xs-1">
												<input type="text" id="num2" name="num"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-3" id="name2"></div>
											<div class="col-xs-1">
												<input type="text" id="val2" name="val"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_putall2_Btn">增加</button>
											</div>
										</div>
										<div class="form-group">
											<div
												style="width: 99%; padding: 10px; background: #fff; border: 1px solid #ccc; margin-left: 100px;">
												<table id="finacial2Table" border="1"
													style="width: 99%; margin: auto;"
													class="table table-bordered">
													<tr>
														<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
														<td style="background-color: #F5F5F5;" width="20%">编号</td>
														<td style="background-color: #F5F5F5;" width="20%">要素名称</td>
														<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
													</tr>
													<tbody id="tbody5"></tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
								<!-- 账务比率 -->
								<div class="layui-tab-item">
									<div class="col-xs-10">
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">审计时间</label>
											<div class="col-xs-2">
												<input type="text" id="auditdt3" name="auditdt"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_CWdel_Btn">删除</button>
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-2 col-sm-2 control-label">顺序号</label> <label
												class="col-md-2 col-sm-2 control-label">编号</label> <label
												class="col-md-2 col-sm-2 control-label">要素名称</label> <label
												class="col-md-2 col-sm-2 control-label">数据值</label> <label
												class="col-md-2 col-sm-2 control-label">操作</label>
										</div>
										<div class="form-group">
											<div id="numSeq" class="col-xs-3"></div>
											<div class="col-xs-1">
												<input type="text" id="num3" name="num"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-3" id="name3"></div>
											<div class="col-xs-1">
												<input type="text" id="val3" name="val"
													class="form-control hasDatepicker">
											</div>
											<div class="col-xs-2">
												<button class="btn btn-info btn-sm pull-right"
													id="search_putall3_Btn">增加</button>
											</div>
										</div>
										<div class="form-group">
											<div
												style="width: 99%; padding: 10px; background: #fff; border: 1px solid #ccc; margin-left: 100px;">
												<table id="finacial3Table" border="1"
													style="width: 99%; margin: auto;"
													class="table table-bordered">
													<tr>
														<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
														<td style="background-color: #F5F5F5;" width="20%">编号</td>
														<td style="background-color: #F5F5F5;" width="20%">要素名称</td>
														<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
													</tr>
													<tbody id="tbody6"></tbody>
												</table>
											</div>
										</div>
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
			</div>
		</div>
		<!-- /.main-content -->
		<%-- 加载底部模块  --%>
		<jsp:include page="../base/footer.jsp" flush="true" />

		<!-- 回到顶部  -->
		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- /.main-container -->

	<!-- basic scripts -->

	<%-- 加载菜单脚本模块 --%>
	<jsp:include page="../base/script-base.jsp" flush="true" />
	<%-- 加载table脚本模块，最后加载  --%>
	<jsp:include page="../base/script-table.jsp" flush="true" />
	<script type="text/javascript"
		src="${appCtx}/static/res/validform/js/Validform_v5.3.2.js"></script>
	<script type="text/javascript"
		src="${appCtx}/static/busi/customer/customer_add.js"></script>
</body>
</html>
