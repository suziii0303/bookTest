package com.suji.basic.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suji.basic.mapper.bookMapper;
import com.suji.basic.service.bookService;
import com.suji.basic.vo.BookVO;

@Service
public class bookServiceImpl implements bookService {

	
	@Autowired
	private bookMapper bookmapper;
	
	@Override
	public List<BookVO> selectAllBook() {
		return bookmapper.selectAllbook();
	}

	@Override
	public int updateBook(BookVO bookVo) {
		return bookmapper.updateBook(bookVo);
	}

	@Override
	public int insertBook(BookVO bookVo) {
		return bookmapper.insertBook(bookVo);
	}

	@Override
	public int updateBookYN(String BookCode) {
		return bookmapper.updateBookYN(BookCode);
	}

	@Override
	public int updateBookreturn(String BookCode) {
		return bookmapper.updateBookreturn(BookCode);
	}
	
	

}
