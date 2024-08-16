package homeworkString;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        /*
Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */
        Scanner input=new Scanner(System.in);
        String nameMom, nameDad, gender;
        String nameBaby="";
        System.out.println("Enter mom's name");
        nameMom=input.nextLine();
        System.out.println("Enter dad's name");
        nameDad=input.nextLine();
        System.out.println("Boy of Girl?");
        gender=input.nextLine();
        if (gender.equalsIgnoreCase("Boy")){
            nameBaby=nameDad.substring(0,3)+nameMom.substring(nameMom.length()-2);
        }else if (gender.equalsIgnoreCase("Girl")){
            nameBaby=nameMom.substring(0,2)+nameDad.substring(nameDad.length()-3);
        }else {
            System.out.println("Enter correct gender");
        }
        if (!nameBaby.isEmpty()){
            System.out.println("Suggested baby name: "+nameBaby.toUpperCase());
        }

        }
}
