package Homework2;

public class E3 {
    public static void main(String[] args) {
        //3. Reverse a String: Write a function to reverse a given string.
        // For example, given the input "Hello", the output should be "olleH".
        String str="Hello";
        String str2="";
        for (int i = str.length()-1; i >= 0; i--) {
            str2+=str.charAt(i);
        }
        System.out.println(str2);

        //or
        StringBuilder stb=new StringBuilder(str);
        stb.reverse();
        str2=stb.toString();
        System.out.println(str2);
    }
}
