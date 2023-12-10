package com.suji.basic.service;

import com.suji.basic.vo.MemberVO;

public interface memberService {
	
	public MemberVO loginCheck(MemberVO memberVO);
	
	public MemberVO memberId(String memId);
	
	public int memJoin(MemberVO memberVO);
}
