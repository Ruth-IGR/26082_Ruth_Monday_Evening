/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author ruthishimwe
 */
public class File_Not_Found_Exception_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        try {
            // Prompt the user to enter the file name.
            System.out.print("Enter the name of the file to open: ");
            String fileName = sc.nextLine(); // Read the file name from the user.

            // Attempt to open the specified file using FileReader.
            FileReader reader = new FileReader(fileName);

            // If the file is found, print a success message.
            System.out.println("File '" + fileName + "' opened successfully.");
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException and handle it.
            System.out.println(" The file '" + e.getMessage() + "' was not found.");
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            sc.close();
        }
    }
}
