package example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog Dog1=new Dog();
        Dog1.breed="Husky";
        Dog1.name="Mike";
        Dog1.color="Grey";
        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog Dog2=new Dog();
        Dog2.breed="Bulldog";
        Dog2.name="Zack";
        Dog2.color="Brown";
        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog Dog3=new Dog();
        Dog3.breed="Labrador";
        Dog3.name="Nick";
        Dog3.color="Chocolate";
        // Call the methods 'bark()', 'run()', and 'play()' for each object
        Dog1.bark();
        Dog1.run();
        Dog1.play();
        Dog2.bark();
        Dog2.run();
        Dog2.play();
        Dog3.bark();
        Dog3.run();
        Dog3.play();



    }
}
