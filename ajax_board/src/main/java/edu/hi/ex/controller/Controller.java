package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hi.ex.service.BoardService;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private BoardService service; 
	
	@GetMapping("/list")
	public String getListpage(){
		
		
		
	
		
		return "list";
	}
	
//	@GetMapping("/content_view")
//	public String content_view(Model model,BoardVO boardVO){
//		
//		int bid = boardVO.getBid();
//		
//		model.addAttribute("boardList",service.read(bid));
//		
//		return "content_view";
//	}
	
	
	
	
}
