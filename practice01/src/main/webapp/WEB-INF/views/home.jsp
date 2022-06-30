<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 welcome!
 
 <script>
 	//var width = prompt("밑변을 입력하세요.");
 	//var height = prompt("높이를 입력하세요.");
 	${triangle.setWidth(width)}
 	${triangle.setHeight(height)}
 	
 	console.log(${triangle.area});
 </script>
 ${triangle.setWidth(10)}
 ${triangle.setHeight(10)}
 ${triangle.area}
</body>
</html>