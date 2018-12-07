<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 
 <%
 String user = (String)session.getAttribute("userName"); 
 String style_display="none";
 if(!user.isEmpty()){
 	style_display="block";
 }
 %>
 
<html>
<head>
<title>修改用户信息</title>
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
               if(form.realname.value.length>20){
            	   alert("真实姓名过长!")
            	   form.realname.focus();
                   return false;
               }
               if(form.sex.value.length>2){
            	   alert("性别过长!")
            	   form.sex.focus();
                   return false;
               }
               if(form.telnumber.value.length>15){
            	   alert("电话号码过长!")
            	   form.telnumber.focus();
                   return false;
               }
                  document.myform.submit();
            }
</script>
<div style="display:<%=style_display%>;">
	<form action="Update_user" method="post" name="myform">
		<div class='signforom'>
			<div>
				<p>您的用户名为：<%=user %></p>			
				<input type="hidden" name="user" value=<%=user %>>
				<!--通过表单向java里传值-->
			</div>
			
			<div>
				<p>密码：</p>			
				<input type="text" name="password">			
			</div>
			
			<div>
				<p>真实姓名：</p>			
				<input type="text" name="realname">			
			</div>
			
			<div>
				<p>性别：</p>			
				<input type="text" name="sex">			
			</div>
			
			<div>
				<p>电话号码：</p>			
				<input type="text" name="telnumber">			
			</div>
		</div>
		<br>
		<input type="submit" value="修改" onclick="check(this.form)"> 
		<input type="button" value="返回主页" onclick="window.location.href('index.jsp')" />
	</form>
</div>
</body>
</html>