<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link
	href="<%=request.getContextPath()%>/resources/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/resources/css/commen.css"
	rel="stylesheet">
<script src="<%=request.getContextPath()%>/resources/dist/jquery.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/dist/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/post.js">
	
</script>
</head>
<body>
	<div class="table-responsive" style="margin-top: 5px;">
		<table id="dataSourceTable"
			class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>岗位名称</th>
					<th>创建人</th>
					<th>创建时间</th>
					<th>更新人</th>
					<th>更新时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${post.name }</td>
					<td>${post.create_person }</td>
					<td>${post.create_time }</td>
					<td>${post.update_person }</td>
					<td>${post.update_time }</td>
					<td style="text-align: center;"><a id="deltQuestion"
						onclick="deletPost('${post.id}')" style="cursor: pointer;">删除</a>
					</td>
				</tr>
			</tbody>
		</table>
		<div id="table-loader" class="col-xs-12"
			style="text-align: center; margin-top: 6%; display: none; margin-bottom: 6%">
			<img
				src="<%=request.getContextPath()%>/resources/images/ajax-loader.gif" />
		</div>
	</div>
</body>
</html>