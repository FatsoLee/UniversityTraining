function jump() {
	var choose = "百度";
	var Str1 = document.getElementById("search").value;
	switch (choose) {
	case "百度":
		window.location.href = "https://www.baidu.com/s?wd=" + Str1;
		break;
	case "360搜索":
		window.location.href = "https://www.so.com/s?q=" + Str1;
		break;
	case "搜狗":
		window.location.href = "https://www.sogou.com/web?ie=utf8&query="
				+ Str1;
		break;
	}
}

function gradeChange() {
	var obj = document.getElementById("pid");
	for ( var i = 0; i < obj.length; i++) {// 下拉框的长度就是他的选项数
		if (obj[i].selected == true) {
			choose = obj[i].text;// 获取文本
		}
	}
}

