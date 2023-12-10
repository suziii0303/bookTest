package com.suji.basic.service;

import java.util.List;

import com.suji.basic.vo.BookVO;


public interface bookService {
	
	public List<BookVO> selectAllBook();
	
	public int updateBook(BookVO bookVo);
	
	public int insertBook(BookVO bookVo);
	
	public int updateBookYN(String BookCode);
	public int updateBookreturn(String BookCode);
	
}
