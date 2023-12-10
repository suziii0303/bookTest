package com.suji.basic.service;

import java.util.List;

import com.suji.basic.vo.RentalBookVO;

public interface rentalService {
	public List<RentalBookVO> selectRentalBook(String bookCode);
	
	public int rentalBookInsert(RentalBookVO rentalVO);
}
