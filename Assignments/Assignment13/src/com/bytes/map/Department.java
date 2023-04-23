package com.bytes.map;

import java.util.ArrayList;

public class Department {
	private String name;
	private double averageSalary;
	private List<Employee> employees;

	
	public Department(String name) {
		super();
		this.name = name;
		this.averageSalary = -1;
	    this.employees = new ArrayList<>();
	}


	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}


	public double getAverageSalary() {
		return averageSalary;
	}


	public void setAverageSalary(double averageSalary) {
		this.averageSalary = averageSalary;
	}
	  // Calculate average salary of department
    public double getDepartmentAverageSalary() {
        if (averageSalary != -1) {
            return averageSalary;
        }
        
        double totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.getSalary();
        }
        averageSalary = totalSalary / employees.size();
        
        return averageSalary;
    }
    public void addEmployee(Employee e) {
        employees.add(e);
    }

}



// List myList = new Arraylist<Employee>()
//Map<Departmet,List<Employee>> deptMap;
//Arraylist<Employee> itEmpList; 
//iadEmpList.add(new Employee("Elon","E001"));
//adEmpList.add(new Employee("Mask","E002"));
//Deparrtment itDept = new Department("IT","D001"); 
//deptMap.put(itDept,itEmpList); Arraylist<Employee> adEmpList; 
//adEmpList.add(new Employee("Richard","E003")); 
//adEmpList.add(new Employee("Dawkins","E004")); 
//Deparrtment adDept = new Department("Admin","D002"); 
//deptMap.put(adDept,adEmpList);
