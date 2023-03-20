package com.bytes.assignment;
import java.util.Scanner;
import java.util.Arrays;
public class SortingOfNumbers {
	public static void main(String[]args) {
		Scanner Obj= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=Obj.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0;i<size;i++) {
			array[i]=Obj.nextInt();		
	}
//using sort()
//	Arrays.sort(array);
//	System.out.println("sorted array = " +Arrays.toString(array));
		
		
//	using for loop
	 for (int i = 0; i < size-1; i++) {
         for (int j = i+1; j < size; j++) {
             if (array[i] > array[j]) {
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }
         }
     }
     System.out.println("Sorted array: ");
     for (int i = 0; i < size; i++) {
         System.out.print(array[i] + " ");
     }
 }

}

