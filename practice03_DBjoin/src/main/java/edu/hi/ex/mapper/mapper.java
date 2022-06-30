package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.UsersVO;

@Mapper
public interface mapper {
	List<UsersVO> getJoinList(); 
}
