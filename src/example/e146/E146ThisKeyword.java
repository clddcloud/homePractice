package org.example.e146;

public class E146ThisKeyword {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
    employee1.printDetails();
    employee2.printDetails();
    }

}
class Employee{
    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    public Employee(String name, String lastName, int employeeId, String startDate, int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    public Employee(){};

    void printDetails(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }
}
