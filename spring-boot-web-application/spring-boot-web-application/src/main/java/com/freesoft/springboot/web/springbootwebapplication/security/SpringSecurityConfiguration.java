package com.freesoft.springboot.web.springbootwebapplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	// Create user - Dina Bogdan/Parola
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder authenticationManager) throws Exception {
		authenticationManager.inMemoryAuthentication().withUser("Dina Bogdan").password("Parola").roles("USER",
				"ADMIN");
	}

	// Create a LoginForm
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/", "/*todo*/**")
				.access("hasRole('USER')").and().formLogin();
	}
}
