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
			<th>번호</th>
			<th>제목</th>
			<th>이름</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		
		<c:forEach items="${listGet}" var="info">
			<tr>
				<td>${info.bid}</td>
				<td>${info.bname}</td>
				<td>${info.btitle}</td>
				<td>${info.bdate}</td>
				<td>${info.bhit}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>