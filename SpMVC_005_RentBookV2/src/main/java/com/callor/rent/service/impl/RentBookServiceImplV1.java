package com.callor.rent.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.rent.dao.RentBookDao;
import com.callor.rent.models.RentBookVO;
import com.callor.rent.service.RentBookService;

@Service
public class RentBookServiceImplV1 implements RentBookService {
	
	protected final RentBookDao rentbookDao;
	public RentBookServiceImplV1(RentBookDao rentbookDao) {
		this.rentbookDao = rentbookDao;
	}


	@Override
	public int insert(RentBookVO rentBookVO) {
		// TODO Auto-generated method stub
		return rentbookDao.insert(rentBookVO);
	}


	@Override
	public List<RentBookVO> selectAll() {
		// TODO Auto-generated method stub
		return rentbookDao.selectAll();
	}

	

	
}
