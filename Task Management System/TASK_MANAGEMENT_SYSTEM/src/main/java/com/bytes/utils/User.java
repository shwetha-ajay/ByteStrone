package com.bytes.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="users")
public class User {
	@Id
	 private int userID;
//	@Column(name="\"name\"")
	 private String name;
//	@Column(name="\"email\"")
	 private String email;
	 @ManyToOne
	 @JoinColumn(name="roleID")
	 private UserRole roleID;
	 
	 public User() {
		 
	 }

	
	public User(int userID, String name, String email, UserRole roleID) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.roleID = roleID;
	}


	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}


	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
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
	public UserRole getRoleID() {
		return roleID;
	}


	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(UserRole roleID) {
		this.roleID = roleID;
	}


}
