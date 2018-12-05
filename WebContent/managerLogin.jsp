<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 
<html>
<head>
<title>管理员登录</title>
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
<form action="ManagerLogin" method="post" name="myform">
	<div class='login'>
		<div>
			<p>管理员用户名：</p>			
			<input type="text" name="managername">			
		</div>
		
		<div>
			<p>密码：</p>			
			<input type="password" name="password">			
		</div>
	</div>
	<br>
	<input type="submit" value="登录" onclick="check(this.form)"> 
</form>
<div>
	<input type="button" value="用户登录" onclick="window.location.href('login.jsp')">
</div>
</body>
</html>