package com.bytes.student;


	import java.util.Scanner;

	public class MainclassStud {
		public static void main(String[]args) {
			Scanner Obj = new Scanner(System.in);
			System.out.println("Enter number of students");
			int numOfStudents = Obj.nextInt();
			System.out.println("Enter number of grades per student");
			int numOfGrades = Obj.nextInt();
			
			 Student[] objects=new Student[numOfStudents]   ;
		
			 
			 
			 
			 for(int i=0;i<objects.length;i++) {
				 objects[i]=new Student();
				 System.out.println("enter student name");
				 objects[i].setName(Obj.next());
				 System.out.println("enter age");
				 objects[i].setAge(Obj.nextInt());
				 
				 objects[i].marks=new Mark();
				 System.out.println("enter english marks");
				 objects[i].marks.setEnglishMark(Obj.nextFloat());
				 System.out.println("enter maths marks");
				 objects[i].marks.setMathsMark(Obj.nextFloat());
				 System.out.println("enter physics marks");
				 objects[i].marks.setPhysicsMark(Obj.nextFloat());
				 System.out.println("enter chemistry marks");
				 objects[i].marks.setChemistryMark(Obj.nextFloat());
			 }
			 for (int i=0;i<objects.length;i++) {
				 float Avg=(objects[i].marks.getEnglishMark()+objects[i].marks.getMathsMark()+objects[i].marks.getPhysicsMark()+objects[i].marks.getChemistryMark())/numOfStudents;
				 
				 objects[i].setAverage(Avg);
				
			 }
			
			 //print average grade//
			 
			 System.out.println("average grades:");
			 for(int i=0;i<objects.length;i++) {
				 System.out.println(objects[i].getName()+" : "+objects[i].getAverage());
			 }	
			Obj.close();
		}
	}


		





