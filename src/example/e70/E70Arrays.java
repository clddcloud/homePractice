package example.e70;

public class E70Arrays {
    public static void main(String[] args) {
        // Create an array of integers with size 11
        int[] array=new int[11];
        // Use a for loop to add the years from 2010 to 2020 to the array
        for (int i = 0; i < array.length; i++) {
            array[i]=2010+i;
        }
        // Use another for loop to iterate through the array and print each value on a new line
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // Declare and initialize the array of integers with size 11
    }
}
