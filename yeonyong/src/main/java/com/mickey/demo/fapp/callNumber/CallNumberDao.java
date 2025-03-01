package com.mickey.demo.fapp.callNumber;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CallNumberDao {

	public List<CallNumberDto> selectList();
	
}
