package com.callor.car.controller.impl;

import org.springframework.stereotype.Service;

import com.callor.car.models.CarDto;
import com.callor.car.persistance.CarDao;
import com.callor.car.service.CarService;

@Service
public class CarServiceImplV1 implements CarService{

	protected final CarDao carDao;
	public CarServiceImplV1(CarDao carDao) {
		this.carDao = carDao;
	}



	@Override
	public CarDto findTachoByCarNum(String carnum) {
		return carDao.findTachoByCarNum(carnum);
	}

}
