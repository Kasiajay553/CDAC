package com.CollectionsExceptionHandlingAssignment1.Question1;

import java.util.*;

public class BookSystemMainClass {

	public static void main(String[] args) {
		BookManagnment bookmang=new BookManagnment();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("-------Enter your choice--------");
			System.out.println("1. Add Book");
			System.out.println("2. Display All Books");
			System.out.println("3. Search Book by ID");
			System.out.println("4. Update Book");
			System.out.println("5. Delete Book");
			System.out.println("6. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				bookmang.addBook();
				break;
			case 2:
				bookmang.displayAllBooks();
				break;
			case 3:
				bookmang.searchBookById();
				break;
			case 4:
				bookmang.updateBook();
				break;
			case 5:
				bookmang.deleteBook();
				break;
			case 6:
				System.exit(0);
				
			default:
				System.out.println("You have enter the invalid choice");
			}
		}
	}

}
