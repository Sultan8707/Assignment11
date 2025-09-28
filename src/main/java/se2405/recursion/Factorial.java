package se2405.recursion;

/**
 * Calculates factorial using recursion.
 */
public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Time: O(n), Space: O(n)
}

