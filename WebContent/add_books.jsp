<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">   

<html>
<head>
<title>增加书目</title>
</head>
<body>
	<form action = "Addbook" method="post">
        <div>
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
					<td><input type="text" name="callnumber"> </td>
					<td><input type="text" name="isbn"></td>
					<td><input type="text" name="name"></td>
					<td><input type="text" name="author"></td>
					<td><input type="text" name="publisher"></td>
					<td><input type="text" name="price"></td>
				</tr>
		</table>
		<div>
			<input type="submit" value="Addbook">  
		</div>
	</div>
    </form> 
</body>
</html>