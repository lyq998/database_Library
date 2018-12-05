<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<html>
<%
String manager = request.getParameter("manager"); 
String update_info="window.location.href('add_info.jsp?manager="+manager+"')";
String search_info="window.location.href('searchInfo.jsp?manager="+manager+"')";
%>
<head>
<title>管理员首页</title>
</head>
<body>
<h3>
	管理员首页
</h3>
<div>
	<input type="button" value="发布公告" onclick=<%=update_info %> />
	<input type="button" value="查找公告" onclick=<%=search_info %> />
</div>
</body>
</html>