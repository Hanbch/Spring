package edu.hi.ex.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.hi.ex.vo.DeptVO;
import edu.hi.ex.vo.EmpVO;

@SpringBootTest
class EmpMapperTest {
	
	@Autowired
	private EmpMapper mapper;
	
	
//	void testGetEmpDeptList() {
//		assertNotNull(mapper);
//		System.out.println(mapper.getEmpDeptList());
//		
//		for(EmpDeptVO vo : mapper.getEmpDeptList()) {
//			System.out.println(vo);
//		}
//	
//	}
	@Test
	void testGetEmpDeptList2() {
		assertNotNull(mapper);
		
		System.out.println(mapper.getEmpDeptList2());
		
		for(DeptVO vo : mapper.getEmpDeptList2()) {
			for(EmpVO emp:vo.getEmpList()) {
				System.out.println(emp);
			}
		}
	}

}
