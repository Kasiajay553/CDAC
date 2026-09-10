package com.HashmapPratice;

public class Book {
int bookId;
String title;
String author;
int price;
public Book(int bookId, String title, String author, int price) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.price = price;
}

void displayBookDetails() {
	System.out.printf("the book details [ID : %d, Title : %s, Author:%s, Price : %d]\n",bookId,title,author,price);
}
}
//package HashmapPratice;
//
//public class Book {
//    private String title;
//    private String author;
//
//    // Constructor
//    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }
//
//    // Getters and Setters
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    // toString method for easy printing
//    @Override
//    public String toString() {
//        return "'" + title + "' by " + author;
//    }
//}
