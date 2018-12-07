<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<html>
 <%
 String manager = (String)session.getAttribute("managerName"); 
 String style_display="none";
 if(!manager.isEmpty()){
 	style_display="block";
 }
 %>
<head>
<title>借书</title>
</head>
<body>
<h3>借书</h3>
<div style="display:<%=style_display%>;">
<br> 
    <form action = "BorrowBook" method="post">
   		<p>输入索书号(callnumber)：
  	    <input type="text" name="callnumber" placeholder="在这里输入callnumber"> 
  	    <p>输入用户名：
		<input type="text" name="username" placeholder="在这里输入username"> 
        <input type="submit" value="确认借阅"> 
    </form> 
</div>
</body>
</html>