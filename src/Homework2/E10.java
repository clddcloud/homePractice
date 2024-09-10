package Homework2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class E10 {
    public static void main(String[] args) {
        // How can you remove all duplicates from ArrayList?
        List<String> list=new ArrayList<>();
        list.add("Madrid");
        list.add("Salamanca");
        list.add("Malaga");
        list.add("Palma de Mallorca");
        list.add ("Bilbao");
        list.add ("Oviedo");
        list.add ("Pamplona");
        list.add("Valencia");
        list.add("Madrid");
        list.add ("Oviedo");
        list.add("Madrid");
        System.out.println("Original list:" +list);

        // Option 1: convert to Set and back
        Set<String> set=new LinkedHashSet<>(list);
        List <String> listNew=new ArrayList<>(set);
        System.out.println("New list via set: "+listNew);

        //Option 2: loop, remove

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i!=j && list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println("Removed from list: "+ list);
    }
}
