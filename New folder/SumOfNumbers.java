package com.bytes.hello;

import java.util.Scanner;
/**
 * to find the sum of 5 numbers
 * @author ShwethaA(Intern)
 *
 */
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = Obj.nextInt();

		System.out.println("Enter number 2");
		int num2 = Obj.nextInt();

		System.out.println("Enter number 3");
		int num3 = Obj.nextInt();

		System.out.println("Enter number 4");
		int num4 = Obj.nextInt();
		System.out.println("Enter number 5");
		int num5 = Obj.nextInt();
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);

	}
}
