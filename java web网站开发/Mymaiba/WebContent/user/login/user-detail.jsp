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
		<table cellpadding="5" cellspacing="0" border="1" bordercolor="#99ccff" width="750">
			<tr align=center bgcolor="#80ffff">
				<th colspan="2">用户具体信息</th>
			</tr>
			<tr>
				<td>账号</td>
				<td>${user.account }</td>
			</tr>
			<tr>
				<td>密码</td>
				<td>${user.password }</td>
			</tr>
			<tr>
				<td>昵称</td>
				<td>${user.username }</td>
			</tr>
				<tr>
				<td>年龄</td>
				<td>${user.age }</td>
			</tr>	
			<tr>
				<td>电子邮件</td>
				<td>${user.email }</td>
			</tr>
			<tr>
				<td colspan="2" align="center" bgcolor="#80ffff">
					<a href="${pageContext.request.contextPath }/user/login/user-edit.jsp?account=${user.account }"><input type="button" value="修改"></a>
					<a href="${pageContext.request.contextPath }/user/login/user-list.jsp">
						<input type="button" value="返回">
					</a>
				</td>
			</tr>
		</table>
	</div>

	<%@ include file="/include/footer.jsp"%>

</body>
</html>