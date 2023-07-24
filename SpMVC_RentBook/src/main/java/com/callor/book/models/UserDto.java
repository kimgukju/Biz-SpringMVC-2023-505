package com.callor.book.models;

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
	private String u_code;		//	varchar(6)
	private String u_name;		//	varchar(125)
	private String u_tel;		//	varchar(125)
	private String u_addr;		//	varchar(125)
}
