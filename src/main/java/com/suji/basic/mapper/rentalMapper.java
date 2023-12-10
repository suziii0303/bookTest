package com.suji.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.suji.basic.vo.RentalBookVO;

@Mapper
public interface rentalMapper {
	public List<RentalBookVO> selectRentalBook(String bookCode);
	
	public int rentalBookInsert(RentalBookVO rentalVO);
}
