package edu.hi.ex.page;

import java.sql.Timestamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class Criteria{
	private int pageNum; //페이지 번호
	private int amount; //한페이지당 몇개의 데이터를 보여줄것인가

	public Criteria() {
		this(1,10); //생성자가 파라미터를 안받으면 this(1,10) 즉 Criteria(1,10)으로 생성; 
	}
	
	public Criteria(int pageNum,int amount) {
		
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
}
