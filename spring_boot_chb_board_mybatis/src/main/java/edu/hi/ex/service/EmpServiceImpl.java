package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import edu.hi.ex.mapper.EmpMapper;
import edu.hi.ex.page.Criteria;
import edu.hi.ex.vo.BoardVO;
import edu.hi.ex.vo.DeptVO;
import edu.hi.ex.vo.EmpDeptVO;
import edu.hi.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmpServiceImpl implements Empservice{

   @Autowired
   private EmpMapper empMapper;

	@Override
	public List<EmpDeptVO> getEmpDeptList() {
		
		log.info("getEmpDeptList()...");
		
		return empMapper.getEmpDeptList();
}

	@Override
	public List<DeptVO> getEmpDeptList2() {
		
		return empMapper.getEmpDeptList2();
	}

	@Override
	public List<EmpVO> getEmpList() {
		log.info("getEmpList..");
		return empMapper.getEmpList();
	}

   
	
   
}