package com.freesoft.springboot.web.springbootwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freesoft.springboot.web.springbootwebapplication.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String showTodos(ModelMap modelMap) {
		modelMap.put("todos", todoService.retrieveTodos("Dina Bogdan"));
		return "list-todos";
	}
	
}
