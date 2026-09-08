package com.Assignment2;
import java.util.Scanner;

public class ProductDiscount {
	
	static double finalprice(int p) {
		if (p>=10000) {
			return p*0.2;
		}
		else if(p>=5000 && p<=9999) {
			return p*0.1;
		}
		else if(p>=2000 && p<=4999) {
			return p*0.05;
		}
		else {
			return p;
		}
	
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the product id : ");
		int productid = sc.nextInt();
		sc.nextLine();
		System.out.print("enter the product name : ");
		String productname =sc.nextLine();
		System.out.println("enter the price : ");
		int price = sc.nextInt();
		double finaldiscount=finalprice(price);
		System.out.println("the final discouted amout is  :"+finaldiscount);
		
		

	}
 
}
