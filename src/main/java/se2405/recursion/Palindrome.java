package se2405.recursion;

/**
 * Checks if string is palindrome using recursion.
 */
public class Palindrome {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    // Time: O(n), Space: O(n)
}

