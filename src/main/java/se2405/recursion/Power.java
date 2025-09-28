package se2405.recursion;

/**
 * Calculates power using recursion.
 */
public class Power {
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    // Time: O(b), Space: O(b)
}
