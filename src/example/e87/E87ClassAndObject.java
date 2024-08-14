package example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'
        Car Car1=new Car();

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object
        Car1.carColor="Black";
        Car1.carYear=2019;
        Car1.carMake="BMW";

        // Create the second object of the class 'Car'
        Car Car2=new Car ();
        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object
        Car2.carColor="White";
        Car2.carYear=2018;
        Car2.carMake="Toyota";
        // Print the values of the properties for both objects in the specified format
       Car1.info();
       Car2.info();




    }
}
