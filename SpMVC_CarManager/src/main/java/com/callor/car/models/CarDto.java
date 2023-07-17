package com.callor.car.models;

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
public class CarDto {
	private long c_seq;			//bigint
	private String c_division;	//VARCHAR(20)
	private String c_sdate;		//VARCHAR(10)
	private String c_stime;		//VARCHAR(10)
	private String c_sdistance;	//VARCHAR(20)
	private String c_adate;		//VARCHAR(10)
	private String c_atime;		//VARCHAR(10)
	private String c_adistance;	//VARCHAR(20)
	private String c_place;		//VARCHAR(20)
	private long c_cost;			//bigint

}
