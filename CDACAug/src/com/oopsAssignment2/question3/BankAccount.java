package com.oopsAssignment2.question3;

public class BankAccount {
	long accountnum;
	String customername;
	int balance;
	static String bankname= "SBI"; 
	BankAccount(long accountnum,String customername, int balance){
		this.accountnum= accountnum;
		this.customername= customername;
		this.balance= balance;
	}
	
	void display() {
		System.out.println("enter the bank account number : "+accountnum);
		System.out.println("enter the custername : "+customername);
		System.out.println("enter the balance : "+balance);
	}
}
