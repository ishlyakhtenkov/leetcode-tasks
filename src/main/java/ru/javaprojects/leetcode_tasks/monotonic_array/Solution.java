package ru.javaprojects.leetcode_tasks.monotonic_array;

class Solution {
    public boolean isMonotonic(int[] nums) {
        int increasingMark = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                if (increasingMark == 0) {
                    increasingMark = -1;
                } else if (increasingMark > 0) {
                    return false;
                }
            } else if (nums[i] > nums[i + 1]) {
                if (increasingMark == 0) {
                    increasingMark = 1;
                } else if (increasingMark < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
