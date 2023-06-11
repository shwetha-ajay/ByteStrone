package com.bytes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.UserService;
import com.bytes.utils.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/superAdmin")
public class SuperAdminController {

	@Autowired
	UserService userService;

	// add new admin
	@PostMapping("/addAdmin")
	public ResponseEntity<Integer> addAdmin(@RequestBody User admin) {
		userService.addAdmin(admin);
		return ResponseEntity.ok(200);
	}

	// view admin list
	@GetMapping("/viewAdmin")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// delete admin
	@DeleteMapping("deleteAdmin/{userId}")
	public ResponseEntity<Integer> deleteAdmin(@PathVariable int userId) {
		userService.deleteAdmin(userId);
		return ResponseEntity.ok(200);
	}

}
