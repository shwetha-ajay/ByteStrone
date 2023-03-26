package com.bytes.hello;

import java.util.Scanner;
//to print sum of even numbers from an array

public class SumOfEven {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter number of elements ");
		int size = Obj.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements");

		int i, even_sum = 0;
		for (i = 0; i < size; i++) {
			array[i] = Obj.nextInt();
		}
		for (i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				even_sum = even_sum + array[i];

			}
		}
		System.out.println("sum of even numbers =" + even_sum);
	}

}
