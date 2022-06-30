package edu.hi.ex.service;

import java.util.List;

import edu.hi.ex.page.Criteria;
import edu.hi.ex.vo.BoardVO;

public interface BoardService{
	
	List<BoardVO> getList();//리스트 메서드
	BoardVO read (int bid);//글쓰기 메서드
	void register(BoardVO board);//글쓰기
	int modify(BoardVO board);//글수정
	int delete(BoardVO board);//글삭제
	void registerReply(BoardVO board);//답글쓰기
	//int updateHit(BoardVO board);//조회수
	
	//paging
	int getTotal();
	List<BoardVO> getList(Criteria cri);//리스트 메서드
}
