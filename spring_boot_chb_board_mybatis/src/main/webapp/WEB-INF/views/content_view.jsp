<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   <script src="/js/board.js"></script>
   <title>list</title>
   <script>
   	$(document).ready(function(){
   		$("#updateForm").submit(function(e){
			e.preventDefault();
			
	   		boardService.modify("/rest_board3.html");
   			
   		});
   	});
   </script>
</head>
<body>
  <table width="700" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="modify" method="post">
         <input id="input_bid" type="hidden" name="bid" value="${content_view.bid}">
         <tr>
            <td> 번호 </td>
            <td> ${content_view.bid} </td>
         </tr>
         <tr>
            <td> 히트 </td>
            <td> ${content_view.bhit} </td>
         </tr>
         <tr>
            <td> 이름 </td>
            <td> <input id="input_bname" type="text" name="bname" value="${content_view.bname}"></td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_btitle" type="text" name="btitle" value="${content_view.btitle}"></td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea rows="10" id="input_bcontent" name="bcontent" >${content_view.bcontent}</textarea></td>
         </tr>
         <tr >
         
            <td colspan="2"> 
	            <input id="updateBtn" type="submit" value="수정"> 
	            &nbsp;&nbsp; <a href="list2?pageNum=${pageMaker.cri.pageNum}&amount=10">목록보기</a> 
	            &nbsp;&nbsp; <a href="delete?bid=${content_view.bid}">삭제</a> 
	            &nbsp;&nbsp; <a href="reply_view?bid=${content_view.bid}">답변</a>
            </td>
         </tr>
      </form>
   </table>
	
</body>
</html>