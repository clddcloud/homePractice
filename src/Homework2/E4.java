package Homework2;

public class E4 {
    public static void main(String[] args) {
        //4. Check if a String is Palindrome: Determine whether a given string is a palindrome,
        // which means it reads the same forwards and backward.
        String str="racecar";
        StringBuilder str2=new StringBuilder(str);
        str2.reverse();
        if (str.equals(str2.toString())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
