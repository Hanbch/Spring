<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		반지름 : <input type="number" name="rad"><br>
		<input type="button" value="넓이"><br>
		
		넓이: ${cir.getArea()}
		
	</form>
</body>
</html>