<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.lqz.domain.*, com.lqz.servive.*, com.lqz.servive.impl.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<title>user-edit</title>
</head>
<body>

	<%@ include file="/include/header.jsp"%>
	<%
		String account = request.getParameter("account").toString();
		pageContext.setAttribute("user", new UserServiceImpl().findUserByCount(account));
	%>
	<div align=center style="margin: 40px auto 40px;">
		<form action="${pageContext.request.contextPath }/servlet/editDetailServlet" method="post">
		<table cellpadding="5" cellspacing="0" border="1" bordercolor="#99ccff" width="750">
			<tr align=center bgcolor="#80ffff">
				<th colspan="2">用户具体信息</th>
			</tr>
			<tr>
				<td>账号</td>
				<td><input type="text" name="account" size="50" value="${user.account }"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" size="50" value="${user.password }"></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" name="username" size="50" value="${user.username }"></td>
			</tr>
				<tr>
				<td>年龄</td>
				<td><input type="text" name="age" size="50" value="${user.age }"></td>
			</tr>	
			<tr>
				<td>电子邮件</td>
				<td><input type="text" name="email" size="50" value="${user.email }"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" bgcolor="#80ffff">
					<input type="submit" value="修改">
					<a href="${pageContext.request.contextPath }/user/login/user-list.jsp"><input type="button" value="返回"></a>
				</td>
			</tr>
		</table>
		</form>
	</div>

	<%@ include file="/include/footer.jsp"%>

</body>
</html>