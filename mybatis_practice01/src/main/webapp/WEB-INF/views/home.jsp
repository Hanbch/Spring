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
	
	${plus.setNum1(5)}
	${plus.setNum2(6)}
	
	num1 : ${add.num1}<br>
	num2 : ${add.num2}<br>
	add(): ${add.add()}
	
</body>
</html>