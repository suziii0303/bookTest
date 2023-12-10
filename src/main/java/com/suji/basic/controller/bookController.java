package com.suji.basic.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suji.basic.service.bookService;
import com.suji.basic.vo.BookVO;
import com.suji.basic.vo.RentalBookVO;

import lombok.extern.slf4j.Slf4j;




@Slf4j
@RestController
@RequestMapping("/api")
public class bookController {
	@Autowired
	
	private bookService bookservice;
	
	@GetMapping(value = "/books", produces = "application/json;charset=utf-8")
	private List<BookVO> selectAllbook() {
		
		List<BookVO> result = bookservice.selectAllBook();
		
		
		
		log.info("result"+result);

		return  bookservice.selectAllBook() ;
		
	}
	
	@PutMapping(value = "/updateBook", produces = "application/json;charset=utf-8")
	private int updateBook(@RequestBody BookVO bookVo) {
		 log.info("=======================>>>>"+bookVo);
		 return  bookservice.updateBook(bookVo);
	}
	
	@PostMapping(value="/insertBook", produces = "application/json;charset=utf-8")
	private int insertBook(@RequestBody BookVO bookVo) {
		
		log.info("bookVo" + bookVo);
		return bookservice.insertBook(bookVo);
	}
	
	@PutMapping(value ="/rentalBook/{bookCode}", produces = "application/json;charset=utf-8")
	public int rentalBookInsert(@PathVariable  String bookCode) {
		log.info("================>" +bookCode);
	    return bookservice.updateBookreturn(bookCode);
	}
}
