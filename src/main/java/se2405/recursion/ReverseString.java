package se2405.recursion;

/**
 * Reverses string using recursion.
 */
public class ReverseString {
    public static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    // Time: O(n^2) (из-за substring), Space: O(n)
}
