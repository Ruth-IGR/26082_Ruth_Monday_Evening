/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_exceptions_handling;
import java.io.*;
/**
 *
 * @author ruthishimwe
 */
public class IO_Exception_Example {
    public static void main(String[] args) {
        try {
            // Attempt to open a non-existent file, which will cause an IOException
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            reader.readLine(); // Attempt to read a line from the file
            reader.close(); // Close the reader
        } catch (IOException e) {
            // Handle the exception by printing an error message
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
