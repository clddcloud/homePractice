package org.example.e174;

import java.util.ArrayList;

public class E174List {
    public static void main(String[] args){
        ArrayList<Integer> productID=new ArrayList<>();
        int tmp=1000;
        for (int i = 0; i <6 ; i++) {
            productID.add(tmp+11);
            tmp+=11;
        }
        productID.forEach(x->{
            if (x%2!=0) {
                System.out.println(x);
            }
        });
        /*
        for (int i = 0; i < productID.size(); i+=2) {
            System.out.println(productID.get(i));
        }
         */
    }

}
