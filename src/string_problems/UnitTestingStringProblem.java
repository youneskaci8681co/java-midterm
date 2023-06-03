package string_problems;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        testAnagram();
        testDetermineLargestWord();
        testDuplicateWord();
        testPalindrome();
        testPermutation();
    }

    public static void testAnagram() {
        String word1 = "CAT";
        String word2 = "ACT";
        boolean isAnagram = Anagram.isAnagram(word1, word2);
        System.out.println("Anagram Test:");
        System.out.println(word1 + " and " + word2 + " are anagrams: " + isAnagram);
        System.out.println();
    }

    public static void testDetermineLargestWord() {
        String sentence = "Human brain is a biological learning machine";
        System.out.println("Determine Largest Word Test:");
        System.out.println("Sentence: " + sentence);
        System.out.println("Result: " + DetermineLargestWord.findTheLargestWord(sentence));
        System.out.println();
    }

    public static void testDuplicateWord() {
        String sentence = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        System.out.println("Duplicate Word Test:");
        DuplicateWord.findDuplicateWords(sentence);
        System.out.println();
    }

    public static void testPalindrome() {
        String word1 = "MOM";
        String word2 = "HELLO";
        System.out.println("Palindrome Test:");
        System.out.println(word1 + " is a palindrome: " + Palindrome.isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + Palindrome.isPalindrome(word2));
        System.out.println();
    }

    public static void testPermutation() {
        String str = "ABC";
        System.out.println("Permutation Test:");
        System.out.println("String: " + str);
        System.out.println("Permutations: " + Permutation.computePermutations(str));
        System.out.println();
    }
}
