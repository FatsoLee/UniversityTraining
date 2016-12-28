<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page
	import="java.util.*, com.lqz.domain.*, com.lqz.servive.*, com.lqz.servive.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/base.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/login.js"></script>
<title>user-login</title>
</head>
<body bgcolor="#FFFFFF">

	<%
		if (session.getAttribute("user") != null) {
			session.removeAttribute("user");
			System.out.println("销毁了session");
		}
	%>

	<%@ include file="/include/header.jsp"%>


	<div class="table">
		<form
			action="${pageContext.request.contextPath }/servlet/loginServlet"
			method="post">

			<div class="register">用户登陆</div>
			<div class="left">用户名:</div>
			<div class="right">
				<input type="text" name="account_lg" size="50"> <span
					id="msg1" style="color: #ff0000;">* 请输入用户名</span>
			</div>

			<div class="left">密码:</div>
			<div class="right">
				<input type="password" name="password_lg" size="50"> <span
					id="msg2" style="color: #ff0000;">* 请输入密码</span>
			</div>

			<c:set var="act" scope="session" value="relogon" />
			<c:set var="action" scope="session"
				value='<%=request.getParameter("action")%>' />
			<c:if test="${act==action}">
				<div class="left">验证码:</div>
				<div class="right">
					<input type="text" name="check" size="50"> <img
						id="checkcodeimgID" src="<%=request.getContextPath()%>/ServImgVal"
						align="absmiddle" alt="输入图中数字">
				</div>
			</c:if>
			
			<div class="register">
				<input type="submit" value="登陆"
					style="align: center; margin: auto 10px auto"> <a
					href="${pageContext.request.contextPath }/user/user-register.jsp">
					<input type="button" value="注册"
					style="align: center; margin: auto 10px auto">
				</a>
			</div>
		</form>
	</div>
	<%@ include file="/include/footer.jsp"%>
</body>
</html>