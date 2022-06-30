package edu.hi.ex.controller;

public class Cir {
	private double num;
	
	public Cir() {}
	
	public Cir(double num) {
		
		this.num = num;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	
	public double getArea() {
		return num*num*3.14;
	}
	
	
}
