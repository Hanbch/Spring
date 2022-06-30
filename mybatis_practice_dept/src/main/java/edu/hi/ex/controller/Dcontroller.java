package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hi.ex.service.Dservice;
import edu.hi.ex.vo.Dvo;
import lombok.Data;

@Controller
public class Dcontroller {
	
	@Autowired
	private Dservice  dservice;
	
	@GetMapping("/main")
	public String main(Model model) {
		
		model.addAttribute("info",dservice.getInfo());
		
		return "main";
	}
	
	@GetMapping("/main2")
	public String main2(Dvo dvo) {
		
		
		return "main2";
	}

}
