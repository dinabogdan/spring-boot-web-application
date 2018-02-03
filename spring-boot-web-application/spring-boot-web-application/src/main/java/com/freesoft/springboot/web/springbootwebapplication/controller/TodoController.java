package com.freesoft.springboot.web.springbootwebapplication.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.freesoft.springboot.web.springbootwebapplication.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap modelMap) {
		String name = (String) modelMap.get("name");
		modelMap.put("todos", todoService.retrieveTodos(name));
		return "list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		return "todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String description) {
		todoService.addTodo((String) model.get("name"), description, new Date(), false);
		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteTodo(id);
		return "redirect:/list-todos";
	}

}
