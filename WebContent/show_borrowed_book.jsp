<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   
<style>
        table,table tr th, table tr td { border:1px solid #0094ff; }
        table { width: 1000px; min-height: 25px; line-height: 25px; text-align: center; border-collapse: collapse;}   
</style>
<html>
<head>
<title>已借书籍</title>
</head>
<body>
<h3>
	已借书籍：
</h3>
	<div>
		<table>
				<tr>
					<td>索书号</td>
					<td>ISBN</td>
					<td>书名</td>
					<td>作者</td>
					<td>出版社</td>
					<td>价格</td>
					<td>最晚归还时间</td>
				</tr>
				<c:forEach items="${borrowbooks}" var="book">
					<tr style="border:1px solid;">
						<td>${book.callnumber}</td>
						<td>${book.isbn}</td>
						<td>${book.name}</td>
						<td>${book.author}</td>
						<td>${book.publisher}</td>
						<td>${book.price}</td>
						<td>${book.backtime}</td>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>