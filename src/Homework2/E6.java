package Homework2;

public class E6 {
    //6. Create a method to count how many vowels are present in a string “documentation”
    public static int vowels (String str){
        return (str.replaceAll("[^aeiouAEIOU]","").length());
    }

    public static void main(String[] args) {
        System.out.println(vowels("documentation"));
    }
}
