package com.oopsAssignment2.question5;


public class LibraryHasABook {

	public static void main(String[] args) {
	        Book book1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 10);
	        Book book2 = new Book(102, "To Kill a Mockingbird", "Harper Lee", 14);
	        Book book3 = new Book(103, "1984", "George Orwell", 12);

	        Library lib1 = new Library("Central Library", "Downtown", book1);
	   
	        Library lib2 = new Library("City Public Library", "Northside", book2);
	        Library lib3 = new Library("University Library", "Campus East", book3);
	        
	        lib1.dispalylibrarydeatil();
	        lib2.dispalylibrarydeatil();
	        lib3.dispalylibrarydeatil();
	        System.out.println("the total number book : "+Library.totalbook);

	}

}
