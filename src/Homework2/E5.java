package Homework2;

public class E5 {
    public static void main(String[] args) {
        //5. Check if Two Strings are Anagrams:
        // Given two strings, determine if they are anagrams, meaning they contain the same characters in a different order.
        // For example, "listen" and "silent" are anagrams.
        String str1="listen";
        String str2="silent";
        int count=0;
        if (str1.length()==str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i)==str2.charAt(j)){
                        count++;
                    }
                    // check for duplicate counts of letters (if there are 2 or more same letters in the word)
                    if (i!=j && str1.charAt(i)==str1.charAt(j)){
                        count--;
                    }
                }
            }
        }

        if (count==str1.length() && count!=0){
            System.out.println("Words: '"+str1+"' & '" +str2+"' are anagrams. True");
        } else {
            System.out.println("They are NOT anagrams. False");
        }

    }
}
