package example.e119;

public class E119JavaMethods {
    public static String censorLetter (String str, char symbol){
        str=str.replace(symbol, '*');
        return str;
    }
    public static void main(String[] args) {
        // Students will write the code here.
        E119JavaMethods censor=new E119JavaMethods();
        String newStr;
        newStr=censor.censorLetter("computer science", 'e');
        System.out.println(newStr);
        newStr= censor.censorLetter("trick or treat", 't');
        System.out.println(newStr);
    }

}
