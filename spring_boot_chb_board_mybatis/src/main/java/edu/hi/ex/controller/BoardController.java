package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hi.ex.page.Criteria;
import edu.hi.ex.page.PageVO;
import edu.hi.ex.service.BoardService;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController{

	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		log.info("list()..");
		
		model.addAttribute("boardList",service.getList());
		
		return "list";
	}
	
	@GetMapping("/list2")
	public String list2(Criteria cri,Model model) {
		log.info("list2()..");
		log.info("list2() Criteria " + cri);
		
		model.addAttribute("list",service.getList(cri));
		
		int total = service.getTotal();
		log.info("total" + total);
		
		model.addAttribute("pageMaker",new PageVO(cri,total));
		
		return "list2";
	}
	
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO ,Criteria cri, Model model) {
		log.info("content_view()...");
		
		int bid =  boardVO.getBid(); // 클릭한 데이터의 bid 값을 가져옴
		
		model.addAttribute("content_view",service.read(bid));
		
		int total = service.getTotal();
		log.info("total" + total);
		
		model.addAttribute("pageMaker",new PageVO(cri,total));
		
		return "content_view";
	}
	
	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view()...");
		
		
		return "write_view";
	}
	
	@PostMapping("/write")
	public String write_view(BoardVO boardVO) {
		log.info("write()...");
		
		service.register(boardVO);
		return "redirect:list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify()...");
		
		int rn = service.modify(boardVO);
		
		log.info("modify()... result number::" + rn);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete()...");
		
		service.delete(boardVO);
		
		return "redirect:list";
	}
	
	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO,Model model) {
		log.info("reply_view()...");
		
		model.addAttribute("reply_view",service.read(boardVO.getBid()));
		
		return "reply_view";
	}
	
	@PostMapping("/reply")
	public String reply(BoardVO boardVO){
		log.info("reply()...");
		
		service.registerReply(boardVO);
		
		return "redirect:list";
	}
	
}
