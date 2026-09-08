package com.Assignment1;
import java.util.*;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter num1 : ");
		 int num2=sc.nextInt();
		 System.out.print("enter num2 : ");
		 int num3=sc.nextInt();
		 if (num3==num2) {
		 System.out.println("Bothe are same");
		   
		 }
		 else if(num2>num3) {
		 System.out.println("the geater number is : " + num3);
		 }
		 else {
		 System.out.println("the smallest is : "+num2);
		 }

	}

}
