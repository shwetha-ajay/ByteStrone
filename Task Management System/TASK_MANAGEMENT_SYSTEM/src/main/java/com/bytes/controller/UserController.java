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

//import com.bytes.service.UserRoleService;
import com.bytes.service.UserService;
import com.bytes.utils.Login;
import com.bytes.utils.User;
import com.bytes.utils.UserRole;


//    @PostMapping()
//    
//	//@GetMapping("/findUsers")
//	public List<User>getUsers(){
//		return userService.getUsers();
//	}

@CrossOrigin(origins="http://localhost:4200")
	@RestController
	public class UserController {
		@Autowired
		UserService userService;
		
		@RequestMapping(value="user", method=RequestMethod.POST)
		public String adderUser(@RequestBody User user) {
			System.out.println("sts error");
			userService.addUser(user);
			return "user added";
		}
//		public ResponseEntity<User> loginUser(@RequestBody User user){
//
//			return userService.addUser(user);
//			
		}



