package com.java.pratice;
import java.util.ArrayList;
import java.util.Scanner;

public class StudendManagementArrayList {

	ArrayList <StudentArrayList> arrofstudent=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	
	void creationOfstudent() {
		System.out.println("Enter the number od student you wants to add : ");
		int numOfStudents=sc.nextInt();
		for(int i =0;i<numOfStudents;i++) {
			System.out.println(" Enter the id student : "+(i+1));
			int id=sc.nextInt();
			System.out.println("Enter the  name student : "+(i+1));
			String name=sc.next();
			StudentArrayList s=new StudentArrayList(id,name);
			arrofstudent.add(s);
		}
		System.out.println(" the studentes are add sucessfully");
	}
	
	void udateOfstudent() {
		System.out.println("Enter the id to update student : ");
		int id=sc.nextInt();
		for(StudentArrayList s : arrofstudent) {
			if (s.id==id) {
				System.out.println("enter the name to change : ");
				String name=sc.next();
				s.name=name;
				System.out.println("the upadation completed");
			}
			else {
				System.out.println("invliad id number");
			}
		}
	}
	
	
	void deleteOfstudent() {
		System.out.println("Enter the id to delete student : ");
		int id=sc.nextInt();
		int pos=0;
		for(StudentArrayList s : arrofstudent) {
			if (s.id==id) {
				pos=arrofstudent.indexOf(s);
				System.out.println("thedeletion completed");
			}
			else {
				System.out.println("invliad id number");
			}
			arrofstudent.remove(pos);
		}
	}
	
	void displayOfstudent() {
		
		for(StudentArrayList s : arrofstudent) {
			
			s.displayStudents();
		}
	}
	
}
