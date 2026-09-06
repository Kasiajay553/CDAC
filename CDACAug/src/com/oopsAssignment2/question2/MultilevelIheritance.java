package com.oopsAssignment2.question2;

import java.util.Scanner;

import com.oopsAssignment2.question1.Manager;

public class MultilevelIheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Manager m1= new Manager("nikhil",18,2002,25000,"pgcp-ac",2);
//		m1.displaymanager();
//		Manager m2= new Manager("nikhil",18,2002,25000,"pgcp-ac",2);
//		m1.displaymanager();
//		Manager m3= new Manager("nikhil",18,2002,25000,"pgcp-ac",2);
//		m1.displaymanager();
		Managers[] mangobj=new Managers[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("----------enter details Employee "+(i+1)+"-------------- ");
			
			System.out.println("enter Name : ");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("enter age : ");
			int age=sc.nextInt();
			System.out.println("enter Id of employee : ");
			int empId=sc.nextInt();
			System.out.println("enter salary of employee : ");
			int salary=sc.nextInt();
			sc.nextLine();
			System.out.println("enter department  of manager : ");
			String department=sc.nextLine();
			System.out.println("enter team  size : ");
			int teamsize=sc.nextInt();
			mangobj[i]=new Managers(name,age,empId,salary,department,teamsize);
			
		}
		for(int i=0;i<3;i++) {
			mangobj[i].displaymanager();
		}

	}

}
