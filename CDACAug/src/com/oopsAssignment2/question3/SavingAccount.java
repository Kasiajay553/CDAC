package com.oopsAssignment2.question3;

public class SavingAccount extends BankAccount {
	float interstrate;
	
	SavingAccount(long accountnum,String customername, int balance,float interstrate){
		super(accountnum,customername,balance);
		this.interstrate=interstrate;
	}
	
	void calculateintrest(){
		System.out.println("the the interest is : "+balance*interstrate);
	}
	void displaysavingaccount() {
		System.out.println("------it is a Saving Account details------");
		display();
		calculateintrest();
		
	}
}
