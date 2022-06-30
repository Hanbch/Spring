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
	
	${dvo.setDeptno(11)}
	${dvo.setDname("choi")}
	${dvo.setLoc("AnYang")}
	
	${dvo.dname}
	${dvo.deptno}
	${dvo.loc}
	
</body>
</html>