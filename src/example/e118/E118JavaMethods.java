package example.e118;

public class E118JavaMethods {
    public static String spaceOut (String str){
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            str2+=str.charAt(i)+" ";
        }
        return str2;
    }
    public static void main(String[] args) {
        // Students will write the code here.
        E118JavaMethods manipulation = new E118JavaMethods();
        String str;
        str=manipulation.spaceOut("hello");
        System.out.println(str);
        str=manipulation.spaceOut("technology");
        System.out.println(str);
    }
}
