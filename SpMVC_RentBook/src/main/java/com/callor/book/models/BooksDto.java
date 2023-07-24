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
public class BooksDto {
	private String b_code; 		//	VARCHAR(6)	
	private String b_name; 		//	VARCHAR(125)	
	private String b_auther;	//	VARCHAR(125)	
	private String b_comp;		//	VARCHAR(125)	
	private long b_year; 		//	INT	
	private long b_iprice;	    //	INT	
	private long b_rprice; 		//	INT	

}
