package edu.hi.ex.vo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@Data
public class Triangle {
	
	private int width;
	private int height;
	
	public double getArea() {
		return (width*height)/2;
	}

}
