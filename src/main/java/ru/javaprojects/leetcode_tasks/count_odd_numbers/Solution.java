package ru.javaprojects.leetcode_tasks.count_odd_numbers;

public class Solution {
    public int countOdds(int low, int high) {
        int interval = (high - low);
        if (low % 2 != 0 || high % 2 != 0) {
            return interval / 2 + 1;
        }
        return interval / 2;
    }
}
