/*
 Javascript module (ajax) 
*/
 
 var dataList = (() => {
 
 	function getList(callback){
 		
 		$.ajax({
 		
 			type:"GET",
 			url:"/boards/list",
 			success:function(data){
 				
 				if(callback){
 					callback(data);
 				}
 				
 				
 			},
 			error:function(){
 				console.log("error");
 			}
 		
 		});
 		
 		
 	}
 	
 	return {getList:getList};
 	
 })();