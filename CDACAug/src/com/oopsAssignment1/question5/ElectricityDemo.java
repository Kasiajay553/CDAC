package com.oopsAssignment1.question5;
import java.util.Scanner;

public class ElectricityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ElectricityBill[] elecbill=new ElectricityBill[5];
		for(int i=0;i<5;i++) {
			System.out.println("enter the deatils bill "+i+1);
			System.out.println("the consumer number : ");
			int cosumerno=sc.nextInt();
			sc.nextLine();
			System.out.println("the consumer name : ");
			String cosumerName=sc.nextLine();
			System.out.println("the consumer consume units : ");
			int units=sc.nextInt();
			sc.nextLine();
			elecbill[i]=new ElectricityBill(cosumerno, cosumerName, units);
			elecbill[i].display();
		}
		

	}

}
