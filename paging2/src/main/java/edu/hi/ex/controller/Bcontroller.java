package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hi.ex.page.Criteria;
import edu.hi.ex.page.PageVO;
import edu.hi.ex.service.Bservice;
import edu.hi.ex.vo.Bvo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Bcontroller {
	
	@Autowired
	private Bservice service;
	
	@GetMapping("/list")
	public String llist(Model model) {
		log.info("List()..");
		
		model.addAttribute("list",service.List());
		
		return "list";
	}
	
	@GetMapping("/list2")
	public String llist2(Model model, Criteria cri) {
		log.info("List()..");
		
		model.addAttribute("list",service.getListWithPage(cri));
		
		int total = service.getTotal();
		log.info("total" + total);
		
		model.addAttribute("pageMaker",new PageVO(cri,total));
		
		return "list2";
	}
	
	@GetMapping("/content")
	public String content(Bvo bvo,Model model) {
		log.info("content()..");
		 
		int bid = bvo.getBid();
		model.addAttribute("content",service.content(bid));
		
		
		return "content";
	}
	
}
