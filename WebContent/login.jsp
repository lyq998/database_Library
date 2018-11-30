<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 
<html>
<head>
<title>登录</title>
</head>
<body>
<script type="text/javascript">
         function check(form) {
              if(form.username.value=='') {
                    alert("请输入用户帐号!");
                    form.username.focus();
                    return false;
               }
               if(form.password.value==''){
                    alert("请输入登录密码!");
                    form.password.focus();
                    return false;
                }
                  document.myform.submit();
            }
</script>
<form action="Login" method="post" name="myform">
	<div class='login'>
		<div>
			<p>用户名：</p>			
			<input type="text" name="username">			
		</div>
		
		<div>
			<p>密码：</p>			
			<input type="text" name="password">			
		</div>
	</div>
	<br>
	<input type="submit" value="登录" onclick="check(this.form)"> 
	<input type="button" value="注册" onclick="window.location.href('signin.jsp')" />
</form>	
</body>
</html>