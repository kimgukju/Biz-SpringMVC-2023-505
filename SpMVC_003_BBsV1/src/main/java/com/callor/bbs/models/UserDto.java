package com.callor.bbs.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private String username;	//	varchar(125)		PRIMARY KEY
	private String nickname;	//	varchar(125)		
	private String tel;			//	varchar(20)		


}
