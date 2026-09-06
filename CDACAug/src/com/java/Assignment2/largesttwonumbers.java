package com.java.Assignment2;
import java.util.Scanner;
public class largesttwonumbers {
	static int findlargest(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int largest=findlargest(num1,num2);
		System.out.println("the biggest number is : "+largest);
		

	}

}
