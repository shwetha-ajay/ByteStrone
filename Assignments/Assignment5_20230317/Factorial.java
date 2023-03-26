package com.bytes.assignment;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("enter the number");
		int n = Obj.nextInt();
		System.out.println("factorial is " + factorial(n));

	}

	private static int factorial(int n) {
		
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

}
