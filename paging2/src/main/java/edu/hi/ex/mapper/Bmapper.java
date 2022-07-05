package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.page.Criteria;
import edu.hi.ex.vo.Bvo;

@Mapper
public interface Bmapper {
	public List<Bvo> List();
	Bvo content(int bid);
	
	int getTotal();
	
	public List<Bvo> getListWithPage(Criteria cri);
}
