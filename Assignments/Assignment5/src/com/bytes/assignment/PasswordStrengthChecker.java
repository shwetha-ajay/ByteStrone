package com.bytes.assignment;
import java.util.Scanner;
public class PasswordStrengthChecker {
	public static void main(String[]args) {
		Scanner Obj=new Scanner(System.in);
		System.out.println("enter your password: ");
		String password=Obj.nextLine();
		
		int length = password.length();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
//        String specialChars = "!@#$%^&*()_+-=;':\"./<>?";
        
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else  {
                hasSpecialChar = true;
            }
        }
        if (length >= 8 && hasUpperCase && hasLowerCase && hasNumber && hasSpecialChar) {
            System.out.println("Strong password!");
        } else if (length >= 6 && ((hasUpperCase && hasLowerCase) || (hasLowerCase && hasNumber) || (hasUpperCase && hasNumber) || (hasSpecialChar && hasNumber))) {
            System.out.println("Moderate password.");
        } else {
            System.out.println("Weak password.");
        }
    }







	}


