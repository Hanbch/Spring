package edu.hi.ex.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.hi.ex.mapper.mapper;
import edu.hi.ex.vo.AuthVO;
import edu.hi.ex.vo.UsersVO;

@SpringBootTest
class mapperTest {

	@Autowired
	private mapper map;
	
	@Test
	void test() {
		
		for(UsersVO us: map.getJoinList()) {
			for(AuthVO au: us.getAuthList()) {
				System.out.println(au);
			}
		}
		
	}

}
