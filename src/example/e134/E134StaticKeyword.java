package example.e134;

public class E134StaticKeyword {
    static int countVowels (String s){
        String str;
        str=s.replaceAll("[^AaEeIiOoUu]", "");
        return str.length();
    }

    public static void main(String[] args) {
        E134StaticKeyword obj = new E134StaticKeyword();
        int number;
        number = obj.countVowels("obama");
        System.out.println(number);
        number = obj.countVowels("happy friday! i love weekends");
        System.out.println(number);
    }
}

