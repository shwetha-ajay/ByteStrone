package com.bytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.UserService;
import com.bytes.service.UserServiceImpl;
import com.bytes.utils.User;

//    @PostMapping()
//    
//	//@GetMapping("/findUsers")
//	public List<User>getUsers(){
//		return userService.getUsers();
//	}

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	@Autowired
	UserService userService;
	UserServiceImpl userServiceImpl;

	@RequestMapping(value = "user", method = RequestMethod.POST)
	public String adderUser(@RequestBody User user) {
		System.out.println("sts error");
		userService.addUser(user);
		return "user added";
	}
//		public ResponseEntity<User> loginUser(@RequestBody User user){
//
//			return userService.addUser(user);	
//		}
}
