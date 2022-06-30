package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	BoardVO read(int bid); //파라미터는 url로 넘어오는 bid값을 의미
	void insert(BoardVO board); // 글쓰기
	int update(BoardVO board); // 글수정
	
}

