package com.java.assignment3;
import java.util.Scanner;

public class SimpleInterest {
	static int simplecalculator(int num1,int num2,char ch) {
		switch(ch) {
		case '+':
			return num1+num2;
		case '*':
			return num1*num2;
		case '-':
			return num1-num2;
		case '/':
			return num1/num2;
		case '%':
			return num1%num2;
		default:
			System.out.println("the invaild operstor");
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number 1 : ");
		int num1=sc.nextInt();
		System.out.println("enter the number 2 : ");
		int num2=sc.nextInt();
		System.out.println("enter the operator : ");
		char ch=sc.next().charAt(0);
		System.out.println(simplecalculator(num1,num2,ch));

	}

}
