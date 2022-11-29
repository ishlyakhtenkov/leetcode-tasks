package ru.javaprojects.leetcode_tasks.plus_one;

class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    return digits;
                }
            }
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            return newArray;
        }
    }
}
