package org.example.e158;

public class E158MethodOverloading {
    public static void main(String[] args){
        LoanPaymentCalculator payment=new LoanPaymentCalculator();
        double monthlyPayment;
        monthlyPayment=payment.calculatePayment(10000,5);
        System.out.println(String.format("%.2f",monthlyPayment));
        monthlyPayment=payment.calculatePayment(10000,5,24);
        System.out.println(String.format("%.2f",monthlyPayment));
        monthlyPayment=payment.calculatePayment(10000, 5,24 , 2000);
        System.out.println(String.format("%.2f",monthlyPayment));
    }
}
class LoanPaymentCalculator{
    double calculatePayment (double loanAmount, double interestRate){
        return ((loanAmount * (1 + interestRate/100))/12);
    }
    double calculatePayment (double loanAmount, double interestRate, int numberOfMonths){
        return ((loanAmount * (1 + interestRate/100))/numberOfMonths);
    }
    double calculatePayment (double loanAmount, double interestRate, int numberOfMonths, double downPayment){
        return (((loanAmount-downPayment)* (1 + interestRate/100))/numberOfMonths );
    }
}

