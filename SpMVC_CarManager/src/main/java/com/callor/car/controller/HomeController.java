package com.callor.car.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.car.dao.CarDao;
import com.callor.car.models.CarDto;

import lombok.extern.slf4j.Slf4j;

@Controller
public class HomeController {
	
	private final CarDao carDao;
	public HomeController(CarDao carDao) {
		this.carDao = carDao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		List<CarDto> carList = carDao.findCarSelect();
		model.addAttribute("CAR_LIST",carList);
		return "home";
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String insert(CarDto carDto, Model model) {
		List<CarDto> carList = carDao.insert();
		model.addAttribute("CAR_LIST",carList);
		return "home";
	}
	
	
}
