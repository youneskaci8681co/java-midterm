
package math_problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        testLowestNumber();
    }

    public static void testLowestNumber() {
        int[] array = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        int expectedResult = 5;
        int actualResult = LowestNumber.findLowestNumber(array);

        if (actualResult == expectedResult) {
            System.out.println("LowestNumber test passed.");
        } else {
            System.out.println("LowestNumber test failed. Expected: " + expectedResult + ", Actual: " + actualResult);
        }
    }
}
