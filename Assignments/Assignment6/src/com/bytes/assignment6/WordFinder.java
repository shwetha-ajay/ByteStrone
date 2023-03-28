package com.bytes.assignment6;
import java.util.Scanner;
public class WordFinder {
	public static void main (String[]args) {
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter a statement: ");
		String sentence=Obj.nextLine();
		System.out.println("Enter the word: ");
		String word=Obj.nextLine();
		if(sentence.contains(word)) {
			System.out.println(word+" is present in the sentence. And is at position "+sentence.indexOf(word));
		}else {
			System.out.println(word+" not present in the sentence");
		
		}
	}

}
