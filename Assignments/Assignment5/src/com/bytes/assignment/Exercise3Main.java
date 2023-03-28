package com.bytes.assignment;

import java.util.Scanner;

public class Exercise3Main {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		int idNo = Obj.nextInt();
		System.out.println("Enter the employee name: ");
		String name = Obj.next();
		System.out.println("Enter the employee age: ");
		int age = Obj.nextInt();
		System.out.println("enter the address : ");
		System.out.println("building No : ");
		int buildingNo = Obj.nextInt();
		System.out.println("street : ");
		String street = Obj.next();
		System.out.println("district : ");
		String district = Obj.next();
		System.out.println("state : ");
		String state = Obj.next();
		Address A1 = new Address(buildingNo, street, district, state);
		Employee E1 = new Employee(idNo, name, age, A1);

		System.out.println("Enter the employee2 id: ");
		int idNo2 = Obj.nextInt();
		System.out.println("Enter the employee2 name: ");
		String name2 = Obj.next();
		System.out.println("Enter the employee2 age: ");
		int age2 = Obj.nextInt();
		System.out.println("enter the address : ");
		System.out.println("building No : ");
		int buildingNo2 = Obj.nextInt();
		System.out.println("street : ");
		String street2 = Obj.next();
		System.out.println("district : ");
		String district2 = Obj.next();
		System.out.println("state : ");
		String state2 = Obj.next();
		Address A2 = new Address(buildingNo2, street2, district2, state2);
		Employee E2 = new Employee(idNo2, name2, age2, A2);

		System.out.println("Employee id: " + E1.getId());
		System.out.println("Employee name: " + E1.getName());
		System.out.println("Employee age: " + E1.getAge());
		System.out.println("Employee address: " + A1.getBuildingNo() + " , " + A1.getStreet() + " , " + A1.getDistrict()
				+ " , " + A1.getState());
		System.out.println("Employee id: " + E2.getId());
		System.out.println("Employee name: " + E2.getName());
		System.out.println("Employee age: " + E2.getAge());
		System.out.println("Employee address: " + A2.getBuildingNo() + " , " + A2.getStreet() + " , " + A2.getDistrict()
				+ " , " + A2.getState());

		if (E1.ageEquals(E2)) {
			System.out.println("ages are equal");
		} else {
			System.out.println("not equal");
		}

	}
}
