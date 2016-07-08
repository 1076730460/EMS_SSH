
$(document).ready(function() {
	// 綁定button
	$("#onlogin").on("click", function() {
		var username = $.trim($("#username").val());
		var password = $("#password").val();
		if (username == "" && password == "") {
			alert("请填写用户名和密码");
			return false;
		} else if (username == "") {
			alert("请填写用户名");
			return false;
		} else if (password == "") {
			alert("请填写密码");
			return false;
		} else {
		}
		//var form_login = $("#form_login");
		//var data = form_login.serialize();
		$.ajax({
			type : "POST",
			async : false,
			url : "login.action?userName="+username+"&password="+password,
			dataType : "json",
			contentType : "application/json",
			data : {
				"userName" : username,
				"password" : password
			},
			success : function(data) {
				if(data.success){
					window.location.href = data.url;
				}else{
					alert(data.errorMsg);
					return;
				}
			},
			error:function(msg){
				alert("用户名或密码错误:"+msg);
			}
		});
	});
});
$(document).keydown(function(e) {
	if (e.keyCode == 13) {
		$('#onlogin').trigger("click");
	}
});