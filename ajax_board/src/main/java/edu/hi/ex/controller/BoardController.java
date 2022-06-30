package edu.hi.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hi.ex.service.BoardService;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/boards")
@RestController
public class BoardController {

	@Autowired
	private BoardService service; 
	
	@GetMapping("/data")
	public List<BoardVO> data() {
		
		return service.getList();
	}
	
	@GetMapping("/{bid}")//변수화해서 url에 입력
	public BoardVO rest_content_view(BoardVO boardVO){
		log.info("rest_content_view()..");
		
		return service.read(boardVO.getBid());
	}
	
	@DeleteMapping("/{bid}")
	public int delete(BoardVO boardVO) {
		
		
		return service.delete(boardVO);
	}
	
	
	
	
}
