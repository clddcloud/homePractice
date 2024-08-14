package example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
        int totalSlices=13, friends=4;

        // Calculate slices per person
        int slicePerPerson=totalSlices/friends;
        int leftover=totalSlices%friends;
        // Print the results
        System.out.println("Each person gets "+slicePerPerson+" slices.");
        System.out.println("There are "+leftover+" slices left over.");

    }
}
