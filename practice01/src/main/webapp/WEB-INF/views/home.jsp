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
 	//var width = prompt("�غ��� �Է��ϼ���.");
 	//var height = prompt("���̸� �Է��ϼ���.");
 	${triangle.setWidth(width)}
 	${triangle.setHeight(height)}
 	
 	console.log(${triangle.area});
 </script>
 ${triangle.setWidth(10)}
 ${triangle.setHeight(10)}
 ${triangle.area}
</body>
</html>