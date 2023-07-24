package com.callor.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.book.models.UserDto;

public interface UserDao {
	
	@Select("SELECT * FROM TBL_USERS ORDER BY U_CODE ")
	public List<UserDto> selectAll();
	
	public int insert(UserDto userDto);
	
	public UserDto findByCode(String ucode);
	
	public int update(UserDto userDto);
	
	public int delete(String ucode);

}
