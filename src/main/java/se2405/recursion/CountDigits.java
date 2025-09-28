package se2405.recursion;

/**
 * Counts number of digits using recursion.
 */
public class CountDigits {
    public static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }

    // Time: O(log n), Space: O(log n)
}
