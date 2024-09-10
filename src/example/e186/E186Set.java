package org.example.e186;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E186Set {
    public static void main(String[] args) {
        Set<String> taskNames=new HashSet<>();
        taskNames.add("third");
        taskNames.add("first");
        taskNames.add("second");
        System.out.println(taskNames);
        taskNames.clear();
        System.out.println(taskNames);

    }

}
