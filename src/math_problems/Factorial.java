package math_problems;

public class
Factorial {

    public static void main(String[] args) {
        int number = 5;

        // Calculate factorial using recursion
        int factorialRecursive = calculateFactorialRecursive(number);
        System.out.println("Factorial (Recursive): " + factorialRecursive);

        // Calculate factorial using iteration
        int factorialIterative = calculateFactorialIterative(number);
        System.out.println("Factorial (Iterative): " + factorialIterative);
    }

    // Recursive method to calculate factorial
    public static int calculateFactorialRecursive(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorialRecursive(number - 1);
        }
    }

    // Iterative method to calculate factorial
    public static int calculateFactorialIterative(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
