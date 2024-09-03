package org.example.e152;

public class E152SuperKeyword {
    public static void main(String[] args) {
    House house1=new House("Vienna");

    }
}
class Building {
    String location;
    public Building (String location){
        this.location=location;
        System.out.println(location);
    }
    public Building(){
        System.out.println("Building Constructor");
    }
}
class House extends Building{
   public House (String location){
       super (location);
   }
}
