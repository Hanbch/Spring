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
			<th>��ȣ</th>
			<th>����</th>
			<th>����</th>
			<th>�̸�</th>
			<th>��¥</th>
			<th>��ȸ��</th>
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
			<td colspan="6"><a href="/write">�۾���</a></td>
		</tr>
	</table>
</body>
</html>