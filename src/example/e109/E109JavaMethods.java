package example.e109;

public class E109JavaMethods {
    public static void main(String[] args) {
        E109JavaMethods a = new E109JavaMethods();
        // Call newLine method three times
        for (int i = 1; i <= 3; i++) {
            a.newLine();
        }
    }
    // Create method newLine with print statement
    void newLine(){
        System.out.println("newLine method implementation");
    }
}
