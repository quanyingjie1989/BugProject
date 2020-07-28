<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>项目云平台</title>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
#wrap {
	height: 519px;
}
#head {
	height: 320px;
	width: 100;
	background-color: #66CCCC;
	text-align: center;
	position: relative;
}
#wrap .logGet {
	height: 408px;
	width: 368px;  
	position: absolute;
	background-color: #FFFFFF;
	top: 30%;
	right: 35%;
}
.logC a button {
	width: 100%;
	height: 45px;
	background-color: #ee7700;
	border: none;
	color: white;
	font-size: 18px;
}
.logGet .logD.logDtip .p1 {
	display: inline-block;
	font-size: 28px;
	margin-top: 30px;
	width: 86%;
}
#wrap .logGet .logD.logDtip {
	width: 86%;
	border-bottom: 1px solid #ee7700;
	margin-bottom: 60px;
	margin-top: 0px;
	margin-right: auto;
	margin-left: auto;
}
.logGet .lgD img {
	position: absolute;
	top: 12px;
	left: 8px;
}
.logGet .lgD input {
	width: 100%;
	height: 42px;
	text-indent: 2.5rem;
}
#wrap .logGet .lgD {
	width: 86%;
	position: relative;
	margin-bottom: 30px;
	margin-top: 30px;
	margin-right: auto;
	margin-left: auto;
}
#wrap .logGet .logC {
	width: 86%;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}
.title {
	font-family: "宋体";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%); 
	font-size: 36px;
	height: 40px;
	width: 30%;
}
.copyright {
	font-family: "宋体";
	color: #FFFFFF;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%); 
	height: 60px;
	width: 40%;
	text-align:center;
}
</style>
</head>
<body>

	<form action="loginservelet" method="post">
	
		<div class="wrap" id="wrap">
			<div class="logGet">
					<div class="logD logDtip">
						<p class="p1">项目云平台</p>
					</div>
					<!-- 输入框 -->
					<div class="lgD">
					<span style="color:red;"><%=request.getAttribute("msg") == null ?"":request.getAttribute("msg") %></span>
						<img src="img/logName.png" width="20" height="20" alt=""/>
						<input type="text" name="username"
							placeholder="输入用户名" /><br>
					</div>
					<div class="lgD">
						<img src="img/logPwd.png" width="20" height="20" alt=""/>
						<input type="password" name="password"
							placeholder="输入用户密码" /><br>
					</div>
					<div class="logC">
						<a href="index.html" target="_self"><button>登 录</button></a>
						<br>
						 <a href="#" class="p1">立即注册</a>
					</div>
				</div>
		</div>
	
	</form>
</body>
</html>