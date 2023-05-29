package com.bytes.utils;

public class User {
	int UserID;
	String name;
	String email;
	int RoleID;
	
	public User(int userID, String name, String email, int roleID) {
		super();
		UserID = userID;
		this.name = name;
		this.email = email;
		RoleID = roleID;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return UserID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		UserID = userID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the roleID
	 */
	public int getRoleID() {
		return RoleID;
	}

	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(int roleID) {
		RoleID = roleID;
	}
	
	
	

}
