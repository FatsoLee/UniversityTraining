<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page
	import="java.util.*, com.lqz.domain.*, com.lqz.servive.*, com.lqz.servive.impl.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/base.js"></script>
<title>user-list</title>
</head>
<body>

	<%@ include file="/include/header.jsp"%>

	<div style="clear: both;"></div>

	<div class="rearch">
		<form action="${pageContext.request.contextPath }/user/login/vagueuser-detail.jsp">
			<span>请输入查询的用户账号：</span> 
			<input type="text" id="vague" name="vague" size="20"> 
			<input type="submit" value="查询" id="search">
		</form>
	</div>

	<div align=center style="margin: 40px auto 40px;">
		<table cellpadding="5" cellspacing="0" border="1"
			bordercolor="#99ccff" width="750">
			<tr align=center bgcolor="#80ffff">
				<th colspan="4">用户信息</th>
			</tr>
			<tr>
				<td>账号</td>
				<td>密码</td>
				<td>昵称</td>
				<td>操作</td>
			</tr>
			<%
				pageContext.setAttribute("user", new UserServiceImpl().findUser());
			%>
			<c:forEach items="${user }" var="user">
				<tr>
					<td>${user.account }</td>
					<td>${user.password }</td>
					<td>${user.username }</td>

					<td><a
						href="${pageContext.request.contextPath }/servlet/showDetailServlet?account=${user.account }"><input
							type="button" value="查看"></a> <a
						href="${pageContext.request.contextPath }/user/login/user-edit.jsp?account=${user.account }"><input
							type="button" value="修改"></a> <a
						href="${pageContext.request.contextPath }/servlet/deleteDetailServlet?account=${user.account }"><input
							type="button" value="删除"></a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<%@ include file="/include/footer.jsp"%>

</body>
</html>