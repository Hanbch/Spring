package edu.hi.ex.controller;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.hi.ex.vo.Print;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class StudentTest {
	
	//주입 -> @Resource,@Autowired,@Inject 이 태그들의 차이점은 의존객체를 찾는 방법차이
	@Autowired
	private Student student;
	
	@Resource(name="lprint") 
	private Print print;
	
	@Test
	void testExist() {
		
		print.print("str");
	}
	
	@Test
	void testStudentObj() {
		Student student = new Student();
		student.setName("홍길동");
		student.setAge(10);
		
		
		log.info("이름 : " + student.getName() + " 나이 : " + student.getAge());
	}

}
