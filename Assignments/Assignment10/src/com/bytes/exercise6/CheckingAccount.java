package com.bytes.exercise6;

public class CheckingAccount extends BankAccount{
	double overdraft;
	
	
	public CheckingAccount(double overdraft) {
		
		this.overdraft = overdraft;
	}


	public void withdraw() {
		
		
	}
 

}



//public abstract class BankAccount {
//    protected double balance;
//
//    public abstract void withdraw(double amount);
//
//    public abstract void deposit(double amount);
//}
//
//public class CheckingAccount extends BankAccount {
//    private double overdraftLimit;
//
//    public CheckingAccount(double balance, double overdraftLimit) {
//        this.balance = balance;
//        this.overdraftLimit = overdraftLimit;
//    }

//    @Override
//    public void withdraw(double amount) {
//        if (amount <= balance + overdraftLimit) {
//            balance -= amount;
//            System.out.println("Withdrawn " + amount + " from Checking Account");
//        } else {
//            System.out.println("Transaction failed. Insufficient funds.");
//        }
//    }
//
//    @Override
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited " + amount + " to Checking Account");
//    }
//}
//
//public class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(double balance, double interestRate) {
//        this.balance = balance;
//        this.interestRate = interestRate;
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrawn " + amount + " from Savings Account");
//        } else {
//            System.out.println("Transaction failed. Insufficient funds.");
//        }
//    }

    