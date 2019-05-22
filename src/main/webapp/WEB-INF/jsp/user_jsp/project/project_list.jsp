<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>长春市科技金融服务平台 - 查看融资列表</title>
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
				<label style="color: #4A4A4A;">当前位置: 首页 > 我要融资 > 查看融资列表 </label>
			</div>
		</div>

		<div class="container" style="padding-top: 50px;">
			<div class="col-xs-offset-2">
				<iframe src="${appCtx}/project/list?flag=2" height="507px" width="753px"></iframe>
			</div>

			<div class="col-xs-12 text-center">
				<button type="button" class="btn btn-sm btn-default" id="cancelAdd"
						onClick="self.location=document.referrer;">返回</button>
			</div>
		</div>
			
		<%-- 加载底部模块  --%>
		<jsp:include page="../../base/new_footer.jsp" flush="true" />
		
		<!-- basic scripts -->
		<%-- 加载菜单脚本模块 --%>
		<jsp:include page="../../base/script-base.jsp" flush="true" />
		<script type="text/javascript" src="${appCtx}/static/busi/user_jsp/project/project_list.js"></script>
	</body>
</html>
