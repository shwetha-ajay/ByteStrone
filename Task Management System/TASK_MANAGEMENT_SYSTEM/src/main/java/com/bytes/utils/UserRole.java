package com.bytes.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userrole")
public class UserRole {
	@Id
	private int roleID;
	@Column(name="name")
	private String name;
	
//	public UserRole(int roleID, String name) {
//		super();
//		this.roleID = roleID;
//		this.name = name;
//	}
	/**
	 * @return the roleID
	 */
	public int getRoleID() {
		return roleID;
	}
	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	/**
	 * @return the roleName
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
