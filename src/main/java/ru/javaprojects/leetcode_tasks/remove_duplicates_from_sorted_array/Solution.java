package ru.javaprojects.leetcode_tasks.remove_duplicates_from_sorted_array;

class Solution {
    // 1 1 1 2 2 4

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int iterNumber = nums.length;
        for (int i = 1; i < iterNumber; ) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                iterNumber--;
            } else {
                i++;
            }
        }
        return iterNumber;
    }
}