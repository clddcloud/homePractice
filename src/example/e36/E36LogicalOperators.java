package example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter their monthly rent expense
        System.out.println("Please enter your monthly rent expense");
        // Capture the rent expense input
        double rentExpense = input.nextDouble();
        // Print prompt for user to enter their monthly food expense
        System.out.println("Please enter your monthly food expense");
        // Capture the food expense input
        double foodExpense = input.nextDouble();
        // Print prompt for user to enter their monthly transportation expense
        System.out.println("Please enter your monthly transportation expense");
        // Capture the transportation expense input
        double transportationExpense = input.nextDouble();
        // Print prompt for user to enter their monthly entertainment expense
        System.out.println("Please enter your monthly entertainment expense");
        // Capture the entertainment expense input
        double entertainmentExpense = input.nextDouble();
        if (rentExpense>foodExpense && transportationExpense>entertainmentExpense){
            System.out.println("You are prioritizing essentials well.");
        } else if (rentExpense>foodExpense || transportationExpense>entertainmentExpense){
            System.out.println("You are on the right track, but could improve.");
        } else if (rentExpense<=foodExpense && transportationExpense<=entertainmentExpense) {
            System.out.println("You need to rethink your spending priorities.");
        } input.close();
        // Analyze expenses
        // If rentExpense is greater than foodExpense and transportationExpense is greater than entertainmentExpense
        //    Print "You are prioritizing essentials well."
        // Else if rentExpense is greater than foodExpense or transportationExpense is greater than entertainmentExpense
        //    Print "You are on the right track, but could improve."
        // Else
        //    Print "You need to rethink your spending priorities."
    }
}
