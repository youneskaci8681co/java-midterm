package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String, Integer> wordOccurrences = findDuplicateWords(st);
        double averageLength = calculateAverageLength(st);

        // Print the duplicate words and their occurrences
        System.out.println("Duplicate Words and Occurrences:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            String word = entry.getKey();
            int occurrences = entry.getValue();
            System.out.println(word + ": " + occurrences);
        }

        // Print the average length of all the words
        System.out.println("Average Length of Words: " + averageLength);
    }

    public static Map<String, Integer> findDuplicateWords(String st) {
        Map<String, Integer> wordOccurrences = new HashMap<>();
        String[] words = st.split("\\s+");

        for (String word : words) {
            // Remove punctuation marks and convert to lowercase
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (wordOccurrences.containsKey(word)) {
                // If the word is already present, increment the count
                int count = wordOccurrences.get(word);
                wordOccurrences.put(word, count + 1);
            } else {
                // If the word is encountered for the first time, add it to the map
                wordOccurrences.put(word, 1);
            }
        }

        return wordOccurrences;
    }

    public static double calculateAverageLength(String st) {
        String[] words = st.split("\\s+");
        int totalLength = 0;

        for (String word : words) {
            // Remove punctuation marks
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            totalLength += word.length();
        }

        if (words.length > 0) {
            return (double) totalLength / words.length;
        } else {
            return 0;
        }
    }
}
