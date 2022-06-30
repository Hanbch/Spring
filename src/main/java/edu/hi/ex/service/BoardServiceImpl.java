package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.mapper.BoardMapper;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	//글전체목록
	@Override
	public List<BoardVO> getList() {
		log.info("getList() ..");
		
		return boardMapper.getList();
	}

	//선택한 글보기
	@Override
	public BoardVO read(int bid) {
		log.info("read() ..");
		
		return boardMapper.read(bid);
	}

	@Override
	public void register(BoardVO board) {
		log.info("register() ..");		
		 boardMapper.insert(board);		
	}

	@Override
	public int modify(BoardVO board) {
		log.info("modify() ..");		
		
		return  boardMapper.update(board);	
	}
	
}
