package edu.hi.ex.vo;

import org.springframework.stereotype.Component;

@Component("sprint")
public class Sprint implements Print{
	@Override
	public void print(String str) {
		System.out.println("Sprint");
	}
}
