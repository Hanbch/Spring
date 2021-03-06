package edu.hi.ex.page;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class PageVO {
	private int startPage;
	private int endPage;
	private boolean prev,next;
	
	private int total;
	private Creteria cri;
	
	public PageVO(Creteria cri , int total){
		this.cri =cri;
		this.total = total;
		
		this.endPage = (int)Math.ceil(cri.getPageNum()/10.0)*10;
		this.startPage = this.endPage - 9;
		
		 int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
	
	      if (realEnd <= this.endPage) {
	         this.endPage = realEnd;
	     }
		
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
