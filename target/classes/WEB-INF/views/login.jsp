<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
<head>
<title>LOGIN</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/css/reset.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/css/supersized.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/assets/css/style.css">
</head>
<body>


	<div class="page-container">
		<h1>Login</h1>
		<form   id="form_login">
			<s:textfield name="user.userName" cssClass="username" id="username" validate="required,minLength:6"
				placeholder="Username" ></s:textfield>
			<s:password name="user.password" cssClass="password" id="password" validate="required,minLength:6"
				placeholder="Password"></s:password>

			<button type="button" id="onlogin">Sign me in</button>
			<div class="error">
				<span>+</span>
			</div>
		</form>
	</div>
	<!-- Javascript -->
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/jquery-1.8.2.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/supersized.3.2.7.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/supersized-init.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/assets/js/scripts.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/login.js"></script>
</body>
</html>