package com.callor.rent.service;

import java.util.List;

import com.callor.rent.models.RentBookDto;

public interface RentBookService {

	public List<RentBookDto> selectAll();

	public int insert(RentBookDto dto);
	
	

}
