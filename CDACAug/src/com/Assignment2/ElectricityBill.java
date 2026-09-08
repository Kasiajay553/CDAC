package com.Assignment2;
import java.util.Scanner;

public class ElectricityBill {
	static int calculateBill(int units) {
		if (units>=0 && units<=100) {
			return units*2;
		}
		else if(units>=101 && units<=200) {
			return units*3;
		}
		else if(units>=201 && units<=300) {
			return units*5;
		}
		else {
			return units*7;
		}
		
	}
		

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	System.out.print("enter the number of units : ");
	int units=sc.nextInt();
	int bill=calculateBill(units);
	System.out.println(bill);
			
	
	
	
		
	}
}
