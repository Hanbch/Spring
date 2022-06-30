package edu.hi.ex.Ucontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hi.ex.service.Uservice;

@Controller
public class controller {
	
	@Autowired
	private Uservice ser;
	
	@GetMapping("/main")
	public String main(Model model){
		
		model.addAttribute("joinList",ser.getJoinList());
		
		return "main";
	}
	
	@GetMapping("/list")
	public String list(){
		
		
		
		return "list";
	}
}
