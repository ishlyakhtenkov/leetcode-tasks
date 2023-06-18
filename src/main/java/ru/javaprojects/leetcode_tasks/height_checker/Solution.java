package ru.javaprojects.leetcode_tasks.height_checker;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);
        int heightOrderMismatchCounter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                heightOrderMismatchCounter++;
            }
        }
        return heightOrderMismatchCounter;
    }
}
