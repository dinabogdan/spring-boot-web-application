package com.freesoft.springboot.web.springbootwebapplication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("exception", exception.getStackTrace());
		modelView.addObject("url", request.getRequestURL());
		modelView.setViewName("error");
		return modelView;
	}

}
