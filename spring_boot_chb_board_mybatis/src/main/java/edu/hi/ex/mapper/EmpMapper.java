package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.DeptVO;
import edu.hi.ex.vo.EmpDeptVO;
import edu.hi.ex.vo.EmpVO;

@Mapper //마이바티스용 인터페이스
public interface EmpMapper{
	List<EmpVO> getEmpList();
	List<EmpDeptVO> getEmpDeptList();
	List<DeptVO> getEmpDeptList2();
		
	
}
