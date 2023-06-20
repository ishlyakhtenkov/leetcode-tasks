package ru.javaprojects.leetcode_tasks.xor_operation_in_an_array;

class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int xorResult = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xorResult = xorResult ^ nums[i];
        }
        return xorResult;
    }
}
