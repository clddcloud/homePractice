package example.e140;

public class E140AccessModifiers {
    String maxLength (String s){
        String [] words=s.split("[ ,.?!:;()]");
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
        String str;
        str=obj.maxLength("this is (actually) longest!");
        System.out.println(str);
    }
}
