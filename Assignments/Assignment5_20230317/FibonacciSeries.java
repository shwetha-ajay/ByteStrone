package com.bytes.assignment;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int fibo = Obj.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		while (b < fibo) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
