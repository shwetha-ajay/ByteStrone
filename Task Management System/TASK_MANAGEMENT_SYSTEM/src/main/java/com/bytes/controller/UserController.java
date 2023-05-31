package com.bytes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.UserService;
import com.bytes.utils.User;


@RestController
@RequestMapping(path="api/v1/user")
public class UserController {
	
private final UserService userService;
	
	@Autowired
	public UserController (UserService userService) {
		this.userService=new UserService();
	}
	
    @PostMapping
    
	@GetMapping("/findstudents")
	public List<User>getUsers(){
		return userService.getUsers();
	}


}
