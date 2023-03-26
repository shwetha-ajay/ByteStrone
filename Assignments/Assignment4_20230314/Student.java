package com.bytes.student;

public class Student {
	String name;
	int  age;
	Mark marks;
	float averagemarks;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setAverage(float averagemarks) {
		this.averagemarks=averagemarks;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getAverage() {
		return averagemarks;
	}
	

}
