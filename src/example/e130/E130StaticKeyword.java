package example.e130;

public class E130StaticKeyword {
    static int[] array;
    void mystery(){
        for (int number:array){
            if (number%2==0){
                number/=2;
            }else {
                number*=10;
            }
            System.out.print(number+" ");
        }
    }
    public static void main(String[] args) {
        array=new int[] {1, 2, 3, 4, 5};
        E130StaticKeyword p = new E130StaticKeyword();
        p.mystery();
    }
}
