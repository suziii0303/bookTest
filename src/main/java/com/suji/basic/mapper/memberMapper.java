package com.suji.basic.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.suji.basic.vo.MemberVO;


@Mapper
public interface memberMapper {
	public MemberVO loginCheck(MemberVO memberVO);
	
	public MemberVO memberId(String memId);
	
	public int memJoin(MemberVO memberVO);
}
