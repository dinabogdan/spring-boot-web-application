package com.freesoft.springboot.web.springbootwebapplication.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public Boolean validateUser(String userId, String password) {
		// user: Dina, password: Parola
		return userId.equalsIgnoreCase("Dina Bogdan") && password.equalsIgnoreCase("Parola");
	}

}
