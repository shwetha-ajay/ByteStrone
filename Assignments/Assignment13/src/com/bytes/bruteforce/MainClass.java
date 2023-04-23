package com.bytes.bruteforce;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the password ( 8 characters ): ");
		String userPassword = Obj.next();
		
		BruteForce bruteforce = new BruteForce(userPassword);
		
		System.out.println(bruteforce.attack());
		
		Obj.close();
		
	}

}
