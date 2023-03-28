package com.bytes.assignment1;

import java.util.Scanner;
/**
 * print multiplication table
 * @author ShwethaA(Intern)
 *
 */
public class multiplication_table {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number limit");
		int num = myObj.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
	}

}
