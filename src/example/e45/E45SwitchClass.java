package example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the coffee type input
        int type=input.nextInt();
        double price=0;
        switch (type){
            case 1:
                price=3.00;
                break;
            case 2:
                price=4.00;
                break;
            case 3:
                price=4.50;
                break;
            case 4:
                price=5.00;
                break;
            default:
                System.out.println("Invalid coffee type entered");
        }
        if (price!=0) {
            System.out.println("The price of your coffee is $" + price);
        }
        input.close();
        // Print the price
        // Output: The price of your coffee is $____
    }
}
