package com.bytes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.LoginRepository;
import com.bytes.repo.UserRepository;
import com.bytes.utils.Login;
import com.bytes.utils.User;

import jakarta.transaction.Transactional;

@Service
//@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
//	LoginRepository loginRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);

	}

//  add new admin
	@Override
	public void addAdmin(User admin) {
		userRepository.save(admin);
		
//		 Login login = new Login();
//		    login.setEmail(admin.getEmail());
//		    login.setPassword(admin.getPassword());
//
//		    loginRepository.save(login); // Save login details to the login table
//	   
	}

//  fetch all users
	@Override
	public List<User> getAllUsers() {
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
	}
	
//   list all the userIds	
	 public List<Integer> getUserIds() {
	        return userRepository.findAllUserIds();
}
}
