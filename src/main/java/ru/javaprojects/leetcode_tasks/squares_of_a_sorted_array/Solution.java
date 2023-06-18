package ru.javaprojects.leetcode_tasks.squares_of_a_sorted_array;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];

        int positiveIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positiveIndex = i;
                break;
            }
        }

        if (positiveIndex == 0) {
            for (int i = 0; i < nums.length; i++) {
                squared[i] = nums[i] * nums[i];
            }
        } else if (positiveIndex == -1){
            for (int i = nums.length - 1; i >= 0; i--) {
                squared[squared.length - i - 1] = nums[i] * nums[i];
            }
        } else {
            int negativeIndex = positiveIndex - 1;
            for (int i = 0; i < squared.length; i++) {
                if (positiveIndex == nums.length) {
                    squared[i] = nums[negativeIndex] * nums[negativeIndex];
                    negativeIndex--;
                } else if (negativeIndex == -1) {
                    squared[i] = nums[positiveIndex] * nums[positiveIndex];
                    positiveIndex++;
                } else {
                    if (nums[positiveIndex] <= -nums[negativeIndex]) {
                        squared[i] = nums[positiveIndex] * nums[positiveIndex];
                        positiveIndex++;
                    } else {
                        squared[i] = nums[negativeIndex] * nums[negativeIndex];
                        negativeIndex--;
                    }
                }
            }
        }
        return squared;
    }
}
