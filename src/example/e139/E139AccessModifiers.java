package org.example.e139;

public class E139AccessModifiers {
    protected String replaceSpaces (String str){
        return (str.replace(" ","_"));
}
    public static void main(String[] args) {
        E139AccessModifiers obj=new E139AccessModifiers();
        System.out.println(obj.replaceSpaces("hello world"));
        System.out.println(obj.replaceSpaces("java is fun"));
        System.out.println(obj.replaceSpaces("i love coding"));

    }


}

