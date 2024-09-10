package org.example.e207;


import java.util.HashMap;

public class E207Map {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        var entries=map.entrySet();
        for (var entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        map.replace("THREE", "ASEL");
        map.replace("FIVE", "SUMAIR");
        map.forEach((k,v)-> System.out.println(k+" : "+v));

    }
}

