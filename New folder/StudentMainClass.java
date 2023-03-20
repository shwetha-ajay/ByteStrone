package com.bytes.hello;

public class StudentMainClass {
	public static void main(String args[]) {
//		Student student1=new Student();
//		student1.name="Ross";
//		student1.age=22;
//		student1.mathsMark=48;
//		student1.englishMark=35;
//		System.out.println(student1.name);
//		
//		Student student2=new Student();
//		student2.name="joy";
//		student2.age=22;
//		student2.mathsMark=38;
//		student2.englishMark=45;
//		System.out.println(student2.name);
//		
		

			String myName= "Alen";
			
			StudentMarks alanMarks = new StudentMarks();
			alanMarks.mathsMark=49;
			alanMarks.engilshMark=35;
			
			
			
			Student student1 = new Student();
			student1.name=myName;
			student1.marks=alanMarks;
			
			Student student2 = new Student();
			student2.name="Denit";
			student2.marks=alanMarks;
			student2.marks.engilshMark=49;
			
			System.out.println(student1.name);
			System.out.println(alanMarks.engilshMark);
			System.out.println(student1.marks.engilshMark);
	
			
			

			
			
			

		}
	}
	
