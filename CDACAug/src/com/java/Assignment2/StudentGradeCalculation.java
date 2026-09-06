package com.java.Assignment2;
import java.util.Scanner;

public class StudentGradeCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the marks of student");
		int marks = sc.nextInt();
		char result=calculategrade(marks);
		System.out.println("result of the student :" +result);		
		

	}

		 static char calculategrade(int marks) {
			 if(marks>=90 && marks<=100) {
				 return 'A';
			 }
			 else if(marks>=75 && marks<=89) {
				 return 'B';
			 }
			 else if(marks>=60 && marks<=74) {
				 return 'C'; 
			 }
			 else if(marks>=50 && marks<=59) {
				 return 'D';
			 }
			 else {
				return 'F';
			 }
				 
			
		}
}
