package com.callor.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.hello.service.UserService;
import com.callor.models.UserDto;

@Service
public class UserServiceImplV1 implements UserService{

	/*
	 * List<UserDto> userList 객체를 생성하고
	 * 임의로 생성한 3명의 User 정보를 add 하기
	 * userList를 return 하기 
	 */
	@Override
	public List<UserDto> selectAll() {
		
		List<UserDto> userList = new ArrayList<UserDto>();
		UserDto userDto = new UserDto();
		userDto.setUsername("김아무개");
		userDto.setPassword("1234");
		userDto.setName("김씨");
		userDto.setTel("010-111-1111");
		userDto.setAddr("광주광역시 북구");
		userDto.setAge(30);
		userList.add(userDto);
		
		userDto = new UserDto();
		userDto.setUsername("선아무개");
		userDto.setPassword("1234!");
		userDto.setName("선씨");
		userDto.setTel("010-222-2222");
		userDto.setAddr("광주광역시 북구");
		userDto.setAge(30);
		userList.add(userDto);
		
		userDto = new UserDto();
		userDto.setUsername("강아무개");
		userDto.setPassword("1234!@");
		userDto.setName("강씨");
		userDto.setTel("010-333-3333");
		userDto.setAddr("전라북도 전주시");
		userDto.setAge(30);
		userList.add(userDto);
		
		// field 생성자를 사용하여 데이터 추가하기
		// field 생성자를 사용하는 경우 원하는 변수에 값이
		// 정확히 저장되는지 확인하기 어렵다
		userDto = new UserDto("ddd","12345","임꺽정","010-444-4444","함경도",20);
		userList.add(userDto);
		
		return userList;
	}

	@Override
	public UserDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int input(UserDto dto) {
		
		return 0;
	}

}
