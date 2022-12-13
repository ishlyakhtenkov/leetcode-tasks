package ru.javaprojects.leetcode_tasks.arranging_coins;

class Solution {
    public int arrangeCoins(int n) {
        int rowsNumber = 0;
        for (int i = 1; i <= n; i++) {
            n -= i;
            if (n >= 0) {
                rowsNumber++;
            }
        }
        return rowsNumber;
    }
}