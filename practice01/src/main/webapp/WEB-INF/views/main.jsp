<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>RockscissorPaper Project</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/css/reset.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div class="wrapper">
        <div class="wrapper_inner">
            <div class="show_result">
                <div class="left">
                    <div class="tit">You</div>
                    <img src="/img/default.png" alt="default_img" id="you">
                </div>
                <div class="vs">vs</div>
                <div class="right">
                    <div class="tit">Computer</div>
                    <img src="/img/default.png" alt="default_img">
                </div>
            </div>
            <div class="select_zone">
               	<form action="/result_page" method="POST" enctype="/home">
               		<input class="rsp_input" type="radio" name="rsp" id="rock" value="0">
					<label class="label_img " for="rock">
					    <img src="/img/rock_icon.png" alt="rock_img">
					</label>
					<input class="rsp_input" type="radio" name="rsp" id="scissor" value="1">
					<label class="label_img " for="scissor">
						   <img src="/img/scissor_icon.png" alt="scissor_img">
					</label>
					
					<input class="rsp_input" type="radio" name="rsp" id="paper" value="2">
					<label class="label_img " for="paper">
						<img src="/img/paper_icon.png" alt="paper_img">
					</label>
					 <button type="submit" class="select_btn">선택</button>
               	</form>
               	<script>
               		//가위 바위 보 선택시 이미지 변경
               		var select = document.getElementsByClassName("label_img");
          		 	var you = document.getElementById("you");
          		 	var check_box = document.getElementsByName("rsp");
          		 	var select_btn = document.getElementsByClassName("select_btn")[0];
          		 	
	           		for(var i=0; i<select.length; i++){
	           			select[i].idx=i;
	           			 
	           			select[i].addEventListener("click",function(e){	           				
	           				 
	               			 var n = e.currentTarget.idx;
	               			 
	               			 for(var j=0; j<select.length; j++){
	               				 if(j == n){
	                				 select[j].classList.add("on");
	                				 if(j == 0){
	                					 you.src="/img/rock_icon.png";
	                				 } else if( j == 1){
	                					 you.src="/img/scissor_icon.png";
	                				 }else {
	                					 you.src="/img/paper_icon.png";
	                				 } 
	                			 }else{
	                				 select[j].classList.remove("on");
	                			 } 
	               			 }
	               		});	 
           			}
	           		
           			select_btn.addEventListener("click",function(e){
       					if(check_box[0].checked == false && check_box[1].checked == false && check_box[2].checked == false){
           					alert("가위, 바위, 보 중 하나를 선택해주세요!");
           					e.preventDefault();
           					return false;
       					 }
       				});
               	</script>
            </div>
        </div>

    </div>
</body>
</html>