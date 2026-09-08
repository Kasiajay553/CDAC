package com.BankingManagnment;
import java.util.Scanner;


public class BankManagnament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		while(true) {
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		//System.out.println(BankingOperation.amount);
		int choice=sc.nextInt();
		switch(choice) {
			case 1:{
				BankingOperation e=new BankingOperation();
				System.out.println("the total balance is "+ e.desposit());
				break;
			}
			case 2:{
				System.out.println("the total balance is "+ BankingOperation.withdraw());
				break;
			}
			case 3:{
				System.out.println("the total balance is "+ BankingOperation.balance());
				break;
			}
			case 4:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Enter correct vaild choice :");
			}
		}
		
	}

}
