package com.FileHandlingAssignment2.Question4;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class ArrayListManipulation {
	Scanner sc = new Scanner(System.in);
	public void displayAllBooks(ArrayList<Book> al) {
		for(Book obj : al) {
			obj.displayBook();
		}
	}
	
	void searchBook(ArrayList<Book> al) {
		System.out.println("enter bookId ");
		int id=sc.nextInt();
		for(Book ele: al) {
			if(ele.bookId==id) {
				System.out.println("book found " + ele.title);
			}
		}
	}
	
	void updatebyPrice(ArrayList<Book> al) {
		System.out.println("enter bookId ");
		int id=sc.nextInt();
		System.out.println("enter the new price of book : ");
		float newPrice=sc.nextFloat();
		for(Book ele: al) {
			if(ele.bookId==id) {
				ele.price=newPrice;
				System.out.println("book price upadted to " + ele.price);
			}
		}
	}
	
//	void deletebook(ArrayList<Book> al) {
//		System.out.println("enter bookId ");
//		int id=sc.nextInt();
//		
//		for(Book ele: al) {
//			if(ele.bookId==id) {
//				al.remove(ele);
//				System.out.println("book is deleted " );
//			}
//		}
//	}
//	
	
	void deletebook(ArrayList<Book> al) {

	    System.out.println("enter bookId ");

	    int id = sc.nextInt();

	    Iterator<Book> itr = al.iterator();

	    while(itr.hasNext()) {

	        Book ele = itr.next();

	        if(ele.bookId == id) {

	            itr.remove();

	            System.out.println("book is deleted ");
	            break;
	        }
	    }
	}
	
	public void displayabove500(ArrayList<Book> al) {
		for(Book obj : al) {
			if(obj.price>500) {
				obj.displayBook();
			}
			
		}
	}
	
	float expensive=0;
	public void mostExpensive(ArrayList<Book> al) {
		for(Book obj : al) {
			if(obj.price>expensive) {
				expensive=obj.price;
			}	
		}
		for(Book obj : al) {
			if(obj.price==expensive) {
				System.out.println("the most expensive");
				obj.displayBook();
			}	
		}
	}
	
//	void sortbook(ArrayList<Book> al) {
//		al.sort(al,Comparator.comparing(al::getprice).reversed());
//		
//		//Arrays.sort(studentArray, Comparator.comparingInt(Student::getMarks).reversed());;
//	}
	
	void sortbook(ArrayList<Book> al) {

	    al.sort(Comparator.comparing(Book::getprice).reversed());

	    displayAllBooks(al);
	}
	void totalbooknumber(ArrayList<Book> al) {
		System.out.println("the total book count : ");
		System.out.println(al.size());
	}
	
	void avgprice(ArrayList<Book> al) {
		float sum=0;
		int size=al.size();
		for(Book ele:al) {
			sum+=ele.price;
		}
		System.out.println("the average price is"+sum/size);
				
	}
	
//	void upadtetofile(ArrayList<Book> al) throws IOException {
//		FileOutputStream fos = new FileOutputStream("bookObject.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		for(Book ele: al) {
//			oos.writeObject(ele);
//		}
//		 oos.close();
//		    fos.close();
//
//		    System.out.println("Updated data saved successfully");
//	}
//	
//	
	
	
	void upadtetofile(ArrayList<Book> al) throws IOException {

	    FileWriter fw = new FileWriter("books.csv");

	    for(Book ele : al) {

	        fw.write(ele.bookId + "," +
	                 ele.title + "," +
	                 ele.author + "," +
	                 ele.price + "\n");
	    }

	    fw.close();

	    System.out.println("Updated data saved successfully");
	}
	
	
	
	
}







//package com.FileHandlingAssignment2.Question4;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Iterator;
//
//public class ArrayListManipulation {
//
//    // Display all books
//    public void displayAllBooks(ArrayList<Book> books) {
//
//        if (books.isEmpty()) {
//            System.out.println("No books available.");
//            return;
//        }
//
//        for (Book book : books) {
//            book.displayBook();
//        }
//    }
//
//    // Search book
//    public void searchBook(ArrayList<Book> books, int id) {
//
//        boolean found = false;
//
//        for (Book book : books) {
//
//            if (book.getBookId() == id) {
//
//                System.out.println("Book found: " + book.getTitle());
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Book not found.");
//        }
//    }
//
//    // Update book price
//    public void updateByPrice(ArrayList<Book> books, int id, float newPrice) {
//
//        boolean found = false;
//
//        for (Book book : books) {
//
//            if (book.getBookId() == id) {
//
//                book.setPrice(newPrice);
//
//                System.out.println(
//                        "Book price updated to " + book.getPrice()
//                );
//
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Book not found.");
//        }
//    }
//
//    // Delete book
//    public void deleteBook(ArrayList<Book> books, int id) {
//
//        Iterator<Book> iterator = books.iterator();
//
//        while (iterator.hasNext()) {
//
//            Book book = iterator.next();
//
//            if (book.getBookId() == id) {
//
//                iterator.remove();
//
//                System.out.println("Book is deleted.");
//                return;
//            }
//        }
//
//        System.out.println("Book not found.");
//    }
//
//    // Display books above ₹500
//    public void displayAbove500(ArrayList<Book> books) {
//
//        boolean found = false;
//
//        for (Book book : books) {
//
//            if (book.getPrice() > 500) {
//
//                book.displayBook();
//                found = true;
//            }
//        }
//
//        if (!found) {
//            System.out.println("No books found above ₹500.");
//        }
//    }
//
//    // Find most expensive book
//    public void mostExpensive(ArrayList<Book> books) {
//
//        if (books.isEmpty()) {
//            System.out.println("No books available.");
//            return;
//        }
//
//        float expensive = 0;
//
//        for (Book book : books) {
//
//            if (book.getPrice() > expensive) {
//                expensive = book.getPrice();
//            }
//        }
//
//        System.out.println("The most expensive book:");
//
//        for (Book book : books) {
//
//            if (book.getPrice() == expensive) {
//                book.displayBook();
//            }
//        }
//    }
//
//    // Sort books by price
//    public void sortBook(ArrayList<Book> books) {
//
//        books.sort(
//                Comparator.comparing(Book::getPrice).reversed()
//        );
//
//        displayAllBooks(books);
//    }
//
//    // Total number of books
//    public void totalBookNumber(ArrayList<Book> books) {
//
//        System.out.println(
//                "The total book count: " + books.size()
//        );
//    }
//
//    // Average price
//    public void averagePrice(ArrayList<Book> books) {
//
//        if (books.isEmpty()) {
//            System.out.println("No books available.");
//            return;
//        }
//
//        float sum = 0;
//
//        for (Book book : books) {
//            sum += book.getPrice();
//        }
//
//        float average = sum / books.size();
//
//        System.out.println("The average price is: " + average);
//    }
//
//    // Save updated data
//    public void updateToFile(ArrayList<Book> books) throws IOException {
//
//        try (FileWriter fw = new FileWriter("books.csv")) {
//
//            for (Book book : books) {
//
//                fw.write(
//                        book.getBookId() + "," +
//                        book.getTitle() + "," +
//                        book.getAuthor() + "," +
//                        book.getPrice() + "\n"
//                );
//            }
//        }
//
//        System.out.println("Updated data saved successfully.");
//    }
//}
