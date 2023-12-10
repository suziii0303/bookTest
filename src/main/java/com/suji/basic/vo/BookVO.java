package com.suji.basic.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookVO {
	private String bookCode;
	private String bookName;
	private Date bookDate;
	private String bookDateStr;
	private String bookWriter;
	private String bookYn;
	private String bookPlot;
	

}
