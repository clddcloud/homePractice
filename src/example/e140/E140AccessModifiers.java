package org.example.e140;

public class E140AccessModifiers {
   private String maxLength (String [] words){
        int max=words[0].length();
        int index=0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length()>max){
                max=words[i].length();
                index=i;
            }
        }
        return (words[index]);
    }
    public static void main(String[] args) {
        E140AccessModifiers obj=new E140AccessModifiers();
        String [] words={"this", "is", "a", "long", "word"};
        System.out.println(obj.maxLength(words));
        String [] words2 ={"java", "programming", "is", "fun"};
        System.out.println(obj.maxLength(words2));
    }

}
