package math_problems;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 40; // Number of Fibonacci numbers to generate
        printFibonacciNumbers(n);
    }

    public static void printFibonacciNumbers(int n) {
        long[] fib = new long[n];
        fib[0] = 0; // First Fibonacci number
        fib[1] = 1; // Second Fibonacci number

        // Generate Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
