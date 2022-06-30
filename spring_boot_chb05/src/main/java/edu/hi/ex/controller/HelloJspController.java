package edu.hi.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloJspController {

		@GetMapping("/hello")
		public String hello(Circle cir) {
			return "hello";
		}
		
		@GetMapping("/mind")
		public String mind() {
			return "mind";
		}
		
		@GetMapping("/form")
		public String hello() {
			return "hello";
		}
		
		@PostMapping("/cir")
		public String cir(Circle cirVO) {
			return "cir";
		}

}
