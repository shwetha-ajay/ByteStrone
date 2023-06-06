package com.bytes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.service.UserService;
import com.bytes.utils.User;
@RestController
@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping("/superAdmin")
public class SuperAdminController {

    @Autowired
    UserService userService;

//    public SuperAdminController(SuperAdminService superAdminService) {
//    this.superAdminService = superAdminService;
//}

//    @PostMapping("/users/addAdmin")
//    public ResponseEntity<?> addAdmin(@RequestBody int userId,@RequestBody String password,@RequestBody int roleId,@RequestBody String name,@RequestBody String email) {
//         userService.addAdmin(userId, password, roleId, name, email);
//         return ResponseEntity.ok("Admin created successfully");
//}

    //add new admin
    @PostMapping("/addAdmin")
    public String addAdmin(@RequestBody User admin) {
    	userService.addAdmin(admin);
    	return "new admin added";
    	   	
    }
    
    //view admin list
    @GetMapping("/viewAdmin")
	public List<User>getAllUsers(){
		return userService.getAllUsers();
	}
    
//	
//    //delete admin
//		  @DeleteMapping("deleteAdmin/{userId}")
//		    public ResponseEntity<String> deleteAdmin(@PathVariable int userId) {
//		        userService.deleteAdmin(userId);
//		        return ResponseEntity.ok("admin deleted");
//		    }

		}
	
    
    

