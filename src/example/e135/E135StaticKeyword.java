package example.e135;

public class E135StaticKeyword {
    static String surround (String s, String search_term){
        return s.replace(search_term, "("+search_term+")");
    }
  
    public static void main(String[] args) {
        E135StaticKeyword obj=new E135StaticKeyword();
        String str;
        str=obj.surround ("abcabcabc","c");
        System.out.println(str);
        str=obj.surround ("technology","o");
        System.out.println(str);
    }
}

