package example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        // Declare an array to store the sums of each row
        int [] sum=new int[a.length];
        int count = 0;
        // Use nested loops to iterate through the 2D array and calculate the sum of each row
        for (int [] line : a) {
            // Store the sums in the new array
            for (int number : line) {
                sum[count] += number;
            }
            count++;
        }
        // Print the values of the new array
        for (int sumRaw:sum){
            System.out.println(sumRaw);
        }
    }
}
