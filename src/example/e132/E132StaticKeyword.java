package org.example.e132;

public class E132StaticKeyword {
    static int[][] reduce10(int [][] array) {
        int [][] arrayNew= new int [array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayNew[i][j] = array [i][j] - 10;
            }
        }
        return arrayNew;
    }

    public static void main(String[] args) {
       int [][] array = new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
       int [][] arrayNew=reduce10 (array);
        for (int i = 0; i < arrayNew.length; i++) {
            for (int j = 0; j < arrayNew[i].length; j++) {
                System.out.print(arrayNew[i][j] + " ");
            }
            System.out.println();
        }
    }
}