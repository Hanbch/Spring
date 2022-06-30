<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>uname</td>
			<td>password</td>
			<td>enable</td>
			<td>uname_1</td>
			<td>Auth</td>
		</tr>
		
		<c:forEach items="${joinList}" var="user">
			<c:forEach items="${user.authList}" var="auth">
				<tr>
					<td>${user.username}</td>
					<td>${user.password}</td>
					
					<td>${auth.username}</td>
					<td>${auth.AUTHORITY}</td>
				</tr>
			</c:forEach>
		</c:forEach>
		
	</table>
</body>
</html>