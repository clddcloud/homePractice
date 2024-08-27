package example.e110;

public class E110JavaMethods {
    public static void main(String[] args) {
        E110JavaMethods a=new E110JavaMethods();
        // Call method newLine
        a.newLine();
        // Call method displayLine
        a.displayLine();
    }

    // Create method newLine with print statement
    void newLine(){
        System.out.println("newLine method implementation");
    }
    // Create method displayLine with print statement
    void displayLine(){
        System.out.println("displayLine method implementation");
    }
}
