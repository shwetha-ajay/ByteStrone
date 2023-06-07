package com.bytes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.UserRepository;
import com.bytes.utils.Task;
import com.bytes.utils.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserRepository userRepository;
//	RoleRepository roleRepository;
	
//	@Autowired
//	UserRoleRepository userRoleRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
//		System.out.println("new error");
		
		
//		User adminRole = roleRepository.findByName("admin");
//        if (adminRole == null) {
//            throw new RuntimeException("Admin role not found"); // Handle appropriately
//        }
	
	}
//@Override
//      public void addAdmin(int userId,String password,int roleId,String name,String email) {
//	        userRepository.AddAdmin(userId, password, roleId, name, email);
//	
//}
@Override
public void addAdmin(User admin) {
	userRepository.save(admin);
	    
	
}
@Override
public List<User> getAllUsers(){
	return userRepository.findAll();
}
@Override
public void deleteAdmin(int userId) {
	 userRepository.deleteById(userId);
	
}

  
}