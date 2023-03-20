package com.bytes.assignment;

import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = Obj.nextLine();

//		int wordCount = WordCount(str);
		System.out.println("number of words is " + WordCount(str));
	}

	public static int WordCount(String str) {
		String[] words = str.split(" ");
		return words.length;
	}

}
