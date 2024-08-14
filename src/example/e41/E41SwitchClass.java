package example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter the time of day
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        // Capture the time of day input
        String timeOfDay=input.next();
        switch (timeOfDay){
            case "morning":
                System.out.println("Recommended meal: Breakfast");
                break;
            case "afternoon":
                    System.out.println("Recommended meal: Lunch");
                    break;
            case "evening":
                    System.out.println("Recommended meal: Dinner");
                    break;
            case "night":
                    System.out.println("Recommended meal: Snack");
                    break;
            default:
            System.out.println("Invalid time of day entered");
        } input.close();
        // Recommend meal using switch statement

        //    Print "Invalid time of day entered"




    }
}
