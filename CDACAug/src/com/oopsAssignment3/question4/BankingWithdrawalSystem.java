package com.oopsAssignment3.question4;

public class BankingWithdrawalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount currac=new CurrentAccount(1234567,"ajay",25000);
		currac.deposit(23950);
		currac.displayAccountDetails();
		currac.calculatewithdrawalLimit();
		SavingAccount savac=new SavingAccount(987653,"Kasi",5000);
		savac.deposit(5600);
		savac.displayAccountDetails();
		savac.calculatewithdrawalLimit();

	}

}
