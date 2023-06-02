package string_problems;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {
        // Convert the strings to lowercase to make the comparison case-insensitive
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Convert the strings to char arrays and sort them
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String word1 = "CAT";
        String word2 = "ACT";
        System.out.println(isAnagram(word1, word2));  // true

        word1 = "ARMY";
        word2 = "MARY";
        System.out.println(isAnagram(word1, word2));  // true

        word1 = "FART";
        word2 = "RAFT";
        System.out.println(isAnagram(word1, word2));  // true
    }
}
