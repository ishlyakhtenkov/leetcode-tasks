package ru.javaprojects.leetcode_tasks.maximum_product_of_three_numbers;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int maxProductPos = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int maxProductPosAndNeg = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(maxProductPos, maxProductPosAndNeg);
    }
}