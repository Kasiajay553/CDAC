package com.oopsAssignment3.question4;

public class CurrentAccount extends BankAccount {
	
	CurrentAccount(long accountNumber,String customerName,long balance){
		super( accountNumber, customerName,balance);

	}
	
	@Override
	void calculatewithdrawalLimit() {
		System.out.println("the max with draw limit is : "+(balance+(balance*5.0)));
	} 

}
