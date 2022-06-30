package edu.hi.ex.service;

import java.util.List;

import edu.hi.ex.vo.DeptVO;
import edu.hi.ex.vo.EmpDeptVO;

public interface Empservice{
	List<EmpDeptVO> getEmpDeptList();
	List<DeptVO> getEmpDeptList2();
}
