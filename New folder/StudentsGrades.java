package com.bytes.hello;

import java.util.Scanner;

public class StudentsGrades {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		
		//enter no of students and grades//
		
		System.out.println("Enter number of students");
		int numOfStudents = Obj.nextInt();
		System.out.println("Enter number of grades per student");
		int numOfGrades = Obj.nextInt();
		
		//2D array to store names and grades//
		
		 String[][] studentGrades=new String[numOfStudents][numOfGrades+1];
		 //
		 for(int i=0;i<numOfStudents;i++) {
			 System.out.println("enter student name");
			 String studentName=Obj.next();
			 studentGrades[i][0]=studentName;
			 double totalGrade=0.0;
			 for(int j=1;j<=numOfGrades;j++) {
				 System.out.println("enter grades"+j+"for"+studentName+":");
				 double grade=Obj.nextDouble();
				 studentGrades[i][j]=String.valueOf(grade);
				 totalGrade+=grade;
				 }
			 //to find average//
			 double averageGrade=totalGrade/numOfGrades;
			 studentGrades[i][numOfGrades]=String.valueOf(averageGrade);
			 }
		 
		 //print average grade//
		 
		 System.out.println("avaerage grades:");
		 for(int i=0;i<numOfStudents;i++) {
			 System.out.println(studentGrades[i][0]+":"+studentGrades[i][numOfGrades]);
		 }	
		
	}
}

