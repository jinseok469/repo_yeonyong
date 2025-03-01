package com.mickey.demo.fapp.club;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ClubDao {
	
//	mapper 에서 해당하는 쿼리와 연결 시켜주고
//	쿼리 결과를 가져옴
	public List<ClubDto> selectList();

	
	}

