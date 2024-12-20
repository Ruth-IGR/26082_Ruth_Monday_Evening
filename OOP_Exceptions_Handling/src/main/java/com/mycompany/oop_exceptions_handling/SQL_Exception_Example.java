/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;
import java.util.Scanner; 
import java.sql.*;
/**
 *
 * @author ruthishimwe
 */
public class SQL_Exception_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt the user to enter database connection details.
            System.out.print("Enter the database URL (e.g., jdbc:mysql://localhost:3306/your_db): ");
            String dbUrl = sc.nextLine(); // Read the database URL.

            System.out.print("Enter the database username: ");
            String username = sc.nextLine(); // Read the database username.

            System.out.print("Enter the database password: ");
            String password = sc.nextLine(); // Read the database password.

            // Attempt to establish a connection to the database with the provided details.
            Connection connect = DriverManager.getConnection(dbUrl, username, password);

            // If the connection is successful, print a success message.
            System.out.println("Successfully connected to the database.");
        } catch (SQLException e) {
            // Catch SQLException and print an error message if connection fails.
            System.out.println("SQLException occurred: " + e.getMessage());
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            sc.close();
        }
    }
}
