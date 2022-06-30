package edu.hi.ex.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
public class Rsp{
	private int rsp;
	private int com;
	
	public Rsp() {
		com =(int)(Math.random()*3);
	}
	

	public int getRsp() {
		return rsp;
	}

	public void setRsp(int rsp) {
		this.rsp = rsp;
	}

	public String toString(int rsp) {
		if(rsp == 0) 
			return "rock";
		else if(rsp == 1) 
			return "scissor";
		else
			return "paper";	
	}
	
	public String run(){
		
		if(this.rsp == (com))
			return "DRAW";
		
		if(this.rsp == 0 && com == 1) 
			return "WIN";
		else if(this.rsp == 0 && com == 3)
			return "LOSE";
		else if(this.rsp == 1 && com == 0)
			return "LOSE";
		else if(this.rsp == 1 && com == 2)
			return "WIN";
		else if(this.rsp == 2 && com == 0)
			return "WIN";
		else 
			return "LOSE";
		
	}
	
}
