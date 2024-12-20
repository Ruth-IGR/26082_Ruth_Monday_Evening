/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;

/**
 *
 * @author ruthishimwe
 */
public class Class_Not_Found_Exception_Example {
    public static void main(String[] args) {
	        try {
	            // Attempt to load a non-existent class
	            Class.forName("nonexistent.ClassName");
	        } catch (ClassNotFoundException e) {
	            // Handle the ClassNotFoundException
	            System.out.println("ClassNotFoundException occurred! The class '" + e.getMessage() + "' was not found."); 
	        }
	    }

}
