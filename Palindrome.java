package com.bytes.assignment;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the word ");
		String word = Obj.nextLine();
//		String newword=new String(word).reverse();
		 if (isPalindrome(word)) {
	           System.out.println(word + " is a palindrome.");
	       } else {
	           System.out.println(word + " is not a palindrome.");
	       }
	   }

	   public static boolean isPalindrome(String str) {
	       int length = str.length();

	       for (int i = 0; i < length / 2; i++) {
	           if (str.charAt(i) != str.charAt(length - i - 1)) {
	               return false;
	           }
	       }

	       return true;
	   }
	}
	






