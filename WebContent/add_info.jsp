<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<html>
 <%
String manager = request.getParameter("manager"); 
 %>
<head>
<title>添加公告</title>
<link href="add_info.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<h3>添加公告</h3>
    <br> 
    <form action = "AddInfo" method="post">
  	    <input type="text" name="text" placeholder="在这里输入公告"> 
  	    <input type="hidden" name="manager" value=<%=manager %>> 
        <input type="submit" value="发布公告"> 
    </form> 
</body>
</html>