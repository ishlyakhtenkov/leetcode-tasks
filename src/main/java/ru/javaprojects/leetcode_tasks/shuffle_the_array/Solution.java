package ru.javaprojects.leetcode_tasks.shuffle_the_array;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int shuffledCursor = 0;
        for (int i = 0; i < n; i++) {
            shuffled[shuffledCursor++] = nums[i];
            shuffled[shuffledCursor++] = nums[i + n];
        }
        return shuffled;
    }
}
