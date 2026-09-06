package com.oopsAssignment2.question5;

public class Book {
	int bookId;
	String title;
	String author;
	int price;

	Book(int bookId,String title,String author,int price){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displaybook() {
		System.out.println("the book Id: "+bookId);
		System.out.println("the book title : "+title);
		System.out.println("the book author : "+author);
		System.out.println("the book price"+price);
	}
	

}
