package ru.javaprojects.leetcode_tasks.search_insert_position;

import java.util.Arrays;

class Solution {
    //  1 3 5 6 7 9

    public int searchInsert(int[] nums, int target) {
//        int i = Arrays.binarySearch(nums, target);
//        return i >= 0 ? i : Math.abs(i) - 1;
        int upperBorder = nums.length - 1;
        int lowerBorder = 0;
        int index = -1;
        while (upperBorder >= lowerBorder) {
            index = (upperBorder + lowerBorder) / 2;
            if (nums[index] == target) {
                return index;
            } else if (target > nums[index]) {
                lowerBorder = index + 1;
            } else {
                upperBorder = index - 1;
            }
        }
        if (lowerBorder == 0) {
            return 0;
        }
        if (target < nums[index]) {
            return index;
        } else {
            return index + 1;
        }
    }
}