package example.e86;

public class E86ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Student'
        // Declare a String variable named 'name' and an integer variable named 'roll_no'
        // Create an object of the class 'Student'
        Student Student1 = new Student();
        // Assign the value "John" to the 'name' variable
        Student1.name="John";
        // Assign the value 2 to the 'roll_no' variable
        Student1.roll_no=2;
        // Print the values of 'name' and 'roll_no' in the specified format
       Student1.info();

    }
}
