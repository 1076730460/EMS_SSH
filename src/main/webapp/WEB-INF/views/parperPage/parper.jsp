<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link
	href="<%=request.getContextPath()%>/resources/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=request.getContextPath()%>/resources/dist/jquery.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/dist/js/bootstrap.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/assets/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<h2 style="text-align: center;">试卷</h2>

	<div id="test">
		<div id="select1">
			<form action="">
				<div id="radio">
					<h3 style="margin-left: opx;">一、 思维题(每题5分)</h3>
					<ol>
						<c:forEach items="${questionList }" var="question"
							varStatus="radio">
							<c:choose>
								<c:when test="${question.testquestionType.name=='思维题' }">
									
									<li>${question.name }&nbsp;&nbsp;<p class="hide">${question.id }</p><label class="hide">
											<font color="red">${question.rightOption }</font>
									</label></br> </br> <input type="radio" name="${question.option.id }" value="A">
										A.${question.option.optionA }&nbsp; <input type="radio"
										name="${question.option.id }" value="B">
										B.${question.option.optionB }&nbsp; <input type="radio"
										name="${question.option.id }" value="C">
										C.${question.option.optionC }&nbsp; <input type="radio"
										name="${question.option.id }" value="D">
										D.${question.option.optionD }&nbsp;
									</li>
									</br>
								</c:when>
								<c:otherwise></c:otherwise>
							</c:choose>
						</c:forEach>
					</ol>
					</br>

					<h3 style="margin-left: opx;">二、 单选题</h3>
					<ol>
						<c:forEach items="${questionList }" var="question"
							varStatus="radio">
							<c:choose>
								<c:when test="${question.testquestionType.name=='单选题' }">



									<li>${question.name }&nbsp;&nbsp;<p class="hide">${question.id }</p><label class="hide"><font
											color="red">${question.rightOption }</font></label></br> </br> <input
										type="radio" name="${question.option.id }" value="A">
										A.${question.option.optionA }&nbsp; <input type="radio"
										name="${question.option.id }" value="B">
										B.${question.option.optionB }&nbsp; <input type="radio"
										name="${question.option.id }" value="C">
										C.${question.option.optionC }&nbsp; <input type="radio"
										name="${question.option.id }" value="D">
										D.${question.option.optionD }&nbsp;
									</li>
									</br>
								</c:when>
								<c:otherwise></c:otherwise>
							</c:choose>
						</c:forEach>
					</ol>
				</div>
				</br>
				<h3 style="margin-left: opx;">三、 多选题</h3>
				<div id="checkbox">
					<ol>
						<c:forEach items="${questionList}" var="question"
							varStatus="duoxuan">
							<c:choose>
								<c:when test="${question.testquestionType.name=='多选题' }">

									<li>${question.name }&nbsp;&nbsp;<p class="hide">${question.id }</p><label class="hide"><font
											color="red">${question.rightOption }</font></label></br> </br> <input
										type="checkbox" name="${question.option.id }" value="A">
										A.${question.option.optionA }&nbsp; <input type="checkbox"
										name="${question.option.id }" value="B">
										B.${question.option.optionB }&nbsp; <input type="checkbox"
										name="${question.option.id }" value="C">
										C.${question.option.optionC }&nbsp; <input type="checkbox"
										name="${question.option.id }" value="D">
										D.${question.option.optionD }&nbsp;
									</li>
								</c:when>
								<c:otherwise></c:otherwise>
							</c:choose>
						</c:forEach>
					</ol>
				</div>
		</div>
		</br>
		<div id="select2">

			<h3 style="margin-left: opx;">四、 判断题</h3>
			<ol>
				<c:forEach items="${questionList }" var="question"
					varStatus="panduan">
					<c:choose>
						<c:when test="${question.testquestionType.name=='判断题' }">
							<li>${question.name }&nbsp;&nbsp;<p class="hide">${question.id }</p><label class="hide"><font
									color="red">${question.rightOption }</font></label></br> </br> <input
								type="radio" name="${question.option.id }" value="正确">
								正确&nbsp; <input type="radio" name="${question.option.id }"
								value="错误"> 错误&nbsp;
							</li>
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</c:forEach>
			</ol>
		</div>
		</form>
	</div>
	<script src="<%=request.getContextPath()%>/resources/js/test.js"></script>
</body>
</html>