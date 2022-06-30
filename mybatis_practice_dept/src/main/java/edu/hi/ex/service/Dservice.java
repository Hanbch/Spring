package edu.hi.ex.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import edu.hi.ex.vo.Dvo;

@Service
public interface Dservice {
	List<Dvo> getInfo();
	

}
