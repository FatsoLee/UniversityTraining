<%@ page language="java" contentType="text/html; charset=utf-8"
	import="com.lqz.domain.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/base.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/register.js"></script>
<title>user-register</title>
</head>
<body>

	<%@ include file="/include/header.jsp"%>
	<form action="${pageContext.request.contextPath }/servlet/registerServlet" method="post">
		<!-- <form action="Handle-UserRegister.jsp" method="post"> -->

		<div class="table">
			<div class="register">用户注册</div>

			<div class="left">
				<span>帐号</span>：
			</div>
			<div class="right">
				<!-- placeholder： HTML5的标签 -->
				<input type="text" name="account" size="50" value="${user.account }"> 
				<span id="msg1" style="color: #ff0000;">* 请输入用户名</span> 
				<input type='hidden' name="paras" value="" />
			</div>
			<!-- <div class="clear"></div> -->
			<!-- 用于清除浮动效果 -->

			<div class="left">
				<span>密码</span>：
			</div>
			<div class="right">
				<input type="password" name="password" size="50" value="${user.password }"> 
				<span id="msg2" style="color: #ff0000;">* 请输入密码</span> 
				<input type='hidden' name="paras" value="" />
			</div>

			<div class="left">
				<span>昵称</span>：
			</div>
			<div class="right">
				<input type="text" name="username" size="50" value="${user.username }">
				<span id="msg3">(选填)</span> <input type='hidden' name="paras" value="" />
			</div>

			<div class="left">
				<span>年龄</span>：
			</div>
			<div class="right">
				<input type="text" name="age" size="50" value="${user.age }"> 
				<span id="msg4">(选填) </span> <input type='hidden' name="paras" value="" />
			</div>

			<div class="left">电子邮件：</div>
			<div class="right">
				<input type="text" name="email" size="50" value="${user.email }"> 
				<span id="msg5">(选填)</span> <input type='hidden' name="paras" value="" />
			</div>

			<div class="register">
				<!-- <input type="submit" value="注册" onclick="Register()"> -->
				<input type="submit" value="注册">
			</div>
		</div>
	</form>
	<%@ include file="/include/footer.jsp"%>

</body>
</html>