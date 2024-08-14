package Homework;

public class A10 {
    public static void main(String[] args) {
        String[] array = {"Maria", "Jose", "Roberto", "Maria", "Carlos", "Alejandro",
                          "Miguel", "Ignacio", "Antonio", "Nerea", "Rodrigo", "Jesus",
                          "Maria", "Unai", "Jesus", "Alejandro", "Alejandra", "Maria"};
        for (int i = 0; i < array.length; i++) {
            int count=1;
                for (int j = i+1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                }
                if (count==2){
                    System.out.println(array[i]);
                }
        }

    }
}
