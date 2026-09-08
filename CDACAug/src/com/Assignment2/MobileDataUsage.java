package com.Assignment2;
import java.util.Scanner;
public class MobileDataUsage {
	static int calculatecharge(int a) {
		if(a<=1) {
			return 50;
		}
		else if(a>1 && a<5)
		{
			return 100;
		}
		else if(a>5 && a<10) {
			return 200;
		}
		else {
			return 350;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the mobile number : ");
		long number = sc.nextLong();
		System.out.println("enter the data usage in gb : ");
		int gb =sc.nextInt();
		int charge = calculatecharge(gb);
		System.out.println("the mobile number is : " +number +"\nthe data usage is "+gb +"\nfinal charge is :"+charge);
		

	}

}
