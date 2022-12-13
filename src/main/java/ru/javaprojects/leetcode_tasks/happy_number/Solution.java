package ru.javaprojects.leetcode_tasks.happy_number;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (!numbers.contains(n)) {
            numbers.add(n);
            int digitsSquareSum = 0;
            while (n > 0) {
                digitsSquareSum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (digitsSquareSum == 1) {
                return true;
            }
            n = digitsSquareSum;
        }
        return false;
    }
}
