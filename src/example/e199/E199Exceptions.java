package example.e199;

public class E199Exceptions {

    public static void main(String[] args) {
    int [] array=new int[5];
        try {
            System.out.println("Trying to access an element...");
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException f){
            System.out.println("Error: Array index is out of bounds");
            f.printStackTrace();
        }
        System.out.println("Program has finished");

    }

}
