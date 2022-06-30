package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hi.ex.service.Deptservice;
import edu.hi.ex.service.Empservice;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DeptController {
	
	@Autowired
	private Deptservice deptservice;
	
	@GetMapping("/emp/dept")
	public String list(Model model) {
		log.info("list()..");
		System.out.println("model : " + model);
		model.addAttribute("deptList",deptservice.getList());
		
		return "/emp/dept";
	}
	
}
