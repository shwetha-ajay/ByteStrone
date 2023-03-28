package com.bytes.assignment;

public class Employee {
	int id;
	String name;
	int age;
	Address address;
	
	public Employee(int id,String name,int age,Address address) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
		
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	 public boolean ageEquals(Employee E2) {
	        if (this.age == E2.age) {
	            return true;
	        }
	        else {
	            return false;
	        }
	 }
}


