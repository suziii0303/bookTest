package com.suji.basic.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {
	private String memId;
	private String memPass;
	private String memName;
	private String memTall;
	private String memAdd;
	private String memAuth;
}
