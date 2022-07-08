package edu.hi.ex.service;

import java.util.List;

import edu.hi.ex.vo.DeptVO;
import edu.hi.ex.vo.EmpDeptVO;
import edu.hi.ex.vo.EmpVO;

public interface Empservice{
	List<EmpVO> getEmpList();
	List<EmpDeptVO> getEmpDeptList();
	List<DeptVO> getEmpDeptList2();
}
