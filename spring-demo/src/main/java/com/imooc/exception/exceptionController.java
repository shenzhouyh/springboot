package com.imooc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class exceptionController {
	@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e) {
		e.printStackTrace();
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.addObject("url",	request.getRequestURI());
		mv.setViewName("my");
		System.out.println("捕获异常~~~");
		return mv;
	}
}
