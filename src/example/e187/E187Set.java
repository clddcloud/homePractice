package org.example.e187;

import java.util.HashSet;

public class E187Set {

    public static void main(String[] args) {
        HashSet<String> colourNames=new HashSet<>();
        colourNames.add("Red");
        colourNames.add("Pink");
        colourNames.add("Yellow");
        colourNames.add("White");
        colourNames.add("Black");
        System.out.println("Original Hash Set: "+colourNames);
        System.out.println("Size of the Hash Set: "+colourNames.size());

    }

}
