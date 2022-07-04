package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hi.ex.service.Empservice;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController{

	@Autowired
	private Empservice service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/user/userHome")
	public String userHome() {
		return "/user/userHome";
	}
	
	@GetMapping("/admin/adminHome")
	public void adminHome() { //void면 return "/user/adminHome"
		log.info("adminHome...");
	}
	
	@GetMapping("/member/member")
	public void member() { //void면 return "/user/adminHome"
		log.info("member...");
	}
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mav,Model model) {
		
		mav.setViewName("index");
		model.addAttribute("list",service.getEmpDeptList2());
		
		return mav;
		
	}

}
