
// 提示用户是否删除
function delBook(id, name) {
	if (confirm("是否确定删除:" + name + "?")) {
		location.href = "${pageContext.request.contextPath }/servlet/delBookServlet?id="
				+ id;
	}
}

// 提示用户是否删除
function delBook(id) {
	location.href = "${pageContext.request.contextPath }/servlet/delBookServlet?id="
			+ id;
}