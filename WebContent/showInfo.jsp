<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <meta http-equiv="Content-Type"content="text/html;charset=gbk">  
<html>
<style>
        table,table tr th, table tr td { border:1px solid #0094ff; }
        table { width: 1000px; min-height: 25px; line-height: 25px; text-align: center; border-collapse: collapse;}   
</style>
<head>
<title>公告栏</title>
</head>
<body>
<h1>公告栏:</h1>
	<div>
		<table>
				<tr>
					<td>ID</td>
					<td>公告内容</td>
					<td>发布时间</td>
				</tr>
				<c:forEach items="${infos}" var="info">
					<tr style="border:1px solid;">
						<td>${info.id}</td>
						<td>${info.text}</td>
						<td>${info.datetime}</td>
					</tr>
				</c:forEach>
		</table>
	</div>
	<input type="button" value="返回管理员主页" onclick="window.location.href('managerIndex.jsp')" />
	<p>若想删除公告，请输入公告id并点击确认删除按钮
	<form action = "DeleteInfo" method="post">
  	    <input type="text" name="id"> 
        <input type="submit" value="确认删除"> 
    </form> 
</body>
</html>