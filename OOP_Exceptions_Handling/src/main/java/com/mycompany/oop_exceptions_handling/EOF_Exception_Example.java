/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;
import java.io.EOFException; 
import java.io.FileInputStream; 
import java.io.ObjectInputStream; 
import java.util.Scanner; 
/**
 *
 * @author ruthishimwe
 */
public class EOF_Exception_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        try {
            // Prompt the user to enter the file name.
            System.out.print("Enter the name of the file to read from: ");
            String fileName = sc.nextLine(); // Read the file name from the user.

            // Using a try-with-resources block to automatically close the ObjectInputStream.
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
                // Attempting to read an object from the file.
                // If the file is empty, this will likely throw an EOFException.
                Object obj = ois.readObject(); 
                
                // Print the read object if successful.
                System.out.println("Object read from file: " + obj);
            } catch (EOFException e) {
                // This block will catch the EOFException if the end of the file is reached unexpectedly.
                System.out.println("EOFException occurred: End of file reached unexpectedly.");
            } catch (Exception e) {
                // This block catches any other exceptions that might occur (e.g., file not found, etc.)
                System.out.println("General exception occurred: " + e.getMessage());
            }
        } finally {
            // Close the scanner to release resources.
            System.out.println("Exiting program. Thank you!");
            sc.close();
        }
    }
}
