package example.e112;

public class E112JavaMethods {
    public static void main(String[] args) {
        E112JavaMethods a = new E112JavaMethods();
        // Call method printNumbers
        a.printNumbers();
    }

    // Create method printNumbers that prints numbers from 1 to 10
    void printNumbers(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }
}
