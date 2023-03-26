package com.bytes.assignment;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
//		
		ReverseWords obj=new ReverseWords();
		System.out.print("Enter a sentence: ");
		obj.reverseWord(Obj.nextLine());
	}
	
	
		
		public void reverseWord(String str) {
			String[] words=str.split(" ");
			String reverseString=" ";
			for (int i=0;i<words.length;i++) {
				String word=words[i];
				String reverseWord=" ";
				for (int j=word.length()-1;j>=0;j--) {
					reverseWord=reverseWord+word.charAt(j);
				}
				reverseString=reverseString+reverseWord+" ";
				}
			
		System.out.println(reverseString);

	}
}
