package edu.hi.ex.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.Bvo;

@Mapper
public interface Bmapper {
	public List<Bvo> List();
	Bvo content(int bid);
}
