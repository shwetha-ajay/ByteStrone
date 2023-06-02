package com.bytes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.UserRepository;
import com.bytes.utils.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserRepository userRepository;
	
	
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
}