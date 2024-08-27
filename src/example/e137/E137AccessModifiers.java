package example.e137;

public class E137AccessModifiers {
    String name;
    private String schoolName="Syntax";
    protected int batchNumber;
    public String city;
    void display(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
    }
    public static void main(String[] args) {
    E137AccessModifiers student1=new E137AccessModifiers();
    student1.name="John";
    student1.schoolName="Syntax";
    student1.city="Miami";
    student1.batchNumber=9;

    student1.display();
    }
}

