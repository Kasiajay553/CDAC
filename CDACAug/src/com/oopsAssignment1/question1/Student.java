package com.oopsAssignment1.question1;

public class Student {
	int rollno;
	String name;
	int marks;

	
	 void display() {
		System.out.println("student rollno : "+rollno);
		System.out.println("student name : "+name);
		System.out.println("student marks : "+marks);
	}
	void calculateGrade() {
		if(marks>=90) {
			System.out.println("student grade : Grade A");
		}
		else if(marks>=75 &marks<90){
			System.out.println("student grade : Grade B");
		}else if(marks>=60 &marks<75){
			System.out.println("student grade : Grade C");
		}
		else {
			System.out.println("student grade : Grade D");
		}
	}
	
}
