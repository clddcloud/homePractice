package Homework;

public class A7 {
    public static void main(String[] args) {
        int num=10;
        int fib0=0, fib1=1, fib2=0;  // I start the Fibonacci sequence with 0
        if (num>0) {
            for (int i = 2; i <= num; i++) {
               fib2=fib0+fib1;
               fib0=fib1;
               fib1=fib2;
            }
        } else if (num==0){
                fib1=0;
        }
        System.out.println("Fibonacci for "+num+" equals to "+fib1);
    }
}
