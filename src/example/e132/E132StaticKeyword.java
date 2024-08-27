package example.e132;

public class E132StaticKeyword {
    static int[][] array;
    void reduce10(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j]-=10;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        array = new int[][] {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        E132StaticKeyword obj=new E132StaticKeyword();
        obj.reduce10();
    }}

