package org.example.e145;

public class E145ThisKeyword {
    public static void main(String[] args) {
    Dog dog1=new Dog ("Tarzan", 50);
    Dog dog2=new Dog("Lucy", 10);
    dog1.DisplayDetails();
    dog2.DisplayDetails();
    }
}
class Dog{
    private String dogName;
    private double dogWeight;
    private static String dogBreed = "Mutt";

    public Dog (String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
    }
    void DisplayDetails(){
        System.out.println(dogName+" "+dogBreed+" "+ dogWeight);
    }
}
