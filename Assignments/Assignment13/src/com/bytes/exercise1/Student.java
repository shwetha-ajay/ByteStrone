package com.bytes.exercise1;

public class Student {
	 
	int rollNo;
	 String name;
	 int age;
	 
	 public Student(int rollNo, String name, int age) {
	//		super();
			this.rollNo = rollNo;
			this.name = name;
			this.age = age;
		}

	
	public int getRollNo() {
		return rollNo;
	}

	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 public int compareTo(Student o) {
	        return this.rollNo - o.rollNo;
	    }
	 @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof Student) {
	            Student other = (Student) obj;
	            return this.rollNo == other.rollNo && this.name.equals(other.name) && this.age == other.age;
	                   
	        }
	        return false;
	    }


}
