$(document).ready(function() {
	selectAll();
});
//创建一个qustion对象
function question(questionId,option){
	this.questionId = questionId;
	this.option = option;
}
//放做对题数
function rightOptionStatistic(radioNum,panduanNum,checkboxNum){
	var obj = new Object();
	obj.radioNum = radioNum;
	obj.panduanNum = panduanNum;
	obj.checkboxNum = checkboxNum;
	return obj;
}
//每题分数
function Score(){
	var obj = new Object();
	obj.radioScore = 5;
	obj.panduanScore = 5;
	obj.checkboxScore = 5;
	return obj;
}

// 判断是否选中
function selectAll() {
	//隐藏label
	//$("#test label").hide();
	$("#submit").click(function() {
		var inputs = $("#select1 input");
		var index = 0;
		for ( var i = 0; i < inputs.length; i++) {
			if (inputs[i].checked) {
				index++;
			} else {

				if ((i+1) % 4 == 0 && index == 0) {
					alert("还有未选项！");
					inputs[i].focus();
					return false;
				}
			}
			if ((i+1) % 4 == 0) {
				index = 0;
			}

		}
		
		//判断题
		var inputs_panduan = $("#select2 input");
		var index_panduan = 0;
		for ( var i = 0; i < inputs_panduan.length; i++) {
			if (inputs_panduan[i].checked) {
				index_panduan++;
			} else {

				if ((i+1) % 2 == 0 && index_panduan == 0) {
					alert("还有未选项！");
					inputs_panduan[i].focus();
					return false;
				}
			}
			if ((i+1) % 2 == 0) {
				index_panduan = 0;
			}

		}
		//确认表单提交
		if(confirm("你确认要提交吗？")){
		
		//存放question对象的数组
		var question_array = new Array();
		var questionIndex = 0;
		
		//单选计数
		var radioNum = 0;
		//基础题计数
		var commonNum = 0;
		//多选计数
		var checkboxNum = 0;
		//判断题计数
		var panduanNum = 0;
		//基础题和单选题提交数据验证对错
		var radios = $("#radio input:checked");
		var radio_raghtOptions = $("#radio label");
		for(var i=0;i<radios.length;i++){
			for(var j=0;j<radio_raghtOptions.length;j++){
				if(i==j){
					var radioQuestionId = $(radios[i]).siblings("p").text();
					var radioValue = $(radios[i]).val();
					var rightOption_value = $(radio_raghtOptions[i]).text().trim();
					question_array.push(new question(radioQuestionId,radioValue));
					if(radioValue!=rightOption_value){
						$(radios[i]).siblings("label").removeClass("hide");		
					}else{
						radioNum++;
					}
				}
			}
		}
		
		//判断题提交数据验证错误
		
		var panduans = $("#select2 input:checked");
		var panduan_raghtOptions = $("#select2 label");
		for(var i=0;i<panduans.length;i++){
			for(var j=0;j<panduan_raghtOptions.length;j++){
				if(i==j){
					var questionId = $(radios[i]).siblings("p").text();
					var pd_radioValue = $(panduans[i]).val();
					var pd_rightOption_value = $(panduan_raghtOptions[i]).text().trim();
					question_array.push(new question(questionId,pd_radioValue));
					if(pd_radioValue!=pd_rightOption_value){
						$(panduans[i]).siblings("label").removeClass("hide");
						//$(radios[i]).siblings("label").show();
					}else{
						panduanNum++;
					}
				}
			}
		}
		
		//复选框
		var checkbox_inputs = $("#checkbox input");
		var array = new Array();
		var check_index = 0;
		var daan = "";
		var checkbox_raghtOptions = $("#checkbox label");
		var select_array = new Array();
		var select_index = 0;
		for ( var i = 0; i < checkbox_inputs.length; i++) {
			array[check_index]=checkbox_inputs[i];
			check_index++;
			if((i+1)%4==0){
				//循环取值
				for(var j=0;j<array.length;j++ ){
					if(array[j].checked){
						daan +=array[j].value;
					}
				}
				select_array[select_index] = daan;
				daan="";
				array.length=0;
				check_index = 0;
			}
				
		}
		//验证选项
		for(var i=0;i<select_array.length;i++){
			for(var j=0;j<checkbox_raghtOptions.length;j++){
				if(i==j){
					var questionId = $(radios[i]).siblings("p").text();
					var checkbox_Value = select_array[i];
					var checkbox_rightOption_value = $(checkbox_raghtOptions[i]).text().trim();
					question_array.push(new question(questionId,checkbox_Value));
					if(checkbox_Value!=checkbox_rightOption_value){
						$(checkbox_raghtOptions[i]).removeClass("hide");
						//$(select_array[i]).siblings("label").removeClass("hide");
						//$(radios[i]).siblings("label").show();
					}else{
						checkboxNum++;
					}
				}
			}
		}
		//计算分数
		var tiNum = rightOptionStatistic(radioNum,panduanNum,checkboxNum);
		var score = new Score();
		var scoreCount = score.radioScore*tiNum.radioNum+score.panduanScore*tiNum.panduanNum+score.checkboxScore*tiNum.checkboxNum;
	
		var questionStr = "";
		for(var i=0;i<question_array.length;i++){
			questionStr += question_array[i].questionId+",";
			questionStr += question_array[i].option+"/";
		}
		//提交数据到后台
		var url = "submitQuestion.action?questionStr="+questionStr+"&score="+scoreCount;
		url = encodeURI(url);
		url = encodeURI(url);
		
		$.ajax({
			type : "POST",
			url :url ,
			async : false,
			data : JSON.stringify({
				"question_array" : question_array
			}),
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				if (data.success) {
					
					if(scoreCount<80){
						alert("总分："+scoreCount+" 你总共有三次的机会！重新点击试卷抽取试题。");
					}else{
						alert("总分："+scoreCount);
					}
				} else {
					alert("数据异常！");
				}
			}
		});
		
		
	}//end 表单提交
		return false;
	});

}