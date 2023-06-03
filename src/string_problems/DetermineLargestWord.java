package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        // Print the result
        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            int length = entry.getKey();
            String word = entry.getValue();
            System.out.println(length + ": " + word);
        }
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<>();

        // Split the sentence into individual words
        String[] words = wordGiven.split(" ");

        int maxLength = 0;

        // Iterate through each word to find the longest word
        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
            }
        }

        // Iterate through each word again to find all words with the longest length
        for (String word : words) {
            int length = word.length();
            if (length == maxLength) {
                map.put(length, word);
            }
        }

        return map;
    }
}
