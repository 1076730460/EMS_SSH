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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link
	href="<%=request.getContextPath()%>/resources/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=request.getContextPath()%>/resources/dist/jquery.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="row">
		<div class="col-sm-11">
			<form class="form-horizontal" id="form_search"
				action="searchData.action">
				<div class="row" style="margin-top: 5px;">

					<label class="col-sm-1 control-label" for="form-field-select-1">
						岗位</label>
					<div class="col-sm-2 no-padding-left">
						<s:select list="postList" listValue="name" listKey="id"
							value="post.id" name="post.id" id="up_post"
							cssClass="form-control" headerKey="" headerValue="请选择岗位"
							onchange="onSelectChange()">
						</s:select>
					</div>

					<label class="col-sm-1 control-label" for="form-field-select-1">
						试题类型</label>
					<div class="col-sm-2 no-padding-left">
						<s:select list="typeList" listValue="name" listKey="id"
							value="type.id" name="type.id" id="up_type"
							cssClass="form-control" headerKey="" headerValue="请选择类型"
							onchange="onSelectChange()">
						</s:select>
					</div>


				</div>
				<div class="row" style="height: 10px;"></div>
				<div class="row">
					<label class="col-sm-1 control-label" for="form-field-select-1">
						试卷名称</label>
					<div class="col-sm-2 no-padding-left">
						<input type="text" class="form-control" id="parperName"
							name="parper.name">
					</div>
					<label class="col-sm-1 control-label" for="form-field-select-1">
						试卷类型</label>
					<div class="col-sm-2 no-padding-left">
						<input type="text" class="form-control" id="parperType"
							name="parper.postType">
					</div>

					<label class="col-sm-1 control-label" for="form-field-select-1">
						题目数</label>
					<div class="col-sm-1 no-padding-left">
						<input type="text" class="form-control" id="qustionNum"
							name="zujuanNum">
					</div>
					<div class="col-sm-1">
						<button class="btn btn-primary btn-sm" id="organization">自动组卷</button>
					</div>
					<div class="col-sm-1">
						<button class="btn btn-primary btn-sm" id="artfical">人工组卷</button>
					</div>


				</div>
			</form>
		</div>
		<div class="col-sm-1" style="margin-top: 50px;">
			<button class="btn btn-primary btn-sm" data-toggle="modal"
				data-target="#myModal">添加题目</button>
		</div>

	</div>
	<div class="row"></div>
	<input id="searchUrl" type="hidden" value="questionInfoSearch">
	<input id="searchPagination" type="hidden" value="JobInfoPagination">
	<div class="table-responsive" style="margin-top: 5px;">
		<table id="dataSourceTable"
			class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th class="center"><label class="position-relative"> <input
							type="checkbox" class="ace" id="allSelect" onclick="selectAll()" />
							<span class="lbl"></span>
					</label></th>
					<th>题目名称</th>
					<th>岗位</th>
					<th>类型</th>
					<th>选项</th>
					<th>正确项</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="questionList" var="question" status="st">
					<input id="questionNum" type="hidden" value="${st.count }">
					<tr>
						<td class="center"><label class="position-relative">
								<input type="checkbox" class="ace" value="${question.id }"
								name="question.name" /> <span class="lbl"></span>
						</label></td>

						<td>${question.name }</td>
						<td>${question.post.name }</td>
						<td>${question.testquestionType.name }</td>
						<td><c:choose>
								<c:when test="${question.testquestionType.name=='判断题' }">

								</c:when>
								<c:otherwise>
							A.${question.option.optionA
							}&nbsp;&nbsp;B.${question.option.optionB }&nbsp;&nbsp;C.${question.option.optionC
							}&nbsp;&nbsp;D.${question.option.optionD }&nbsp;
							</c:otherwise>
							</c:choose></td>
						<td>${question.rightOption }</td>
						<td>
							<%-- <s:a action="updateQuestion.action?questionId=%{id}" onclick="javascript:;window.opener.location.reload();">修改</s:a> --%>
							<a id="deltQuestion" onclick="deletQuestion('${question.id}')"
							style="cursor: pointer;">删除</a> <a id="deltQuestion"
							onclick="updateQuestion('${question.id}')"
							style="cursor: pointer;" data-toggle="modal"
							data-target="#updateModal">修改</a>
						</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<div id="table-loader" class="col-xs-12"
			style="text-align: center; margin-top: 6%; display: none; margin-bottom: 6%">
			<img
				src="<%=request.getContextPath()%>/resources/images/ajax-loader.gif" />
		</div>
	</div>

	<!-- 添加模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" style="text-align: center;">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加题目</h4>
				</div>
				<div class="modal-body">
					<!-- modal start -->
					<div class="step-pane active">
						<div class="step-pane active">
							<div class="center">
								<form action="" class="form-horizontal" id="form_addQuestion">
									<div class="form-group" style="margin-top: 5px;">
										<div class="col-xs-6 form-cell">
											<s:select list="postList" listValue="name" listKey="id"
												value="post.id" name="post.id" id="post"
												cssClass="form-control" headerKey="" headerValue="请选择岗位">
											</s:select>
										</div>
										<div class="col-xs-6 form-cell">
											<s:select list="typeList" listValue="name" listKey="id"
												onchange="typeSelect()" value="type.id" name="type.id"
												id="type" cssClass="form-control" headerKey=""
												headerValue="请选择类型">
											</s:select>
										</div>
									</div>
									<div class="row">
										<s:textarea name="question.name" cssClass="form-control"
											placeholder="题目" id="questName"></s:textarea>
									</div>
									<!-- 选项 -->
									<div id="options">
										<div class="row" style="margin-top: 5px;">
											<label class="col-sm-1 control-label">A</label> <input
												type="text" class="col-sm-5" name="option.optionA">
											<label class="col-sm-1 control-label">B</label> <input
												type="text" class="col-sm-5" name="option.optionB">
										</div>
										<div class="row" style="margin-top: 5px;">
											<label class="col-sm-1 control-label">C</label> <input
												type="text" class="col-sm-5" name="option.optionC">
											<label class="col-sm-1 control-label">D</label> <input
												type="text" class="col-sm-5" name="option.optionD">
										</div>
									</div>
									<!-- 答案 -->
									<div class="row"></div>
									</br>
									<div class="row" id="checkbox">
										<label class="checkbox-inline"> <s:textfield
												type="radio" name="radio" value="A">A</s:textfield>
										</label> <label class="checkbox-inline"> <s:textfield
												type="radio" name="radio" value="B">B</s:textfield>
										</label> <label class="checkbox-inline"> <s:textfield
												type="radio" name="radio" value="C">C</s:textfield>
										</label> <label class="checkbox-inline"> <s:textfield
												type="radio" name="radio" value="D">D</s:textfield>
										</label>
									</div>


									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
										<button type="button" class="btn btn-primary" id="questionSub">提交</button>
									</div>
								</form>
							</div>
						</div>
					</div>
					<!-- model end -->

				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

	<!-- 修改模态框 -->
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" style="text-align: center;">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">题目详情</h4>
				</div>
				<div class="modal-body">
					<!-- modal start -->
					<div class="step-pane active">
						<div class="step-pane active">
							<div class="center">
								<form action="" class="form-horizontal" id="form_updateQuestion">
									<s:textfield name="question.id" type="hidden"
										id="update_questionId"></s:textfield>
									<div class="row">
										<s:textarea name="question.name" cssClass="form-control"
											placeholder="题目" id="update_questName"></s:textarea>
									</div>
									<%-- <div class="row">
										<s:textarea name="question.options" cssClass="form-control"
											placeholder="选项" id="update_questionOptions"></s:textarea>
									</div> --%>
									<div class="row">
										<s:textfield name="question.rightOption"
											cssClass="form-control" id="update_rightOption"
											placeholder="答案"></s:textfield>
									</div>

									<div class="form-group" style="margin-top: 5px;">
										<div class="col-xs-6 form-cell">
											<s:select list="postList" listValue="name" listKey="id"
												value="post.id" name="post.id" id="update_post"
												cssClass="form-control" headerKey="" headerValue="请选择岗位">
											</s:select>
										</div>
										<div class="col-xs-6 form-cell">
											<s:select list="typeList" listValue="name" listKey="id"
												value="type.id" name="type.id" id="update_type"
												cssClass="form-control" headerKey="" headerValue="请选择类型">
											</s:select>
										</div>
									</div>

									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
										<button type="button" class="btn btn-primary"
											id="update_questionSub">提交</button>
									</div>
								</form>
							</div>
						</div>
					</div>
					<!-- model end -->

				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!-- 添加试卷名模特框 -->
	<script
		src="<%=request.getContextPath()%>/resources/js/testQuestion.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/elements/table.js"></script>
</body>
</html>