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
			<th>내용</th>
			<th>이름</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.bid}</td>
				<td>${list.btitle}</td>
				<td>
					<a href="/content">${list.bcontent}</a>
				</td>
				<td>${list.bname}</td>
				<td>${list.bdate}</td>
				<td>${list.bhit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6"><a href="/write">글쓰기</a></td>
		</tr>
	</table>
</body>
</html>