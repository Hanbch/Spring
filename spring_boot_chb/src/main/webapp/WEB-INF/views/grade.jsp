<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/grade" method="POST">
		반지름 입력:<input type="number" name="rad"><br>
		국어:<input type="number" name="kor"><br>
		영어:<input type="number" name="eng"><br>
		수학:<input type="number" name="math" value="gradeVo.math"><br>
		<input type="submit" value="평균"><br>
	</form>
	
	평균: ${gradeVo.getAvg()}<br> 
	평균: ${gradeVo.avg}<br>
	
	평균: ${gradeVo.getNum()}<br> 
	평균: ${gradeVo.getArea}<br>
	<script>
		console.log("1. : ",${gradeVo.getAvg()});
		console.log("OK");
	</script>
</body>
</html>