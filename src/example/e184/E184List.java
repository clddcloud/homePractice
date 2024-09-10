package org.example.e184;


import java.util.ArrayList;
import java.util.List;

public class E184List {
    List<String> removeCountriesStartingWithA (List<String> list){
        list.removeIf(x-> x.indexOf("A")==0);
        return list;
    }
    public static void main(String[] args) {
        List <String> listCountries = new ArrayList<>();
        listCountries.add("USA");
        listCountries.add("Argentina");
        listCountries.add("Kazakhstan");
        listCountries.add("Australia");
        listCountries.add("Pakistan");
        listCountries.add("Russia");

        E184List obj=new E184List();
        obj.removeCountriesStartingWithA(listCountries);
        System.out.println(listCountries);
    }
}
