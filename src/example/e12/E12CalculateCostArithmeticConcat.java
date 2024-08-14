package example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Declare the float variables and assign values
        float a=15.5f, b=23.0f, c=9.99f, d=27.49f;
        // Calculate the total cost
        float totalCost=a+b+c+d;
        // Calculate the average cost
        float averageCost=(a+b+c+d)/4;
        // Print the results
      //  System.out.println("The total cost is " + totalCost);
        //System.out.println("The average cost is " + averageCost);
        System.out.println("The total cost is " + String.format("%.2f",totalCost));
        System.out.println("The average cost is " + String.format("%.3f", averageCost));
        //format for string output with 2 or 3 decimals after whole number
    }
}
