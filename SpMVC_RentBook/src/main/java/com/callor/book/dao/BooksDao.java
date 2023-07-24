package com.callor.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.book.models.BooksDto;

public interface BooksDao {
	
	@Select("SELECT * FROM TBL_BOOKS ORDER BY B_CODE ")
	public List<BooksDto> selectAll();
	
	public int insert(BooksDto booksDto);
	
	@Select(" SELECT * FROM tbl_books "
			+ " WHERE b_code = #{code} ")
	public BooksDto findByCode(String code);
	
	public int update(BooksDto booksDto);
	
	public int delete(String code);
	

}
