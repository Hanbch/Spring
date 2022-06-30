package edu.hi.ex.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.mapper.Bmapper;
import edu.hi.ex.vo.Bvo;

@Service
public class BserviceImpl implements Bservice {
	
	@Autowired
	private Bmapper mapper;
	
	public List<Bvo> List(){
		
		return mapper.List();
	}

	@Override
	public Bvo content(int bid) {
		
		return mapper.content(bid);
	}
}
