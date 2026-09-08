package com.Assignment1;
import java.util.*;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter age : ");
		 int age=sc.nextInt();
		 if(age>=18) {
		 System.out.println(" eligible");
		 }
		 else {
		 System.out.println("not eligible");
		 }
	}

}
