package ru.javaprojects.leetcode_tasks.maximum_subarray;

public class Solution {

//    [-2,1,-3,4,-1,2,1,-5,4]

    public int maxSubArray(int[] nums) {
        int tempSum = nums[0];
        int max = tempSum;
        for (int i = 1; i < nums.length; i++) {
            if (tempSum < 0) {
                tempSum = nums[i];
            } else {
                tempSum += nums[i];
            }
            if (max < tempSum) {
                max = tempSum;
            }
        }
        return max;
    }
}