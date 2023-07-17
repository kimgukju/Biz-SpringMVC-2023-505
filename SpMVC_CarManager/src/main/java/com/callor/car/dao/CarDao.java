package com.callor.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.callor.car.models.CarDto;

public interface CarDao {
	
	public List<CarDto> findCarSelect();
	
	public CarDto findById(String seq);

	public List<CarDto> insert();
}
