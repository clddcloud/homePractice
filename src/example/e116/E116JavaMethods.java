package example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        E116JavaMethods check=new E116JavaMethods();
        // Call the bothEven method with various arguments to test the method
        boolean cond=check.bothEven(10, 11);
        System.out.println(cond);
    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
    boolean bothEven (int a, int b){
        if (a%2==0 && b%2==0){
            return true;
        } else {
            return false;
        }
    }
}
