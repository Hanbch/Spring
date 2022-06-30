package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hi.ex.service.Empservice;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class EmpController {
	
	@Autowired
	private Empservice empservice;
	
	@GetMapping("/emp/list")
	public String list(Model model) {
		log.info("list()..");
		
		model.addAttribute("empList",empservice.getList());
		
		return "/emp/list";
	}
	
}
