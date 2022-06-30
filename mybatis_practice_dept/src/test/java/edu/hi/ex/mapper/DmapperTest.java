package edu.hi.ex.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.hi.ex.vo.Dvo;
@SpringBootTest
class DmapperTest {
	
	@Autowired
	private Dmapper dmapper;
	
	@Test
	void test() {
		List<Dvo> info = dmapper.getInfo();
		
		for(Dvo e : info) {
			System.out.println(e);
		}
	}

}
