package math_problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        int lowestNumber = findLowestNumber(array1, array2);
        System.out.println("The lowest number not shared between the arrays is: " + lowestNumber);
    }

    public static int findLowestNumber(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                return array1[i];
            } else if (array1[i] > array2[j]) {
                return array2[j];
            } else {
                i++;
                j++;
            }
        }

        // If all elements are shared, return the lowest element from either array
        if (i == array1.length) {
            return array2[0];
        } else {
            return array1[0];
        }
    }
}
