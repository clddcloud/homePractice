package example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);
        // Create an array of integers that will store 5 elements
        int[] array=new int[5];
        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        // Use another loop to iterate through the array in reverse order and print each value on a new line
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        input.close();
    }
}
