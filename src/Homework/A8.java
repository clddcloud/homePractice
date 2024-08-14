package Homework;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=input.nextInt();
        int [] array=new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Enter the value for array ["+i+"]");
            array[i]=input.nextInt();
        }
        int min=array[0];
        int max=array[0];
        for (int i = 1; i < l; i++) {
            if (array[i]>max){
                max=array[i];
            }else if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("min="+min);
        System.out.println("max="+max);
        input.close();
    }
}
