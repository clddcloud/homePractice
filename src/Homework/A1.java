package Homework;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int [] temperatureWeek=new int[7];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < temperatureWeek.length; i++) {
            System.out.println("Please enter temperature for Day "+(i+1));
            temperatureWeek[i]=input.nextInt();
        }
        int minTemp=temperatureWeek[0], maxTemp=temperatureWeek[0];
        for (int i = 1; i < temperatureWeek.length; i++) {
            if (temperatureWeek[i]>maxTemp) {
                maxTemp=temperatureWeek[i];
            }
        }
        for (int i = 1; i < temperatureWeek.length; i++) {
            if (temperatureWeek[i]<minTemp) {
                minTemp=temperatureWeek[i];
            }
        }
        System.out.println("Maximum temperature for the week is: "+maxTemp);
        System.out.println("Minimum temperature for the week is: "+minTemp);
        input.close();
    }
}
