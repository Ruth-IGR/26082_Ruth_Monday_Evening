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
public class Illegal_Argument_Exception_Examples {
      // Method to calculate the square root of a number
    public static double calculateSquareRoot(double number) throws Exception {
        if (number < 0) {
            throw new Exception("Number must be non-negative.");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
        try {
            System.out.println("Enter a positive number:");
            double nbr=sc.nextDouble();
            // Valid argument
            double validResult = calculateSquareRoot(nbr);
            System.out.println("Square root of "+ nbr+ " is: " + validResult);
            
            System.out.println("Enter a negative number:");
            nbr=sc.nextDouble();

            // Invalid argument: Passing a negative number
            double invalidResult = calculateSquareRoot(nbr); // This will throw IllegalArgumentException
            System.out.println("Square root of "+ nbr + " is: " + invalidResult);

        } catch (Exception e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }

}
