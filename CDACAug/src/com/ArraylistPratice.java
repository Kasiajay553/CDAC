package com.java.pratice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPratice {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	boolean loop=true;
	StudendManagementArrayList opearationobject= new StudendManagementArrayList();
	
	while(loop) {
		System.out.println("Enter your choice from the drop down");
		System.out.println("Enter 1 for the creation : ");
		System.out.println("Enter 2 for the update : ");
		System.out.println("Enter 3 for the  delete : ");
		System.out.println("Enter 4 for the  dispaly : ");
		System.out.println("Enter 5 for the Exit : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			opearationobject.creationOfstudent();
			break;
		case 2:
			opearationobject.udateOfstudent();
			break;
		case 3:
			opearationobject.deleteOfstudent();
			break;
		case 4:
			opearationobject.displayOfstudent();
			break;
		case 5:
			System.out.println("Exiting application...");
			loop = false;
			break;
			
		default:
			System.out.println("the invlaid choice");
		}
		
		
		
	}
		
	}
}
