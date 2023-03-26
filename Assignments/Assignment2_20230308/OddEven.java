package com.bytes.hello;

import java.util.Scanner;
/**
 * to print odd and even numbers between 1 and 100
 * @author ShwethaA(Intern)
 *
 */
public class OddEven {
	public static void main(String[] args) {
		System.out.println("even numbers are");
		for (int num = 1; num < 100; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		System.out.println("odd numbers are");
		for (int num = 1; num < 100; num++) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}

	}

}
