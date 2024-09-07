package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args){
        ArrayList<Integer> quantities=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (i<3){
                quantities.add(111);
            } else {
                quantities.add(999);
            }
        }
        for (Integer q:quantities){
            System.out.println(q);
        }
    }

}
