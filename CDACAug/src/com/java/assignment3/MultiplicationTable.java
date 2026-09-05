package com.java.assignment3;

import java.util.Scanner;

public class MultiplicationTable {
	
	static int calculation(int num,int i) {
		return num*i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the nubmer that you print the table : ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+calculation(num, i));
		}
		

	}

}
