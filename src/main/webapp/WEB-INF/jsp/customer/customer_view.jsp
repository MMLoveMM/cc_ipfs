<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<div class="layui-tab layui-tab-card">
	<ul class="layui-tab-title" style="background-color:#428bca">
			<li class="layui-this" lay-id="custMsg">企业信息</li>
			<li lay-id="custAcct">账户信息</li>
			<li lay-id="custCerti">证件信息</li>
			<li lay-id="user">客户附件</li>
			<li lay-id="lxr">联系人信息</li>
			<li lay-id="asset">资产负债表</li>
			<li lay-id="pal">损益表</li>
			<li lay-id="cash">现金流量表</li>
			<li lay-id="accratio">账务比率</li>
	</ul>
	<!-- 企业信息 -->
	<div class="layui-tab-content">
		<div class="layui-tab-item layui-show">
		<input type="hidden" id="tdata" value='${tdata}'>
				<table id="companyTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
					<tr>
						<td align="right" class="td1"  width="24%">企业名称</td>
						<td id="companyname" width="25%">${customerInfo.companyname}</td>
						<td align="right" class="td1"  width="25%">企业简称</td>
						<td id="shortname"  width="25%">${customerInfo.shortname}</td>
					</tr>
					<tr>
						<td align="right" class="td1">英文名称</td>
						<td id="englishname">${customerInfo.englishname}</td>
						<td align="right" class="td1">成立时间</td>
						<td id="createTime">${customerInfo.createTime}</td>
					</tr>
					<tr>
						<td align="right" class="td1">注册资本</td>
						<td id="registeredcapital">${customerInfo.registeredcapital}</td>
						<td align="right" class="td1">实到资本</td>
						<td id="practicalcapital">${customerInfo.practicalcapital}</td>
					</tr>
					<tr>
						<td align="right" class="td1">公司法律责任形式</td>
						<td id="companyType"></td>
						<td align="right" class="td1">行业类型</td>
						<td id="businesstype"><input type="hidden" id="hylx" value="${customerInfo.businesstype}"></td>
					</tr>
					<tr>
						<td align="right" class="td1"><nobr><span>企业类型</span></nobr></td>
						<td id="companytype"><input type="hidden" id="qylx" value="${customerInfo.companytype}"></td>
						<td align="right" class="td1">公司规模</td>
						<td id="comsize"><input type="hidden" id="gsgm" value = "${customerInfo.comsize}"></td>
					</tr>
					<tr>
						<td align="right" class="td1">职工人数</td>
						<td id="employees">${customerInfo.employees}</td>
						<td align="right" class="td1">是否高新技术企业</td>
						<td id="ishighindustry">${customerInfo.ishighindustry}</td>
					</tr>
					<tr>	
						<td align="right" class="td1">客户种类</td>
						<td id="customertype"><input type="hidden" id="khzl" value = "${customerInfo.customertype}"></td>
						<td align="right" class="td1">客户状态</td>
						<td id="customerstatus"><input type="hidden" id="khzt" value = "${customerInfo.customerstatus}"></td>
					</tr>
					<tr>	
						<td align="right" class="td1">法人资格</td>
						<td id="corporatecapacity"><input type="hidden" id="frzg" value = "${customerInfo.corporatecapacity}"></td>
						<td align="right" class="td1">隶属关系</td>
						<td id="subordination"><input type="hidden" id="lsgx" value = "${customerInfo.subordination}"></td>
					</tr>
					<tr>
						<td align="right" class="td1">主营业务</td>
						<td id="mainbusiness">${customerInfo.mainbusiness}</td>
						<td align="right" class="td1">主要股东</td>
						<td id="shareholder">${customerInfo.shareholder}</td>
						
					</tr>
					<tr>
						<td align="right" class="td1">主要董事</td>
						<td id="director">${customerInfo.director}</td>
						<td align="right" class="td1">主要管理者</td>
						<td id="managers">${customerInfo.managers}</td>
					</tr>
					<tr>
						<td align="right" class="td1">法定代表人</td>
						<td id="comanylegalperson">${customerInfo.comanylegalperson}</td>
						<td align="right"  class="td1">企业实际控制人</td>
						<td id="buicontrolperson" colspan="3">${customerInfo.buicontrolperson}</td>
					</tr>
					<tr>
						<td align="right" class="td1">国家统计局标准客户四位行业代码</td>
						<td id="code">${customerInfo.code}</td>
						<td align="right"  class="td1">区县</td>
						<td id="county" colspan="3"><input type="hidden" id="qx" value = "${customerInfo.county}"></td>
					</tr>	
					<tr>
						<td align="right" class="td1">企业注册地址</td>
						<td id="companyregisteradd" colspan="3">${customerInfo.companyregisteradd}</td>
					</tr>
					<tr>
						<td align="right" class="td1">企业办公地址</td>
						<td id="companyofficeadd" colspan="3">${customerInfo.companyofficeadd}</td>
					</tr>
					<tr>
						<td align="right" class="td1">企业经营地址</td>
						<td id="operateAdd" colspan="3"></td>
					</tr>
					<tr>
						<td align="right" class="td1">知识产权名称</td>
						<td id="inteproname" colspan="3">${customerInfo.inteproname}</td>
					</tr>
				</table>
		</div>
		<!-- 账户信息 -->
	    	<div class="layui-tab-item">
	    		<table id="zhTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
		    			<tr>
		    				<td style="background-color: #F5F5F5; width: 24%;">序号</td>
		    				<td style="background-color: #F5F5F5; width: 25%;">账户名称</td>
		    				<td style="background-color: #F5F5F5; width: 25%;">银行账号</td>
		    				<td style="background-color: #F5F5F5; width: 25%;">开户行</td>
		    			</tr>
		    			<c:forEach var="tCustAcct" items="${tCustAcct}">
			    			<tr>
			    				<td>${tCustAcct.id}</td>
			    				<td>${tCustAcct.acctname}</td>
			    				<td>${tCustAcct.bankacct}</td>
			    				<td>${tCustAcct.openbank}</td>
			    			</tr>
		    			</c:forEach>
	    		</table>
	    	</div>
	    <!-- 证件信息 -->
	    	<div class="layui-tab-item">
	    		<table id="zjTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
	    				<td style="background-color: #F5F5F5;">序号</td>
	    				<td style="background-color: #F5F5F5;">证件颁发国家/地区</td>
	    				<td style="background-color: #F5F5F5;">证件类型</td>
	    				<td style="background-color: #F5F5F5;">证件号码</td>
	    				<td style="background-color: #F5F5F5;">证件生效日期</td>
	    				<td style="background-color: #F5F5F5;">证件失效日期</td>
	    				<td style="background-color: #F5F5F5;">证件年检日期</td>
	    			</tr>
	    			<c:forEach var="tCustCerti" items="${tCustCerti}">
		    			<tr>
		    				<td>${tCustCerti.id}</td>
		    				<td id="zjbfdq"><input type="hidden" id="zjbfgj" value = "${tCustCerti.nation}"></td>
		    				<td id="zjtype"><input type="hidden" id="zjlx" value = "${tCustCerti.idtype}"></td>
		    				<td>${tCustCerti.idno}</td>
		    				<td>${tCustCerti.idtefdate}</td>
		    				<td>${tCustCerti.idlefdate}</td>
		    				<td>${tCustCerti.idasdate}</td>
		    			</tr>
		    		</c:forEach>
	    		</table>
	    	</div>
	    <!-- 客户附件 -->
	    	<div class="layui-tab-item">
	    		<table id="fjTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
	    				<td style="background-color: #F5F5F5;" width="4%">序号</td>
	    				<td style="background-color: #F5F5F5;" width="20%">附件名称</td>
	    				<td style="background-color: #F5F5F5;" width="20%">附件</td>
	    				<td style="background-color: #F5F5F5;" width="20%">附件类别</td>
	    				<td style="background-color: #F5F5F5;" width="20%">操作用户</td>
	    			</tr>
	    			<c:forEach var="accessoryInfos" items="${accessoryInfos}">
	    				<tr>
	    					<td>${accessoryInfos.id}</td>
		    				<td>${accessoryInfos.accessoryname}</td>
		    				<td>${accessoryInfos.showname}</td>
		    				<td>${accessoryInfos.accessorytype}</td>
		    				<td>${accessoryInfos.userid}</td>
	    				</tr>
	    			</c:forEach>
	    		</table>
	    	</div>
	    <!-- 联系人信息 -->
	    	<div class="layui-tab-item">
	    		<table id="lxrTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
						<td align="right" class="td1" width="24%">企业联系人</td>
						<td id="contacts" width="25%">${customerInfo.contacts}</td>
						<td align="right" class="td1" width="25%">职务</td>
						<td id="post" width="25%">${customerInfo.post}</td>
					</tr>
					<tr>
						<td align="right" class="td1">联系电话</td>
						<td id="contactNumber">${customerInfo.contactnumber}</td>
						<td align="right" class="td1">传真</td>
						<td id="fax">${customerInfo.fax}</td>
					</tr>
					<tr>
						<td align="right" class="td1">手机号码</td>
						<td id="phoneNumber">${customerInfo.phonenumber}</td>
						<td align="right" class="td1">电子邮箱</td>
						<td id="email">${customerInfo.email}</td>
					</tr>
					<tr>
						<td align="right" class="td1">推荐人</td>
						<td colspan="3" id="refereeName"></td>
					</tr>
	    		</table>
	    	</div>
	    <!-- 资产负债表 -->
	    	<div class="layui-tab-item">
	    		<table id="zcfzTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
			 			<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
						<td style="background-color: #F5F5F5;" width="20%">编号</td>
						<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
					</tr>
					<c:forEach var="finacialVals" items="${finacialVals}">
						<c:if test="${finacialVals.num < '6000'}">
							<tr>
								<td>${finacialVals.id}</td>
								<td>${finacialVals.num}</td>
								<td>${finacialVals.val}</td>
							</tr>
						</c:if>
					</c:forEach>
	    		</table>
	    	</div>
	    <!-- 损益表 -->
	    	<div class="layui-tab-item">
	    		<table id="syTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
			 			<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
						<td style="background-color: #F5F5F5;" width="20%">编号</td>
						<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
					</tr>
					<c:forEach var="finacialVals" items="${finacialVals}">
						<c:if test="${finacialVals.num > '6000' && finacialVals.num < '7000'}">
							<tr>
								<td>${finacialVals.id}</td>
								<td>${finacialVals.num}</td>
								<td>${finacialVals.val}</td>
							</tr>
						</c:if>
					</c:forEach>
	    		</table>
	    	</div>
	    <!-- 现金流量表 -->
	    	<div class="layui-tab-item">
	    		<table id="xjTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
			 			<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
						<td style="background-color: #F5F5F5;" width="20%">编号</td>
						<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
					</tr>
					<c:forEach var="finacialVals" items="${finacialVals}">
						<c:if test="${finacialVals.num > '7000' && finacialVals.num < '8000'}">
							<tr>
								<td>${finacialVals.id}</td>
								<td>${finacialVals.num}</td>
								<td>${finacialVals.val}</td>
							</tr>
						</c:if>
					</c:forEach>
	    		</table>
	    	</div>
	    <!-- 财务比率 -->
	    	<div class="layui-tab-item">
	    		<table id="cwTable"  border="1" style="width:99%; margin: auto;" class="table table-bordered">
	    			<tr>
			 			<td style="background-color: #F5F5F5;" width="5%">顺序号</td>
						<td style="background-color: #F5F5F5;" width="20%">编号</td>
						<td style="background-color: #F5F5F5;" width="20%">财务审计数据</td>
					</tr>
					<c:forEach var="finacialVals" items="${finacialVals}">
						<c:if test="${finacialVals.num > '8000'}">
							<tr>
								<td>${finacialVals.id}</td>
								<td>${finacialVals.num}</td>
								<td>${finacialVals.val}</td>
							</tr>
						</c:if>
					</c:forEach>
	    		</table>
	    	</div>
	</div>
</div>