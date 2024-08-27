package example.e128;

public class E128StaticKeyword {
    public static void mixString(String s1, String s2) {
        if (s1.length() == s2.length()) {
            String s3 = "";
            for (int i = 0; i < s1.length(); i++) {
                s3 += String.valueOf(s1.charAt(i)) + String.valueOf(s2.charAt(i));
            }
            System.out.println(s3);;
        }
    }
    public static void main(String[] args) {
        E128StaticKeyword obj=new E128StaticKeyword();
        obj.mixString ("12345","abcde");

    }
    }
