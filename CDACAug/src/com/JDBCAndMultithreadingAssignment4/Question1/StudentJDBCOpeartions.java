package com.JDBCAndMultithreadingAssignment4.Question1;
import java.util.*;
import java.sql.*;

public class StudentJDBCOpeartions {
    private final String url = "jdbc:mysql://localhost:3306/jdbcpratice";
    private final String user = "root";
    private final String password = "ajay";
    Connection con;
    Scanner sc = new Scanner(System.in);

    StudentJDBCOpeartions() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully done........");
        } catch (Exception e) {
            System.out.println("Invalid connection / connection failed:");
            e.printStackTrace();
        }
    }

    public void insertAStudent() {
        try {
            PreparedStatement pre = con.prepareStatement("insert into student values(?,?,?,?)");
            System.out.println("Enter the Student ID : ");
            int studentId = sc.nextInt();
            sc.nextLine(); 
            pre.setInt(1, studentId);

            System.out.println("Enter the name of the student: ");
            String studentName = sc.nextLine();
            pre.setString(2, studentName);

            System.out.println("Enter the course of the student: ");
            String course = sc.nextLine();
            pre.setString(3, course);

            System.out.println("Enter the marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); 

            pre.setInt(4, marks);

            int rs = pre.executeUpdate();
            System.out.println("The insertion done .... Rows affected: " + rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void displayAllStudent() {
        String sql = "Select * from student";
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Student Id : " + rs.getInt("studentId") + 
                                   " | Name : " + rs.getString("studentName") + 
                                   " | Course : " + rs.getString("course") + 
                                   " | Marks : " + rs.getInt("marks"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void serachAStudent() throws SQLException {
        System.out.println("Enter the ID to search: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer

        // Fixed typo: 'studetId' to 'studentId'
        PreparedStatement pre = con.prepareStatement("select * from student where studentId=?");
        pre.setInt(1, id); // FIXED: Added missing parameter binding

        ResultSet rs = pre.executeQuery();
        
        // FIXED: Loop over ResultSet to show actual values
        if (rs.next()) {
            System.out.println("Student Found -> Id : " + rs.getInt("studentId") + 
                               " | Name : " + rs.getString("studentName") + 
                               " | Course : " + rs.getString("course") + 
                               " | Marks : " + rs.getInt("marks"));
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }

    void upadteStudent() throws SQLException {
        System.out.println("Enter the ID to update : ");
        int searchId = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.println("Enter the new name of student :");
        String studentName = sc.nextLine();

        System.out.println("Enter the new course: ");
        String course = sc.nextLine();

        System.out.println("Enter the new marks : ");
        int marks = sc.nextInt();
        sc.nextLine(); // Clear buffer

        // FIXED: Corrected spelling from 'upate' to 'UPDATE' and set WHERE condition to 'studentId'
        PreparedStatement pre = con.prepareStatement("UPDATE student SET studentName=?, course=?, marks=? WHERE studentId=?");

        pre.setString(1, studentName);
        pre.setString(2, course);
        pre.setInt(3, marks);
        pre.setInt(4, searchId);

        int rows = pre.executeUpdate();
        if(rows > 0) {
            System.out.println("The update is successfully done.");
        } else {
            System.out.println("No student found with ID: " + searchId);
        }
    }

    void deleteStudent() throws SQLException {
        System.out.println("Enter ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer

        PreparedStatement pre = con.prepareStatement("delete from student where studentId =?");
        pre.setInt(1, id);

        int rows = pre.executeUpdate();
        if(rows > 0) {
            System.out.println("The deletion done.");
        } else {
            System.out.println("No student found with ID: " + id);
        }
    }
}
