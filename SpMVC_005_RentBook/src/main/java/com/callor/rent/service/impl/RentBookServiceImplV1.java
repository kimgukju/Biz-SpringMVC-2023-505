package com.callor.rent.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.rent.dao.RentBookDao;
import com.callor.rent.models.RentBookDto;
import com.callor.rent.service.RentBookService;

@Service
public class RentBookServiceImplV1 implements RentBookService {
	
	protected final RentBookDao rentbookDao;
	public RentBookServiceImplV1(RentBookDao rentbookDao) {
		this.rentbookDao = rentbookDao;
	}

	@Override
	public List<RentBookDto> selectAll() {
		return rentbookDao.selectAll();
	}

	@Override
	public int insert(RentBookDto dto) {
		return rentbookDao.insert(dto);
	}

	

	
}
