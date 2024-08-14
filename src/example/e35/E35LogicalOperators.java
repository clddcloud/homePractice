package example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");
        // Capture the loan requirement input
        boolean needsLoan=input.nextBoolean();
        String eligible="Unknown";
        // Check if the user needs a loan
        if (needsLoan){
            System.out.println("What is your credit score?");
            int creditScore=input.nextInt();
            if (creditScore<600){
                eligible="Not eligible";
            }else if (creditScore>=600 && creditScore<=700){
                eligible="Maybe eligible";
            }else if (creditScore>=701 && creditScore<=800) {
                eligible="Eligible";
            }else if (creditScore>800) {
                eligible="Definitely eligible";
            }
        }
        System.out.println("The eligibility is "+eligible);
        input.close();
        }
        // If the user needs a loan
        //    Print prompt for user to enter their credit score
        //    Capture the credit score input
        //    Determine eligibility based on credit score
        //        If credit score is below 600, eligibility = "Not eligible"
        //        If credit score is between 600 and 700 inclusive, eligibility = "Maybe eligible"
        //        If credit score is between 701 and 800 inclusive, eligibility = "Eligible"
        //        If credit score is higher than 800, eligibility = "Definitely eligible"
        // If the user does not need a loan, eligibility = "Unknown"

        // Print the eligibility status
    }

