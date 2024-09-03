package org.example.e149;

public class E149Inheritance {

    public static void main(String[] args) {
    Car car1=new Car();
    car1.make="Toyota";
    car1.year=2020;
    car1.model="Corolla";
    car1.displayInfo();
    }
}
class Vehicle{
    String make;
    int year;
    void displayInfo(){
        System.out.println("Vehicle: "+make+", Year: "+year);
    }
}
class Car extends Vehicle{
    String model;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Model: "+model);
    }
}
