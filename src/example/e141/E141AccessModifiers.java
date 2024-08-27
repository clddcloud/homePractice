package example.e141;

public class E141AccessModifiers {
    public int maxValue (int [] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return (max);
    }
    public static void main(String[] args) {
        E141AccessModifiers obj=new E141AccessModifiers();
        int max;
        int [] array={20, 12,-1, 22, 0, 9, 21};
        max=obj.maxValue(array);
        System.out.println(max);
    }
}
