function deletPost(Id) {	
			$.ajax({
				type : "POST",
				url : "delPost.action?postId=" + Id,
				async : false,
				dataType : "json",
				contentType : "application/json",
				complete : function(xhr) {
					if (xhr.status == 200) {
						var json = JSON.parse(xhr.responseText);
						if (json.success) {
							// 刷新
							parent.location.reload();
						} else {
							alert(json.errorMsg);
						}
					}
				}
		});
}