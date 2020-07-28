<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script type="text/javascript" src="js/jquery-1.11.2.js"></script>
 <script type="text/javascript">
 
		function usernamecheck(){
            var usernamevalue = $("#usernameid").val();
            var Reg = /^[a-zA-Z][-_a-zA-Z0-9]{1,5}/;
            if (usernamevalue.length >= 6 && usernamevalue.length <= 18 && Reg.test(usernamevalue)) {
				$("#usernameSpan").eq(0).html("<font color='green' id='usernamefont'>用户名可用<font>");
            } else {
				$("#usernameSpan").eq(0).html("<font color='red' id='usernamefont'> 用户名必须以字母开头且长度在6-18之间<font>");
            }
		}
		
		function passwordcheck(){
			var password = $("#passwordid").val();
			if (password == "") {
				$("#passwordSpan").eq(0).html("<font color='red' id='passwordfont'>密码不能为空</font>");
			} else {
				$("#passwordSpan").eq(0).html("<font color='green' id='passwordfont'>密码可用</font>");
			}
		}

		function repasswordcheck(){
			var password = $("#passwordid").val();
			var repassword = $("#repasswordid").val();
			if (repassword == password) {
				$("#repasswordSpan").eq(0).html("<font color='green' id='repasswordfont'>输入一致</font>");
			} else {
				$("#repasswordSpan").eq(0).html("<font color='red' id='repasswordfont'>两次输入密码不一致</font>");
			}
		}
		
		function checkgorm(form){
			var usernamemsg = $("#usernamefont").eq(0).text();
			var passwordmsg = $("#passwordfont").eq(0).text();
			var repasswordmsg = $("#repasswordfont").eq(0).text();
			if(Object.is(usernamemsg, '用户名可用') && Object.is(passwordmsg, '密码可用') && Object.is(repasswordmsg, '输入一致')){
				alert("guo")
				return true;
			}else{
				return false;
			}
		}
		
    </script>
</head>
<body>
 <h2>项目云平台注册画面</h2>
    <div>
        <form action="addusersservlet" method="post" onsubmit="return checkform(this)">
            <table cellspacing="15">
                <tr>
                    <td>
                        账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp号:
                    </td>
                    <td>
                        <input type="text" id="usernameid" name="username" onblur="return usernamecheck()">
                        <span id="usernameSpan"></span>
                    </td>

                </tr>

                <tr>
                    <td>
                        密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp码:
                    </td>
                    <td>
                        <input type="password" id="passwordid" name="password" onblur="return passwordcheck()">
                        <span id="passwordSpan"></span>
                    </td>

                </tr>
				
                <tr>
                    <td>
                        确认密码:
                    </td>
                    <td>
                        <input type="password" id="repasswordid" name="password1" onblur="return repasswordcheck()">
                        <span id="repasswordSpan"></span>
                    </td>
                </tr>
				
            </table>
			<input type="submit" value="注册" style="width: 150px" />
        </form>
    </div>

</body>
</html>