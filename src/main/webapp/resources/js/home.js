$(document).ready(function() {
	addPost();
	addType();
	serverLogin();
	
	//退出登录
	$('#loginOut').click(function() {
		$.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {

			if (r) {
				location.href = 'index.action';
			}
		});

	})
	
});

// 修改密码
function serverLogin() {
	//设置加载页面是修改窗口关闭
	$('#w').window('close');
	// 点击修改后打开窗口
	$('#editpass').click(function() {
		//openPwd();
		$('#w').window('open');
	});
	$("#passwordUpdat_cancel").click(function() {
		$('#w').window('close');
	});
	//存储修改
	$('#btnEp').click(function() {
		var $newpass = $('#txtNewPass').val();
		var $rePass = $('#txtRePass').val();
		if ($newpass == '') {
			msgShow('系统提示', '请输入密码！', 'warning');
			return false;
		}
		if ($rePass == '') {
			msgShow('系统提示', '请在一次输入密码！', 'warning');
			return false;
		}

		if ($newpass != $rePass) {
			msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
			return false;
		}
		
		//ajax提交数据
		$.ajax({
			type : "POST",
			url : "modifyPassword.action?newPassword="+$newpass,
			async : false,
			data : JSON.stringify({
				"newPassword" : $newpass
			}),
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				if(data.success){
					//关闭窗口
					alert("修改密码成功!当前秘密为："+$newpass.val());
					$('#w').window('close');
					//刷新页面
					location.reload();
				}else{
					msgShow("系统提示",data.errorMsg,"error");
				}
			},
			error : function(msg) {
				msgShow("系统提示",msg,"error");
			}
		});
	});
}
/**
 * create time 2016.6.29
 * @author gjp
 */
function addPost() {
	//设置默认关闭添加岗位窗口
	$('#addPost').window('close');
	$("#add_post").click(function() {
		$('#addPost').window('open');
	});
	$("#addPost_cancel").click(function() {
		$('#addPost').window('close');
	});
	//保存数据
	$("#addPost_btn").click(function() {
		var postName = $("#postName").val();
		if(postName==""){
			msgShow('系统提示', '请输入岗位名称！', 'warning');
			return false;
		}
		var url = "savePost.action?postName="+postName;
		url=encodeURI(url); 
		url=encodeURI(url); 
		$.ajax({
			type : "POST",
			url : url,
			async : false,
			data : JSON.stringify({
				"postName" : postName
			}),
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				if(data.success){
					//关闭窗口
					$('#addPost').window('close');
					//刷新页面
					location.reload();
				}else{
					msgShow("系统提示",data.errorMsg,"error");
				}
			},
			error : function(msg) {
				msgShow("系统提示",msg,"error");
			}
		});
	});
}

//添加试题类型
function addType() {
	//设置默认关闭添加岗位窗口
	$('#addType').window('close');
	$("#add_type").click(function() {
		$('#addType').window('open');
	});
	$("#addType_cancel").click(function() {
		$('#addType').window('close');
	});
	//保存数据
	$("#addType_btn").click(function() {
		var typeName = $("#typeName").val();
		if(typeName==""){
			msgShow('系统提示', '请输入试题类型名称！', 'warning');
			return false;
		}
		var url = "saveType.action?typeName="+typeName;
		url=encodeURI(url); 
		url=encodeURI(url); 
		$.ajax({
			type : "POST",
			url : url,
			async : false,
			data : JSON.stringify({
				"typeName" : typeName
			}),
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				if(data.success){
					alert("添加成功");
					//关闭窗口
					$('#addType').window('close');
					//刷新页面
					location.reload();
				}else{
					alert(data.errorMsg);
				}
			},
			error : function(msg) {
				alert(msg);
			}
		});
	});
}