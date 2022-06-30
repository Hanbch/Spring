package edu.hi.ex.service;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import edu.hi.ex.mapper.Bmapper;
import edu.hi.ex.vo.Bvo;

public interface Bservice {
	public List<Bvo> List();
	Bvo content(int bid);
}
