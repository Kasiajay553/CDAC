package com.java.Assignment1;
import java.util.*;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter num : ");
		 int num1=sc.nextInt();
		 if(num1==0) {
		 System.out.println("zero");
		   
		 }
		 else if(num1>0) {
		 System.out.println("positive number");
		 }
		 else {
		 System.out.println("negative number");
		 }
	}

}
