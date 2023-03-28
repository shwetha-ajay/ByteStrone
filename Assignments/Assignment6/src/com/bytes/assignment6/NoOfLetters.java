package com.bytes.assignment6;
import java.util.Scanner;
public class NoOfLetters {
	public static void main (String[]args) {
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = Obj.nextLine();
		int count=0;
		
		for (int i=0;i<sentence.length();i++) {
			char ch=sentence.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				count++;
			}
				
		}
		System.out.println("total number of letters is "+count);
	}

}
