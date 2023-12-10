package com.suji.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suji.basic.service.bookService;
import com.suji.basic.service.rentalService;
import com.suji.basic.vo.RentalBookVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class rentalController {
	
	@Autowired
	private rentalService rentalservice;
	@Autowired
	private bookService bookservice;
	
	@GetMapping(value ="/rentalBookSelect", produces = "application/json;charset=utf-8")
	public List<RentalBookVO> selectRentalBook(@RequestParam String bookCode){
		
		log.info("확인" +bookCode);
		return rentalservice.selectRentalBook(bookCode);
	}
	
	@PostMapping(value ="/rentalBookInster", produces = "application/json;charset=utf-8")
	public int rentalBookInsert(@RequestBody RentalBookVO rentalVO) {
		String bookCode = rentalVO.getBookCode();
		log.info(bookCode);
		
		int result = bookservice.updateBookYN(bookCode);
		int result2 = rentalservice.rentalBookInsert(rentalVO);
		log.info("등록 되나용 ==>" +rentalVO);

	    
	    return result + result2;
	}
}
