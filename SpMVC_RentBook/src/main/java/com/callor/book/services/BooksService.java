package com.callor.book.services;

import java.util.List;

import com.callor.book.models.BooksDto;

public interface BooksService {
	
	public List<BooksDto> selectAll();
	
	public int insert(BooksDto booksDto);
	
	public BooksDto findByCode(String code);
	
	public int update(BooksDto booksDto);
	
	public int delete(String code);

}
