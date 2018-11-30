<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<html>
<head>
<title>注册</title>
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
               if(form.username.value.length>20){
            	   alert("用户名过长!")
            	   form.username.focus();
                   return false;
               }
               if(form.password.value.length>20){
            	   alert("密码过长!")
            	   form.password.focus();
                   return false;
               }
                  document.myform.submit();
            }
</script>
	<form action="Signin" method="post" name="myform">
		<div class='signforom'>
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
		<input type="submit" value="注册" onclick="check(this.form)"> 
		<input type="button" value="返回登录界面" onclick="window.location.href('login.jsp')" />
	</form>
</body>
</html>