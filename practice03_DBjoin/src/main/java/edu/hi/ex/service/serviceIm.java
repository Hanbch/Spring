package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.mapper.mapper;
import edu.hi.ex.vo.UsersVO;

@Service
public class serviceIm  implements Uservice{
	
	@Autowired
	private mapper map;
	
	@Override
	public List<UsersVO> getJoinList(){
		
		return map.getJoinList();
	}
}
