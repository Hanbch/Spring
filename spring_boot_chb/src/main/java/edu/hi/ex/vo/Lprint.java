package edu.hi.ex.vo;

import org.springframework.stereotype.Component;

@Component("lprint")
public class Lprint implements Print {
	@Override
	public void print(String str) {
		System.out.println("Lprint");
	};
}
