package edu.hi.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hi.ex.Add;
import edu.hi.ex.service.Service;

import lombok.Data;

@Controller
public class BController {
	
	@Autowired
	private Service service;
	
	@GetMapping("/board")
	public String board(Model model) {
		
		model.addAttribute("listGet",service.getList());
		
		return "board";
		
	}
	
	
	
	@GetMapping("/home")
	public String home() {
		
		//model.addAttribute("add",add);
		return "home";
	}
	
	
}
