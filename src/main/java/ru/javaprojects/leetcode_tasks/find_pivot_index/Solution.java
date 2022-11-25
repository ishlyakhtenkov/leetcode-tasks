package ru.javaprojects.leetcode_tasks.find_pivot_index;

public class Solution {
    public int pivotIndex(int[] nums) {
        int previousIndexLeftSum = 0;
        int previousIndexRightSum = calculateRightSumForZeroIndex(nums);

        if (previousIndexLeftSum == previousIndexRightSum) {
            return 0;
        }

        for (int index = 1; index < nums.length; index++) {
            int indexLeftSum = previousIndexLeftSum + nums[index - 1];
            int indexRightSum = previousIndexRightSum - nums[index];
            if (indexLeftSum == indexRightSum) {
                return index;
            }
            previousIndexLeftSum = indexLeftSum;
            previousIndexRightSum = indexRightSum;
        }

        return -1;
    }

    private int calculateRightSumForZeroIndex(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}