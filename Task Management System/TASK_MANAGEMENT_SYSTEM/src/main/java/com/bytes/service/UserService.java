package com.bytes.service;

import java.util.List;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

import com.bytes.utils.Task;
import com.bytes.utils.User;

public interface UserService {

	public void addUser(User user);
//	public void addAdmin(int userId,String password,int roleId,String name,String email);
	public void addAdmin(User admin);
	public List<User> getAllUsers();
	public void deleteAdmin(int userId);
	public static User getCurrentUser(Authentication authentication) {
		
		return null;
	}
	
	
	


}
