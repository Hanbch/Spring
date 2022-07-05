<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
	<title>list</title>
</head>
<body>
  <table width="700" cellpadding="0" cellspacing="0" border="1">
      <form action="modify" method="post">
         <input type="hidden" name="bid" value="${content.bid}">
         <tr>
            <td> 번호 </td>
            <td> ${content.bid} </td>
         </tr>
         <tr>
            <td> 히트 </td>
            <td> ${content.bhit} </td>
         </tr>
         <tr>
            <td> 이름 </td>
            <td> <input type="text" name="bname" value="${content.bname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input type="text" name="btitle" value="${content.btitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10" name="bcontent" >${content.bcontent}</textarea></td>
         </tr>
         <tr>
            <td colspan="2"> <input type="submit" value="수정"> 
            &nbsp;&nbsp; <a href="list">목록보기</a> 
            &nbsp;&nbsp; <a href="delete?bid=${content.bid}">삭제</a> 
            &nbsp;&nbsp; <a href="reply_view?bid=${content.bid}">답변</a></td>
         </tr>
      </form>
   </table>

</body>
</html>