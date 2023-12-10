package com.suji.basic.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RentalBookVO {
	private String rentalNum;
	private Date rentalSdate;
	private Date rentalRdate;
	private String bookCode;
	private String memId;
	private String rentalSdateStr;
	private String rentalRdateStr;
}
