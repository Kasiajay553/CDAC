package com.BankingManagnment;

import java.util.Scanner;

public class BankingOperation {
	static Scanner sc=new Scanner(System.in);
	
	static int amount=1000;
	
	
	int desposit() {
		System.out.println("eneter amount to be Desposit");
		int desamount=sc.nextInt();
		amount= amount+desamount;
		return amount;
	}
	static int withdraw() {
		System.out.println("eneter amount to be withdraw");
		int withamount=sc.nextInt();
		amount= amount-withamount;
		return amount;
	}
	static int balance() {
		System.out.println("the balance present");	
		return  amount;
	}
}
