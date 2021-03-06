package edu.hi.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"edu.hi.ex.mapper"})
@SpringBootApplication
public class Practice02Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice02Application.class, args);
	}

}
