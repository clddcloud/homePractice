package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args){
        LinkedList<Integer> ages = new LinkedList<>();
        int tmp=20;
        for (int i = 0; i < 10; i++) {
            ages.add(tmp);
            tmp+=5;
        }
        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) >60 || ages.get(i)<=25){
                ages.remove(i);
                i--;
            }
        }
        Collections.sort(ages);
        System.out.println("Remaining ages: "+ages);
        int sum=0;
        for (Integer age:ages){
            sum+=age;
        }
        double avg=sum / ages.size();
        System.out.println("Average age: "+avg);
    }

}
