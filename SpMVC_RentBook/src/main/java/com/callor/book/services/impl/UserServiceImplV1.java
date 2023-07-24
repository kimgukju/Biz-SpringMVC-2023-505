package com.callor.book.services.impl;

import java.util.List;

import com.callor.book.dao.UserDao;
import com.callor.book.models.UserDto;
import com.callor.book.services.UserService;

public class UserServiceImplV1 implements UserService{

	protected final UserDao userDao;
	public UserServiceImplV1(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<UserDto> selectAll() {
		
		return userDao.selectAll();
	}

	@Override
	public int insert(UserDto userDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDto findByCode(String ucode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(UserDto UserDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String ucode) {
		// TODO Auto-generated method stub
		return 0;
	}

}
