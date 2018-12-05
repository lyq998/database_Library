<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 
<html>
<head>
<title>首页</title>
</head>
<%
String user = request.getParameter("user"); 
String update_user="window.location.href('update_user.jsp?user="+user+"')";
%>
  <body> 
    <h3>首页</h3>
    <br> 
	<div>
		图书管理系统测试
	</div>
	<div>
		欢迎你！<%=user %>!
	</div>
	<div>
		此处可插入图片
	</div>
	<div class='select_button'>
		<input type="button" value="修改个人信息" onclick=<%=update_user %> />
		<input type="button" value="查询图书" onclick="window.location.href('search.jsp')" />
		<input type="button" value="退出登录" onclick="window.location.href('login.jsp')" />
	</div>
  </body> 
</html> 
