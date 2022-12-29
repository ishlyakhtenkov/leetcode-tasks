package ru.javaprojects.leetcode_tasks.max_consecutive_ones;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempMax++;
            } else {
                if (tempMax > max) {
                    max = tempMax;
                }
                tempMax = 0;
            }
        }
        if (tempMax > max) {
            max = tempMax;
        }
        return max;
    }
}
