package com.FileHandlingAssignment2.Question4;

import java.util.*;

import java.io.*;

public class StudentWriteAndRead {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("bookObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		BufferedReader bf = new BufferedReader(new FileReader("books.csv"));
		
		String objRead;
		while((objRead=bf.readLine())!=null) {
			
			String[] arr = objRead.split(",");
			Book b=new Book(Integer.parseInt(arr[0]),arr[1],arr[2],Float.parseFloat(arr[3]));
			oos.writeObject(b);
		}
		
		
		bf.close();
		oos.close();
		fos.close();
		
		
		
		FileInputStream fis = new FileInputStream("bookObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Book b;
		ArrayList<Book> al = new ArrayList<>();
		ArrayListManipulation a=new ArrayListManipulation();
		
		try {
		while((b= (Book) ois.readObject()) != null) {
			al.add(b);
		}
		}catch(Exception e) {
			
		}
		while(true) {
		System.out.println("\n===== BOOK MANAGEMENT =====");
        System.out.println("1. Display Books");
        System.out.println("2. Search Book");
        System.out.println("3. Update Book Price");
        System.out.println("4. Delete Book");
        System.out.println("5. Display Books Above ₹500");
        System.out.println("6. Find Most Expensive Book");
        System.out.println("7. Sort Books by Price");
        System.out.println("8. Display Book Count");
        System.out.println("9. Calculate Average Price");
        System.out.println("10. Save Updated Data");
        System.out.println("11. Exit");
        System.out.print("\nEnter your choice: ");
   
		
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				a.displayAllBooks(al);
				break;
			case 2:
				a.searchBook(al);
				break;
			case 3:
				a.updatebyPrice(al);
				break;
			case 4:
				a.deletebook(al);
				break;
			case 5:
				a.displayabove500(al);
				break;
			case 6:
				a.mostExpensive(al);
				break;
			case 7:
				  a.sortbook(al);
				  break;
			case 9:
				a.avgprice(al);
				break;
			case 8:
				a.totalbooknumber(al);
				break;
				
			case 10:
				a.upadtetofile(al);
				break;
			case 11:
				System.exit(0);
			default:
				System.out.println("the invalid input");
					
		}
		}
		
		
		
		
	}
}



//package com.FileHandlingAssignment2.Question4;
//
//import java.util.*;
//import java.io.*;
//
//public class StudentWriteAndRead {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Writing objects from CSV to Object file with proper exception handling
//        try (FileOutputStream fos = new FileOutputStream("bookObject.txt");
//             ObjectOutputStream oos = new ObjectOutputStream(fos);
//             BufferedReader bf = new BufferedReader(new FileReader("books.csv"))) {
//            
//            String objRead;
//            while ((objRead = bf.readLine()) != null) {
//                String[] arr = objRead.split(",");
//                if (arr.length >= 4) {
//                    try {
//                        Book b = new Book(
//                            Integer.parseInt(arr[0].trim()), 
//                            arr[1].trim(), 
//                            arr[2].trim(), 
//                            Float.parseFloat(arr[3].trim())
//                        );
//                        oos.writeObject(b);
//                    } catch (NumberFormatException nfe) {
//                        System.out.println("Skipping invalid record format: " + objRead);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error writing data to file: " + e.getMessage());
//        }
//
//        // Reading objects into ArrayList
//        ArrayList<Book> al = new ArrayList<>();
//        try (FileInputStream fis = new FileInputStream("bookObject.txt");
//             ObjectInputStream ois = new ObjectInputStream(fis)) {
//            
//            while (true) {
//                Book b = (Book) ois.readObject();
//                al.add(b);
//            }
//        } catch (EOFException e) {
//            // Reached end of file normally, ignore
//        } catch (FileNotFoundException e) {
//            System.out.println("Object file not found. Starting with an empty list.");
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Error reading book objects: " + e.getMessage());
//        }
//
//        // Menu-driven loop with ordered switch cases
//        while (true) {
//            System.out.println("\n===== BOOK MANAGEMENT =====");
//            System.out.println("1. Display Books");
//            System.out.println("2. Search Book");
//            System.out.println("3. Update Book Price");
//            System.out.println("4. Delete Book");
//            System.out.println("5. Display Books Above ₹500");
//            System.out.println("6. Find Most Expensive Book");
//            System.out.println("7. Sort Books by Price");
//            System.out.println("8. Display Book Count");
//            System.out.println("9. Calculate Average Price");
//            System.out.println("10. Save Updated Data");
//            System.out.println("11. Exit");
//            System.out.print("\nEnter your choice: ");
//            
//            int ch;
//            try {
//                ch = sc.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input! Please enter a number.");
//                sc.next(); // Clear invalid input
//                continue;
//            }
//
//            switch (ch) {
//                case 1:
//                    a.displayAllBooks(al);
//                    break;
//                case 2:
//                    a.searchBook(al);
//                    break;
//                case 3:
//                    a.updatebyPrice(al);
//                    break;
//                case 4:
//                    a.deletebook(al);
//                    break;
//                case 5:
//                    a.displayabove500(al);
//                    break;
//                case 6:
//                    a.mostExpensive(al);
//                    break;
//                case 7:
//                    a.sortbook(al);
//                    break;
//                case 8:
//                    a.totalbooknumber(al);
//                    break;
//                case 9:
//                    a.avgprice(al);
//                    break;
//                case 10:
//                    a.upadtetofile(al);
//                    break;
//                case 11:
//                    System.out.println("Exiting application. Goodbye!");
//                    sc.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid input! Please choose between 1 and 11.");
//            }
//        }
//    }
//}
