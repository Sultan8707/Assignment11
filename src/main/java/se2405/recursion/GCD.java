package se2405.recursion;

/**
 * Finds GCD using recursion.
 */
public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Time: O(log(min(a,b))), Space: O(log(min(a,b)))
}
