package com.bytes.assignment3;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter number of elements ");
		int size = Obj.nextInt();

		int array[] = new int[size];
		int newarray[] = new int[size];
		System.out.println("Enter the elements");

		for (int i = 0; i < size; i++) {
			int item = Obj.nextInt();
			array[i] = item;
		}
		System.out.println("original array is");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		int f, k = 0;
		for (int i = 0; i < size; i++) {
			f = 0;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					f = 1;
					break;
				}
			}
			if (f == 0) {
				newarray[k] = array[i];
				k++;

			}
		}
		System.out.println("new array");
		for (int i = 0; i < k; i++) {
			System.out.println(newarray[i]);
		}

	}
}







