package com.bytes.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Exercise1Main {
	public static void main(String[] args) {
		ArrayList<Student> studList =new ArrayList<Student>();
		Scanner Obj = new Scanner(System.in);
		
		 while (true) {
	            System.out.println("Choose an option:\n" + "1. Add a student\n" + "2. Search for a student\n"
	                    + "3. Update a student\n" + "4. Delete a student\n" + "5. Sort by Roll No\n"
	                    + "6. Sort in reverse order\n" + "7. Sort by Name\n" + "8. Check for duplicates\n"
	                    + "9. Remove duplicates\n" + "10. Add a new student after a given roll no.\n" + "11. Exit");
	            int option = Obj.nextInt();
	            switch (option) {
	            
	        //add student details
	            
	                case 1:
	                    System.out.println("Enter roll no:");
	                    int rollNo = Obj.nextInt();
	                    System.out.println("Enter name:");
	                    String name = Obj.next();
	                    System.out.println("Enter age:");
	                    int age = Obj.nextInt();
	                    studList.add(new Student(rollNo, name, age));
	                    break;
	        //search a student
	                case 2:
	                    System.out.println("Enter rollno to be searched:");
	                    int searchRollNo = Obj.nextInt();
	                    boolean found = false;
	                    for (Student s : studList) {
	                        if (s.getRollNo() == searchRollNo) {
	                            System.out.println("Roll no: " + s.getRollNo() + "\nName: " + s.getName() + "\nAge: "
	                                    + s.getAge() );
	                            found = true;
	                        }}
	                            break;
	                       
	         //Update a student details
	                    
	                    case 3:
	                        System.out.println("Enter rollno to update:");
	                        int updateRollNo = Obj.nextInt();
	                        found = false;
	                        for (Student s : studList) {
	                            if (s.getRollNo() == updateRollNo) {
	                                System.out.println("Enter updated name:");
	                                String updatedName = Obj.next();
	                                System.out.println("Enter updated age:");
	                                int updatedAge = Obj.nextInt();
	                                s.setName(updatedName);
	                                s.setAge(updatedAge);
	                                
	                                System.out.println("Student updated successfully.");
	                                found = true;
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Student with rollno " + updateRollNo + " is not found.");
	                        }
	                        break;
	         //delete a student
	                    case 4:
	                        System.out.println("Enter rollno to delete:");
	                        int deleteRollNo = Obj.nextInt();
	                        found = false;
	                        for (int i = 0; i < studList.size(); i++) {
	                            if (studList.get(i).getRollNo() == deleteRollNo) {
	                                studList.remove(i);
	                                System.out.println("Student deleted successfully.");
	                                found = true;
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Student with rollno " + deleteRollNo + " not found.");
	                        }
	                        break;
	           //sort with rollno
//	                    case 5:
//	                        Collections.sort(studList);
//	                        for (Student s : studList) {
//	                            System.out.println("Roll no: " + s.getRollNo() + "\nName: " + s.getName() + "\nAge: "
//	                                    + s.getAge());
//	                        }
//	                        break;
	                    case 6:
	                        Collections.sort(studList, Collections.reverseOrder());
	                        for (Student s : studList) {
	                            System.out.println("Roll no: " + s.getRollNo() + "\nName: " + s.getName() + "\nAge: "
	                                    + s.getAge());
	                        }
	                        break;
	                    case 7:
	                        Collections.sort(studList, new StudentNameComparator());
	                        for (Student s : studList) {
	                            System.out.println("Roll no: " + s.getRollNo() + "\nName: " + s.getName() + "\nAge: "
	                                    + s.getAge() );
	                        }
	                        break;
	                    case 8:
	                        HashSet<Student> set = new HashSet<>(studList);
	                        if (set.size() == studList.size()) {
	                            System.out.println("No duplicates found.");
	                        } else {
	                            System.out.println("Duplicates found.");
	                        }
	                        break;
	                    case 9:
	                        HashSet<Student> uniqueSet = new HashSet<>(studList);
	                        ArrayList<Student> uniqueList = new ArrayList<>(uniqueSet);
	                        for (Student s : uniqueList) {
	                            System.out.println("Roll no: " + s.getRollNo() + "\nName: " + s.getName() + "\nAge: "
	                                    + s.getAge() );
	                        }
	                        break;
	                    case 10:
	                        System.out.println("Enter roll no to find:");
	                        int findRollNo = Obj.nextInt();
	                        found = false;
	                        for (int i = 0; i < studList.size(); i++) {
	                            if (studList.get(i).getRollNo() == findRollNo) {
	                                System.out.println("Enter new student: ");
	}

}
	}}}}
