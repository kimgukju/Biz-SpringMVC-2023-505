package com.callor.book.services;

import java.util.List;

import com.callor.book.models.UserDto;

public interface UserService {
	
	public List<UserDto> selectAll();
	
	public int insert(UserDto userDto);
	
	public UserDto findByCode(String ucode);
	
	public int update(UserDto UserDto);
	
	public int delete(String ucode);


}
