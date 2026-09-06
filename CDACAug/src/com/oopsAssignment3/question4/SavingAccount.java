package com.oopsAssignment3.question4;

public class SavingAccount  extends BankAccount{
	static int percentagelimit=90;
	SavingAccount(long accountNumber,String customerName,long balance){
		super( accountNumber, customerName,balance);

	}
	
	@Override
	void calculatewithdrawalLimit() {
		System.out.println("the max with draw limit is : "+(balance*0.9));
	} 

}
