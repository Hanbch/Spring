package edu.hi.ex.page;

import lombok.Data;

@Data
public class Creteria {
	private int pageNum;
	private int amount;
	
	public Creteria(){
		this(1,10);
	}
	
	public Creteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
