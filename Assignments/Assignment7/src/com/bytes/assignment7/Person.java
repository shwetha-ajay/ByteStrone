package com.bytes.assignment7;

public class Person {
	private static int count;
	static {
		count=0;
	}
	private String name;
	public Person(String name) {
		this.name=name;
		count++;
	}
	static int  getCount() {
		return count;
		
	}
	
}
