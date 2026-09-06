package com.oopsAssignment1.question4;

public class BankAccount {

	int accountNo;
	String customerName;
	int balance;
	
	BankAccount(int ac, String name, int bal){
		accountNo=ac;
		customerName=name;
		balance=bal;
	}
	void display() {
		System.out.println("the account number is : "+accountNo);
		System.out.println("the holder name : "+customerName);
		System.out.println("the balance : "+ checkbalance(balance));
		System.out.println("the interest : "+(int)calculateInterest(balance));
	}
	
	
	
	int checkbalance(int balance) {
		return balance;
	}
	
	
	double calculateInterest(int balance) {
		
		if(balance >=100000) {
			return balance*0.07;
		}
		else if(balance>=50000 && balance<100000) {
			return balance*0.06;
		}
		else {
			return balance*0.05;
		}
	}
	

}
