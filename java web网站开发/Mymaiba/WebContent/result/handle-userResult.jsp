<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="/include/header.jsp"%>
	
	<div style="margin: 120px auto 50px auto">
		<div style="text-align: center;">${msg }</div>
		<div style="margin-top: 40px; text-align: center;">
			<c:set var="act" scope="session" value="${action}"/>
			<c:set var="action1" scope="session" value="relogon"/>		
			<c:if test="${act==action1}">
			<a href="${pageContext.request.contextPath}/user/user-login.jsp?action=relogon"> 
				<input type="button" value="返回">
			</a>
			</c:if>
		</div>
	</div>

	<%@ include file="/include/footer.jsp"%>

</body>
</html>