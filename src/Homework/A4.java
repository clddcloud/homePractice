package Homework;

public class A4 {
    public static void main(String[] args) {
        int[][] array= {
                {1,2,3,4,5},
                {11,20,31},
                {101,202,303},
                {79,12,39,-8,-11}
        };
        int sumOdd=0, sumEven=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2==0){
                    sumEven+=array[i][j];
                } else {
                    sumOdd+=array[i][j];
                }
            }
        }
        System.out.println("The sum of all odd numbers = "+sumOdd);
        System.out.println("The sum of all even numbers = "+sumEven);
    }
}
