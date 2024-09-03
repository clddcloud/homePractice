package org.example.e153;

import org.example.e87.Car;

public class E153SuperKeyword {
    public static void main(String[] args) {
    CarType car1=new CarType();
    }
}
class Vehicle{
    Vehicle(){
        System.out.println("This is the Vehicle constructor");
    }
}
class CarType extends Vehicle{
    CarType(){
        super();
    }
}
