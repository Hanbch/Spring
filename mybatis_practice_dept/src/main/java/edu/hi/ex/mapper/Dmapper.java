package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.Dvo;

@Mapper
public interface Dmapper {
	public List<Dvo> getInfo();
	

}
