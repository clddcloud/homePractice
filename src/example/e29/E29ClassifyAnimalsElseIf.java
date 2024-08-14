package example.e29;

public class E29ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
        String animal="dog";

        // Use if-else-if conditions to classify the animal
        if (animal.equalsIgnoreCase("dog")){
            System.out.println("The animal is a mammal.");
        }else if (animal.equalsIgnoreCase("eagle")){
            System.out.println("The animal is a bird.");
        }else if (animal.equalsIgnoreCase("shark")){
        System.out.println("The animal is a fish.");
        }else if (animal.equalsIgnoreCase("frog")){
            System.out.println("The animal is an amphibian.");
        }else if (animal.equalsIgnoreCase("snake")){
                System.out.println("The animal is a reptile.");
        }else {
            System.out.println("Unknown animal type.");
        }
    }
}