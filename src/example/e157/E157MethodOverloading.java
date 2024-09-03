package org.example.e157;

public class E157MethodOverloading {
    public static void main(String[] args) {
        TransactionCalculator obj=new TransactionCalculator();
        System.out.println(obj.calculateProfit(100, 20,30,10));
        System.out.println(obj.calculateProfit(80,30,20));
        System.out.println(obj.calculateProfit(50,30));
    }
}
class TransactionCalculator{
    int calculateProfit (int a, int b){
    return (a-b);
    }
    int calculateProfit (int a, int b, int c){
    return (a-b-c);
    }
    int calculateProfit (int a, int b, int c, int d){
    return (a-b-c-d);
    }

}



