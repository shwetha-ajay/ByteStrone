package com.bytes.assignment;

public class Student {
	int rollNo;
	String name;
	float totalMarks;
//	boolean isPassed;
	
	public Student(int rollNo,String name,float totalMarks) {
		this.rollNo=rollNo;
		this.name=name;
		this.totalMarks=totalMarks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}

	public float getTotalMarks() {
		return totalMarks;
	}
	public boolean isPassed(float totalMarks) {
		return totalMarks>=50;
//		return isPassed;
		}
		
//	public void setTotalMarks(float totalMarks ) {
//		this.totalMarks=totalMarks;
//		this.isPassed=totalMarks>=50;
//		
//		
//		
//	}


}

