package Homework2;

public class E9 {
    public static void main(String[] args) {
        //9. Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
        // For example, in the string "abracadabra", the first non-repeating character is 'c'.
        String str="abracadabra";
        int count=1;
        for (int i = 0; i < str.length(); i++) {
            boolean cond=true;
            for (int j = 0; j < str.length(); j++) {
                if (i!=j && str.charAt(i)==str.charAt(j)){
                    cond=false;
                    break;
                }
            }
            if (cond && count==1){
                System.out.println("letter: " + str.charAt(i));
                count++;
            }
        }

    }
}
