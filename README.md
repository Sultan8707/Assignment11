# Recursion Algorithms Project (SE-2405)

This project implements **10 classic recursive algorithms in Java**.  
The goal is to practice recursion, analyze time complexity, and document results.

---

## 📂 Implemented Algorithms

1. Factorial – `Factorial.java`
2. Fibonacci – `Fibonacci.java`
3. GCD (Euclidean algorithm) – `GCD.java`
4. Reverse String – `ReverseString.java`
5. Sum of Digits – `SumOfDigits.java`
6. Power (a^b) – `Power.java`
7. Palindrome Check – `Palindrome.java`
8. Count Digits – `CountDigits.java`
9. Tower of Hanoi – `TowerOfHanoi.java`
10. Binary Search – `BinarySearch.java`

A `Main.java` class demonstrates all algorithms.

---

## 🔬 Recurrence Analysis

### 1. Factorial
- Recurrence: **T(n) = T(n-1) + O(1)**
- Solution: **Θ(n)**, space Θ(n)

### 2. Fibonacci
- Recurrence: **T(n) = T(n-1) + T(n-2) + O(1)**
- Solution: **Θ(2^n)**, space Θ(n)

### 3. GCD
- Recurrence: **T(n) = T(n mod m) + O(1)**
- Solution: **Θ(log(min(a, b)))**

### 4. Reverse String
- Recurrence: **T(n) = T(n-1) + O(n)** (due to substring)
- Solution: **Θ(n²)**

### 5. Sum of Digits
- Recurrence: **T(n) = T(n/10) + O(1)**
- Solution: **Θ(log n)**

### 6. Power
- Recurrence: **T(b) = T(b-1) + O(1)**
- Solution: **Θ(b)**

### 7. Palindrome
- Recurrence: **T(n) = T(n-2) + O(1)**
- Solution: **Θ(n)**

### 8. Count Digits
- Recurrence: **T(n) = T(n/10) + O(1)**
- Solution: **Θ(log n)**

### 9. Tower of Hanoi
- Recurrence: **T(n) = 2T(n-1) + O(1)**
- Solution: **Θ(2^n)**

### 10. Binary Search
- Recurrence: **T(n) = T(n/2) + O(1)**
- Solution: **Θ(log n)**

---

## ▶️ Example Run

Factorial(5): 120
Fibonacci(7): 13
GCD(24, 18): 6
Reverse(hello): olleh
Sum of digits(1234): 10
Power(2, 5): 32
Palindrome(kazak): true
CountDigits(12345): 5
TowerOfHanoi(3):
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
BinarySearch(7): 3

---

## 📊 Summary

- Recursive algorithms were implemented correctly and tested.  
- Theoretical recurrence analysis matches observed behavior.  
- Depth of recursion is logarithmic for Binary Search and GCD, linear for Factorial/Palindrome, and exponential for Tower of Hanoi/Fibonacci.  
- Results confirm theory; differences are only in constant factors (e.g., substring overhead in ReverseString).  

---

## 🏆 Project Workflow

- Used GitHub commits per feature (see history).  
- Final release tagged as **v1.0**.  
- Report included in this README.md.  

---
