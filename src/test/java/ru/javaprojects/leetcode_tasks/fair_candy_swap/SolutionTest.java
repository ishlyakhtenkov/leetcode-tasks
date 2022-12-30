package ru.javaprojects.leetcode_tasks.fair_candy_swap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fairCandySwap() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1, 2}, solution.fairCandySwap(new int[] {1, 1}, new int[] {2, 2}));
        assertArrayEquals(new int[] {1, 2}, solution.fairCandySwap(new int[] {1, 2}, new int[] {2, 3}));
        assertArrayEquals(new int[] {2, 3}, solution.fairCandySwap(new int[] {2}, new int[] {1, 3}));
    }
}