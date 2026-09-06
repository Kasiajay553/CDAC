package com.java.Assignment1;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter prinicple amount : ");
		 int principle_amount=sc.nextInt();
		 float rate_of_interest=sc.nextFloat();
		 int time=sc.nextInt();
		  
		 float simple_interest = (principle_amount*rate_of_interest*time)/100;
		 System.out.println("simple intrest =" +simple_interest);
		 System.out.println("amount =" +(simple_interest+principle_amount));
	}

}
