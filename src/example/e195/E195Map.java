package org.example.e195;


import java.util.*;

public class E195Map {

    public static void main(String[] args) {
        Map<String, List<String>> classes=new LinkedHashMap<>();
        classes.put("Mathematics", Arrays.asList("Alice", "Bob"));
        classes.put("Science", Arrays.asList("Charlie", "David"));
        classes.put("History", Arrays.asList("Eve", "Frank"));
        System.out.println("From Map (Students by Subject):");
        classes.forEach((k,v)-> System.out.println("Subject: "+k+" Students: "+v));


}}
