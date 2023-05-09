package com.bytes.policy;

public class PolicyHolder extends Customer{
	String holder_id;
	String name;
	String email;
	int phone;
	
	public PolicyHolder(String holder_id, String name, String email, int phone,int customer_id, String address) {
		super(customer_id, name, email, phone, address);
		this.holder_id = holder_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getHolder_id() {
		return holder_id;
	}

	public void setHolder_id(String holder_id) {
		this.holder_id = holder_id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getPhone() {
		return phone;
	}

	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	

}
