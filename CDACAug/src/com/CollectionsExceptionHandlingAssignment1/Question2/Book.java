package com.CollectionsExceptionHandlingAssignment1.Question2;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int price;

    public Book(int bookId, String title, String author, int price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setId(int bookId) {
        this.bookId = bookId;
    }

    public int getId() {
        return bookId;
    }

 
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        System.out.println("---------------------------");
    }
}
