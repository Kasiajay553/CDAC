package com.java.assignment3;
import java.util.Scanner;

public class ReverseANumber {
	
	static int reverse(int num) {
		int revnum=0; 
		
		while(num!=0) {
			revnum=(revnum*10)+num%10;
			num/=10;
		}
		return revnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int reversenumber = reverse(num);
		System.out.println("the orginal number is: "+num+"\nthe reverse number is : "+reversenumber);
		

	}

}
