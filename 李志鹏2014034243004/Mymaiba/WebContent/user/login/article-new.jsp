<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.all.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/ueditor/themes/default/css/ueditor.css">
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>

<link href="${pageContext.request.contextPath}/css/base.css"
	rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/javascript">
function submit() {
	var Reg1 = /^\w{1,8}$/;
	var Reg2 = /^[A-Za-z0-9]{4,10}$/;
	var context = document.getElementsByName("context")[0];
	if (context != null)
		window.location.href="servlet/addPostServlet";
}
UE.getEditor('editor');
</script>
<title>article-new</title>
</head>
<body>
	<%@ include file="/include/header.jsp"%>
	<div align=center style="margin: 40px auto 40px;">
	<form action="${pageContext.request.contextPath }/servlet/addPostServlet" method="post">
		<table cellpadding="5" cellspacing="0" border="1" bordercolor="#99ccff" width="750">
			<tr align=center bgcolor="#80ffff" height="30dp">
				<th colspan="2">发表帖子</th>
			</tr>
			<tr>
				<td>标题：</td>
				<td><input style="width:600px" type="text" name="title"></td>
			</tr>
			<tr>
				<td>文章内容：</td>
				<td>
				
				<textarea style="width:600px; height:160px" name="context" id="editor"></textarea>
				
				 <!-- <div style="width:600px; height:320px">
				 <script id="editor" type="text/plain" style="width:600px;height:160px;"></script>
				 </div> -->
				</td>
			</tr>
			<tr bgcolor="#80ffff"  height="30dp">
				<td colspan="2" align="center">
					<input type="button" value="发表" onclick="submit()">
					<a href="${pageContext.request.contextPath }/user/login/article-list.jsp"><input type="button" value="取消"></a>
				</td>
			</tr>
		</table>
	</form>
	</div>
	<%@ include file="/include/footer.jsp"%>
</body>
</html>