package edu.hi.ex.page;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.Data;

@Data
public class PageVO {
	
	private int startPage;
	private int endPage;
	private int total;
	private boolean prev, next;
	private Criteria cri;
	
	public PageVO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil((cri.getPageNum())/10.0))*10;
		this.startPage = endPage - 9;
		
		int realEnd = (int)Math.ceil((total/cri.getAmount())*1.0);
		
		if(realEnd <= this.endPage)
			this.endPage = realEnd ;
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
		
		
		
		
	}
	
	public String makeQuery(int page) {
		UriComponents uriComponentsBuilder = UriComponentsBuilder.newInstance()
				.queryParam("pageNum", page) // pageNum =  3
				.queryParam("amount", cri.getAmount()) // pageNum=3&amount=10
				.build(); // ?pageNum=3&amount=10
			return uriComponentsBuilder.toUriString(); // ?pageNum=3&amount=10 리턴
	      
      
	}
	
}
