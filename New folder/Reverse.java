package com.bytes.hello;

import java.util.Scanner;
/**
 * to reverse a number using while loop
 * @author ShwethaA(Intern)
 *
 */
public class Reverse {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter no");
		int number = myObj.nextInt();
		int reverse = 0;
		while (number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the number is: " + reverse);
	}
}


