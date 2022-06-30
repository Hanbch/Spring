package edu.hi.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.hi.ex.vo.EmpVO;

@SpringBootTest
class EmpserviceTest {
	
	@Autowired
	Empservice empService;
	
	@Test
	void testGetList() {
		List<EmpVO> empList = empService.getList();
		
		for(EmpVO empVO : empList) {
			System.out.println(empVO);
			
		}
	}

}
