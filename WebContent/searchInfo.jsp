<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<html>
<%
String manager = request.getParameter("manager"); 
%>

<head>
<title>查询公告</title>
</head>
<body>
	<h3>查询公告</h3>
	<p>请输入公告id。若想查看所有公告，请直接点击查询按钮。
    <br> 
    <form action = "SearchInfo" method="post">
  	    <input type="text" name="id"> 
  	    <input type="hidden" name="managername" value="<%=manager %>">
        <input type="submit" value="查询"> 
    </form> 
</body>
</html>