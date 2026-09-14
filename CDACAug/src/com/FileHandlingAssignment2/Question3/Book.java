package com.FileHandlingAssignment2.Question3;

import java.io.Serializable;

public class Book implements Serializable{
	int bookId;
	String title;
	String author;
	float price;
	public Book(int bookId, String title, String author, float price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
		System.out.println("enter the book id :"+bookId);
		System.out.println("enter the title of book :"+title);
		System.out.println("enter the author name :"+author);
		System.out.println("enter the price of the book :"+price);
	}
	

}
