package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.hi.ex.service.Empservice;

@RestController
public class HomeController{

	@Autowired
	private Empservice service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mav,Model model) {
		
		mav.setViewName("index");
		model.addAttribute("list",service.getEmpDeptList2());
		
		return mav;
		
	}

}
