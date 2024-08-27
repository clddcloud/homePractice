package example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        E114JavaMethods result = new E114JavaMethods();
        // Call the add method with arguments that add up to 30
        result.addMethod(16,14);
        // Call the multiply method with arguments that multiply to 30
        result.multiplyMethod(6,5);
        // Call the subtract method with arguments that subtract to 20
        result.subtractMethod(90,70);
    }

    // Create method multiply with two integer parameters and a print statement to display the result
    void multiplyMethod (int a, int b){
        System.out.println("Multiplication "+a*b);
    }
    // Create method add with two integer parameters and a print statement to display the result
    void addMethod (int a, int b){
        System.out.println("Addition "+(a+b));
    }
    // Create method subtract with two integer parameters and a print statement to display the result
    void subtractMethod (int a, int b){
        System.out.println("Subtraction "+(a-b));
    }
}
