function getXMLHttpRequest() {
	var xmlhttp;
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	return xmlhttp;
}

window.onload = function() {
	// 帐号由1-8位单词字符组成
	var Reg1 = /^\w{1,8}$/;
	// 密码由4-10位数字或字母组成
	var Reg2 = /^[A-Za-z0-9]{4,10}$/;
	// 昵称由1-7个中文字符或1-14个单词字符组成
	var Reg3 = /^[\u4e00-\u9fa5]{1,7}$|^[\w]{1,14}$|^[\u4e00-\u9fa5\w]{1,7}$/;
	// 年龄范围为1-150
	var Reg4 = /^(\d|[1-9]\d|1[0-4]\d|150)$/;
	// 邮箱格式，如Tom@163.com
	var Reg5 = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

	var accountElement = document.getElementsByName("account")[0];
	var passwordElement = document.getElementsByName("password")[0];
	var usernameElement = document.getElementsByName("username")[0];
	var ageElement = document.getElementsByName("age")[0];
	var emailElement = document.getElementsByName("email")[0];

	accountElement.onkeyup = function() {
		var account = this.value;// this等价于accountElement
		var msg1 = document.getElementById("msg1");
		// 创建XMLHttpRequest对象
		var xhr = getXMLHttpRequest();
		// 处理结果
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4) {// 请求一切正常
				if (xhr.status == 200) {// 服务器响应一切正常
					alert(xhr.responseText);//得到响应结果
					if (xhr.responseText == "true") {
						msg1.innerHTML = "<font color='red'>* 用户名已存在</font>";
						// msg.innerText = "<font color='red'>用户名已存在</font>";
					}
				}
			}
		};
		// 创建连接
		xhr.open("get", "/servlet/findNameServlet?account=" + account + "&time=" + new Date());
		// 发送请求
		xhr.send(null);
		if (!Reg1.test(account)) {
			// alert("帐号不合法，必须由1-8位单词字符组成");
			msg1.innerHTML = "<font color='red'>* 帐号不合法</font>";
			document.getElementsByName("paras")[0].value = "帐号";
		} else{
			msg1.innerHTML = "<font color='black'>可以使用</font>";
			document.getElementsByName("paras")[0].value = "";
		}
	};

	passwordElement.onkeyup = function() {
		var msg2 = document.getElementById("msg2");
		if (passwordElement.value != "")
			if (!Reg2.test(passwordElement.value)) {
				// alert("密码不合法，必须由4-10位数字或字母组成");
				msg2.innerHTML = "<font color='red'>* 密码不合法</font>";
				document.getElementsByName("paras")[1].value = "密码";
			} else{
				msg2.innerHTML = "<font color='black'>密码合法</font>";
				document.getElementsByName("paras")[1].value = "";
			}
	};

	usernameElement.onkeyup = function() {
		var msg3 = document.getElementById("msg3");
		if (usernameElement.value != "")
			if (!Reg3.test(usernameElement.value)) {
				// alert("昵称不合法，必须由1-7个中文字符或1-14个单词字符组成");
				msg3.innerHTML = "<font color='red'>* 昵称不合法</font>";
				document.getElementsByName("paras")[2].value = "昵称";
			} else{
				msg3.innerHTML = "昵称合法";
				document.getElementsByName("paras")[2].value = "";
			}
	};

	ageElement.onkeyup = function() {
		var msg4 = document.getElementById("msg4");
		if (ageElement.value != "")
			if (!Reg4.test(ageElement.value)) {
				// alert("年龄不合法，必须由1-8位单词字符组成");
				msg4.innerHTML = "<font color='red'>* 年龄不合法</font>";
				document.getElementsByName("paras")[3].value = "年龄";
			} else {
				msg4.innerHTML = "年龄合法";
				document.getElementsByName("paras")[3].value = "";
			}
	};

	emailElement.onkeyup = function() {
		var msg5 = document.getElementById("msg5");
		if (emailElement.value != "")
			if (!Reg5.test(emailElement.value)) {
				// alert("邮箱不合法，格式如Tom@163.com");
				msg5.innerHTML = "<font color='red'>* 邮箱不合法</font>";
				document.getElementsByName("paras")[4].value = "邮箱";
			} else {
				msg5.innerHTML = "邮箱合法";
				document.getElementsByName("paras")[4].value = "";
			}
	};
};