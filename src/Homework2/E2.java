package Homework2;

public class E2 {
    public static void main(String[] args) {
        //2. Find out how many alpha characters are present in a string
        String str="Find out how many alpha characters are present in a string? 48? ^_^";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());;
    }
}
