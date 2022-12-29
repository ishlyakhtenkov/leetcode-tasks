package ru.javaprojects.leetcode_tasks.maximum_average_subarray_I;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = -Double.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i + k <= nums.length) {
                int subArraySum = 0;
                for (int j = 0; j < k; j++) {
                    subArraySum += nums[i + j];
                }
                double average = ((double) subArraySum) / k;
                if (average > maxAverage) {
                    maxAverage = average;
                }
            }
        }
        return maxAverage;
    }
}