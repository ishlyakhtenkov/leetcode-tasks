package ru.javaprojects.leetcode_tasks.missing_number;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
        }
        return nums[0] == 0 ? nums[nums.length - 1] + 1 : 0;
    }
}