package com.bytes.assignment6;

import java.util.Scanner;

public class ConcatenateString {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = myObj.nextLine();
		
		System.out.println("enter second string ");
		String string2 = myObj.nextLine();
	
		System.out.println(string1.concat(string2));

}
}
