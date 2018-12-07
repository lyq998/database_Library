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
<title>还书</title>
</head>
<body>
<div style="display:<%=style_display%>;">
<br> 
    <form action = "ReturnBook" method="post">
   		<p>输入索书号(callnumber)：
  	    <input type="text" name="callnumber" placeholder="在这里输入callnumber"> 
        <input type="submit" value="确认归还"> 
    </form> 
</div>
</body>
</html>