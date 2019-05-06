<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 客户管理</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/css-table.jsp" flush="true" />
		<jsp:include page="../base/css-base.jsp" flush="true" />
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
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#">首页</a>
							</li>
							<li class="active">客户管理</li>
						</ul>
					</div>
					<!-- 面包屑导航结束 -->

					<!-- 页面内容 -->
					<div class="page-content" style="position: relative;">
						<!-- /.page-header -->
						<div class="page-header">
							<h1>
								客户管理
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									个人客户管理-新增管理
								</small>
							</h1>
						</div><!-- /.page-header -->
						<!-- PAGE CONTENT BEGINS   form-horizontal-->
						<form id="addPersonInfoForm"  class="addPersonInfoForm" > 
							<div class="col-xs-12 form-horizontal">
								<div class="form-group">
									<div class="layui-tab layui-tab-card">
										<ul class="layui-tab-title" style="background-color:#428bca">
											<li class="layui-this" >基本信息</li>
								   	 		<li>负债情况</li>
								   	 		<li>资产信息</li>
								   	 		<li>辅助联系人</li>
								   	 		<li>证件信息</li>
								   	 		<li>关联企业</li>
										</ul>
										<div class="layui-tab-content" >
											<div class="layui-tab-item layui-show">
													<!-- 个人基本信息 -->
											        <div id="personInfo">
											        	<div class="col-xs-8" >
											    			<div class="form-group">
																<label class="col-md-3 col-sm-3 control-label"><span style="color:red;">*</span>姓名</label>
																<div class="col-xs-3">
																	<input type="text" autocomplete="off" datatype="*" class="col-xs-8" id="username" name="username">
																	<label class="Validform_checktip" style="color: red;"></label>
																</div>
																			
																<label class="col-md-3 col-sm-3 control-label">性别</label>
																<div class="col-xs-3">
																	<select class="col-xs-6" name="sex">
																		<option value="">请选择</option>
																		<option value="01">男</option>
																		<option value="02">女</option>
																	</select>
																</div>
															</div>
															
															<div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">年龄</label>
																<div class="col-xs-3">
																	<input type="text" autocomplete="off" class="col-xs-8" maxlength="2" max="99" name="age">
																</div>
																			
																<label class="col-md-3 col-sm-3 control-label">民族</label>
																<div class="col-xs-3">
																	<input type="text"  autocomplete="off"  class="col-xs-8" name="people">
																</div>
															</div>
															
															<div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">手机号码</label>
																<div class="col-xs-3">
																	<input type="text" autocomplete="off" class="col-xs-8" name="phone">
																</div>
																			
																<label class="col-md-3 col-sm-3 control-label">电子邮箱</label>
																<div class="col-xs-3">
																	<input type="text"  autocomplete="off"  class="col-xs-8" name="email">
																</div>
															</div>
															
															<div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">居住地址</label>
																	<div class="col-xs-8">
																		<input type="text" autocomplete="off" id="projectname" name="address"  class="col-xs-8" >
																	</div>
															</div>
															
															<div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">工作单位</label>
																	<div class="col-xs-8">
																		<input type="text" autocomplete="off" name="workunit"  class="col-xs-8" >
																	</div>
															</div>
															
															<div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">家庭背景</label>
																<div class="col-xs-3">
																	 <textarea name="familybackground" style="width:800px; height:70px;"></textarea>
																</div>
														    </div>
														    
														    <div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">教育背景</label>
																<div class="col-xs-3">
																	 <textarea name="education" style="width:800px; height:70px;"></textarea>
																</div>
														    </div>
														    
														    <div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">工作背景</label>
																<div class="col-xs-3">
																	 <textarea name="work" style="width:800px; height:70px;"></textarea>
																</div>
														    </div>
														    
														     <div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">社会背景</label>
																<div class="col-xs-3">
																	 <textarea name="socialcontext" style="width:800px; height:70px;"></textarea>
																</div>
														    </div>
														    
														    <div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">信用状态</label>
																<div class="col-xs-3">
																	 <textarea name="creditstanding" style="width:800px; height:70px;"></textarea>
																</div>
														    </div>
														    
														    <div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">其他状态</label>
																<div class="col-xs-3">
																	 <textarea name="otherinfos" style="width:800px; height:70px;"></textarea>
																</div>
														    </div>
														    <div class="form-group">
																<label class="col-md-3 col-sm-3 control-label">推荐人</label>
																<div class="col-xs-3">
																	<input type="text" autocomplete="off" class="col-xs-8" name="refereename">
																</div>
														    </div>
														</div>
												    <!-- personInfoDiv end -->
												    </div>
												<!-- layui-tab-item layui-show end -->
											</div> 
											
											<div class="layui-tab-item">
    											<!-- 负债情况Liabilities -->
												<div id="LiabilitiesDIV">
											    	<div class="col-xs-8" >
														<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">负债类型</label>
															<div class="col-xs-3">
																<c:forEach var="tdataDict" items="${tdataDicts}">
																	<c:if test="${tdataDict.dictType == 'liabType'}">
																		<input type="radio" id="liabtype" name="liabtype" value='${tdataDict.dcode}'>${tdataDict.dname}
																	</c:if>
																</c:forEach> 
															</div>
														</div>
														
														<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">借款金额</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="credit" name="credit"  class="col-xs-8" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">已还款</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="paid" name="paid"  class="col-xs-8" >
															</div>
													    </div>
													    
													    <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">未还款</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="nopay" name="nopay"  class="col-xs-8" >
															</div>
															
															
															<label class="col-md-3 col-sm-3 control-label">月均需还款</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="averagepay" name="averagepay"  class="col-xs-8" >
																<input type="button" id="addLiabs" onclick="addLiab();" value="增加记录" class="btn btn-mini" >
															</div>
													    </div>
																
														<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">附件类别</label>
															<div class="col-xs-3">
																<select class="col-xs-8" name="loanuse" id="loanuseType">
																	<c:forEach var="tdataDict" items="${tdataDicts}">
																		<c:if test="${tdataDict.dictType == 'accessoryBusiType' && tdataDict.dcode == '17'}">
																			<option value='${tdataDict.id}'>${tdataDict.dname}</option>
																		</c:if>
																	</c:forEach>
																</select>
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">附件名称</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="fjmc" readonly="readonly"  name="fjmc" value="${fjmc}"  class="col-xs-8" >
																<input type="file" id="btn_file" name="btn_file" style="display:none;"/>
																<input type="button" value="添加附件" onclick="getFileName();"   class="btn btn-mini fileinput-button" >
																<input type="button" id="uploadFile"  value="确定上传" style="display:none;" onclick="upload();" class="btn btn-mini btn-primary">  
															</div>
													    </div>
													</div>
												    <!-- 负债信息-信息列表 -->
												    <div class="row">
														<div class="col-xs-12">
															<div id="search"></div>
															<table id="fzGrid-table"></table>
															<div id="fzGrid-pager"></div>
														</div><!-- /.col -->
													</div><!-- /.row -->
												<!--LiabilitiesDIV end---!>
    										   </div> 
    										<!-- layui-tab-item  end -->
										   </div>
										   <!-- 资产信息 -->
										   <div class="layui-tab-item">
										      <div id="assetsInfoDIV">
											    	<div class="col-xs-8" >
											    		<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">资产类型</label>
															<div class="col-xs-3">
																<c:forEach var="tdataDict" items="${tdataDicts}">
																	<c:if test="${tdataDict.dictType == 'houseType'}">
																		<input type="radio" id="housingtype" name="housingtype" value='${tdataDict.dcode}'>${tdataDict.dname}
																	</c:if>
																</c:forEach> 
															</div>
														</div>
														
														 <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">地址/型号</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="addornum" id="addornum" class="col-xs-8" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">面积/数量</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  name="areaornum" id="areaornum" class="col-xs-8" >
															</div>
													    </div>
													    
													    <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">购买时间</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  id="startDate" name="buytime"  class="col-xs-8 hasDatepicker" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">购买价值</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="purchasevalue" name="purchasevalue"  class="col-xs-8" >
															</div>
													    </div>
													    
													    <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">评估价值</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="valuationvalue" id="valuationvalue" class="col-xs-8" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">权证号</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  name="warrantsnum" id="warrantsnum" class="col-xs-8" >
															</div>
													    </div>
													    
													    <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">权属及使用情况</label>
															<div class="col-xs-3">
																 <textarea id="ownerandusage" name="ownerandusage" style="width:800px; height:150px;"></textarea>
																<input type="button" id="addAssInfo" onclick="addAssetInfo();" value="增加记录" class="btn btn-mini" >
															</div>
														</div>
														
														<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">附件类别</label>
															<div class="col-xs-3">
																<select class="col-xs-8" name="fjlb2">
																	<c:forEach var="tdataDict" items="${tdataDicts}">
																		<c:if test="${tdataDict.dictType == 'accessoryBusiType' && tdataDict.dcode == '18'}">
																			<option value='${tdataDict.id}'>${tdataDict.dname}</option>
																		</c:if>
																	</c:forEach>
																</select>
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">附件名称</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="fjmc2" readonly="readonly"  name="fjmc2" value="${fjmc2}"  class="col-xs-8" >
																
																<input type="file" id="btn_file2" name="btn_file2" style="display:none;"/>
																<input type="button" value="添加附件"  onclick="getFileName2();" class="btn btn-mini fileinput-button">  
																<input type="button" id="uploadFile2"  value="确定上传" style="display:none;" onclick="uploadAsset();" class="btn btn-mini btn-primary"> 
															</div>
													    </div>
													    <!-- 资产信息-信息列表 -->
													    <div class="row">
															<div class="col-xs-12">
																<div id="search"></div>
																<table id="zcGrid-table"></table>
																<div id="zcGrid-pager"></div>
															</div><!-- /.col -->
														</div><!-- /.row -->
											    	</div>
											  </div>
											  <!-- item end -->
										   </div>
										   <!-- 辅助联系人信息 -->
										   <div class="layui-tab-item">
										      <div id="AuxiliaryPersonDIV">
											    	<div class="col-xs-8" >
											    		<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">姓名</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="contactsName"  class="col-xs-8" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">关系</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  name="relation"  class="col-xs-8" >
															</div>
													    </div>
													    <div class="form-group">
													    	<label class="col-md-3 col-sm-3 control-label">联系人电话</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  name="contactsPhone"  class="col-xs-8" >
															</div>
													    </div>
													    <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">姓名</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  name="contactsName"  class="col-xs-8" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">关系</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="relation"  class="col-xs-8" >
															</div>
													    </div>
													    <div class="form-group">
													    	<label class="col-md-3 col-sm-3 control-label">联系人电话</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off"  name="contactsPhone"  class="col-xs-8" >
															</div>
													    </div>
													     <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">姓名</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="contactsName" class="col-xs-8" >
															</div>
																		
															<label class="col-md-3 col-sm-3 control-label">关系</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="relation" class="col-xs-8" >
															</div>
													    </div>
													    <div class="form-group">
													    	<label class="col-md-3 col-sm-3 control-label">联系人电话</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="contactsPhone" class="col-xs-8" >
															</div>
													    </div>
													    
											    	</div>
											    <!-- AuxiliaryPersonDIV END -->
											   </div>
											 <!--  辅助联系人信息end-->  
										   </div>
										   <div class="layui-tab-item">
    											<!-- 证件信息 -->
												<div id="identityInfoDIV">
											    	<div class="col-xs-8" >
											    		<div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">证件类型</label>
															<div class="col-xs-3">
																<select class="col-xs-8" name="certtypes" id="certtypes">
																	<option value="">请选择</option>
																	<c:forEach var="tdataDict" items="${tdataDicts}">
																		<c:if test="${tdataDict.dictType == 'certType'}">
																			<option value='${tdataDict.id}'>${tdataDict.dname}</option>
																		</c:if>
																	</c:forEach>
																</select>
															</div>
															<label class="col-md-3 col-sm-3 control-label">证件号码</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" name="num" id="num" class="col-xs-8" >
															</div>
													    </div>
													    
													     <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">附件名称</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" id="fjmc3" readonly="readonly"  name="fjmc3" value="${fjmc3}"  class="col-xs-8" >
																
																<input type="file" id="btn_file3" name="btn_file3" style="display:none;"/>
																<input type="button"  onclick="getAnnexFileName();" value="添加附件"  class="btn btn-mini fileinput-button">  
																<input type="button" id="uploadFile3"  value="保存" style="display:none;" onclick="uploadAnnex();" class="btn btn-mini btn-primary">  
															</div>
													    </div>
													    
											    	</div>
											    <!-- identityInfoDIV -->
											    </div>
										  <!--  layui-tab-item 3 -->
										  </div>
										  <div class="layui-tab-item">
    											<!-- 关联企业Affiliated enterprises -->
												<div id="AffiliatedEnterprisesDIV">
											    	<div class="col-xs-8" >
											    		 <div class="form-group">
															<label class="col-md-3 col-sm-3 control-label">是否关联企业</label>
															<div class="col-xs-3">
																<input type="radio"  name="isrelcus" onclick="affiliated();" value="1" checked/>是
																<input type="radio"  name="isrelcus" value="0" onclick="affiliated();"/>否
															</div>
													     </div>
													    
													     <div class="form-group" id="companys">
															<label class="col-md-3 col-sm-3 control-label">企业名称</label>
															<div class="col-xs-3">
																<input type="text" autocomplete="off" readonly="readonly"  name="companyName" id="companyName"  class="col-xs-8" >
																<input type="button" id="selectcompanys" value="选择企业"  class="btn btn-primary" >
															</div>
													    </div>
											    	</div>
											    	<!-- 模态框 -->
											    	  <div class="modal fade" id="companyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
											    	  	<div class="modal-dialog">
													        <div class="modal-content">
													            <div class="modal-header">
													                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
													                <h4 class="modal-title" id="myModalLabel">选择关联企业</h4>
													            </div>
													            <div class="modal-body">
													            	<div class="row">
													            		<div class="col-xs-6">
																			<div class="form-group">
																				<label class="col-xs-4 control-label">企业编号</label>
																				<div class="col-sm-8">
																					<input type="text" class="form-control" id="companynum"
																						name="companynum" autocomplete="off">
																				</div>
																			</div>
																		</div>
													            		<div class="col-xs-6">
																			<div class="form-group">
																				<label class="col-xs-4 control-label">企业名称</label>
																				<div class="col-sm-8">
																					<input type="text" class="form-control" id="companyname"
																						name="companyname" autocomplete="off">
																				</div>
																			</div>
																			
																			<button class="btn btn-default btn-sm pull-right" id="search_reset_Btn" style="margin-left:10px">重置</button>
																			<button class="btn btn-info btn-sm pull-right" id="search_submit_Btn">搜索</button>
																		</div>
																		
																		
																		<div class="col-xs-12" style="padding-top: 10px;">
								 											<table id="grid-table"></table>
																		</div>
																	</div>
														    	</div>
														    	 <div class="modal-footer">
													                <button type="button" class="btn btn-default" id="cancelAdd" data-dismiss="modal">取消</button>
																	<button type="button" id="sureCompanys" class="btn btn-primary">确认</button>
													            </div>
														    </div>
													    </div>
													  </div>
											    </div><!--DUO  -->
										  </div>
										  <!-- layui-tab-content end -->
										</div> 
									<!-- layui-tab layui-tab-card end  -->
									</div> 
								<!-- form-group -->
								</div>
							</div>
							<div style="text-align:center">
								<button type="button" id="save" class="btn btn-primary">提交</button>
								<button type="button" class="btn btn-default" id="cancelAdd" onClick="self.location=document.referrer;" >返回</button>
							</div>	
							
							<input type="hidden" id="percustomerId" name="percustomerId" value='${percustomerId}'/>
							<input type="hidden" id="assetInfosId" name="assetInfosId" value='${assetInfosId}'/>
							<input type="hidden" id="liabId" name="liabId" value='${liabId}'/>
							<input type="hidden" id="companyId" name="companyid" >
							<input type="hidden" id="testaa" name="testaa"/>
						</form> 
						<!-- PAGE CONTENT ENDS -->
					</div><!-- /.page-content -->
				</div>
			</div>
			<!-- /.main-content -->
			
			<%-- 加载底部模块  --%>
			<jsp:include page="../base/footer.jsp" flush="true" />
			
			<!-- 回到顶部  -->
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->
		
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		<%-- 加载table脚本模块，最后加载  --%>
		<jsp:include page="../base/script-table.jsp" flush="true" />
		<script type="text/javascript" src="${appCtx}/static/busi/customer/per_customer_add.js"></script>
	</body>
</html>
