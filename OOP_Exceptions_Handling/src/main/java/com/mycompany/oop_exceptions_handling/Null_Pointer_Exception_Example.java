/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;
//import java.util.Scanner; 

/**
 *
 * @author ruthishimwe
 */
public class Null_Pointer_Exception_Example {
    public static void main(String[] args) {
        try {
            // Attempt to access a method on a null object reference
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handle null reference error
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}

    

