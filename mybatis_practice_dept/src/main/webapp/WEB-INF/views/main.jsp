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
			<th>�̸�</th>
			<th>����</th>
		</tr>
		<c:forEach items="${info}" var="info">
			<tr>
				<td>${info.deptno}</td>
				<td>${info.dname}</td>
				<td>${info.loc}</td>
			</tr>
		</c:forEach>
		
		
		
		
	
	</table>
	
</body>
</html>