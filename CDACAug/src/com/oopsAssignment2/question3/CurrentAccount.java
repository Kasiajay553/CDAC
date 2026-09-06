package com.oopsAssignment2.question3;

public class CurrentAccount extends BankAccount {
	 int minimumbalance ;
	void minimumbalancemethod(){
		
		if( balance<10000) {
			System.out.println("not suffcent balance");
		}
		else {
			System.out.println("you have sufficent balance");
		}
	}
	CurrentAccount(long accountnum,String customername, int balance,int minimumbalance){
		super(accountnum,customername,balance);
		 this.minimumbalance= minimumbalance;
	}

	void diaplaycurrentaccount() {
		display();
		minimumbalancemethod();
	}
}
