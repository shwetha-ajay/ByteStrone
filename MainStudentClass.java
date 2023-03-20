package com.bytes.assignment;

import java.util.Scanner;

public class MainStudentClass {
	public static void main(String[]args) {
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the rollNo: ");
		int rollNo=Obj.nextInt();
		System.out.println("Enter the student name: ");
		String name=Obj.next();
		System.out.println("Enter the total marks: ");
		float totalMarks=Obj.nextInt();
		
		Student student=new Student(rollNo,name,totalMarks);
		if (student.isPassed(totalMarks)) {
			System.out.println(student.name +" is passed");
	    }else {
	    	System.out.println(student.name +" is failed");
	}
		
	}

}
