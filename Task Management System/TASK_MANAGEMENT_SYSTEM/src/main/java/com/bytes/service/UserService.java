package com.bytes.service;

import java.util.List;

import com.bytes.utils.User;

public interface UserService {

	public void addUser(User user);
//	public void addAdmin(int userId,String password,int roleId,String name,String email);
	public void addAdmin(User admin);
	public List<User> getAllUsers();
//	public void deleteAdmin(int userId);
	


}
