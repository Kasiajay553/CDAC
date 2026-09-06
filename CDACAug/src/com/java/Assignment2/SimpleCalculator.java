package com.java.Assignment2;
import java.util.Scanner;
public class SimpleCalculator {
	
	
	static  int calculator(int num1, int num2, char operator) {
		switch(operator) {
		case '+':
			return num1+num2;
			
		case '-':
			return num1-num2;
			
		case '*':
			return num1*num2;
			
		case '/':
			if(num2!=0) {
				return num1/num2;
			}
			else {
				System.out.println("can not be divided by Zero");
				return 0;
			}
			
		default:
			System.out.println("invalid opewrator");
			return 0;
		}
		
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1: ");
		int number1=sc.nextInt();	
		System.out.println("enter number 2: ");
		int number2=sc.nextInt();
		System.out.println("enter operator (+, -, *, /) ");
		char operator=sc.next().charAt(0);
		int result=calculator(number1, number2,operator);
		System.out.println("the result : "+ result);
		

	}

}
