package com.suji.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.suji.basic.vo.BookVO;

@Mapper
public interface bookMapper {
	public List<BookVO> selectAllbook();
	
	public int updateBook(BookVO bookVo);
	
	public int insertBook(BookVO bookVo);
	
	public int updateBookYN(String BookCode);
	
	public int updateBookreturn(String BookCode);
}
