package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.mapper.BoardMapper;
import edu.hi.ex.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<BoardVO> getList(){
		return mapper.getList();
	}

	@Override
	public int delete(BoardVO boardVO) {
		
		return mapper.delete(boardVO);
	}

	@Override
	public BoardVO read(int bid) {
		
		return mapper.read(bid);
	}
	

	
}
