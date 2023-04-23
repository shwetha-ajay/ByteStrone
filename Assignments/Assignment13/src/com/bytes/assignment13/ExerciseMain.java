package com.bytes.assignment13;

import java.util.LinkedList;
import java.util.Scanner;

import com.bytes.exercise1.Student;

public class ExerciseMain {
	 public static void main(String[] args) {
	        LinkedList<Employee> empList = new LinkedList<Employee>();

	        Scanner Obj = new Scanner(System.in);

	        int choice = 0;
	        while (choice != 5) {
	            System.out.println("Select an option:");
	            System.out.println("1. Add employee");
	            System.out.println("2. Search employee by ID");
	            System.out.println("3. Add employee at the front");
	            System.out.println("4. Add employee at the end");
	            System.out.println("5. Remove employee");
	            

	            System.out.print("Enter your choice: ");
	            choice = Obj.nextInt();
	 //           scanner.nextLine(); //

	            switch (choice) {
	                case 1:
	                	System.out.println("Enter employee details:");
	         	        System.out.print("ID: ");         	   
	         	        int id = Obj.nextInt();
	         	        Obj.nextLine();
	         	        System.out.println("Name: ");
	         	        String name = Obj.nextLine();
	         	        System.out.print("Salary: ");
	         	        double salary = Obj.nextDouble();
	         	        Employee employee = new Employee(id, name, salary);
	         	        empList.add(employee);
	         	        System.out.println("Employee added successfully.");
	         	    
	    //               
	                    break;
                 case 2:
	                    System.out.print("Enter employee ID to be searched : ");
	                    int id1 = Obj.nextInt();
	                    boolean found = false;
	                    for (Employee employee1 : empList) {
	                        int searchid1;
							if (employee1.getId() == searchid1) {
	                            System.out.println("id: " + employee1.getId()+"\nName: "+employee1.getName());
	                            found = true;
	                            break;
	                     
	                            
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("Employee not found.");
	                    }
	                    empList.searchEmployeeByID(id1);
	                    break;
//	                case 3:
//	                    System.out.println("Enter employee details:");
//	                    Employee employeeToAddFirst = readEmployeeDetailsFromInput();
//	                    empList.addEmployeeFirst(employeeToAddFirst);
//	                    System.out.println("Employee added at the front of the list.");
//	                    break;
//	                case 4:
//	                    System.out.println("Enter employee details:");
//	                    Employee employeeToAddLast = readEmployeeDetailsFromInput();
//	                    empList.addEmployeeLast(employeeToAddLast);
//	                    System.out.println("Employee added at the end of the list.");
//	                    break;
//	                case 5:
//	                	 System.out.println("Enter employee details:");
//	                     Employee employeeToRemove = readEmployeeDetailsFromInput();
//	                     empList.removeEmployeeUsingIterator(employeeToRemove);
//	                     break;
	                 
	                 default:
	                     System.out.println("Invalid choice.");
	             }
	                
	        }
	
}
}