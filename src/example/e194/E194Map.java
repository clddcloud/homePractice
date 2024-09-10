package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "John");
        students.put(102, "Emily");
        students.put(103, "Michael");
        students.put(104, "Sarah");
        students.put(105, "David");
        System.out.println("Student IDs:");
        var keys=students.keySet();
        keys.forEach(k->System.out.println("Student ID: "+k));
        System.out.println();
        System.out.println("Student Names:");
        var values=students.values();
        values.forEach(v-> System.out.println("Student Name: "+v));
        System.out.println();
        System.out.println("Student Records:");
        var entries=students.entrySet();
        for (var entry : entries) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }

        }
        }



