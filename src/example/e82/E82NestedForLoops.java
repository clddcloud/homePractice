package example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };
        for (String[] row:pattern){
            for (String index: row){
                System.out.print(index+" ");
            }
            System.out.println();
        }
        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
