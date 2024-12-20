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
public class Class_Cast_Exception_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        try {
            // Prompt the user to enter a value
            System.out.print("Enter a name: ");
            String input = sc.nextLine(); 

            // Store the input as an Object
            Object obj = input;

            // Attempt to cast the Object to an Integer
            // If the input is not a valid Integer, this will throw a ClassCastException
            Integer num = (Integer) obj;

            // Print the number if the cast succeeds
            System.out.println("Here's your input: " + num);
        } catch (ClassCastException e) {
            // Catch the ClassCastException and handle it
           System.out.println("ClassCastException occurred: " + e.getMessage());
           System.out.println("We can't cast a string as an integer!");
        } finally {
        //The finally block ensures that the Scanner object is closed, regardless of whether an exception occurred. 
            sc.close();
        }
    }
}
