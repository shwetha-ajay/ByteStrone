package com.bytes.hello;

import java.util.Scanner;
/**
 * enter 2 numbers and perform arithmetic operations.
 * @author ShwethaA(Intern)
 *
 */
public class Arithmetic {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter first no");
		int num1 = myObj.nextInt();
		System.out.println("enter second no");
		int num2 = myObj.nextInt();
		int sum = num1 + num2;
		System.out.println("sum is " + sum);
		int mult = num1 * num2;
		System.out.println("product is " + mult);
		int div = num1 / num2;
		System.out.println("quotient is " + div);
		int sub = num1 - num2;
		System.out.println("difference is " + sub);
		int remain = num1 % num2;
		System.out.println("remainder is " + remain);

	}

}
