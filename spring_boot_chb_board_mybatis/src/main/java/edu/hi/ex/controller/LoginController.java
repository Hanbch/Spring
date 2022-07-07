package edu.hi.ex.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hi.ex.service.Empservice;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController{

	@GetMapping("/login")
	public String login() {
		
		return "/login/login";
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	
	
	
	//로그인시 유저정보를 가져오는 3가지 방법
	@GetMapping("/loginInfo")
	public String loginInfo(Authentication authentication, Principal principal) {
		
		String user_id;
		
		//1.SpringContextHolder를 통하여 자져오는 방법 (일반적인 빈에서 사용 가능)
		Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
		user_id = auth.getName();
		System.out.println("유저 아이디: " + user_id);
		
		//2.authentication 객체로 가ㅏ져오는 방법(많은 정보를 가져 올 수 있다.)
		System.out.println("authentication 유저 아이디: " + authentication.getName() );
		System.out.println("authentication 권한들: " + authentication.getAuthorities() );
		
		
		//3.Principal 객체로 가져오는 방법 (가져올수 있는게 getName()정도)
		System.out.println("Principal 유저 아이디: " + principal.getName() );
		
		return "redirect:/";
	}
	
}
