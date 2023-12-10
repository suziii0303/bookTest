package com.suji.basic.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suji.basic.mapper.memberMapper;
import com.suji.basic.service.memberService;
import com.suji.basic.vo.MemberVO;

@Service
public class memberServiceImpl implements memberService{
	
	@Autowired
	private memberMapper memMapper;
	@Override
	public MemberVO loginCheck(MemberVO memberVO) {
		 //System.out.println(memId);
		 MemberVO result = memMapper.loginCheck(memberVO);
		 System.out.println("쿼리 실행 결과: " + result);
		 return result;
		}
	@Override
	public MemberVO memberId(String memId) {
		return memMapper.memberId(memId);
	}
	@Override
	public int memJoin(MemberVO memberVO) {
		return memMapper.memJoin(memberVO);
	}

}
