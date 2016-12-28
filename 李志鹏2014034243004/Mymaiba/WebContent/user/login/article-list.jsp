<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.lqz.DAO.impl.PostDAOimpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<title>article-list</title>
</head>
<body>
	<%@ include file="/include/header.jsp"%>
	
	<% pageContext.setAttribute("post", new PostDAOimpl().findAllPost()); %>
	<div align=center style="margin: 40px auto 40px;">
		<table cellpadding="5" cellspacing="0" border="1" bordercolor="#99ccff" width="750">
			<tr align=center bgcolor="#80ffff" height="30dp">
				<th colspan="5">麦吧文章列表</th>
			</tr>
			<tr>
				<td width="50">点击数</td>
				<td width="50">回复数</td>
				<td>标题</td>
				<td width="70">作者</td>
				<td width="200">最后回复</td>
			</tr>
			<c:forEach items="${post }" var="post">
			<tr>
				<td>${post.clickNumber }</td>
				<td>${post.replyNumber }</td>
				<td>
					<a href="${pageContext.request.contextPath }/user/login/article-detail.jsp?postId=${post.postId }">${post.title }</a>
				</td>
				<td>${post.userName }</td>
				<td>${post.lastReplyTime }</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	<%@ include file="/include/footer.jsp"%>
</body>
</html>