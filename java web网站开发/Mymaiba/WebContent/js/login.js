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

	var accountElement = document.getElementsByName("account_lg")[0];
	var passwordElement = document.getElementsByName("password_lg")[0];

	accountElement.onkeyup = function() {
		var msg1 = document.getElementById("msg1");
		if (accountElement.value != "") {
			if (!Reg1.test(accountElement.value)) {
				// alert("密码不合法，必须由4-10位数字或字母组成");
				msg1.innerHTML = "<font color='red'>* 账户不合法</font>";
			} else {
				msg1.innerHTML = "<font color='black'>账户合法</font>";
			}
		} else
			msg1.innerHTML = "<font color='red'>* 请输入用户名</font>";
	};

	passwordElement.onkeyup = function() {
		var msg2 = document.getElementById("msg2");
		if (passwordElement.value != "") {
			if (!Reg2.test(passwordElement.value)) {
				// alert("密码不合法，必须由4-10位数字或字母组成");
				msg2.innerHTML = "<font color='red'>* 密码不合法</font>";
			} else {
				msg2.innerHTML = "<font color='black'>密码合法</font>";
			}
		} else
			msg2.innerHTML = "<font color='red'>* 请输入密码</font>";
	};
};