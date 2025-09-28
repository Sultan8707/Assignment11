package se2405.recursion;

/**
 * Performs recursive binary search.
 */
public class BinarySearch {
    public static int search(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return search(arr, target, left, mid - 1);
        return search(arr, target, mid + 1, right);
    }

    // Time: O(log n), Space: O(log n)
}
