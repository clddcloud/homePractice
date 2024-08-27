package example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        E115JavaMethods a=new E115JavaMethods();
        // Call the convertToUpper method and print the result
        String str;
        str=a.convertToUpper("test");
        System.out.println(str);
    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
    String convertToUpper (String str){
        str=str.toUpperCase();
        return str;
    }
}
