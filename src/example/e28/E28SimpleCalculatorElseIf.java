package example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        char operator='*';
        // Declare two variables for numbers and assign values
        int num1=10, num2=5;
        // Perform the corresponding arithmetic operation
        if (operator=='+') {
            System.out.println("The sum is: "+(num1+num2));
        } else if (operator=='-'){
            System.out.println("The difference  is: "+(num1-num2));
        }else if (operator=='*'){
            System.out.println("The product is: "+(num1*num2));
        }
        else if (operator=='/'){
            System.out.println("The quotient is: "+(num1/num2));
        }else {
            System.out.println("Invalid operator");
        }
}
}