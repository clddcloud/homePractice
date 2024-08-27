package example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        E121Variables obj1=new E121Variables();
        obj1.intValue=10;
        obj1.doubleValue=10.23;
        obj1.charValue ='a';

        E121Variables obj2=new E121Variables();
        obj2.intValue=100;
        obj2.doubleValue=100.23;
        obj2.charValue ='s';

        System.out.println(obj1.intValue);
        System.out.println(obj1.doubleValue);
        System.out.println(obj1.charValue);
        System.out.println(obj2.intValue);
        System.out.println(obj2.doubleValue);
        System.out.println(obj2.charValue);
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
