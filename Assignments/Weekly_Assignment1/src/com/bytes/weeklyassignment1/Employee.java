package com.bytes.weeklyassignment1;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import java.time.LocalDate;

public class Employee {
	int empId;
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
//	String depId;

	public Employee(int empId,String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.empId=empId;
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.dateOfBirth = dateOfBirth;
		//this.depId = depId;
	}

	
//	
//	public String getDepId() {
//		return depId;
//	}
//
//	public void setDepId(String depId) {
//		this.depId = depId;
//	}


	

	public int getEmpId() {
		return empId;
	}

	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDate() {
		return dateOfBirth;
	}

	public void setDate(String date) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString() {
		return "Employee [firstName: " + getFirstName() + ", lastName: " + getLastName() + ", Date of Birth: "
				+ getDate() + "]";
	}
    public int compareTo(Employee other) {
        return this.lastName.compareTo(other.lastName);
    }
    
//    public static void sortEmployeesByLastName(List<Employee> employees) {
//   // 	Comparator<Employee> byLastName = Comparator.comparing(Employee::getLastName);
//        Collections.sort(employees);
//    }
//


 

}
