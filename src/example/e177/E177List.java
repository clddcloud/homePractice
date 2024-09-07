package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
        ArrayList<String> messages=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        String str;
        for (int i = 0; i < 5; i++) {
            str= input.nextLine();
            messages.add(str);
        }
        messages.removeIf(x->messages.indexOf(x)%2==0);
        System.out.println("Remaining messages:");
        for (String message:messages){
            System.out.print(message+" ");
        }
    }

}
