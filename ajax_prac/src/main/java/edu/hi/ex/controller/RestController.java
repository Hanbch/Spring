package edu.hi.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hi.ex.service.BoardService;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/boards")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public List<BoardVO> getList(){
		log.info("getList()..");
		
		return service.getList();
	}
	
	@GetMapping("/{bid}")
	public BoardVO read(BoardVO boardVO) {
		log.info("rest_content_view() ..");
		
		return service.read(boardVO.getBid());
	}
	
	@DeleteMapping("/{bid}")
	public int delete(BoardVO boardVO) {
		
		
		return service.remove(boardVO);
	}
	
	@PutMapping("/{bid}")
	public ResponseEntity<String> rest_update(@RequestBody BoardVO boardVO){
		
		log.info("rest_update() ..");
		ResponseEntity<String> entity = null;
		System.out.println(boardVO);
		try {
			int rn = service.modify(boardVO);
			log.info("Update 넘어온 숫자:::" + rn );
			
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);			
			
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return entity;		
	}
}
