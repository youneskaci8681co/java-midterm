package string_problems;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = computePermutations(str);
        System.out.println(permutations);
    }

    public static List<String> computePermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str, 0, str.length() - 1, result);
        return result;
    }

    private static void permute(String str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(str);
            return;
        }

        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);
            permute(str, left + 1, right, result);
            str = swap(str, left, i); // backtrack
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

