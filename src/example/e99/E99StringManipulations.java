package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");
        // Read the input string
        String str=input.nextLine();
        // Remove all spaces and convert the string to lowercase
        str=str.replace(" ","");
        str=str.toLowerCase();
        StringBuilder str2=new StringBuilder(str);
        str2.reverse();
        // Check if the string is a palindrome
        if (str.equals(str2.toString())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        input.close();
        // Print "true" if the string is a palindrome, and "false" otherwise
        // Step 2: Create a Scanner object to read input from the console


    }
}
