package string_problems;

public class Palindrome {

    public static void main(String[] args) {
        String word1 = "MOM";
        System.out.println(isPalindrome(word1));  // true

        String word2 = "DAD";
        System.out.println(isPalindrome(word2));  // true

        String word3 = "MADAM";
        System.out.println(isPalindrome(word3));  // true

        String word4 = "RACECAR";
        System.out.println(isPalindrome(word4));  // true

        String word5 = "HELLO";
        System.out.println(isPalindrome(word5));  // false
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

