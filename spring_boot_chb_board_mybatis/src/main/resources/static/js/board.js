/*
 * boardService 
 * 모듈 구성하기
 *    
 * 모듈 패턴은 쉽게 말해서 Java의 클래스처럼 JavaScript를 이용해서 메서드를 가지는 객체를 구성한다. 
 * 모듈 패턴은 JavaScript의 즉시 실행함수와 '{}'를 이용해서 객체를 구성한다. 
 *  
 * 
 * */
 
 console.log("board Module...");
 
 var boardService = (function(){
   
   function list(callback){
      
      $.ajax({
          type : "GET",
          url : "/boards/list/",
          success: function (result) {       
             console.log(result);
             
             if(callback){
                callback(result);
             }
              
          },
          error: function (e) {
              console.log(e);
          }
      }); 
      
   }//list()
   
   
   function del(id, callback){
      
      $.ajax({
          type : "DELETE",
          url : "/boards/" + id,
          success: function (result) {       
             console.log(result);
             
             if(callback){
                callback();
             }         
   
          },
          error: function (e) {
              console.log(e);
          }
      });
   }
   
   function modify(url){
   
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
	            type: "PUT", 
        url : "/boards/" + bid, 
        cashe: false,
        contentType:'application/json;charset=utf-8',
        data: JSON.stringify(form),
        success : function(result) { 

        	console.log(result);
        	location.href = url;
        	//$(location).attr('href', '/list2');
            
        }, 
        error : function(e){ 
        		console.log(e);
            }	
    	});
   		
   }
   
   
   

   return { 
      list : list, 
      del : del,
      modify:modify
   };
 
 })();