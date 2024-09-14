package Homework2;

public class E5 {
    public static void main(String[] args) {
        //5. Check if Two Strings are Anagrams:
        // Given two strings, determine if they are anagrams, meaning they contain the same characters in a different order.
        // For example, "listen" and "silent" are anagrams.

        // another much better approach below

        String str1 = "listen_silent_silsil";
        String str2 = "silent_listen_lislis";
        int count = 0;
        int doubeLetterCountStr1 = 0;
        int doubeLetterCountStr2 = 0;
        if (str1.length() == str2.length()) {
            int sum1=0;
            int sum2=0;
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                    }
                    // check for duplicate counts of letters (if there are 2 or more same letters in the word)
                    // this solution works for strings that have many double/treble letters and that are not the same in both strings
                    if (i != j && str1.charAt(i) == str1.charAt(j)) {
                        count--;
                        doubeLetterCountStr1++;
                    }
                    if (i != j && str2.charAt(i) == str2.charAt(j)) {
                        doubeLetterCountStr2++;
                    }
                }
            }
            System.out.println(sum1);
            System.out.println(sum2);
            if (count == str1.length() && count != 0 && doubeLetterCountStr1 == doubeLetterCountStr2) {
                System.out.println("Words: '" + str1 + "' & '" + str2 + "' are anagrams. True");
            } else {
                System.out.println("They are NOT anagrams. False");
            }


            // Another option with more neat code and straight-forward logic:

            boolean cond=false;
            if (str1.length() == str2.length()) {
                String str2tmp=str2;
                for (int i = 0; i < str1.length(); i++) {
                    char currentChar = str1.charAt(i);
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
        }

