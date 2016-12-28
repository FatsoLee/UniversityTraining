<%@page import="com.lqz.DAO.impl.UserDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<title>user-detail</title>
</head>
<body>

	<%@ include file="/include/header.jsp"%>

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
				String account = request.getParameter("vague");
				List<User> listquery = null;
				UserDAOImpl us = new UserDAOImpl();// 定义一个服务类
				listquery = us.findUserByVagueCount(account);// 根据表单的帐号查找
				System.out.println("account = "+ account + "listquery=" + listquery);
				request.setAttribute("listquery", listquery);
			%>
			<c:forEach items="${listquery }" var="user">
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