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
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>이름</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.bid}</td>
				<td>${list.btitle}</td>
				<td>
					<a href="/content">${list.bcontent}</a>
				</td>
				<td>${list.bname}</td>
				<td>${list.bdate}</td>
				<td>${list.bhit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6"><a href="/write">글쓰기</a></td>
		</tr>
	</table>
	<c:if test="${pageMaker.prev}">
         <a href="list2${pageMaker.makeQuery(pageMaker.startPage - 1) }">«</a>
      </c:if>

      <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
         <c:out value="${pageMaker.cri.pageNum == idx?'':''}" /><!-- 이코드의 역할?? -->
         <a href="list2${pageMaker.makeQuery(idx)}">${idx} </a>
      </c:forEach>
      
      <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
         <a href="list2${pageMaker.makeQuery(pageMaker.endPage +1 ) }"> » </a>
      </c:if> <br>
</body>
</html>