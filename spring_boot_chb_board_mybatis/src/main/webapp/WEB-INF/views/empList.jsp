<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- C태그 쓰기 위해 넣은 taglib므로 반드시 확인 --> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<tr>
			<td>사원번호</td>
			<td>이름</td>
			<td>부서</td>
			<td>부서위치</td>
		</tr>
	
        <!--이때 list는 BListCommand에서 메모리에 올린 list를 뜻함. 포워딩시까지 살아있으므로-->
        <!--forEach문을 이용해 데이터를 꺼낼 수 있다.-->
		<c:forEach var="dept" items="${list}">
			<c:forEach var="emp" items="${dept.empList}">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${dept.dname}</td>
					<td>${dept.loc}</td>				
				</tr>
			</c:forEach>
		</c:forEach>
		
	</table>
</body>
</html>