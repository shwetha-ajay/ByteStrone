package com.bytes.weeklyassignment1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.time.LocalDate;
import java.util.Scanner;


public class MainClass {


//	private static final String  = null;

	public static void main(String[] args) {
//		Scanner Obj=new Scanner(System.in);
//		Employee emp1=new Employee("Joe","Joseph","22/03/1998");
//		Employee emp2=new Employee("Loky","Roy","14/09/1997");
		
		
	
		ArrayList<Employee> empList =new ArrayList<Employee>();
		ArrayList<Engineer> empEngineerList=new ArrayList<Engineer>();
		ArrayList<Admin> empAdminList=new ArrayList<Admin>();
		ArrayList<HRmanager> empHRList=new ArrayList<HRmanager>();
		ArrayList<Employee> Empcopy= new ArrayList<Employee>();
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
	                    System.out.println("enter the dept: "+"1.Admin\n"+"2.Engineer\n"+"3.HRmanager");
	                    int dept = Obj.nextInt();
	    	            switch (dept) {
	    	            case 1:
	    					Engineer eng= new Engineer(empId, fname, fname, fname, fname);
	    					eng.setEmpId(empId);
	    					System.out.println("Enter the techstack of engineer");
	    					String techstack=Obj.next();
	    					eng.setTechStack(techstack);
	    					empEngineerList.add(eng);
	    					break;
	    					
	    				case 2:
	    					Admin adm=new Admin(empId, fname, fname, fname, fname);
	    					adm.setEmpId(empId);
	    					System.out.println("Enter the role of admin");
	    					String roles=Obj.next();
	    					adm.setArea(roles);
	    					empAdminList.add(adm);
	    					break;
	    					
	    				case 3:
	    					HRmanager hr= new HRmanager(empId, fname, fname, fname, fname);
	    					hr.setEmpId(empId);
	    					System.out.println("Enter the specialization");
	    					String spl=Obj.next();
	    					hr.setSpecialiation(spl);
	    					empHRList.add(hr);
	    					break;
	    					
	    				default:
	    					System.out.println("Invalid option");
	    	            
	    	            }
	    	            System.out.println("Entered successfully");
	                    break;
	                    
	     //writing to a file
//	                    
	                    try {
	                        File myWriter = new File("C:\\Users\\ShwethaA(Intern)\\Desktop\\EmployeeManagement\\EmployeeDetails.txt");
	                        PrintWriter w=new PrintWriter(new FileOutputStream(myWriter,true));
	                        w.append(empId+fname+lname+date);
	              /          w.close();
	                       System.out.println("Successfully wrote to the file.");
	                      } catch (IOException e) {
	                       System.out.println("An error occurred..");
	                       e.printStackTrace();
	                        }
	                    
	                     
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
	                case 3:
	                	System.out.println("Enter the Employee ID of the Employee whose details has to be printed");
	    				int printId = Obj.nextInt();
	    				for (Employee emp : empList) {
	    					if (emp.getEmpId() == printId) {
	    						System.out.println(emp);}}
	    				break;
	    	  //sorting
	                case 4:
	                	System.out.println("Sorting employees by last name: ");
	                	Collections.sort(Empcopy, new Comparator<Employee>() {

	    					@Override
	    					public int compare(Employee e1, Employee e2) {
	    				
	    						return e1.getLastName().compareTo(e2.getLastName());
	    					}
	    				});
	                	
	                
	    			
	    				for(Employee emp:Empcopy) {
	    					
	    					System.out.println("Employee ID: " + emp.getEmpId());
	    					System.out.println("Employee First Name: " + emp.getFirstName());
	    					System.out.println("Employee last Name: " + emp.getLastName());
	    					System.out.println("Employee DOB: " + emp.getDate());
	    					for (Engineer EmpEng : empEngineerList) {
	    						if (emp.getEmpId() == EmpEng.getEmpId()) {
	    							System.out.println("Employee Department: " + EmpEng.getTechStack());
	    						}
	    					}
	    					for (Admin EmpAdm : empAdminList) {
	    						if (emp.getEmpId() == EmpAdm.getEmpId()) {
	    							System.out.println("Employee Department: " + EmpAdm.getArea());
	    						}
	    					}
	    					for (HRmanager EmpHR : empHRList) {
	    						if (emp.getEmpId() == EmpHR.getEmpId()) {
	    							System.out.println("Employee Department: " + EmpHR.getSpecialiation());
	    						}
	    					}

	    				}
	    				break;
	                	
       
	          //searching
	                case 5:
	                	System.out.println("Search by 1. By First name\n"+"2. By Last Name"+"3. By id");
	                	int opt = Obj.nextInt();
	     	            switch (opt) {
	     	            // search by first name
	     	            case 1:
	     	            	System.out.println("Enter the first name to be searched ");
	     	            	String searchFirstName = Obj.next();
	    					for (Employee emp : empList) {
	    						if (emp.getFirstName().equals(searchFirstName)) {
	    							System.out.println(emp);
	    						
	    						}
	    						else{
	    							System.out.println("not found");}
	    					
	    						}	break;
	     	            case 2:
	     	            	System.out.println("Enter the last name to be searched");
	     	            	String searchLastName = Obj.next();
	    					for (Employee emp : empList) {
	    						if (emp.getFirstName().equals(searchLastName)) {
	    							System.out.println(emp);
	    							
	    						}}break;
	     	            case 3:
	     	            	System.out.println("Enter the id to be searched");
	     	            	String searchId = Obj.next();
	    					for (Employee emp : empList) {
	    						if (emp.getFirstName() == searchId) {
	    							System.out.println(emp);
	    							
	    						}}break;
	                }
	                case 6:
                	     System.out.println("exiting");
	                	
	                	
	            }
	            }
		
}
}
