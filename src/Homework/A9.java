package Homework;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array more than 2");
        int l = input.nextInt();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Enter the value for array [" + i + "]");
            array[i] = input.nextInt();
        }
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 1; i < l; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i]>max2 && array[i]!=max1){
                max2=array[i];
            }
        }
        System.out.println("The second largest number is "+max2);
        input.close();
    }
}
