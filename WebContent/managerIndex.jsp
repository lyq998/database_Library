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
String update_info="window.location.href('add_info.jsp')";
String search_info="window.location.href('searchInfo.jsp')";
String insert_book="window.location.href('add_books.jsp')";
String borrow_book="window.location.href('borrow_book.jsp')";
String return_book="window.location.href('return_book.jsp')";
String update_book="window.location.href('update_book.jsp')";
%>
<head>
<title>管理员首页</title>
</head>
<body>
<h3>
	管理员首页
</h3>
	<div>管理员${managerName }，你好！</div>
<div style="display:<%=style_display%>;">
<div>
<input type="button" value="发布公告" onclick=<%=update_info %> />
	<input type="button" value="查找/删除公告" onclick=<%=search_info %> />
</div>
	
	<div>
	<input type="button" value="添加书籍" onclick=<%=insert_book %> />
	<input type="button" value="修改/删除书籍" onclick=<%=update_book %> />
	</div>
	<div>
	<input type="button" value="借阅书籍" onclick=<%=borrow_book %> />
	<input type="button" value="归还书籍" onclick=<%=return_book %> />
	</div>
</div>
</body>
</html>