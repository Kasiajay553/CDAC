package com.oopsAssignment2.question5;

public class HasARelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(23,"C++","nick",1000);
		Book book1=new Book(23,"python","jhon",1000);
		Book book2=new Book(23,"java","vicky",1000);
		Library lib=new Library("anakaplle shop","mungapka",book);
		Library lib1=new Library("anakaplle shop","mungapka",book1);
		Library lib2=new Library("anakaplle shop","mungapka",book2);
		lib.dispalylibrarydeatil();
		lib1.dispalylibrarydeatil();
		lib2.dispalylibrarydeatil();
		System.out.println("the total books="+Library.totalbooks);

	}

}
