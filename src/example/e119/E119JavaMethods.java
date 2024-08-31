package org.example.e119;

public class E119JavaMethods {
    public static String censorLetter (String str, char symbol){
        str=str.replace(symbol, '*');
        return str;
    }
    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));
    }

}
