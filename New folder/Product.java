package com.bytes.hello;

import java.util.Scanner;
/**
 * product of 2 numbers
 * @author ShwethaA(Intern)
 *
 */
public class Product {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter first no");
		int num1 = myObj.nextInt();
		System.out.println("enter second no");

		int num2 = myObj.nextInt();
		int prod = num1 * num2;
		System.out.println("product is " + prod);

	}

}
