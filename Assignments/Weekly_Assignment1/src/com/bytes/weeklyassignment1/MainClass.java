package com.bytes.weeklyassignment1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.time.LocalDate;
import java.util.Scanner;


public class MainClass {


//	private static final String  = null;

	public static void main(String[] args) {

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
	                    System.out.println("Enter date of birth:");
	               //   LocalDate date = Obj.nextLine();    
	                    int year = Obj.nextInt();
	            		int month = Obj.nextInt();
	            		int day = Obj.nextInt();
	    				LocalDate dateOfBirth = LocalDate.of(year,month,day);
	    			//	objEmp.setDOB(dateOfBirth);
	                    
	                    
	                    empList.add(new Employee(empId, fname, lname,dateOfBirth));
	                    
	       //writing to a file            
	                    
	                    try {
	                        File myWriter = new File("C:\\Users\\ShwethaA(Intern)\\Desktop\\EmployeeManagement\\EmployeeDetails.txt");
	                        PrintWriter w=new PrintWriter(new FileOutputStream(myWriter,true));
	                        w.append("\n"+empId+"   "+fname+" "+lname+"  "+dateOfBirth);  
	                        w.close();
	                       System.out.println("Successfully written into the file.");
	                      } catch (IOException e) {
	                       System.out.println("An error occurred..");
	                       e.printStackTrace();
	                        }
	                    
	                    
	                    System.out.println("enter the dept: "+"1.Engineer\n"+"2.Admin\n"+"3.HRmanager");
	                    int dept = Obj.nextInt();
	    	            switch (dept) {
	    	            case 1:
	    					
	    					System.out.println("Enter the techstack of engineer");
	    					String techstack=Obj.next();
	    					Engineer eng= new Engineer(empId,fname, lname, dateOfBirth,techstack);
	    					eng.setEmpId(empId);
	    					eng.setTechStack(techstack);
	    					
	    					empEngineerList.add(eng);
	    					break;
	    					
	    				case 2:
	    					
	    					System.out.println("Enter the role of admin");
	    					String roles=Obj.next();
	    					
	    					Admin adm=new Admin(empId, fname, lname, dateOfBirth, roles);
	    					adm.setEmpId(empId);
	    					adm.setArea(roles);
	    					empAdminList.add(adm);
	    					break;
	    					
	    				case 3:
	    					
	    					System.out.println("Enter the specialization");
	    					String spl=Obj.next();
	    					HRmanager hr= new HRmanager(empId, fname, lname, dateOfBirth, spl);
	    					hr.setEmpId(empId);
	    					hr.setSpecialiation(spl);
	    					empHRList.add(hr);
	    					break;
	    					
	    				default:
	    					System.out.println("Invalid option");
	    	            
	    	            }
	    	            System.out.println("Entered successfully");
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
	                case 3:
	                	System.out.println("======Details of employee======");
	                	
	                	try {

	                		File EmpFileRead = new File("C:\\\\Users\\\\ShwethaA(Intern)\\\\Desktop\\\\EmployeeManagement\\\\EmployeeDetails.txt");

	                		Scanner Obj1 = new Scanner(EmpFileRead);

	                		while (Obj1.hasNextLine()) {

	                		String EmpData = Obj1.nextLine();

	                		System.out.println(EmpData);

	                		}

	                		Obj1.close();

	                		
	                		} catch (FileNotFoundException e) {

	                		System.out.println("File not found ");

	                		e.printStackTrace();

	                		}
	                	
	                	
	                	
	                	
//	    				int printId = Obj.nextInt();
//	    				for (Employee emp : empList) {
//	    					if (emp.getEmpId() == printId) {
//	    						System.out.println(emp);}}
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

private static String LocalDate(String date) {
	// TODO Auto-generated method stub
	return null;
}
}
