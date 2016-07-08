$(document).ready(function() {
	addQuestion();
	organizationParper();
	artifical();
});
// 根据题型判断
function typeSelect() {
	var type = $("#type option:selected").text();
	if(type=='多选题'){
		$("#options").show();
		$("#checkbox").empty();
		var html = "<label class='checkbox-inline'> <input type='checkbox' value='A' name='checkbox.a'>A</label><label class='checkbox-inline'> <input type='checkbox' value='B' name='checkbox.b'>B</label><label class='checkbox-inline'> <input type='checkbox' value='C' name='checkbox.c'>C</label><label class='checkbox-inline'> <input type='checkbox' value='D' name='checkbox.d'>D</label>";
		$("#checkbox").html(html);
	}else if(type=='单选题'){
		$("#options").show();
		$("#checkbox").empty();
		var html = "<label class='checkbox-inline'> <input type='radio' name='radio' value='A'>A</label> <label class='checkbox-inline'> <input type='radio' name='radio' value='B'>B</label> <label class='checkbox-inline'> <input type='radio' name='radio' value='C'>C</label> <label class='checkbox-inline'> <input type='radio' name='radio' value='D'>D</label>";
		$("#checkbox").html(html);
	}else if(type=="判断题"){
		$("#options").hide();
		$("#checkbox").empty();
		var html = "<label class='checkbox-inline'>正确<input type='radio' value='正确' name='radio'></label><label class='checkbox-inline'> 错误<input type='radio' value='错误' name='radio'></label>";
		$("#checkbox").html(html);
	}else if(type=="思维题"){
		$("#options").show();
		$("#checkbox").empty();
		var html = "<label class='checkbox-inline'> <input type='radio' name='radio' value='A'>A</label> <label class='checkbox-inline'> <input type='radio' name='radio' value='B'>B</label> <label class='checkbox-inline'> <input type='radio' name='radio' value='C'>C</label> <label class='checkbox-inline'> <input type='radio' name='radio' value='D'>D</label>";
		$("#checkbox").html(html);
	}
}

// 全选和反选
function selectAll() {
	var chk = document.getElementById('allSelect');
	if(chk.checked){
		// 全选
		$("#dataSourceTable tbody input[type='checkbox']").each(function(){
			 this.checked=true
		})
		// 反选
	}else{
		$("#dataSourceTable tbody input[type='checkbox']").each(function(){
			 this.checked=false
		})
	}
}
// 人工组卷
function artifical() {	
	var questionIdList = new Array();
	var flag=0;
	$("#artfical").click(function() {
		// 获取所有选种的value
		$("#dataSourceTable tbody input[type='checkbox']").each(function(){
			if($(this).get(0).checked){
				 questionIdList[flag]=this.value;
				 flag++;
			}	
		})
		for(var i=0;i<questionIdList.length;i++){
			
			console.log(questionIdList[i]);
		}
		// ajax提交
		$.ajax({
			type : "POST",
			url : "artficalParper.action?questionIdList="+questionIdList,
			async : false,
			data : JSON.stringify({
				"questionIdList" : questionIdList
			}),
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				if (data.success) {
					alert("组卷成功！");
					window.history.back(-1);
				} else {
					alert(data.errorMsg);
				}
			}
		});
	});
	
}

// 搜索局部刷新表
function onSelectChange() {
	var for_addQuestion = $("#form_search");
	var data = for_addQuestion.serialize();
	for_addQuestion.submit();
}

// 自动组卷
function organizationParper() {
	
	$("#organization").click(function() {
		var questionNum = $("#qustionNum").val();
		var postSelect = $("#up_post").val();
		var typeSelect = $("#up_type").val();
		if(questionNum==""){
			alert("请输入题目数或手动选择题目！");
			return;
		}else {
			if(postSelect!="" &&　typeSelect!=""){
				var curentNum = $("#questionNum").val();
				if(questionNum<=curentNum){
					// ajax发送数据
					
					
					var for_addQuestion = $("#form_search");
					for_addQuestion.attr("action","automaticParper.action")
					var data = for_addQuestion.serialize();
					$.ajax({
						type : "POST",
						url :"automaticParper.action?questionNUm"+questionNum,
						async : false,
						data : data,
						dataType : "json",
						contentType : "application/json",
						success : function(data) {
							if (data.success) {
								alert("组卷成功！");
								window.history.back(-1);
							} else {
								alert(data.errorMsg);
							}
						}
	                    
					});
				}else{
					alert("题目数大于当前题数,请重新输入题数！");
					return;
				}
			}else{
				alert("请选择岗位和题目类型");
			}		
		}
			
	});
	
}

