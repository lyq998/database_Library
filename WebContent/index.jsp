<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 
<html>
<head>
<title>首页</title>
</head>
<%
String user = (String)session.getAttribute("userName"); 
String style_display="none";
if(!user.isEmpty()){
	style_display="block";
}
String update_user="window.location.href('update_user.jsp')";
String search_book="window.location.href('search.jsp')";
String logout="window.location.href('login.jsp')";
String search_info="window.location.href('searchInfo_user.jsp')";
String borrowed_book="window.location.href('show_borrowed_book.jsp')";
%>
  <body> 
    <h3>首页</h3>
    <div style="display:<%=style_display%>;">
    <br> 
	<div>
		图书管理系统
	</div>
	<div>
		欢迎你！<%=user %>！
	</div>
	<div>
		<img alt="图书馆管理系统" src="/pgtest/image/library_index.png" style="width:400px;height:400px;">
	</div>
	<div class='select_button'>
		<input type="button" value="修改个人信息" onclick=<%=update_user %> />
		<input type="button" value="查询图书" onclick=<%=search_book %> />
		
		<form action = "ShowBorrowedBook" method="post">
	  	    <input type="hidden" name="username" value=<%=user %>> 
	        <input type="submit" value="查看已借图书"> 
   		</form>
   		
		<input type="button" value="查看公告" onclick=<%=search_info %>  />
		<input type="button" value="退出登录" onclick=<%=logout %>  />
	</div>
	</div>
  </body> 
  <footer>
  	作者：lyq,lj
  </footer>
</html> 
