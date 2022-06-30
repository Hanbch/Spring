package edu.hi.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloJspController {

		@GetMapping("/hello")
		public String hello() {
			return "hello";
		}
		
		@GetMapping("/mind")
		public String mind() {
			return "mind";
		}
		
		@GetMapping("/lucky")
		public void lucky() {
			
		}
		
		@RequestMapping("/user")
		   public String user(HttpServletRequest request,Model model) {
		      
		      String id = request.getParameter("id");
		      String pw = request.getParameter("pw");
		      
		      model.addAttribute("id", id);
		      model.addAttribute("pw", pw);
		      
		      
		      System.out.println("아이디" + id);
		      System.out.println("패스워드" + pw);
		      
		      
		      
		      return "user";
		   }

		
		@RequestMapping("/user2")
		public String user2(@RequestParam("id") String id,
							@RequestParam("pw") String pw,
							Model model) {
			
			model.addAttribute("id",id);
			model.addAttribute("pw",pw);
			
			return "user";
		}
		
		@GetMapping("/form")
		public String grade() {
			return "grade";
		}
		@GetMapping("/form2")
		public String circle() {
			return "circle";
		}
		
		@GetMapping("/gradeOK")
		public String gradeOK() {
			return "gradeOK";
		}
		
		@GetMapping("/gradeNG")
		public String gradeNG() {
			return "gradeNG";
		}
		
		@PostMapping("/circle")
		public String circle(CircleVO circleVO) {
			
			//System.out.println(cirVO.getRad());
			
			return "circle";
		}
		
		@PostMapping("/grade")
		public String grade(GradeVo gradeVo) {
			
			//double avg = gradeVo.getAvg();
			//if(avg >= 90) {
				return "grade";
			//}
			
			//return "redirect:gradeNG";
		}
		
		@GetMapping("/grade2")
		public String grade2() {
			return "grade2";
		}
		
		@PostMapping("/grade2")
		public String grade2(TriangleVo triVo) {
			
			double result = triVo.getArea();
			System.out.println("result : " + result);
			return "grade2";
			
		}
		
		
			
}
