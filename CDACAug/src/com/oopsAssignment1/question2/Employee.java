package com.oopsAssignment1.question2;

import java.util.Scanner;

public class Employee {
	int empId;
	String empname;
	int salary;
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empId : ");
		empId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the empname : ");
		empname=sc.nextLine();
		System.out.println("enter the salary : ");
		salary=sc.nextInt();
	}
	
	void display() {
		System.out.println("the employee Id : "+empId);
		System.out.println("the employee name : "+empname);
		System.out.println("the employee salary: "+salary);
	}
	
	void calculateBonus() {
		if(salary>=50000) {
			System.out.println("the  bounus for employee : "+(salary*0.1));
		}
		else {
			System.out.println("the  bounus for employee : "+(salary*0.05));
		}
		
	}

}
