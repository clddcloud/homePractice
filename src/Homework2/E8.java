package Homework2;

import java.util.ArrayList;

public class E8 {
    //You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case".
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("America");
        list.add("Antarctica");
        list.add("Australia");
        list.add("Asia");
        list.add("Europe");
        list.add("Africa");
        list.add("Oceania");
        list.removeIf(x-> x.charAt(0)!='A');
        System.out.println(list.toString().toLowerCase());
    }
}
