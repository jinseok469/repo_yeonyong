package com.mickey.demo.fapp.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao {

	public List<AddressDto> selectList();
}
