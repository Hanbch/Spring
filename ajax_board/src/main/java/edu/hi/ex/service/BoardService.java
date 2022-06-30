package edu.hi.ex.service;

import java.util.List;

import edu.hi.ex.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	int delete(BoardVO boardVO);
	BoardVO read(int bid);
}
