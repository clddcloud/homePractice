package org.example.e171;

public class E171Encapsulation {
    public static void main(String[] args){
        Employee person=new Employee();
        System.out.println("Employee Name: "+person.getEmpName());
        System.out.println("Employee Age: "+ person.getEmpAge());
    }
}
class Employee{
    private String empName="John";
    private int empAge=30;
    public String getEmpName(){
        return (empName);
    }
    public int getEmpAge (){
        return (empAge);
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }
}



