<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 首页</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- 加载css模块  --%>
		<jsp:include page="../base/new_css-base.jsp" flush="true" />
		
		<style type="text/css">
			.number-text-font{
				font-size: 0.88rem;
				color: #9B9B9B;
			}
			.number-text-font-bottom{
				font-size: 1.13rem;
				color: #4A4A4A;
			}
			.number-font{
				font-size: 2.25rem;
				color: #4990E2;
			}
			.rz-text-font{
				font-size: 0.75rem;
				color: #4A4A4A;
			}
			.wyrz{
				width: 11.88rem; 
				height: 2.75rem; 
				background-color: #4990E2; 
				border-color: #4990E3;
			}
			.scroll_div {
				/*width: 60%;*/
				height: 75px;
				/*margin: 0 auto;*/
				margin-top: 34px;
				overflow: hidden;
				white-space: nowrap;
				background: #ffffff;
			}
			#scroll_begin,
			#scroll_end,
			#scroll_begin ul,
			#scroll_end ul,
			#scroll_begin ul li,
			#scroll_end ul li {
				display: inline;
			}
			/*设置ul和li横排*/
		</style>
	</head>

	<body>
		<%-- 加载头部模块  --%>
		<jsp:include page="../base/new_header.jsp" flush="true" />

		<div class="container-fluid">
			<!--
            	作者：pangpj
            	时间：2017-12-01
            	描述：背景图片
            -->
			<div class="row">
				<img class="col-xs-12" src="${appCtx}/static/img/banner_img.png" style="padding: 0 0 0 0;"/>
			</div>
			
			<!--
            	作者：pangj
            	时间：2017-12-01
            	描述：金融数据统计模块
            -->
			<div class="row text-center" style="padding-top: 15px; padding-bottom: 15px;">

				<div class="col-xs-3 col-xs-offset-1">
					<div class="row">
						<label id="amt" class="number-font"></label>
						<label class="number-text-font">万元</label>
					</div>
					<div class="row">
						<label class="number-text-font-bottom">金融金额</label>
					</div>
				</div>
				
				<div class="col-xs-3">
					<div class="row">
						<label id="org" class="number-font"></label>
						<label class="number-text-font">家</label>
					</div>
					<div class="row">
						<label class="number-text-font-bottom">服务机构</label>
					</div>
				</div>
				
				<div class="col-xs-3">
					<div class="row">
						<label id="company" class="number-font"></label>
						<label class="number-text-font">家</label>
					</div>
					<div class="row">
						<label class="number-text-font-bottom">服务企业</label>
					</div>
				</div>
			</div>
			
			<!--
            	作者：pangpj
            	时间：2017-12-01
            	描述：五位一体模块
            -->
			<div class="row">
				<div class="col-xs-5 col-xs-offset-1" style="background-color: #E5EDF6;">
					<div class="row" style="margin-top: 20px;">
						<div class="col-xs-12 text-center">
							<div class="col-xs-5 text-right">
								<img src="${appCtx}/static/img/line_left.png"/>
							</div>
							<label class="col-xs-2 text-center" style="margin-top: 2.5px;">五位一体</label>
							<div class="col-xs-5 text-left">
								<img src="${appCtx}/static/img/line_right.png"/>
							</div>
						</div>
					</div>
					<div class="row" style="margin-top: 35px;">
						<div class="col-xs-2 col-xs-offset-1">
							<div class="row">
								<div class="col-xs-12 text-center">
									<img src="${appCtx}/static/img/ping_icon.png"/>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<label class="rz-text-font">即股权评估与知识产权评估。为科技型企业提供技术和知识产权价值评估以及企业投资价值判断。依托技术评估的专家团队、对所关注专利技术的法律状态、技术水平、经济价值进行科学评估和分析。</label>
								</div>
							</div>
						</div>
						
						<div class="col-xs-2">
							<div class="row">
								<div class="col-xs-12 text-center">
									<img src="${appCtx}/static/img/bao_icon.png"/>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<label class="rz-text-font">即担保。通过本地担保机构为科技型企业融资提供强有力的担保增信，便捷解决企业发展急需的资金难题。</label>
								</div>
							</div>
						</div>
						
						<div class="col-xs-2">
							<div class="row">
								<div class="col-xs-12 text-center">
									<img src="${appCtx}/static/img/dai_icon.png"/>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<label class="rz-text-font">即贷款融资。以银行为核心，以小贷、保理、信托、融资租赁等金融机构为补充，构建更快、更多、更便宜、更安全、更丰富的贷款通道，丰富企业融资选择。</label>
								</div>
							</div>
						</div>
						
						<div class="col-xs-2">
							<div class="row">
								<div class="col-xs-12 text-center">
									<img src="${appCtx}/static/img/tou_icon.png"/>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<label class="rz-text-font">即股权投资。搭建债股结合的投资联盟，为科技型企业引入全方位的投融资机会。帮助优质的科技型企业获得直接的股权投资，未来通过并购、重组、IPO等形式实现退出。</label>
								</div>
							</div>
						</div>
						
						<div class="col-xs-2">
							<div class="row">
								<div class="col-xs-12 text-center">
									<img src="${appCtx}/static/img/yi_icon.png"/>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12">
									<label class="rz-text-font">即多元化的交易模式和交易平台。包括技术交易所、产权交易所、股权交易所、投资机构、协会等，形成迅捷流动的交易通道。</label>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row" style="margin-top: 35px; margin-bottom: 20px;">
						<div class="col-xs-12 text-center">
							<shiro:user>
								<a href="${appCtx}/financing/toIWantFinancing"><div class="btn btn-info wyrz">我要融资</div></a>
							</shiro:user>
							<shiro:guest>
								<a href="${appCtx}/public/toUserLogIn"><div class="btn btn-info wyrz">我要融资</div></a>
							</shiro:guest>
						</div>
					</div>
				</div>
				<div class="col-xs-5">
					<div class="row">
						<div class="col-xs-12" style="width: 99%; float: right;">
							<div class="row">
								<div class="col-xs-3 text-center" style="background-color: #4990E2; height: 2.13rem;">
									<label style="font-size: 0.88rem; margin-top: 0.44rem; color: white;">通知公告</label>
								</div>
								<div class="col-xs-9 text-right" style="border-bottom: 1px solid #4990E2; height: 2.13rem;">
									<a href="${appCtx}/public/news/index" style="font-size: 0.88rem; margin-top: 0.44rem;">更多</a>
								</div>
							</div>

							<div class="row" style="margin-top: 8px;">
								<div class="col-xs-9  text-center" id="newsTitle">
								</div>
								<div id="newsDate" class="col-xs-3  text-center">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<!--
            	作者：pangpj
            	时间：2017-12-01
            	描述: 融资需求和成功案例展示模块
            -->
            <div class="row" style="margin-top: 10px;">
            		<div class="col-xs-12"  style="z-index: 1;">
            			<div class="row">
            				<div class="col-xs-5 col-xs-offset-1 text-center">
            					<img src="${appCtx}/static/img/new_image.png"/>
            				</div>
            				<div class="col-xs-5 text-center">
            					<img src="${appCtx}/static/img/new_image.png"/>
            				</div>
            			</div>
            		</div>
            		<div class="col-xs-12">
            			<div class="row" style="margin-top: -30px;">
            				<div class="col-xs-5 col-xs-offset-1">
            					<div class="row">
            						<div class="col-xs-12"  style="background-color: rgba(74,144,226,0.2); height: 18.44rem; width: 99%;">
		            					<div class="row" style="margin-top: 35px;">
		            						<div class="col-xs-12">
		            							<div class="row">
		            								<div class="col-xs-7 text-right">
				            							<label style="font-size: 0.88rem; color: #000000;">融资需求</label>
				            						</div>
				            						<div class="col-xs-5 text-right">
				            							<a href="${appCtx}/public/demand/index" class="text-right" style="font-size: 0.75rem; color: #0055C5; text-align: right;">更多</a>
				            						</div>
		            							</div>
		            							<div class="row">
		            								<div class="col-xs-12">
		            									<hr style="margin-top: -1px; "/>
		            								</div>
		            							</div>
		            						</div>
		            					</div>
		            					
		            					<div class="row">
		            						<div id="demandTitle" class="col-xs-9 text-center">
		            						</div>
		            						<div id="demandDate" class="col-xs-3 text-center">
		            						</div>
		            					</div>
			            				
		            				</div>
            					</div>
            				</div>
            				<div class="col-xs-5">
            					<div class="row">
            						<div class="col-xs-12" style="background-color: rgba(74,144,226,0.2); height: 18.44rem; width: 99%; float: right;">
		            					<div class="row" style="margin-top: 35px;">
		            						<div class="col-xs-12">
		            							<div class="row">
		            								<div class="col-xs-7 text-right">
				            							<label style="font-size: 0.88rem; color: #000000;">成功案例</label>
				            						</div>
				            						<div class="col-xs-5 text-right">
				            							<a href="${appCtx}/public/success/index" class="text-right" style="font-size: 0.75rem; color: #0055C5; text-align: right;">更多</a>
				            						</div>
		            							</div>
		            							<div class="row">
		            								<div class="col-xs-12">
		            									<hr style="margin-top: -1px; "/>
		            								</div>
		            							</div>
		            						</div>
		            					</div>
		            					
		            					<div class="row">
		            						<div id="successTitle" class="col-xs-9 text-center">
		            						</div>
		            						<div id="successDate" class="col-xs-3 text-center">
		            						</div>
		            					</div>
		            				</div>
            					</div>
            				</div>
            			</div>
            		</div>
            </div>
            
            <!--
            	作者：pangpj
            	时间：2017-12-01
            	描述：金融机构模块
            -->
            <div class="row" style="margin-top: 15px;">
            		<div class="col-xs-1 col-xs-offset-1">
            			<div class="row">
            				<div class="col-xs-12" style="width: 80%;">
            					<div class="text-center" style="width: 2.14rem; height: 9.38rem; background-color: #4990E2; float: left; margin-left: -12px;">
		            				<label style="margin-top: 1.7rem; color: white;">金<br />融<br />机<br />构</label>
		            			</div>
            				</div>
            			</div>
            		</div>
            		
            		<div id="scroll_div"  class="scroll_div col-xs-8">
	            		<div id="scroll_begin">
							<ul>
