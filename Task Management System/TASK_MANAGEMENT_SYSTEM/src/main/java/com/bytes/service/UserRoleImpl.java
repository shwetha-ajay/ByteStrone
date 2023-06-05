package com.bytes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.repo.UserRoleRepository;
import com.bytes.utils.UserRole;

@Service
public class UserRoleImpl implements UserRoleService {
	

	@Autowired
    UserRoleRepository userRoleRepository;
	
	
	
	@Override
	public void addUserRole(UserRole role) {
		userRoleRepository.save(role);
		
	}
    
}
