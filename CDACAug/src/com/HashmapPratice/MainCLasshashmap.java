package com.HashmapPratice;
import java.util.*;

public class MainCLasshashmap {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		HashOperation h = new HashOperation();
		
		while(true) {
			System.out.println("Menu : \n1. Add Book\n2. Display Books\n3. Search Book\n4. Update Book\n5. Delete Book\n6. Sort by marks\n7. Exit");
			int n = sc.nextInt();
			switch(n) {
			case 1 :
				h.addBook();
				break;
			case 2 :
				h.displayAllBooks();
				break;
			case 3 :
				h.searchBook();
				break;
			case 4 :
				h.updateBook();
				break;
			case 5:
				h.deleteBook();
				break;
			case 7:
				System.exit(0);
			case 6 :
				h.sortByPrice();
				break;
				default :
					System.out.println("Enter the valid numbers ");
			}
			
		}


	}
}
