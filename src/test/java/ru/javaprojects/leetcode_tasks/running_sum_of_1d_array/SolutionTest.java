package ru.javaprojects.leetcode_tasks.running_sum_of_1d_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void runningSum() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1,3,6,10}, solution.runningSum(new int[] {1,2,3,4}));
        assertArrayEquals(new int[] {1,2,3,4,5}, solution.runningSum(new int[] {1,1,1,1,1}));
        assertArrayEquals(new int[] {3,4,6,16,17}, solution.runningSum(new int[] {3,1,2,10,1}));
    }
}