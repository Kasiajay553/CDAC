package com.java.Assignment2;
import java.util.Scanner;

public class Votingeligibility {
	
	static boolean iseligible(int a) {
		if(a>=18) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age= sc.nextInt();
		boolean vote=iseligible(age);
		System.out.println("eligible to vote   : "+vote);
		

	}

}
