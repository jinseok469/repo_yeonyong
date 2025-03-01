package com.mickey.demo.fapp.callNumber;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallNumberService {

	
	@Autowired
	CallNumberDao callNumberDao;
	
	public List<CallNumberDto> selectList(){
		List<CallNumberDto> callNumberDtos = new ArrayList<>();
		callNumberDtos = callNumberDao.selectList();
		
		return callNumberDtos;
	}
}
