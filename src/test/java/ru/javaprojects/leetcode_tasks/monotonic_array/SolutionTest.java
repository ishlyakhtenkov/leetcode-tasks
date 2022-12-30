package ru.javaprojects.leetcode_tasks.monotonic_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isMonotonicWhenTrue() {
        Solution solution = new Solution();
        assertTrue(solution.isMonotonic(new int[] {1,2,2,3}));
        assertTrue(solution.isMonotonic(new int[] {6,5,4,4}));
        assertTrue(solution.isMonotonic(new int[]{1, 1, 1}));
    }

    @Test
    void isMonotonicWhenFalse() {
        Solution solution = new Solution();
        assertFalse(solution.isMonotonic(new int[] {1,3,2}));
    }
}