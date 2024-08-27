package example.e129;

public class E129StaticKeyword {
    static String countryName;
    static String continent;
    public void print (){
        System.out.println(countryName+" located on "+continent +" continent");
    }
    public static void main(String[] args) {
        countryName="Morocco";
        continent="Africa";
        E129StaticKeyword obj=new E129StaticKeyword();
        obj.print();
    }
}
