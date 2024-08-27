package example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;

    public static void main(String[] args) {
        // Create an instance of the class
        E123Variables obj=new E123Variables();
        // Access instance variables and print them without assigning any values
        // Print the default values of the instance variables
        System.out.println(obj.myInt+"\n"+obj.myString+"\n"+obj.myDouble+"\n"+obj.myBoolean+"\n"+obj.myFloat);
    }
}