/**
 * create time 2016.6.21
 * 
 * @author gjp 添加题目
 */
function addQuestion() {
	$("#questionSub").click(
			function() {
				/*
				 * var questionName = $("#questionName").val(); var
				 * questionOptions = $("#questionOptions").val(); var
				 * RightOption = $("#questionRightOption").val(); var post =
				 * $("#post option:selected").val(); var questionType =
				 * $("#questionType option:selected").val(); if (questionName == "" ||
				 * questionOptions == "" || RightOption == "" || post == "" ||
				 * questionType == "") { alert("请输入相应内容！"); return; }
				 */
				var for_addQuestion = $("#form_addQuestion");
				var data = for_addQuestion.serialize();
				$.ajax({
					type : "POST",
					url : "addQuestion.action",
					data : data,
					dataType : "json",			
					complete: function (xhr) {
                        if (xhr.status == 200) {
                        	 var json = JSON
                             .parse(xhr.responseText);
                            if (json.success) {
                            	$("#myModal").modal('hide');
                            	// 刷新表格
                            	location.reload();
                            } else {
                                alert(json.errorMsg);
                            }
                        }
                    }
				});
			});
}

// 删除
function deletQuestion(Id) {
	$.ajax({
		type : "POST",
		url : "deletQuestion.action?questionId="+Id,
		async : false,
		dataType : "json",
		contentType : "application/json",
		complete: function (xhr) {
            if (xhr.status == 200) {
            	 var json = JSON
                 .parse(xhr.responseText);
                if (json.success) {
                	// 刷新表格
                	location.reload();
                } else {
                    alert(json.errorMsg);
                }
            }
        }
	});
}

// 修改
function updateQuestion(Id) {
	$.ajax({
		type : "POST",
		url : "updateQuestion.action?questionId="+Id,
		async : false,
		dataType : "json",
		contentType : "application/json",
		complete: function (xhr) {
            if (xhr.status == 200) {
            	 var json = JSON
                 .parse(xhr.responseText);
                if (json.success) {
                	// 刷新表格
                	// alert("hello");
                	// 弹出对话框
                	document.getElementById("update_questionId").value=json.questionId;
                	document.getElementById("update_questName").value=json.questionName;
                	document.getElementById("update_questionOptions").value=json.options;
                	document.getElementById("update_rightOption").value=json.rightOption;
 
                	 $("#update_post option").each(function () {
                         var val = $(this).val(); // 获取单个value
                         if(val==json.post){
                 			this.selected=true;
                 		}
                
                     });
                	 
                	 $("#update_type option").each(function () {
                         var val = $(this).val(); // 获取单个value
                         if(val==json.type){
                 			this.selected=true;
                 		}
                
                     });
                	// $("#myModal").modal('open');
                	submit_update_question();
                } else {
                    alert(json.errorMsg);
                }
            }
        }
	});
}
// 提交修改question
function submit_update_question() {
	$("#update_questionSub").click(function() {
		var for_updateQuestion = $("#form_updateQuestion");
		var data = for_updateQuestion.serialize();
		$.ajax({
			type : "POST",
			url : "updateSubmit.action",
			data : data,
			dataType : "json",			
			complete: function (xhr) {
                if (xhr.status == 200) {
                	 var json = JSON
                     .parse(xhr.responseText);
                    if (json.success) {
                    	$("#myModal").modal('hide');
                    	// 刷新表格
                    	location.reload();
                    } else {
                        alert(json.errorMsg);
                    }
                }
            }
		});
	});
}
