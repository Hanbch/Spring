package edu.hi.ex.controller;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Data;

@Component//객체생성해서 ioc컨테이너에 넣어라
@Data
public class Student {
	
	@Value("Hong") // private int name=Hong; 초기화
	private String name;
	
	@Value("30") // private int age=30; 초기화
	private int age;
	
	
}
