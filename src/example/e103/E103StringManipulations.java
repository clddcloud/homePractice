package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In:");
        String str=input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i<str.length()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        input.close();
    }
}
