package com.bytes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise3Main {
	public static void main(String[] args) {
//		Map<Department, List<Employee>> departmentEmployeesMap = new HashMap<>();
//		
//		Department department1 = new Department("Department 1");
//		Department department2 = new Department("Department 2");

//		departmentEmployeesMap.put(employee1, null);
//		departmentEmployeesMap.put(employee2, null);
// 	

//		Department sales = new Department("Sales");
//		Department marketing = new Department("Marketing");
//
//		Employee e1 = new Employee("John", null, 50000, sales);
//		Employee e2 = new Employee("Alex", null, 55000, sales);
//		// Employee e3 = new Employee("Emma", 60000, marketing);
//
//		ArrayList<Employee> salesEmployees = new ArrayList<Employee>();
//		salesEmployees.add(e1);
//		salesEmployees.add(e2);
//
//		// List<Employee> marketingEmployees = new ArrayList<>();
//		// marketingEmployees.add(e3);
//        
//		Map<Department, List<Employee>> departmentEmployeesMap = new HashMap<>();
//		departmentEmployeesMap.put(sales, null);
//		// departmentEmployeesMap.put(marketing, marketingEmployees);
//        
//		System.out.println(departmentEmployeesMap);
		// 
		
		
		
		
		
		List<Employee> myList = new Arraylist<Employee>();
		Map<Departmet,List<Employee>> deptMap=new HashMap<>(); 
		Arraylist<Employee> itEmpList;
		itEmpList.add(new Employee("Elon","E001")); 
		itEmpList.add(new Employee("Mask","E002")); 
		Department itDept = new Department("IT","D001");
		deptMap.put(itDept,itEmpList); 
		Arraylist<Employee> adEmpList; 
		adEmpList.add(new Employee("Richard","E003")); 
		adEmpList.add(new Employee("Dawkins","E004"));
		Department adDept = new Department("Admin","D002"); 
		deptMap.put(adDept,adEmpList);
		System.out.println(deptMap);
	}
}





