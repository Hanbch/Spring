package edu.hi.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hi.ex.service.Empservice;
import edu.hi.ex.vo.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/emp") // localhost:8282/emp/~
public class EmpController{

	@Autowired
	private Empservice service;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list",service.getEmpDeptList());
		
		return "empList";
		
	}
	
	@GetMapping("/list2")
	public String list2(Model model) {
		
		
		model.addAttribute("list",service.getEmpDeptList2());
		
		return "empList";
		
	}
	
	
	
	
}
