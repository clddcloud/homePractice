package Homework;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter the total number of values that you would like to store in the array");
        number=input.nextInt();
        if (number>0) {
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                System.out.println("Input the value #" + (i + 1));
                array[i] = input.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < number; i++) {
                sum += array[i];
            }
            System.out.println("The sum of the all values in the array = " + sum);
        }else {
            System.out.println("Please enter correct number above 0");
        }
        input.close();
    }
}
