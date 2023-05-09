package com.bytes.policy;

public class Customer {
	int customer_id;
	String name;
	String email;
	int phone;
    String address;
	
	public Customer(int customer_id, String name, String email, int phone, String address) {
        super();
		this.customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	

	public int getCustomer_id() {
		return customer_id;
	}

	
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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

	
	public String getAddress() {
		return address;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}
	

}
