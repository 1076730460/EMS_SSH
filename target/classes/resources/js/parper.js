$(document).ready(function() {
	download();
});

function download() {
	$("#downLoad").click(function() {
		var postName = $("#postName").val();
		$.ajax({
			type : "POST",
			url : "download.action?postName="+postName,
			async : false,
			data : JSON.stringify({
				"postName" : postName
			}),
			dataType : "json",
			contentType : "application/json",
			success : function(data) {
				if (data.success) {
					alert("正在下载！");
					window.history.back(-1);
				} else {
					alert(data.errorMsg);
				}
			}
		});
	});
}