package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.hi.ex.mapper.BMapper;
import edu.hi.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	private BMapper bmapper;
	
	public List<BoardVO> getList(){
		log.info("getList()...");
		
		return  bmapper.getList();
	}
	
}
