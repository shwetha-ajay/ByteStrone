package com.bytes.assignment7;

public class Employee {
	 String name;
	private double salary;
	private int id;
	public Employee(String name,double salary,int id) {
		this.setName(name);
		this.setSalary(salary);
		this.setId(id);
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 public void giveRaise() {
	        salary = salary+0.1*salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
