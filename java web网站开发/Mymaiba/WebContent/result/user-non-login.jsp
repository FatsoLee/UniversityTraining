<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/base.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
<title>Login</title>
</head>
<body bgcolor="#FFFFFF">

	<%@ include file="/include/header.jsp"%>
	
	<div style="margin: 120px auto 50px auto">
		<div style="text-align: center;">用户尚未登录，所以无法执行你所作的操作。请先
		<a href="${pageContext.request.contextPath }/user/user-login.jsp">登录</a></div>
	</div>
	
	<%@ include file="/include/footer.jsp"%>
</body>
</html>