
console.log("board Module...");

var nameService = (function(){
	//console.log("aaa");

	function dofun(){
		console.log("함수 실행입니다.")
	}
	
	function didfun(){
		console.log("함수 didfun 실행입니다.")
	}
	
	return {
		name : "홍길동",
		dofun:dofun,
		didfun:didfun
	};

})();
