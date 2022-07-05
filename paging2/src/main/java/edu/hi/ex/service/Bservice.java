package edu.hi.ex.service;

import java.util.List;

import edu.hi.ex.page.Criteria;
import edu.hi.ex.vo.Bvo;

public interface Bservice {
	public List<Bvo> List();
	Bvo content(int bid);
	List<Bvo> getListWithPage(Criteria cri);
	int getTotal();
}
