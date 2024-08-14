package example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int food=input.nextInt();
        double price=0;
        switch (food){
            case 1:
                price=5.00;
                break;
            case 2:
                price=10.00;
                break;
            case 3:
                price=15.00;
                break;
            default:
                System.out.println("Invalid meal type entered");
        }
        if (price!=0) {
            System.out.println("The price of your meal is $" + price);
        }
        input.close();

        // Calculate price using switch statement
        // Case 1
        //    Set price to $5.00
        // Case 2
        //    Set price to $10.00
        // Case 3
        //    Set price to $15.00
        // Default
        //    Print "Invalid meal type entered"

        // Print the price
        // Output: The price of your meal is $____
    }
}
