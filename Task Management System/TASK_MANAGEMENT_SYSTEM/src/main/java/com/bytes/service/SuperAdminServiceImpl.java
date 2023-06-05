package com.bytes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.UserRepository;
import com.bytes.utils.Task;
import com.bytes.utils.User;

@Service
public class SuperAdminServiceImpl implements SuperAdminService {
	@Autowired
	UserRepository userRepository;
//	UserRoleRepository userRoleRepository;
	

//	@Override
//	public void addAdmin(User admin) {
//		User user = new User();
//		user.setUserID(admin.getUserID());
//		user.setEmail(admin.getEmail());
//        user.setName(admin.getName());
//        user.setPassword(admin.getPassword());
//      
//
//        UserRole adminRole = userRoleRepository.findById("101");
//        admin.setRoleID(adminRole);

       // userRepository.save(user);
	//	userRepository.save(admin);

	}

//	@Override
//	public List<User> getAllUsers(){
//		return userRepository.findAll();
//	}
//	
//    public void deleteUser(int userId) {
//        userRepository.deleteById(userId);
//    }

//}
