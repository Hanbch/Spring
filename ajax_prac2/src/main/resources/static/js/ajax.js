/*
	ajax module  
*/


var getListData = (() =>{
	
	
	function list(callback){
		
		$.ajax({
			
			type:"GET",
			url:"/ajax_board/dataList",
			success:function(data){
				if(callback){
					console.log("start");
	                callback(data);
	                
	             }
			},
			error:function(){
				console.log("error");
			}
		
		});
		
	}//list()
	
	function del(bid,link){
	
		$.ajax({
		
			type:"DELETE",
			url:"/ajax_board/" + bid,
			success:function(data){
				
				if(link){
					location.href = link;
				}
				
				console.log("removed");
			},
			error:function(){
				console.log("error");
			}
		});
	
	}//del()
	
	function modify(id){
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
			
			
			
			type:"PUT",
			url:"/ajax_board/" + id,
			cashe: false,
	        contentType:'application/json;charset=utf-8',
	        data: JSON.stringify(form),
			success:function(data){
				
				
				location.href = "/rest_board.html";
				
				
				console.log("modify");
			},
			error:function(){
				console.log("error");
			}
		});
	
	}//modify()
	
	return {
		list:list,
		del:del,
		modify:modify
	}; 
	
})();

