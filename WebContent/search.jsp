<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<html>
<%
String user = (String)session.getAttribute("userName"); 
String style_display="none";
if(!user.isEmpty()){
	style_display="block";
}
%>
<head>
<title>查阅书籍</title>
</head>
  <body> 
    <h3>查询书籍</h3>
    <p>请输入您想查阅书籍的名称或部分名称：
    <br> 
    <div style="display:<%=style_display%>;">
    <form action = "Search" method="post">
  	    <input type="text" name="name"> 
        <input type="submit" value="Search"> 
    </form> 
    </div>
  </body> 
</html> 
