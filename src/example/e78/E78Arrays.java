package example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum=0;
        for (int [] numbers:a){
            for (int number:numbers){
                sum+=number;
            }
        }
        System.out.println(sum);

        // Use nested loops to iterate through the 2D array and calculate the sum of all elements

        // Print the calculated sum
    }
}
