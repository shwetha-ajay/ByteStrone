package com.bytes.weeklyassignment1;
import java.util.ArrayList;
//import java.time.LocalDate;
import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
//		Scanner Obj=new Scanner(System.in);
//		Employee emp1=new Employee("Joe","Joseph","22/03/1998");
//		Employee emp2=new Employee("Loky","Roy","14/09/1997");
		
		
	
		ArrayList<Employee> empList =new ArrayList<Employee>();
		Scanner Obj = new Scanner(System.in);
		
		 while (true) {
	            System.out.println("Choose an option:\n" + "1. Add new employee\n"
	                    + "2. Update an employee\n" + "3. DIsplay employee details\n" + "4. Sort by last name\n"
	                    + "5. Search employee details\n" + "6. Exit");
	            int option = Obj.nextInt();
	            switch (option) {
	            
	        //add employee details
	            
	                case 1:
	                    System.out.println("Enter empId:");
	                    int empId = Obj.nextInt();
	                    System.out.println("Enter first name:");
	                    String fname = Obj.next();
	                    System.out.println("Enter last name:");
	                    String lname = Obj.next();
	                    System.out.println("Enter age:");
	                    String date = Obj.next();
	                    empList.add(new Employee(empId, fname, lname,date));
	                    break;
	        //update an employee
	                case 2:
	                	   System.out.println("Enter empId to update:");
	                        int updateempId = Obj.nextInt();
	                        boolean found = false;
	                        for (Employee e : empList) {
	                            if (e.getEmpId() == updateempId) {
	                                System.out.println("Enter new first name:");
	                                String updatedFirstName = Obj.next();
	                                System.out.println("Enter new last name:");
	                                String updatedLastName = Obj.next();
	                                System.out.println("Enter age:");
	        	                    String updatedDate = Obj.next();
	                                e.setFirstName(updatedFirstName);
	                                e.setLastName(updatedLastName);
	                                e.setDate(updatedDate);
	                                
	                                System.out.println("Student updated successfully.");
	                                found = true;
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Employee with empId " + updateempId + " is not found.");
	                        }
	                        break;
	          //printing
	                        
	                        
	          //sorting
	                case 4:
	                	
	                case 6:
	                	System.out.println("exiting");
	                	
	            }}
		
		
		
		
		
	}

}
