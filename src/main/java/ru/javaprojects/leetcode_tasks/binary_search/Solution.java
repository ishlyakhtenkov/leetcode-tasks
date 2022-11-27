package ru.javaprojects.leetcode_tasks.binary_search;

class Solution {
    // -1 0 3 5 9 12

    public int search(int[] nums, int target) {
        int upperBorder = nums.length;
        int lowerBorder = 0;
        while (true) {
            int index = (upperBorder + lowerBorder) / 2;
            if (target == nums[index]) {
                return index;
            }
            if (index == upperBorder || index == lowerBorder) {
                return -1;
            } else if (target > nums[index]) {
                lowerBorder = index;
            } else {
                upperBorder = index;
            }
        }
    }
}
