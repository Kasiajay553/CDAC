//package com.jdbc;
//
//import java.sql.*;
//import java.util.Scanner;
//
//public class JDBCPreparedStatementMenuDriven {
//
//    Connection con;
//
//    // Constructor
//    public JDBCPreparedStatementMenuDriven() {
//
//        try {
//            con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/cdac",
//                    "root",
//                    "Saikeerthan@123"
//            );
//
//            System.out.println("Connection established");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void createTable() {
//
//        try {
//            String sql = "CREATE TABLE student " +
//                         "(id INT, name VARCHAR(30), marks INT, course VARCHAR(20))";
//
//            PreparedStatement smt = con.prepareStatement(sql);
//
//            smt.executeUpdate();
//
//            System.out.println("Table created successfully");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void insertStudent() {
//
//        try {
//            String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
//
//            PreparedStatement smt = con.prepareStatement(sql);
//
//            Scanner s = new Scanner(System.in);
//            System.out.println("Enter id :");
//            int id = s.nextInt();
//            System.out.println("ENter the name of student : ");
//            String name = s.next();
//            System.out.println("ENter the marks  :");
//            int marks = s.nextInt();
//            System.out.println("Enter the course name : ");
//            String course = s.next();
//            
//            smt.setInt(1, id);
//            smt.setString(2, name);
//            smt.setInt(3, marks);
//            smt.setString(4, course);
//
//            smt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void displayStudent() {
//
//        try {
//            String sql = "SELECT * FROM student";
//
//            PreparedStatement smt = con.prepareStatement(sql);
//
//            ResultSet rs = smt.executeQuery();
//
//            while (rs.next()) {
//                System.out.println(
//                    rs.getInt("id") + " " +
//                    rs.getString("name") + " " +
//                    rs.getInt("marks") + " " +
//                    rs.getString("course")
//                );
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void updateStudent() {
//
//        try {
//            String sql = "UPDATE student SET marks = ?, course = ? WHERE id = ?";
//
//            PreparedStatement smt = con.prepareStatement(sql);
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter student id: ");
//            int id = sc.nextInt();
//
//            System.out.print("Enter new marks: ");
//            int marks = sc.nextInt();
//
//            System.out.print("Enter new course: ");
//            String course = sc.next();
//
//            smt.setInt(1, marks);
//            smt.setString(2, course);
//            smt.setInt(3, id);
//
//            int rows = smt.executeUpdate();
//
//            if (rows > 0) {
//                System.out.println("Student updated successfully");
//            } else {
//                System.out.println("Student not found");
//            }
//
//            smt.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteStudent() {
//
//        try {
//            String sql = "DELETE FROM student WHERE id = ?";
//
//            PreparedStatement smt = con.prepareStatement(sql);
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter student id to delete: ");
//            int id = sc.nextInt();
//
//            smt.setInt(1, id);
//
//            int rows = smt.executeUpdate();
//
//            if (rows > 0) {
//                System.out.println("Student deleted successfully");
//            } else {
//                System.out.println("Student not found");
//            }
//
//            smt.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    public void sortByMarks() throws SQLException {
//    	String q = "select * from student order by marks desc";
//        PreparedStatement smt = con.prepareStatement(q);
//
//        ResultSet rs = smt.executeQuery();
//
//        while (rs.next()) {
//            System.out.println(
//                rs.getInt("id") + " " +
//                rs.getString("name") + " " +
//                rs.getInt("marks") + " " +
//                rs.getString("course"));
//            
//
//        }
//    }
//}

package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCPreparedStatementMenuDriven {
    // Keep a single Scanner instance to avoid "NoSuchElementException" errors
    private static final Scanner s = new Scanner(System.in);
    private Connection con;

    // Constructor
    public JDBCPreparedStatementMenuDriven() {
        try {
            // Added quotes to strings
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "Saikeerthan@123");
            System.out.println("Connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        // Used try-with-resources to automatically close PreparedStatement
        String sql = "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(30), marks INT, course VARCHAR(20))";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            smt.executeUpdate();
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudent() {
        String sql = "INSERT INTO student (id, name, marks, course) VALUES (?, ?, ?, ?)";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            System.out.println("Enter id: ");
            int id = s.nextInt();
            System.out.println("Enter the name of student: ");
            String name = s.next();
            System.out.println("Enter the marks: ");
            int marks = s.nextInt();
            System.out.println("Enter the course name: ");
            String course = s.next();

            smt.setInt(1, id);
            smt.setString(2, name);
            smt.setInt(3, marks);
            smt.setString(4, course);
            
            smt.executeUpdate();
            System.out.println("Student inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayStudent() {
        String sql = "SELECT * FROM student";
        try (PreparedStatement smt = con.prepareStatement(sql);
             ResultSet rs = smt.executeQuery()) {
             
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + 
                                   rs.getInt("marks") + " " + rs.getString("course"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent() {
        String sql = "UPDATE student SET marks = ?, course = ? WHERE id = ?";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            System.out.print("Enter student id: ");
            int id = s.nextInt();
            System.out.print("Enter new marks: ");
            int marks = s.nextInt();
            System.out.print("Enter new course: ");
            String course = s.next();

            smt.setInt(1, marks);
            smt.setString(2, course);
            smt.setInt(3, id);

            int rows = smt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated successfully");
            } else {
                System.out.println("Student not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent() {
        String sql = "DELETE FROM student WHERE id = ?";
        try (PreparedStatement smt = con.prepareStatement(sql)) {
            System.out.print("Enter student id to delete: ");
            int id = s.nextInt();
            smt.setInt(1, id);

            int rows = smt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sortByMarks() {
        String q = "SELECT * FROM student ORDER BY MARKS DESC";
        // Wrapped in try-catch to keep consistency with your other methods
        try (PreparedStatement smt = con.prepareStatement(q);
             ResultSet rs = smt.executeQuery()) {
             
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + 
                                   rs.getInt("marks") + " " + rs.getString("course"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
