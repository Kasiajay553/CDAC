package com.assignment3;
import java.util.Scanner;

public class SimpleCalculator {
	
	static int calculate(int a, int b, char c) {
		switch(c) {
		case '+':
			return a+b;
		
		case '-':
		return a-b;
	
		case '*':
		return a*b;
		
		case '/':
			return a/b;
		default :
			return 0;
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		System.out.println("enter the operator :");
		char opre =sc.next().charAt(0);
		int finalresult=calculate(num1,num2,opre);
		System.out.println("the performed math operation is :" +finalresult);
		

	}

}
