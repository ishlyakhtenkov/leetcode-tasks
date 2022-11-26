package ru.javaprojects.leetcode_tasks.number_of_1_bits;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}