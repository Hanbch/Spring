package edu.hi.ex.vo;

import org.springframework.stereotype.Component;

@Component
public class Lprint implements Print {
	@Override
	public void print(String str) {
		System.out.println(str);
	};
}
