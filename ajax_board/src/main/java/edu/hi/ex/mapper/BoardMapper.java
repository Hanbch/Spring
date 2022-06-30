package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getList();
	int delete(BoardVO board);
	BoardVO read(int bid);
}
