package org.example.e183;

import java.util.LinkedList;

public class E183List {

    public static void main(String[] args) {
        LinkedList<Integer> sales=new LinkedList<>();
        int tmp=10000;
        int numberOfMonth=6;
        int sum=0;
        for (int i = 1; i <=numberOfMonth ; i++) {
            tmp+=1100;
            sales.add(tmp);
        }
        for (int sale:sales){
            sum+=sale;
        }
        System.out.println("Total sales for the year: "+sum);
    }

}