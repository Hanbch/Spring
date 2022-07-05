package edu.hi.ex.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.UserVO;

@Mapper //마이바티스용 인터페이스
public interface UserMapper{
	UserVO getUser(String username);
		
	@Insert("insert into users(username,password,enabled) values(#{username},#{password},#{enabled})")
	public int insertUser(UserVO userVO);
	
	@Insert("insert into AUTHORITIES (username,AUTHORITY) values(#{username},'ROLE_ADMIN')")
	public void insertAuthorities(UserVO UserVO);
	
}
