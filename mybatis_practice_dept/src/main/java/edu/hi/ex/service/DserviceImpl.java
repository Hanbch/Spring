package edu.hi.ex.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.mapper.Dmapper;
import edu.hi.ex.vo.Dvo;

@Service
public class DserviceImpl implements Dservice {
	
	@Autowired
	private Dmapper dmapper;
	
	public List<Dvo> getInfo(){
		
		return dmapper.getInfo();
		
	}
	

}
