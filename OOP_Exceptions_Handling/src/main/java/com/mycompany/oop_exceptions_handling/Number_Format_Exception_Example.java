/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;
import java.util.Scanner; 
/**
 *
 * @author ruthishimwe
 */
public class Number_Format_Exception_Example {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        try {
            // Prompt the user to enter a string to convert to an integer.
            System.out.print("Enter a number: ");
            String input = sc.nextLine(); // Read the input string from the user.

            // Attempting to convert the user input string into an integer.
            // If the string is not a valid number, a NumberFormatException will be thrown.
            int num = Integer.parseInt(input);

            // If successful, print the parsed number.
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            // This block will catch the NumberFormatException if the string cannot be parsed to an integer.
            System.out.println("NumberFormatException occurred: " + e.getMessage());

        } finally {
            
            System.out.println("Exiting program. Thank you!");
            sc.close();
        }
    }
}
