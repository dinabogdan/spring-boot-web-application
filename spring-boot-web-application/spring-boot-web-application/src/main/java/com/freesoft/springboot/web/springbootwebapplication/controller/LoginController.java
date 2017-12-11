package com.freesoft.springboot.web.springbootwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.freesoft.springboot.web.springbootwebapplication.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		// model.addAttribute("name", name);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
		Boolean isValid = loginService.validateUser(name, password);

		if (!isValid) {
			modelMap.put("invalidCredentials", new String("Invalid Credentials"));
			return "login";
		}

		modelMap.addAttribute("name", name);
		modelMap.addAttribute("password", password);
		return "welcome";
	}

}
