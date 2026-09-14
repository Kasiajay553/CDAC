package com.JDBCAssignment4.Question1;
import java.util.Scanner;

public class StudentMainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentJDBCOpeartions studoperation = new StudentJDBCOpeartions();
        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert Student\n2. Display All\n3. Search Student\n4. Update Student\n5. Delete Student\n6. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // Clear scanner buffer after choice execution
                
                switch (choice) {
                    case 1 -> studoperation.insertAStudent();
                    case 2 -> studoperation.displayAllStudent();
                    case 3 -> studoperation.serachAStudent();
                    case 4 -> studoperation.upadteStudent();
                    case 5 -> studoperation.deleteStudent();
                    case 6 -> {
                        loop = false;
                        System.out.println("The JDBC operation Done........");
                    }
                    default -> System.out.println("Enter a correct choice (1-6)");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace(); // FIXED: Real trace printing instead of empty getMessage()
                sc.nextLine(); // Clean scanner if a non-integer typo occurs in menu choice
            }
        }
        sc.close();
    }
}
