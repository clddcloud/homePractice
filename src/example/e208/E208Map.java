package org.example.e208;


import java.util.*;

public class E208Map {
    public static void display(Map<String,Integer> map){
        if (!map.isEmpty()){
            var entries=map.entrySet();
            for (var entry:entries){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }else {
            System.out.println("map is empty");
        }
    }
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        display(map);
        map.clear();
        display(map);

    }

}
