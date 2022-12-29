package ru.javaprojects.leetcode_tasks.maximum_average_subarray_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMaxAverage() {
        Solution solution = new Solution();
        assertEquals(12.75000, solution.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        assertEquals(5.00000, solution.findMaxAverage(new int[] {5}, 1));
        assertEquals(-1.00000, solution.findMaxAverage(new int[] {-1}, 1));
    }
}