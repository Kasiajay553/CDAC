package com.java.assignment3;
import java.util.Scanner;
public class SumOfDigits {
	static int sumdigit(int num) {
		int digsum=0;
		while(num!=0) {
			digsum=digsum+(num%10);
			num/=10;
		}
		return digsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int digitsum = sumdigit(num);
		System.out.println("the orginal number is: "+num+"\nthe sum of digits number is : "+digitsum );
		

	}

}
