package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("In: ");
        String str=input.nextLine();
        String str2="";
        for (int i = str.length()-1; i >= 0; i--) {
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);
        input.close();
    }
}
