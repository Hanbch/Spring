package edu.hi.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hi.ex.repository.EmpRepository;
import edu.hi.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Empservice {

   /*
      객체 주입을 위한 annotation = @Autowired
   */
   
   @Autowired
   private EmpRepository empRepo;
   
   public List<EmpVO> getList(){
      log.info("getList()");//디버깅문구
      
      return empRepo.selectList();      
   }

}