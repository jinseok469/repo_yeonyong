package com.mickey.demo.fapp.dob;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DobDao {

	public List<DobDto> selectList();
}
