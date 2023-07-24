package com.callor.book.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.callor.book.dao.BooksDao;
import com.callor.book.models.BooksDto;
import com.callor.book.services.BooksService;

@Service
public class BooksServiceImplV1 implements BooksService{
	
	protected final BooksDao booksDao;	
	public BooksServiceImplV1(BooksDao booksDao) {
		this.booksDao = booksDao;
	}
	
	@Override
	public List<BooksDto> selectAll() {
		return booksDao.selectAll();
	}
	
	@Override
	public int insert(BooksDto booksDto) {
		
		return booksDao.insert(booksDto);
	}

	@Transactional
	@Override
	public BooksDto findByCode(String code) {
		BooksDto booksDto = booksDao.findByCode(code);
		
		return booksDto;
	}

	@Override
	public int update(BooksDto booksDto) {
		int result = booksDao.update(booksDto);
		return result;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
