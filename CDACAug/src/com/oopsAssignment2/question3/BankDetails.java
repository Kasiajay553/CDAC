package com.oopsAssignment2.question3;
import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SavingAccount[] savacc=new SavingAccount[2];
		CurrentAccount[] curacc=new CurrentAccount[2];
		for(int i=0;i<2;i++) {
			System.out.println("enter the saving account details--------");
			System.out.println("the account of saving number "+(i+1));
			System.out.println("enter the account number : ");
			int accno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the customer name : ");
			String cusname=sc.next();
			System.out.println("enter the balance : ");
			int bal=sc.nextInt();
			System.out.println("enter the Interest : ");
			float interest=sc.nextFloat();
			savacc[i]=new SavingAccount(accno,cusname,bal,interest);
			
		}
		savacc[0].displaysavingaccount();
		savacc[1].displaysavingaccount();
		
		for(int i=0;i<2;i++) {
			System.out.println("enter the current account bdetails--------");
			System.out.println("the account of current "+i+1);
			System.out.println("enter the account number : ");
			int accno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the customer name : ");
			String cusname=sc.next();
			System.out.println("enter the balance : ");
			int bal=sc.nextInt();
			System.out.println("enter the minibalance : ");
			int  minibalance=sc.nextInt();
			curacc[i]=new CurrentAccount(accno,cusname,bal, minibalance);
		}
		curacc[0].diaplaycurrentaccount();
		curacc[1].diaplaycurrentaccount();
	}

}
