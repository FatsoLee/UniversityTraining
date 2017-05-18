<%@page import="java.util.List, com.lqz.DAO.impl.*, com.lqz.domain.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<title>article-detail</title>
</head>
<body>
	<%@ include file="/include/header.jsp"%>
	<%  String postId = request.getParameter("postId");
		Post post = null;
		if (postId != null){
			post = new PostDAOimpl().findPostById(Integer.valueOf(postId));
			pageContext.setAttribute("post", post);
		}
	 %>
	<div align="left" style="margin: 40px">
	<table cellpadding="5" cellspacing="0" border="1" bordercolor="#99ccff" width="750">
		<tr bgcolor="#80ffff" height="30dp">
			<th align="left" colspan="2">${post.title }</th>
		</tr>
		<tr><th align="left" colspan="2">${post.context }</th></tr>
		<tr>
			<th>作者：${post.userName }</th>
			<th>发表时间：${post.date }</th>
		</tr>
	</table>
	<br>
	<%  if (user.getAccount().equals(post.getUserName())) {%>
		<a href="${pageContext.request.contextPath }/user/login/my-article-edit.jsp?postId=${post.postId }"><input type="button" name="alter" size="50" value="修改"></a>
		<a href="${pageContext.request.contextPath }/servlet/deletePostServlet?postId=${post.postId }"><input type="button" name="delete" size="50" value="删除"></a>
	<% 	}
	 	CommentDaoImpl commentDaoImpl = new CommentDaoImpl();
	 	List<Comment> commentList = commentDaoImpl.fingCommentByPostId(Integer.valueOf(postId));
	 	if (commentList != null){
	 	pageContext.setAttribute("comment", commentList);
	 %>
	<p>---------------------------------------------------------------------------------------------</p>
	<p>评论区：</p><br>
	<c:forEach items="${comment }" var="comment">
	${comment.userName }:<br>
	&nbsp;&nbsp;&nbsp;&nbsp;${comment.comment }<br>
	发表时间：${comment.datetime }
	<p>---------------------------------------------------------------------------------------------</p>
	<br>
	</c:forEach>
	<%} %>
	<br>
	<form action="${pageContext.request.contextPath }/servlet/addCommentServlet?postId=${post.postId }" method="post">
		<div>评论：
			<textarea style="width:685px; height:160px" name="comment"></textarea>
		</div>
		<br><input type="submit" value="发表评论">
	</form>
	
	</div>
	<%@ include file="/include/footer.jsp"%>
</body>
</html>