package com.bytes.bruteforce;

import java.util.Scanner;

public class BruteForce {

	public static String userPassword;

	public BruteForce(String userPassword) {
		this.userPassword = userPassword;
	}

	public static String attack() {
		int count = 0;

		String bruteString = " ";
		long startTime = System.currentTimeMillis();
		while (bruteString != userPassword) {
			String letters = "abcdefghijklmnopqrstuvwxyz";

			for (int i1 = 0; i1 < letters.length(); i1++) {
				for (int i2 = 0; i2 < letters.length(); i2++) {
					for (int i3 = 0; i3 < letters.length(); i3++) {
						for (int i4 = 0; i4 < letters.length(); i4++) {
							for (int i5 = 0; i5 < letters.length(); i5++) {
								for (int i6 = 0; i6 < letters.length(); i6++) {
									for (int i7 = 0; i7 < letters.length(); i7++) {
										for (int i8 = 0; i8 < letters.length(); i8++) {
											String password = "" + letters.charAt(i1) + letters.charAt(i2)
													+ letters.charAt(i3) + letters.charAt(i4) + letters.charAt(i5)
													+ letters.charAt(i6) + letters.charAt(i7) + letters.charAt(i8);
											bruteString = password;
											if (bruteString.equalsIgnoreCase(userPassword)) {
												long endTime = System.currentTimeMillis();
												System.out.println("Succefully broken in " + (endTime - startTime)
														+ " ms time and with " + count + " attempts ");

											}
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return("hard to break");
		
	}
}
