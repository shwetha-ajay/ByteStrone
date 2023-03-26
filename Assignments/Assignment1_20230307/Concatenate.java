package com.bytes.hello;

import java.util.Scanner;
/**
 * to concatenate 2 strings.
 * @author ShwethaA(Intern)
 *
 */
public class Concatenate {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first string");

		String str1 = myObj.nextLine();
		System.out.println("enter second string ");
		String str2 = myObj.nextLine();
		String str = str1 + " " + str2;
		System.out.println(str);

	}
}
