package org.example.e150;

public class E150Inheritance {
    public static void main(String[] args) {
    Employee person1= new Employee("Joe", "Smith", 35, 35000);
    person1.printEmployeeDetails();
    Student person2 = new Student("Adam", "Smith", 15, 10);
    person2.printStudentDetails();
    Retiree person3= new Retiree("Frank", "Smith", 15, "tour");
    person3.printRetireeDetails();
    }

}
class Person{
    private String name;
    private String lastName;
    private int age;
    public Person (String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
    public void printDetails () {
        System.out.print(name+" "+lastName+" "+age+" ");
    }
}
class Employee extends Person{
    private int salary;
    public Employee (String name, String lastName, int age, int salary){
        super (name, lastName, age);
        this.salary=salary;
    }
    public Employee (String name, String lastName, int age){
        super (name, lastName, age);
    }
    public void printEmployeeDetails (){
        super.printDetails();
        System.out.println(salary);

    }
}
class Student extends Employee {
    private int grade;
    public Student (String name, String lastName, int age, int grade){
        super (name, lastName, age);
        this.grade=grade;
    }
    public Student (String name, String lastName, int age){
        super (name, lastName, age);
    }
    void printStudentDetails (){
        super.printDetails();
        System.out.println(grade);
    }
}
class Retiree extends Student {
    private String seniorActivity;
    public Retiree(String name, String lastName, int age, String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity=seniorActivity;
    }
    void printRetireeDetails(){
        super.printDetails();
        System.out.println(seniorActivity);
    }
}


