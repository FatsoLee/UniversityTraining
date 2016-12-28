<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*, com.lqz.domain.*, com.lqz.servive.*, com.lqz.servive.impl.*"%>
<%@ page import="com.lqz.domain.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% pageContext.setAttribute("user", new UserServiceImpl().findUser()); %>
<c:forEach items="${user }" var="user">
		<c:if test="${user.account == '12'}">
			<%
				
			%>
		</c:if>
</c:forEach>
<div style="float: left;">
<marquee width=600 behavior=alternate direction=left align=middle>
<span style="color:#F00">
欢迎各位来到MaiBa，请先登录!!!
</span>
</marquee>
</div>
<div class="rearch">
	<input type="text" id="search" size="20"> <select id="pid"
		onchange="gradeChange()">
		<option value="1">百度</option>
		<option value="2">360搜索</option>
		<option value="3">搜狗</option>
	</select> <input type="submit" value="search" onclick=javascrtpt:jump()>
</div>

<%
	User user = (User) session.getAttribute("user");
	if (user == null) {
%>
<div class="visitor">
	<div style="color: #0080FF; padding-left: 30px;">
		<a href="#">
			<%
				out.print("游客");
			%>
		</a>，你好!
		<div style="float: right;">
			<a
				href="${pageContext.request.contextPath }/user/user-visitor.jsp"
				style="padding-right: 30px;">麦吧</a> <a
				href="${pageContext.request.contextPath }/user/user-login.jsp"
				style="padding-right: 30px;">登陆</a> <a
				href="${pageContext.request.contextPath }/user/user-register.jsp"
				style="padding-right: 30px;">注册</a>
		</div>
	</div>
</div>
<%
	} else if (user.getAccount().equals("12")) {
%>
<div class="visitor">
	<div style="color: #0080FF; padding-left: 30px;">
		<a href="#"> <%
 	out.print("管理员");
 %>
		</a>，你好!
		<div style="float: right">
			<a
				href="${pageContext.request.contextPath }/user/login/article-list.jsp"
				style="padding-right: 30px;">麦吧</a> <a style="margin-right: 20px"
				href="${pageContext.request.contextPath}/user/login/user-list.jsp">后台管理</a>
			<a style="margin-right: 20px"
				href="${pageContext.request.contextPath}/user/login/user-detail.jsp"
				onclick="invalidate()">修改基本信息</a> <a style="margin-right: 20px"
				href="${pageContext.request.contextPath}/user/user-login.jsp">退出麦吧</a>
		</div>
	</div>
</div>
<%
	} else {
%>
<div class="visitor">
	<div style="color: #0080FF; padding-left: 30px;">
		<a href="#"> <%
 	out.print(user.getAccount());
 %>
		</a>，你好!
		<div style="float: right">
			<a
				href="${pageContext.request.contextPath }/user/login/article-list.jsp"
				style="padding-right: 30px;">麦吧</a> 
			<a style="margin-right: 20px"
				href="${pageContext.request.contextPath}/user/login/user-detail.jsp"
				onclick="invalidate()">修改基本信息</a> <a style="margin-right: 20px"
				href="${pageContext.request.contextPath}/user/user-login.jsp">退出麦吧</a>
		</div>
	</div>
</div>

<div class="blank"></div>

<div style="float: left; margin-left: 40px">
	<a href="${pageContext.request.contextPath}/user/login/user-detail.jsp">用户管理</a>
</div>
<div style="float: left; margin-left: 40px">
	<a href="${pageContext.request.contextPath}/user/login/article-new.jsp">发表帖子</a>
</div>
<div style="float: left; margin-left: 40px">
	<a
		href="${pageContext.request.contextPath}/user/login/my-article-list.jsp">我发表的帖子</a>
</div>
<div style="float: left; margin-left: 40px">
	<a
		href="${pageContext.request.contextPath}/user/login/my-article-reply.jsp">我评论的帖子</a>
</div>
<%
	}
%>
<div class="blank"></div>