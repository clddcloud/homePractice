package Homework;

public class A3 {
    public static void main(String[] args) {
        int[][] array= {
            {1,2,3,4,5},
            {11,20,31},
            {101,202,303},
            {79,12,39,-8,-11}
        };
        System.out.println("Even numbers (if any):");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2==0){
                System.out.println(array[i][j]);
                }
            }
        }

    }
}
