package Homework;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input 1st number");
        int num1=input.nextInt();
        System.out.println("Input 2nd number");
        int num2=input.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("1st number now = "+num1);
        System.out.println("2nd number now = "+num2);
        input.close();
    }
}
