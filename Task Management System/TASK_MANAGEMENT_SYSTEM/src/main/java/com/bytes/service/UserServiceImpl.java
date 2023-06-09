package com.bytes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bytes.repo.UserRepository;
import com.bytes.utils.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserRepository userRepository;
	
//	@Autowired
//	UserRoleRepository userRoleRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
//		System.out.println("new error");
	}
		
//		User adminRole = roleRepository.findByName("admin");
//        if (adminRole == null) {
//            throw new RuntimeException("Admin role not found"); // Handle appropriately
//        }
	
//  add new admin
    @Override
    public void addAdmin(User admin) {
	userRepository.save(admin);	
    }
    
//  fetch all users    
    @Override
    public List<User> getAllUsers(){
	   return userRepository.findAll();
    }
    
//  delete admin    
    @Override
    public void deleteAdmin(int userId) {
	userRepository.deleteById(userId);	
    }

//  fetch userid by email    
    public int getUserIdByEmail(String email) {
    User user = userRepository.findByEmail(email);
    if (user != null) {
        return user.getUserID();
    } else {
        throw new IllegalArgumentException("User not found");
    }
}}


//public User getCurrentUser() {
//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//if (authentication == null || !authentication.isAuthenticated()) {
//  throw new AuthenticationException("User not authenticated");
//}
//
//Object principal = authentication.getPrincipal();
//if (principal instanceof User) {
//  return (User) principal;
//}
//
//throw new IllegalStateException("User details not available");
//}