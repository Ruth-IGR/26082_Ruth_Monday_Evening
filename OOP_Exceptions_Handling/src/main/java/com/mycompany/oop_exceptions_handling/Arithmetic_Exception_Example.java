/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop_exceptions_handling;
import java.util.Scanner; 
/**
 *
 * @author ruthishimwe
 */
public class Arithmetic_Exception_Example {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        try {//The try block attempts to perform the division
          
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
//If the denominator is zero, an ArithmeticException is thrown and caught by the catch block, which then prints an error message.
         System.out.println(" Cannot divide by zero.");
        } 
        
        finally { //The finally block ensures that the Scanner object is closed, regardless of whether an exception occurred.
            sc.close();
        }
    }
}
