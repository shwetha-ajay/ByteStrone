package com.bytes.assignment7;

public class Exercise3Main {
	   public static void main(String[] args) {
	        Employee e1 = new Employee("Ali", 5000.0, 123);
	        Employee e2 = new Employee("John", 6000.0, 456);

	        e1.giveRaise();
	        e2.giveRaise();
//
	        System.out.println(e1.getName() + " earns Rs." + e1.getSalary() + " per year.");
	        System.out.println(e2.getName() + " earns Rs." + e2.getSalary() + " per year.");
	    }
	}