<%--								<li>--%>
<%--									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046049.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_ql.png"/></a>--%>
<%--								</li>--%>
								<li>
									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046050.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_bjyh.png"/></a>
								</li>
								<li>
									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046052.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_zgyh.png"/></a>
								</li>
								<li>
									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046054.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_zgnyyh.png"/></a>
								</li>
								<li>
									<a href="#" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_pf.png"/></a>
								</li>
<%--								<li>--%>
<%--									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046051.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_qd.png"/></a>--%>
<%--								</li>--%>
<%--								<li>--%>
<%--									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046056.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_qsyh.png"/></a>--%>
<%--								</li>--%>
<%--								<li>--%>
<%--									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046055.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_tayh.png"/></a>--%>
<%--								</li>--%>
								<%--<li>
									<a href="http://jinan.ctex.cn/article/yzfwjg/fwfw/201710/20171000046054.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_zgnyyh.png"/></a>
								</li>--%>
								<li>
									<a href="http://www.icbc.com.cn/icbc/" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_icbc.png"/></a>
								</li>
								<li>
									<a href="http://www.ccb.com/cn/home/indexv3.html" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_jsyh.png"/></a>
								</li>
								<li>
									<a href="http://www.bankcomm.com/BankCommSite/default.shtml" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_jtyh.png"/></a>
								</li>
								<li>
									<a href="http://www.cmbchina.com/" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_zsyh.png"/></a>
								</li>
								<li>
									<a href="https://www.cib.com.cn/cn/index.html" target="_blank"><img src="${appCtx}/static/img/fwgs/dai/dai_xyyh.png"/></a>
								</li>
							</ul>
						</div>
	            		<div id="scroll_end"></div>
	            	</div>
            </div>
            
            <!--
            	作者：pangpj
            	时间：2017-12-04
            	描述：通知公告
            -->
            <div class="row" style="margin-top: 15px;">

            </div>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../base/script-base.jsp" flush="true" />
		
		<script src="${appCtx}/static/busi/user_jsp/user_index.js"></script>
	</body>
</html>
