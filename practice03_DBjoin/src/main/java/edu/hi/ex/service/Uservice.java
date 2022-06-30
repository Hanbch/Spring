package edu.hi.ex.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.UsersVO;


public interface Uservice {
	List<UsersVO> getJoinList(); 
}
