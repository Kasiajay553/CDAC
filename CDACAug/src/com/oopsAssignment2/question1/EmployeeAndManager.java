package com.oopsAssignment2.question1;
import java.util.Scanner;

public class EmployeeAndManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager[] mangobj=new Manager[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("----------enter details Employee "+(i+1)+"-------------- ");
		
			System.out.println("enter Id of employee : ");
			int empId=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Name of employee : ");
			String empname=sc.nextLine();
			System.out.println("enter salary of employee : ");
			int salary=sc.nextInt();
			sc.nextLine();
			System.out.println("enter department  of manager : ");
			String department=sc.nextLine();
			System.out.println("enter team  size : ");
			int teamsize=sc.nextInt();
			mangobj[i]=new Manager(empId,empname,salary,department,teamsize);
			mangobj[i].displaydetails();
		}

	}

}
