package Homework;

import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number above 1");
        int a=input.nextInt();
        boolean prime=true;
        if (a>1){
            for (int i = 2; i < a ; i++) {
                if (a%i==0){
                    prime=false;
                    break;
                    }
                }
            if (prime) {
                System.out.println(a + " is a prime number");  //number 2 will be prime by default
            }else {
                System.out.println(a + " is NOT a prime number");
            }
        } else {
            System.out.println("Please enter correct number");
        }

    }
}
