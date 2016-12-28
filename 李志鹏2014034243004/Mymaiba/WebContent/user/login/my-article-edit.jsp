<%@page import="com.lqz.DAO.impl.PostDAOimpl, com.lqz.domain.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<title>article-new</title>
</head>
<body>
	<%@ include file="/include/header.jsp"%>
	<%
		int postId = Integer.valueOf(request.getParameter("postId"));
		Post post = new PostDAOimpl().findPostById(postId);
		pageContext.setAttribute("post", post);
	 %>
	<div align=center style="margin: 40px auto 40px;">
	<form action="${pageContext.request.contextPath }/servlet/updatePostServlet?postId=${post.postId }" method="post">
		<table cellpadding="5" cellspacing="0" border="1" bordercolor="#99ccff" width="750">
			<tr align=center bgcolor="#80ffff" height="30dp">
				<th colspan="2">修改帖子</th>
			</tr>
			<tr>
				<td>标题：</td>
				<td><input style="width:600px" type="text" name="title" value="${post.title }"></td>
			</tr>
			<tr>
				<td>文章内容：</td>
				<td><textarea style="width:598px; height:160px" name="context">${post.context }</textarea></td>
			</tr>
			<tr bgcolor="#99ccff"  height="30dp">
				<td colspan="2" align="center">
					<input type="submit" value="修改">
					<input type="button" value="取消">
				</td>
		</table>
	</form>
	</div>
	<%@ include file="/include/footer.jsp"%>
</body>
</html>