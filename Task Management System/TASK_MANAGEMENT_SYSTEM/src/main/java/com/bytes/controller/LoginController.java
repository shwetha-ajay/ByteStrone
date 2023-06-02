package com.bytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.LoginService;
import com.bytes.utils.Login;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="login", method=RequestMethod.POST)

//PostMapping()
//	public Login addLoginDetails(@RequestBody Login login) {
//		loginService.addLoginDetails(login);
//		return "added";
	
	@PostMapping("/loginn")
	public ResponseEntity<Login> loginUser(@RequestBody Login login){

		return loginService.loginDetails(login);

		//System.out.println((newLog.getEmail()));

		//return ResponseEntity.ok(newLog);

		}
	}

	


