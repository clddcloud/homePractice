package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {
        SavingsAccount obj1=new SavingsAccount("John Doe","123456789",1000, 6);
        CheckingAccount obj2=new CheckingAccount("Jane Smith", "987654321", 1000, 300);
        obj1.applyInterest();
        obj1.withdraw(10);
        obj1.printAccountInfo();
        System.out.println();
        obj2.withdraw(1300);
        obj2.deposit(250);
        obj2.printAccountInfo();
    }
}
class BankAccount {
    private final String accountHolderName;
    private double balance;
    private String accountNumber;

    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double depositAmount) {
        this.balance+=depositAmount;
        // System.out.println("New balance: "+getBalance()+"\n");
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            this.balance-=withdrawAmount;
            // System.out.println("New balance: "+getBalance()+"\n");
        } else{
            System.out.println("Warning message. Insufficient funds"+"\n");
        }

    }
    public void printAccountInfo(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
    public void setBalance (double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate=interestRate;
    }

    public void applyInterest(){
        super.setBalance(getBalance() + getBalance() * interestRate/100);
        // System.out.println("New balance: "+getBalance()+"\n");
    }
}
class CheckingAccount extends BankAccount{
    private double overdraftLimit;
    CheckingAccount (String accountHolderName,  String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit=overdraftLimit;
    }
    public void withdraw(double withdrawAmount){
        if (getBalance()-withdrawAmount>=0-overdraftLimit){
            super.setBalance(getBalance()-withdrawAmount);
            // System.out.println("New balance: "+getBalance()+"\n");
    }
        else {
            System.out.println("Warning. Overdraft limit"+"\n");
        }
    }
}



