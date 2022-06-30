package edu.hi.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.hi.ex.vo.Rsp;
import edu.hi.ex.vo.Triangle;

@Controller
public class MainController {

	@GetMapping("/main")
	public String main(Rsp rsp){
		
		return "main";
	}
	
	@PostMapping("/result_page")
	public String result_page(Rsp rsp){
		
		return "result_page";
	}
	
	@GetMapping("/home")
	public String home(Triangle triangle){
		
		double result = triangle.getArea();
		
		System.out.println(result);
		
		return "home";
	}
	
	@GetMapping("/test")
	public String test(Rsp rsp){
		
		return "test";
	}
	
	@PostMapping("/test2")
	public String test2(Rsp rsp){
		
		return "test2";
	}
	
	

}
