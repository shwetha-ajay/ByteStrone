package com.bytes.assignment2;

import java.util.Scanner;
/**
 * Take 2 numbers as input and perform arithmetic operations (also add do you want to continue option) using do while loop.
 * @author ShwethaA(Intern)
 *
 */
public class Calculator {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		int sum, diff, mult, div, option;  
		String cont;
		do {
			System.out.println("enter first no");
			int num1 = myObj.nextInt();
			System.out.println("enter second no");
			int num2 = myObj.nextInt();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.print("Enter the operations do you want to perform:");
			option = myObj.nextInt();
			System.out.println("Choice of operation is:" + option);
			switch (option) {
			case 1:
				sum = num1 + num2;
				System.out.println("sum is" + sum);
				break;

			case 2:
				diff = num1 - num2;
				System.out.println("difference is" + diff);
				break;
			case 3:
				mult = num1 * num2;
				System.out.println("product is" + mult);
				break;
			case 4:
				div = num1 / num2;
				System.out.println("quotient is" + div);
				break;
			default:
				System.out.println("This is a wrong choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			cont = myObj.next();
		} while (cont.equals("y"));               

	}

}
