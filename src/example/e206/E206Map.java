package org.example.e206;

import java.util.HashMap;

public class E206Map {

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        var entries=map.entrySet();
        for (var entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        entries=map.entrySet();
        for (var entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

}
