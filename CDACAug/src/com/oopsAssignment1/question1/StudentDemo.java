package com.oopsAssignment1.question1;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.rollno=101;
		s1.name="nick";
		s1.marks=89;
		
		s2.rollno=103;
		s2.name="john";
		s2.marks=67;
		
		s3.rollno=103;
		s3.name="lilly";
		s3.marks=56;
		
		System.out.println("the student 1 details");
		s1.display();
		s1.calculateGrade();
		System.out.println("the student 2 details");
		s2.display();
		s2.calculateGrade();
		System.out.println("the student 3 details");
		s3.display();
		s3.calculateGrade();

	}

}
