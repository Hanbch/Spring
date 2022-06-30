package edu.hi.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hi.ex.service.BoardService;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

//1.제이슨이로 서비스하기

@Slf4j
@RequestMapping("/boards")
@RestController
public class RestBoardController{
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public List<BoardVO> list(Model model){
		log.info("list()..");
		
		return service.getList();
	}
	
	@GetMapping("/{bid}")//변수화해서 url에 입력
	public BoardVO rest_content_view(BoardVO boardVO){
		log.info("rest_content_view()..");
		
		return service.read(boardVO.getBid());
	}
	
	@DeleteMapping("/{bid}")
	public int rest_delete(BoardVO boardVO){
		log.info("rest_delete()..");
		
		int rn = service.delete(boardVO);
		return rn;
	}

	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@PutMapping("/{bid}")
	   public ResponseEntity<String> rest_update(@RequestBody BoardVO boardVO){
	      
	      log.info("rest_update() ..");
	      ResponseEntity<String> entity = null;
	      try {
	         int rn = service.modify(boardVO);
	         log.info("Update 넘어온 숫자:::" + rn );
	         log.info("수정한 제목:::" + boardVO.getBtitle() );
	         
	         entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);         
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	         entity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
	      }
	      
	      return entity;      
	   }
	
	@PostMapping("/")
	public ResponseEntity<String> rest_write(@RequestBody BoardVO boardVO){
	      
	      log.info("rest_write() ..");
	      
	      ResponseEntity<String> entity = null;
	      
	      try {
	    	  
	        service.register(boardVO);
	         
	         entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);         
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	         entity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
	      }
	      
	      return entity;      
	   }
	  

}
