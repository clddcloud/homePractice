package org.example.e178;

import java.util.ArrayList;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        String str;
        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            str=input.nextLine();
            if (!groceries.contains(str)){
                groceries.add(str);
            }
        }
        System.out.println("Unique grocery items:");
        for (String g:groceries){
            System.out.print(g+" ");
        }
}
}

