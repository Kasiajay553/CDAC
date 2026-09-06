package com.java.Assignment2;
import java.util.Scanner;

public class BusTicketFare {
	
	static int calculateFare(int age) {
		if (age<5) {
			return 0;
		}
		else if(age>=5 && age<=20) {
			return 20;
		}
		else if(age >=13 && age<=59) {
			return 40;
		}
		else {
			return 25;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name of passenger : ");
		String name=sc.next();
		System.out.println("enter the age : ");
		int age =sc.nextInt();
		int fare=calculateFare(age);
		System.out.println("the name of passenger : "+ name +"\nThe age : "+ age+"\nThe Fare : "+fare);

	}

}
