<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<title>考试管理系统</title>
<link
	href="<%=request.getContextPath()%>/resources/easyui/css/default.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/easyui/js/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/easyui/js/themes/icon.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/easyui/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/easyui/js/jquery.easyui.js"></script>

<script type="text/javascript"
	src='<%=request.getContextPath()%>/resources/easyui/js/outlook2.js'>
	
</script>

<script type="text/javascript"
	src='<%=request.getContextPath()%>/resources/js/home.js'>
	
</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<noscript>
		<div
			style="position: absolute; z-index: 100000; height: 2046px; top: 0px; left: 0px; width: 100%; background: white; text-align: center;">
			<img
				src="<%=request.getContextPath()%>/resources/easyui/images/noscript.gif"
				alt='抱歉，请开启脚本支持！' />
		</div>
	</noscript>
	<div region="north" split="true" border="false"
		style="overflow: hidden; height: 30px;
        background: url(<%=request.getContextPath()%>/resources/easyui/images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
		<span style="float: right; padding-right: 20px;" class="head">欢迎你!&nbsp${user.name
			}&nbsp <a id="editpass">修改密码&nbsp</a> <a id="loginOut">安全退出</a>
		</span> <span style="padding-left: 10px; font-size: 16px;"><img
			src="<%=request.getContextPath()%>/resources/easyui/images/blocks.gif"
			width="20" height="20" align="absmiddle" /> 考试管理系统</span>
	</div>
	<div region="south" split="true"
		style="height: 30px; background: #D2E0F2;">
		<div class="footer">
			<span class="blue bolder">云南航信空港网络</span> 研发部<strong class="green">&copy;</strong>
			2016 </span>
		</div>
	</div>
	<div region="west" split="true" title="导航菜单" style="width: 180px;"
		id="west">
		<div class="easyui-accordion" fit="true" border="false">
			<!--  导航内容 -->
			<c:if test="${user.userType=='admin' }">
				<div title="岗位管理" style="overflow: auto;" icon="icon-sys">
					<ul>
						<li><s:iterator value="postList" var="post">
								<s:div>
									<a target="mainFrame" href="showPost.action?postId=${post.id }"
										value="post.name"> <span class="icon icon-nav"></span>${post.name}
									</a>
								</s:div>
							</s:iterator></li>
						<li><a id="add_post" title="添加岗位" class="easyui-tooltip"
							style="cursor: pointer;"><span class="icon icon-edit_add"
								style="margin-left: 10px;"></span></a></li>
					</ul>
				</div>
				<!-- 试题类型管理 -->
				<div title="试题类型管理" style="overflow: auto;" icon="icon-sys">
					<ul>
						<li><s:iterator value="typeList" var="type">
								<s:div>
									<a target="mainFrame" href="showType.action?typeId=${type.id }"
										value="post.name"> <span class="icon icon-nav"></span>${type.name}
									</a>
								</s:div>
							</s:iterator></li>
						<li><a id="add_type" title="添加类型" class="easyui-tooltip"
							style="cursor: pointer;"><span class="icon icon-edit_add"
								style="margin-left: 10px;"></span></a></li>
					</ul>
				</div>
				<!-- 试题题目动态管理 -->
				<div title="试题题目管理" style="overflow: auto;" icon="icon-sys">
					<ul>
						<li>
							<div>
								<a target="mainFrame" href="question.action"> <span
									class="icon icon-nav"></span>题目列表
								</a>
							</div>
						</li>
					</ul>
				</div>
				<!-- 试卷动态管理 -->
				<div title="试卷管理" style="overflow: auto;" icon="icon-sys">
					<ul>
						<li><s:iterator value="parpers" var="parper">
								<s:div>
									<a target="mainFrame" href="parper.action?parperId=${parper.id}">
										<span class="icon icon-nav"></span>${parper.name}试卷
									</a>
								</s:div>
							</s:iterator></li>
					</ul>
				</div>
			</c:if>
			<c:if test="${user.userType=='common' }">
				<!-- 考试管理 -->
				<div title="考试管理" style="overflow: auto;" icon="icon-sys">
					<ul>
						<c:choose>
							<c:when test="${user.submitTimes<3 }">
								<li><a target="mainFrame" href="test.action?"> <span
										class="icon icon-nav"></span>试卷
								</a></li>
							</c:when>
							<c:otherwise>
							</c:otherwise>
						</c:choose>

					</ul>
				</div>
			</c:if>
		</div>

	</div>
	<div id="mainPanle" region="center"
		style="background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">

				<h1>欢迎使用考试管理系统</h1>
			</div>
		</div>
	</div>

	<!--修改密码窗口-->
	<div id="w" class="easyui-window" title="修改密码" collapsible="false"
		minimizable="false" maximizable="false" icon="icon-save"
		style="width: 300px; height: 150px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false"
				style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<table cellpadding=3>
					<tr>
						<td>新密码：</td>
						<td><input id="txtNewPass" type="Password" class="txt01" /></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input id="txtRePass" type="Password" class="txt01" /></td>
					</tr>
				</table>
			</div>
			<div region="south" border="false"
				style="text-align: right; height: 30px; line-height: 30px;">
				<a id="btnEp" class="easyui-linkbutton" icon="icon-ok"
					href="javascript:void(0)"> 确定</a> <a class="easyui-linkbutton"
					icon="icon-cancel" href="javascript:void(0)"
					id="passwordUpdat_cancel">取消</a>
			</div>
		</div>
	</div>

	<!-- 添加岗位 窗口-->
	<div id="addPost" class="easyui-window" title="添加岗位"
		collapsible="false" minimizable="false" maximizable="false"
		icon="icon-save"
		style="width: 300px; height: 150px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false"
				style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<table cellpadding=3>
					<tr>
						<td>岗位名：</td>
						<td><input id="postName" type="text" class="txt01"
							name="postName" /></td>
					</tr>
				</table>
			</div>
			<div region="south" border="false"
				style="text-align: right; height: 30px; line-height: 30px;">
				<a id="addPost_btn" class="easyui-linkbutton" icon="icon-ok"
					href="javascript:void(0)"> 确定</a> <a class="easyui-linkbutton"
					icon="icon-cancel" href="javascript:void(0)" id="addPost_cancel">取消</a>
			</div>
		</div>
	</div>
	<!-- 添加岗位 end -->

	<!-- 添加试题类型 start -->
	<div id="addType" class="easyui-window" title="添加试题类型"
		collapsible="false" minimizable="false" maximizable="false"
		icon="icon-save"
		style="width: 300px; height: 150px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false"
				style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<table cellpadding=3>
					<tr>
						<td>类型名：</td>
						<td><input id="typeName" type="text" class="txt01"
							name="type.name" /></td>
					</tr>
				</table>
			</div>
			<div region="south" border="false"
				style="text-align: right; height: 30px; line-height: 30px;">
				<a id="addType_btn" class="easyui-linkbutton" icon="icon-ok"
					href="javascript:void(0)"> 确定</a> <a class="easyui-linkbutton"
					icon="icon-cancel" href="javascript:void(0)" id="addType_cancel">取消</a>
			</div>
		</div>
	</div>

	<!-- 添加试题类型 end -->
	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>

</body>
</html>