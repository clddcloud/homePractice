package org.example.e160;

public class E160MethodOverloading {
    public static void main(String[] args) {
        E160MethodOverloading acc=new E160MethodOverloading();
        acc.displayInfo();
        acc.displayInfo(5000);
        acc.displayBankInfo();
        acc.displayBankInfo(20);
    }
    private void displayInfo(){
        System.out.println("private displayInfo method");
    }
    private void displayInfo (int balance){
        System.out.println("private displayInfo method with balance: " + balance);
    }

    static void displayBankInfo(){
        System.out.println("static method without parameter");
    }

    static void displayBankInfo(int branches){
        System.out.println("static method with int parameter: " + branches);
    }

}


