package Homework2;

public class E5 {
    public static void main(String[] args) {
        //5. Check if Two Strings are Anagrams:
        // Given two strings, determine if they are anagrams, meaning they contain the same characters in a different order.
        // For example, "listen" and "silent" are anagrams.


        String str1 = "listen_silent_SilSil10";
        String str2 = "silent_listen_LisLis01";

        // approach 1. the idea here is to count the unique letters and their number in string 1 and compare them with string 2
        boolean condition=false;
        if (str1.equals(str2)){
            condition=true;
        } else if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
               int letterCountStr1 = 0;
               int letterCountStr2 = 0;
               char letter=str1.toLowerCase().charAt(i);
               for (int j = 0; j < str2.length(); j++) {
                    // we find how many same letters we have in string1
                    if (str1.toLowerCase().charAt(i) == str1.toLowerCase().charAt(j)) {
                        letterCountStr1++;
                    }
                }
                // find how many duplicates of that letter we also have in string2
                for (int k = 0; k < str2.length(); k++) {
                    if (str2.toLowerCase().charAt(k)==letter){
                        letterCountStr2++;
                    }
                }
                // check if number of the letter is the same
                if (letterCountStr1==letterCountStr2){
                    condition=true;
                } else {
                    condition=false;
                    break;
                }
            }
        }
            if (condition) {
                System.out.println("Words: '" + str1 + "' & '" + str2 + "' are anagrams. True");
            } else {
                System.out.println("They are NOT anagrams. False");
            }


            // Approach 2 with more neat code and straight-forward logic:

            boolean cond=false;
            if (str1.length() == str2.length()) {
                String str2tmp=str2.toLowerCase();
                for (int i = 0; i < str1.length(); i++) {
                    char currentChar = str1.toLowerCase().charAt(i);
                    int indexInStr2 = str2tmp.indexOf(currentChar);
                       if (indexInStr2 >= 0) {
                       str2tmp = str2tmp.replaceFirst(String.valueOf(currentChar),"");
                    }
                }
                cond=str2tmp.isEmpty();
            }
            if (cond) {
                System.out.println("Words: '" + str1 + "' & '" + str2 + "' are anagrams. True");
            } else {
                System.out.println("They are NOT anagrams. False");
            }
        }
    }


