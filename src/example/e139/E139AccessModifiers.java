package example.e139;

public class E139AccessModifiers {
    public String alphabetical (String str){
        String str2=String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)>str.charAt(i-1)){
                str2+=str.charAt(i);
            }
        }
        return (str2);
}
    public static void main(String[] args) {
        E139AccessModifiers obj=new E139AccessModifiers();
        String str;
        str= obj.alphabetical("hello");
        System.out.println(str);
        str=obj.alphabetical("software");
        System.out.println(str);
        str= obj.alphabetical("language");
        System.out.println(str);
    }


}

