package example.e131;
public class E131StaticKeyword {
    static String thirdLetter (String s){
        String str="";
        for (int i = 0; i < s.length(); i+=3) {
            str+=String.valueOf(s.charAt(i));
        }
        return str;
    }
    public static void main(String[] args) {
        E131StaticKeyword obj=new E131StaticKeyword();
        System.out.println(obj.thirdLetter("hello there"));
        System.out.println(obj.thirdLetter("technology"));
    }
}
