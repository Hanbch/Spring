<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/grade2" method="POST">
		width:<input type="number" name="width"><br>
		height:<input type="number" name="height"><br>
		
		<input type="submit" value="평균"><br>
	</form>
	
	Area: ${triVo.getArea()}<br> 
	
	
	<script>
		console.log("1. : ",${triVo.getArea()});
		console.log("OK");
	</script>
</body>
</html>