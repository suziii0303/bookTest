package com.suji.basic.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suji.basic.mapper.rentalMapper;
import com.suji.basic.service.rentalService;
import com.suji.basic.vo.RentalBookVO;

@Service
public class rentalServiceImpl implements rentalService {

	@Autowired
	private rentalMapper rentalmapper;
	
	@Override
	public List<RentalBookVO> selectRentalBook(String bookCode) {
		return rentalmapper.selectRentalBook(bookCode);
	}

	@Override
	public int rentalBookInsert(RentalBookVO rentalVO) {
		return rentalmapper.rentalBookInsert(rentalVO);
	}

}
