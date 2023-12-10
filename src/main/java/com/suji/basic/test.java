package com.suji.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	@RequestMapping("/test")
	private String test() {
		return "안녕이다 임마 " ;
		
	}
}
