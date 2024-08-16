package example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("In: ");
        String str=input.nextLine();
        for (int i = 0; i < str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        input.close();

    }
}
