<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   	<title>write_view</title>
   	
   	<script>
   		$(document).ready(function(){
   			
   			let updateForm = document.getElementById("updateForm");
   			
   			updateForm.addEventListener("submit",function(e){
   				
   				e.preventDefault();
   				
   				
   				let bid = $("#input_bid").val();
   				let bname = $("#input_bname").val();
   				let btitle = $("#input_btitle").val();
   				let bcontent = $("#input_bcontent").val();
   				
   				let form = {
   						bid : bid,
   						bname :bname,
   						btitle : btitle,
   						bcontent : bcontent
   				};
   				
   				$.ajax({ 
   		            type: "POST", 
   		            url : "/boards/", 
   		            cashe: false,
   		            contentType:'application/json;charset=utf-8',
   		            data: JSON.stringify(form),
   		            success : function(result) { 
   		
   		            	console.log(result);
   		            	location.href = "/list2";
   		                
   		            }, 
   		            error : function(e){ 
   		            		console.log(e);
   		                }	
   	            });
   				
   			});
   			
   			
   		});
   	</script>
</head>
<body>
     <table width="500" cellpadding="0" cellspacing="0" border="1">
      <form id="updateForm" action="write"  method="post">
         <tr>
            <td> 이름 </td>
            <td> <input id="input_bname" type="text" name="bname" size = "50"> </td>
         </tr>
         <tr>
            <td> 제목 </td>
            <td> <input id="input_btitle" type="text" name="btitle" size = "50"> </td>
         </tr>
         <tr>
            <td> 내용 </td>
            <td> <textarea id="input_bcontent" name="bcontent" rows="10" ></textarea> </td>
         </tr>
         <tr >
            <td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a></td>
         </tr>
      </form>
        </table>
</body>
</html>