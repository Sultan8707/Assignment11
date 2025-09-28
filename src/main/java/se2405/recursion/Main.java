package se2405.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial(5): " + Factorial.factorial(5));
        System.out.println("Fibonacci(7): " + Fibonacci.fib(7));
        System.out.println("GCD(24, 18): " + GCD.gcd(24, 18));
        System.out.println("Reverse(hello): " + ReverseString.reverse("hello"));
        System.out.println("Sum of digits(1234): " + SumOfDigits.sum(1234));
        System.out.println("Power(2, 5): " + Power.power(2, 5));
        System.out.println("Palindrome(kazak): " + Palindrome.isPalindrome("kazak", 0, 4));
        System.out.println("CountDigits(12345): " + CountDigits.count(12345));
        System.out.println("TowerOfHanoi(3):");
        TowerOfHanoi.solve(3, 'A', 'C', 'B');
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("BinarySearch(7): " + BinarySearch.search(arr, 7, 0, arr.length - 1));
    }
}
