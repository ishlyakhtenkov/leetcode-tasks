package ru.javaprojects.leetcode_tasks.remove_element;

import java.util.Arrays;

class Solution {
    // 0 0 1 2 2 2 3 4

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        if (nums[0] == val && nums[nums.length - 1] == val) {
            return 0;
        }

        int firstValIndex = -1;
        int swapCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (firstValIndex == -1 && nums[i] == val) {
                firstValIndex = i;
            } else if (firstValIndex != -1 && nums[i] != val) {
                nums[firstValIndex + swapCounter] = nums[i];
                swapCounter++;
            }
        }
        if (firstValIndex == -1) {
            return nums.length;
        }
        return swapCounter == 0 ? firstValIndex : firstValIndex + swapCounter;
    }
}
