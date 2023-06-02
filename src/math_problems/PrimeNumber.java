package math_problems;

public class PrimeNumber {

    public static void printPrimeNumbers(int limit) {
        boolean[] isPrime = new boolean[limit + 1];

        // Initialize all elements as true
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Mark non-prime numbers
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print prime numbers
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 1000000;
        printPrimeNumbers(limit);
    }
}
