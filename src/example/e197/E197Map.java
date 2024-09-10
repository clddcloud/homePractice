package org.example.e197;

import java.util.LinkedHashMap;
import java.util.Map;

public class E197Map {

    public static void main(String[] args) {
        Map<Integer, Dog> dogs=new LinkedHashMap<>();

        Dog dog1=new Dog("Labrador", "Max", 5);
        Dog dog2=new Dog("Beagle", "Bella", 3);
        Dog dog3=new Dog("Bulldog", "Rocky", 4);
        dogs.put(1, dog1);
        dogs.put(2, dog2);
        dogs.put(3, dog3);
        dogs.forEach((k,v)-> System.out.println("Dog ID: "+k+", "+v.toString(dogs)));
    }
}

class Dog{
    private String name;
    private String breed;
    private int age;
    public Dog (String breed, String name, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public String toString(Map<Integer, Dog> map){
        return ("Details: "+"Dog{name='"+name+"', breed='"+breed+"', age="+age+"}");
    }



}



