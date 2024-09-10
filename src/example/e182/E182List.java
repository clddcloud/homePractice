package org.example.e182;


import java.util.LinkedList;

public class E182List {
    public static void main(String[] args) {
        LinkedList<Integer> primeNumbers=new LinkedList<>();
        Prime obj=new Prime();
        for (int i = 1; i <=100 ; i++) {
            if (obj.isPrime(i)){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }

}
class Prime{
        public static boolean isPrime(int a) {
            boolean prime=true;
            if (a > 1) {
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        prime = false;
                        break;
                    }
                }
            } else {
                prime=false;
            }
            return (prime);
        }
}