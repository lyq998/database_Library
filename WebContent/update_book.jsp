<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 <style>
        table,table tr th, table tr td { border:1px solid #0094ff; }
        table { width: 1000px; min-height: 25px; line-height: 25px; text-align: center; border-collapse: collapse;}   
</style>
<%
String manager = (String)session.getAttribute("managerName"); 
String style_display="none";
if(!manager.isEmpty()){
	style_display="block";
}
%>
<html>
<head>
<title>修改书籍信息</title>
</head>
  <body> 
  <div style="display:<%=style_display%>;"> 
    <h1 style="text-align:center">修改书籍信息</h1>
    <p>请输入你想改变的图书索书号(callnumber)：
    <form action = "SearchUpdateBook" method="post">
  	    <input type="text" name="callnumber"> 
        <input type="submit" value="Enter" type="button"> 
    </form> 
  </div>
  </body> 
</html> 
