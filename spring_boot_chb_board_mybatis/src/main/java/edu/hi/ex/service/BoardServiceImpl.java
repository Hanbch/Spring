package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import edu.hi.ex.mapper.BoardMapper;
import edu.hi.ex.page.Criteria;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

   @Autowired
   private BoardMapper boardMapper;
   
   @Override
   public List<BoardVO> getList() {
      log.info("getList() ..");
      
      return boardMapper.getList();
   }
   
   @Override
   public BoardVO read(int bid) {
	   log.info("read()...");
	   
	   boardMapper.updateHit(bid);
	   return boardMapper.read(bid);
   }

	@Override
	public void register(BoardVO board) {
		log.info("resister()...");
		   
		 boardMapper.insert(board);
		
	}

	@Override
	public int modify(BoardVO board) {
		log.info("modify()...");
		
		return boardMapper.update(board);
	}

	@Override
	public int delete(BoardVO board) {
		log.info("delete()...");
		
		return boardMapper.delete(board);
	}

	@Override
	public void registerReply(BoardVO board) {
		log.info("registerReply()...");
		
		boardMapper.updateShape(board);
		boardMapper.insertReply(board);
	}

	@Override
	public int getTotal() {
		return boardMapper.getTotalCount();
		
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {//getList()를 파라미터 받을수있게 오버 로딩으로 
		return boardMapper.getListWithPaging(cri);
	}

	
   
}