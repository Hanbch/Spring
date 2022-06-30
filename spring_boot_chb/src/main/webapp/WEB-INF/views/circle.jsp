<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<body>
	<form action="/circle" method="POST">
		반지름 입력:<input type="number" name="rad"><br>
		<input type="submit" value="넓이"><br>
	</form>
	
	
	넓이: ${circleVO.getArea()}
	넓이: ${circleVO.area}
	<script>
		console.log("rad : ",${circleVO.getRad()});
		console.log("Area : ",${circleVO.getArea()});
	</script>
</body>
</html>