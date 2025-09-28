package se2405.recursion;

/**
 * Generates Fibonacci numbers using recursion.
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Time: O(2^n), Space: O(n)
}
