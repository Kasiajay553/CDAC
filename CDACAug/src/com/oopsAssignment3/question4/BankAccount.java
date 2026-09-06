package com.oopsAssignment3.question4;

public abstract class BankAccount {
	long accountNumber;
	String customerName;
	long balance;
	
	BankAccount(long accountNumber,String customerName,long balance){
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
		
	}
	void deposit(double amount) {
		this.balance+=amount;
		System.out.println("the amount has deposit : " +amount);
		
	}
	void displayAccountDetails() {
		System.out.println("the account number : "+accountNumber);
		System.out.println("the customer name : "+customerName);
		System.out.println("the  total balance is : "+(balance));
	}
	abstract void calculatewithdrawalLimit();

}
