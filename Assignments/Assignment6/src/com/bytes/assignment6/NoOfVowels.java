package com.bytes.assignment6;

import java.util.Scanner;

public class NoOfVowels {
	public static void main(String[]args) {
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String sentence=Obj.nextLine();
		int count=0;
		for (int i=0;i<sentence.length();i++) {
			char ch=sentence.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
				
				
			}
		      
		System.out.println("There are "+ count +" vowels in this sentence");
			
		}
		
		
	}


