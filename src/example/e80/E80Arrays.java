package example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int count=0;
        // Use nested loops to iterate through the 2D array and count the elements that are both negative and odd
        for (int [] row:a){
            for (int number:row) {
                if (number < 0 && number % 2 != 0) {
                    count++;
                }
            }
        }
        // Print the total count of elements that are both negative and odd
        System.out.println(count);
    }
}
