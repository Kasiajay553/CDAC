package com.HashmapPratice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashOperation {
	
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Book> hm = new HashMap<>();
	
	void addBook() {
		System.out.println("Enter the number of books to add : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n != 0) {
		System.out.println("Enter book id :");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter book title : ");
		String title = sc.next();
		System.out.println("Enter author name :");
		String author = sc.next();
		System.out.println("ENter book price :");
		int price = sc.nextInt();
		hm.put(bookId, new Book(bookId, title, author, price));
		n--;
		}
	}
	
	void displayAllBooks() {
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			m.getValue().displayBookDetails();
		}
	}
	
	void searchBook() {
		System.out.println("Enter the book ID :");
		int bookId = sc.nextInt();
		
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			if(m.getKey() == bookId) {
				System.out.print(m.getKey() + " --->");
				m.getValue().displayBookDetails();
			}
		}
	}
	void updateBook() {
		System.out.println("Enter the book ID :");
		int bookId = sc.nextInt();
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			if(m.getKey() == bookId) {
				System.out.println("Enter the title, author and price of the book : ");
				 m.getValue().title= sc.next();
				 m.getValue().author = sc.next();
				 m.getValue().price = sc.nextInt();
			}
			
		}
		System.out.println("book is updated");
	}
	
	void deleteBook() {
		System.out.println("Enter the book ID :");
		int bookId = sc.nextInt();
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			if(m.getKey() == bookId) {
				hm.remove(bookId);
			}
			
		}
		System.out.println("Book deleted successfully");
	}
	
	void sortByPrice() {

	    hm.entrySet()
	      .stream()
	      .sorted(Comparator.comparingDouble(
	          (Map.Entry<Integer, Book> e) -> e.getValue().price
	      ).reversed())
	      .forEach(e -> e.getValue().displayBookDetails());
	}

}




//package HashmapPratice;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class HashOperation {
//    // Encapsulation: The raw map is hidden from outside classes
//    private final Map<Integer, Book> bookMap;
//
//    public HashOperation() {
//        this.bookMap = new HashMap<>();
//    }
//
//    // Add a book
//    public void addBook(int id, Book book) {
//        if (bookMap.containsKey(id)) {
//            System.out.println("Warning: Book with ID " + id + " already exists. Updating details.");
//        }
//        bookMap.put(id, book);
//        System.out.println("Success: Book added dynamically.");
//    }
//
//    // Search a book - Throws custom exception if not found
//    public Book getBook(int id) throws BookNotFoundException {
//        if (!bookMap.containsKey(id)) {
//            throw new BookNotFoundException("Error: Book with ID " + id + " does not exist in the catalog.");
//        }
//        return bookMap.get(id);
//    }
//
//    // Remove a book - Throws custom exception if not found
//    public void removeBook(int id) throws BookNotFoundException {
//        if (!bookMap.containsKey(id)) {
//            throw new BookNotFoundException("Error: Cannot remove. Book with ID " + id + " not found.");
//        }
//        bookMap.remove(id);
//        System.out.println("Success: Book with ID " + id + " removed successfully.");
//    }
//
//    // Display all books
//    public void displayAllBooks() {
//        if (bookMap.isEmpty()) {
//            System.out.println("The catalog is currently empty.");
//            return;
//        }
//        System.out.println("\n--- Current Book Catalog ---");
//        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
//            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
//        }
//    }
//}
