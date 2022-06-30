<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
   <title>list</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
    <table  id="table" border="1">
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>제목</th>
            <th>날짜</th>
            <th>조회수</th>
            <th>삭제</th>
        </tr>
        
    </table>
    <script>
       
        $(document).ready(function(){

            $.ajax(
            { 
            type: "get", 
            url : "/emps/list", 
            success : function(data) { 

            	//console.log("sucess");
            	
                $(data).each( (index,member)=>{
                        var tr = document.createElement("tr");
                        tr.setAttribute("class","addTr");
                        $("#table").append(tr);

                        for(var i=0; i<6; i++){ 
                            var td = document.createElement("td");
                            $(".addTr").eq(index).append(td); 
                            if(i == 0){ 
                                td.innerHTML= member.bid;
                            }else if(i == 1){
                                td.innerHTML= member.bname;
                            }else if(i == 2){
                                td.innerHTML= "<a href='/content_view?" + member.bid + "'>" + member.btitle + "</a>";
                            }else if(i == 3){
                                td.innerHTML= member.bdate;
                            }else if(i == 4){
                                td.innerHTML= member.bhit;
                            }else{
                                td.innerHTML= "delete"
                                td.setAttribute("class","deleteBtn");
                                td.setAttribute("id",member.bid); 
                            }
                        }
                        
                    });
                
            }, 
            error : function(xhr, textStatus, errorThrown){ 
                //  Error시, 처리 
                    alert(xhr);
                    alert(textStatus);  
                    alert(errorThrown);
                }
            });
            
          //delete 클릭시 해당 데이터 삭제( 동적으로 생성된 객체이므로 delete에 직접 이벤트 추가X )
            document.addEventListener("click",function(e){
                if(e.target && e.target.className == "deleteBtn" ){
                    e.target.parentNode.remove();
                    console.log(e.target.id);
                    
                    $.ajax({ 
                    	
                    type: "DELETE", 
                    url : "/boards/" + e.target.id , 
                    success : function(data) { 

                    	console.log("sucess");
                    	
                        
                        
                    }, 
                    error : function(xhr, textStatus, errorThrown){ 
                        //  Error시, 처리 
                            alert(xhr);
                            alert(textStatus);  
                            alert(errorThrown);
                        }
                    });
                    
                }
            });
            
        });
    </script>
</body>
</html>