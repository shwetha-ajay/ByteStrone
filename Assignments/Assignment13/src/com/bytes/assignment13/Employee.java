package com.bytes.assignment13;

public class Employee {

	private double salary;
	private String name;
	private int id;

	public Employee(int id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
