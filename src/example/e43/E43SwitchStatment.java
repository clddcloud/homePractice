package example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");
        // Capture the usage input
       int usage=input.nextInt();
       double usageCost=0;
       String usageCase="undefined";
       if (usage>=0 && usage<=100){
           usageCase="0-100";
       } else if (usage>=101 && usage<=200) {
           usageCase="101-200";
       } else if (usage>=201 && usage<=300) {
           usageCase="201-300";
       } else if (usage>=301) {
           usageCase="301 and above";
       } else {
           usageCase="fail";
       }
        switch(usageCase){
            case "0-100":
                usageCost=0.12*usage;
                break;
            case "101-200":
                usageCost=0.15*usage;
                break;
            case "201-300":
                usageCost=0.20*usage;
                break;
            case "301 and above":
                usageCost=0.25*usage;
                break;
            default:
                System.out.println("Invalid usage entered");
        }
       if (!usageCase.equals("fail")){
           System.out.println("Your electricity bill is $"+usageCost);
       }
    input.close();
    }

        // Calculate bill using switch statement
        // Case 0-100
        //    Multiply usage by $0.12 per kWh
        // Case 101-200
        //    Multiply usage by $0.15 per kWh
        // Case 201-300
        //    Multiply usage by $0.20 per kWh
        // Case 301 and above
        //    Multiply usage by $0.25 per kWh
        // Default
        //    Print "Invalid usage entered"

        // Print the bill
        // Output: Your electricity bill is $____

    }

