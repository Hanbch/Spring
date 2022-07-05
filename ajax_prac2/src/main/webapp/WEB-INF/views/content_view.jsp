<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
	<title>list</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function (){
		
		$("#updateForm").submit(function(event){
			
			event.preventDefault();
			console.log("submit");
			
			let bid = $("#input_bid").val();
			let bname = $("#input_bname").val();
			let btitle = $("#input_btitle").val();
			let bcontent = $("#input_bcontent").val();

			let form={
					bid: bid,
					bname: bname,
					btitle: btitle,
					bcontent:bcontent					
			};
			
			$.ajax({
				
				type:"PUT",
				url:"/boards/" + bid,
				cashe:false,
				contentType:'application/json; charset=utf-8',
				data:JSON.stringify(form),
				success:function(list){
					console.log("put..");
					
					$(location).attr('href', '/rest_board.html');
				},
				error:function(e){
					console.log("error");
				}
				
			})
			
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
            <td> <textarea id="input_bcontent" rows="10" name="bcontent" >${content_view.bcontent}</textarea></td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="수정"> 
            &nbsp;&nbsp; <a href="list">목록보기</a> 
            &nbsp;&nbsp; <a href="delete?bid=${content_view.bid}">삭제</a> 
            &nbsp;&nbsp; <a href="reply_view?bid=${content_view.bid}">답변</a></td>
         </tr>
      </form>
   </table>

</body>
</html>