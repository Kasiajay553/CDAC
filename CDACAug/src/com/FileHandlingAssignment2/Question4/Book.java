package com.FileHandlingAssignment2.Question4;

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
	public float getprice() {
		return price;
	}
	public void displayBook() {
		System.out.println(bookId +" ||"+ title +"|| "+  author +"|| "+  price);
	}

}




//package com.FileHandlingAssignment2.Question4;
//
//import java.io.Serializable;
//
//public class Book implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    private int bookId;
//    private String title;
//    private String author;
//    private float price;
//
//    public Book(int bookId, String title, String author, float price) {
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    public int getBookId() {
//        return bookId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public void displayBook() {
//        System.out.println(
//                bookId + " || " +
//                title + " || " +
//                author + " || " +
//                price
//        );
//    }
//}