package edu.hi.ex.vo;

import org.springframework.stereotype.Component;

@Component
public class Sprint implements Print{
	@Override
	public void print(String str) {
		System.out.println("Sprint");
	}
}
