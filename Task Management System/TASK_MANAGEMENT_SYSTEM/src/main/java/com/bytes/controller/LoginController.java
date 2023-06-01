package com.bytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.LoginService;
import com.bytes.utils.Login;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	@PostMapping
	public String addLoginDetails(@RequestBody Login login) {
		loginService.addLoginDetails(login);
		return "details added";
	}

	

}
