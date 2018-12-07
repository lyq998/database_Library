<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
 <style>
        table,table tr th, table tr td { border:1px solid #0094ff; }
        table { width: 1000px; min-height: 25px; line-height: 25px; text-align: center; border-collapse: collapse;}   
</style>
<%String callnumber=request.getParameter("callnumber"); %>
<html>
<head>
<title>修改书籍信息</title>
</head>
  <body> 
    <h3>修改书籍信息</h3>
    <h3>图书信息为:</h3>
    <table>
				<tr>
					<td>Callnumber</td>
					<td>ISBN</td>
					<td>Name</td>
					<td>Author</td>
					<td>Publisher</td>
					<td>Price</td>
				</tr>
				<tr style="border:1px solid;">
					<td>${book.callnumber}</td>
					<td>${book.isbn}</td>
					<td>${book.name}</td>
					<td>${book.author}</td>
					<td>${book.publisher}</td>
					<td>${book.price}</td>
				</tr>
	</table>
	<br>
	<p>若想删除该图书，请点击删除按钮
	<form  action = "DeleteBook" method="post">
		<input type="hidden" name="callnumber" value=<%=callnumber %> >
		<input type="submit" value="删除该图书" >
	</form>
	<br>
	<p>请输入你想改变的信息
<div>
	<form  action = "UpdateBook" method="post">
	<table>
				<tr>
					<td>Callnumber</td>
					<td>ISBN</td>
					<td>Name</td>
					<td>Author</td>
					<td>Publisher</td>
					<td>Price</td>
				</tr>

				<tr style="border:1px solid;">
					<td>${book.callnumber}</td>
					<input type="hidden" name="callnumber" value=<%=callnumber %> >
					<td><input type="text" name="isbn"></td>
					<td><input type="text" name="name"></td>
					<td><input type="text" name="author"></td>
					<td><input type="text" name="publisher"></td>
					<td><input type="text" name="price"></td>
				</tr>
	</table>
	<input type="submit" value="修改"> 
	</form>
</div>
<div>
	<input type="button" value="返回主页"  onclick="window.location.href('managerIndex.jsp')" />
</div>	
</body> 	
</html> 
