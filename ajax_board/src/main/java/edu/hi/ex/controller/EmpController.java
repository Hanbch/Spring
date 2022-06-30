package edu.hi.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hi.ex.service.BoardService;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {

	@Autowired
	private BoardService service; 
	
	@GetMapping("/list")
	public List<BoardVO> list(){
		
		return service.getList();
	}
	
	@GetMapping("/{bid}")
	public BoardVO getList(BoardVO boardVO){
		
		int bid = boardVO.getBid();
		
		return service.read(bid);
	}
	
	@DeleteMapping("/{bid}")
	public int delete(BoardVO boardVO) {
		
		return service.delete(boardVO);
	}
	
	@PutMapping("/{bid}")
	public ResponseEntity<String> rest_update(@RequestBody BoardVO boardVO) {
		
		log.info("rest_update() ..");
		ResponseEntity<String> entity = null;
		try {
			
			//int rn = service.modify(boardVO);
			//log.info("Update 넘어온 숫자:::" + rn );
			log.info("수정한 제목:::" + boardVO.getBtitle() );
	 
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);         
	     
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
		}
			return entity; 
	}
	
}
