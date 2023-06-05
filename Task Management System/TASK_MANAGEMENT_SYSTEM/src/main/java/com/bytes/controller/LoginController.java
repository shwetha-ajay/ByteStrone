package com.bytes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.repo.UserRepository;
import com.bytes.service.LoginService;
import com.bytes.service.UserService;
import com.bytes.utils.Login;
import com.bytes.utils.User;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {
	@Autowired
	LoginService loginService;
	 UserRepository userRepository;
	
//	@RequestMapping(value="login", method=RequestMethod.POST)

//PostMapping()
//	public Login addLoginDetails(@RequestBody Login login) {
//		loginService.addLoginDetails(login);
//		return "added";
	
//	@PostMapping()
	
//	@GetMapping("/fetchUsers")
//
//	public List<User> fetchUsers(){
//
//	System.out.println("Hello");
//
//	return userRepository.findAll();
//	}
//	
	 @PostMapping("/login")
	public ResponseEntity<Login> loginUser(@RequestBody Login login){

		return loginService.loginDetails(login);

		//System.out.println((newLog.getEmail()));

		//return ResponseEntity.ok(newLog);

		}
	}

	


