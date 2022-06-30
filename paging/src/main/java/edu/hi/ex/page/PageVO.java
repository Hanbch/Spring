package edu.hi.ex.page;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class PageVO {
	private int startPage;
	private int endPage;
	private int total;
	
	private boolean prev,next;
	private Criteria cri;
	
	PageVO(Criteria cri, int total){
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0))*10;
		this.startPage = endPage -9;
		
		int realEnd = 
		
		
	}
	
	
	
	
}
