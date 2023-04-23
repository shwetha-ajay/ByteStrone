package com.bytes.exercise2;

public class Customer {
	long Id;
	String name;
	Integer tier;
	public Customer(long id, String name, Integer tier) {
		super();
		Id = id;
		this.name = name;
		this.tier = tier;
	}
	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTier() {
		return tier;
	}
	 
	public void setTier(Integer tier) {
		this.tier = tier;
	}
}
