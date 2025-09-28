package se2405.recursion;

/**
 * Sums digits of a number using recursion.
 */
public class SumOfDigits {
    public static int sum(int n) {
        if (n == 0) return 0;
        return n % 10 + sum(n / 10);
    }

    // Time: O(log n), Space: O(log n)
}
