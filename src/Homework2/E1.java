package Homework2;

public class E1 {
    public static void main(String[] args) {
        // 1. Write a program to swap 2 String without a temporary variable
        String a="welcome to";
        String b="java world";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("String a: "+a);
        System.out.println("String b: "+b);

    }
}
