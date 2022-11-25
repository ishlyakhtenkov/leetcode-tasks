package ru.javaprojects.leetcode_tasks.find_pivot_index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pivotIndex() {
        Solution solution = new Solution();
        assertEquals(3, solution.pivotIndex(new int[] {1,7,3,6,5,6}));
        assertEquals(-1, solution.pivotIndex(new int[] {1, 2, 3}));
        assertEquals(0, solution.pivotIndex(new int[] {1}));
    }
}