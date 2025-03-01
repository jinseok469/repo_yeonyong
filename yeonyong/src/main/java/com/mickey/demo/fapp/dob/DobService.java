package com.mickey.demo.fapp.dob;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DobService {

	@Autowired
	DobDao dobDao;

	public List<DobDto> selectList() {
		List<DobDto> dobDtos = new ArrayList<>();
		dobDtos = dobDao.selectList();
		return dobDtos;
	}
}
