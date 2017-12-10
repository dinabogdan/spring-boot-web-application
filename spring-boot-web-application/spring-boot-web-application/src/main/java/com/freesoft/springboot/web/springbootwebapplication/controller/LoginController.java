package com.freesoft.springboot.web.springbootwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		// model.addAttribute("name", name);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		return "welcome";
	}

}
