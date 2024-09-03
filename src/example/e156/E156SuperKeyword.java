package org.example.e156;

public class E156SuperKeyword {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.displaySound();
}
}
class Animal{
    String sound="Some generic animal sound";
}
class Dog extends Animal{
    String sound="Bark";
    void displaySound(){
        System.out.println(sound);
        System.out.println(super.sound);
    }
}
