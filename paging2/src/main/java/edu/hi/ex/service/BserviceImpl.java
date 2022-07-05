package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.mapper.Bmapper;
import edu.hi.ex.page.Criteria;
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

	@Override
	public java.util.List<Bvo> getListWithPage(Criteria cri) {
		
		return mapper.getListWithPage(cri);
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return mapper.getTotal();
	}
}
