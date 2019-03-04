package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testDemo {
	@RequestMapping("hello")
	public String hello() {
		return "hello spring boot!!!!";
	}

}
