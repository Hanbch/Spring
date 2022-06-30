package edu.hi.ex.vo;

import lombok.Data;

/*
이름     널?       유형           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
*/

@Data
public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptVO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	
	
}
