package com.suji.basic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suji.basic.service.memberService;
import com.suji.basic.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class memberController {
	@Autowired
	private memberService memservice;
	
	@PostMapping(value = "/login" ,produces = "application/json;charset=utf-8")
	// 문제에 로그인 기능 따로 언급 없음
	// 회원은 세션으로 값을 가지고 있을 필요가 없고 
	// 관리자 계정을 임의로 만들어서 회원에게 id를 받아 도서대출 등록을 직원이 해준다 ?
	// 만약 회원이 직접 로그인 해서 도서를 대출하려고 하면 id를 담은 세션 필요함
	
	public MemberVO loginCheck(@RequestBody MemberVO memberVO) {
		/*
		 * MemberVO memId = memberVO.getMemId(); String memPass = memberVO.getMemPass();
		 */
		String username = memberVO.getMemId();
   
        MemberVO result = memservice.loginCheck(memberVO);
        log.info("왜이랴 "+result);
        
        if(result == null) {
        	return null;
        }
        if(result.getMemPass().equals(result.getMemPass())){
        	return result;
        }else{
        	
        	return null;
        }
		/*
		 * if (result == 1) { // 로그인 성공 log.info("성공 1 ");
		 * 
		 * } else { // 로그인 실패 log.info("실패 0 "); }
		 */
        
    }
	
	@GetMapping(value = "/selectMemId/{memId}" ,produces = "application/json;charset=utf-8")
	public MemberVO memberId(@PathVariable String memId) {
		return memservice.memberId(memId);
	}

	@PostMapping(value = "/memJoin" ,produces = "application/json;charset=utf-8")
	public int memJoin(@RequestBody MemberVO memberVO) {
		log.info("확인해보장 -->" +memberVO);
		return memservice.memJoin(memberVO);
	}
}
