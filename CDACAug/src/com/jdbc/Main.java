package com.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        JDBCPreparedStatementMenuDriven obj =
                new JDBCPreparedStatementMenuDriven();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Student");
            System.out.println("3. Display Students");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("7. Sort By marks ");

            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                obj.createTable();
                break;

            case 2:
                obj.insertStudent();
                break;

            case 3:
                obj.displayStudent();
                break;

            case 4:
                obj.updateStudent();
                break;

            case 5:
                obj.deleteStudent();
                break;
            case 7 :
            	obj.sortByMarks();
            	break;

            case 6:
                
                System.out.println("Program exited...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
