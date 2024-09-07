package org.example.e176;


import java.util.ArrayList;

public class E176List {
    public static void main(String[] args){
        ArrayList<Integer> productIDs=new ArrayList<>();
        int tmp=111;
        for (int i = 0; i < 6; i++) {
            productIDs.add(tmp);
            tmp+=111;
        }
        System.out.println(productIDs);
        productIDs.clear();
        System.out.println(productIDs);
    }

}
