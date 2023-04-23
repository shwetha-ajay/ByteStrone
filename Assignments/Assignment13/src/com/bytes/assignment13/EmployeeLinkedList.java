package com.bytes.assignment13;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeLinkedList {
	LinkedList<Employee> emplist=new LinkedList<Employee>();
	 public void addEmployeeDetailsFromInput() {
	        System.out.println("Enter employee details:");
	        System.out.print("ID: ");
	        Scanner Obj=new Scanner(System.in);
			int id = Obj.nextInt();
	        Obj.nextLine();
	        System.out.print("Name: ");
	        String name = Obj.nextLine();
	        System.out.print("Salary: ");
	        double salary = Obj.nextDouble();
	        Employee employee = new Employee(id, name, salary);
	        empList.add(employee);
	        System.out.println("Employee added successfully.");
	    }

	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void searchEmployeeByID(int id) {
		// TODO Auto-generated method stub
		
	}
	    

}
