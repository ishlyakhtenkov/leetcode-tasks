package ru.javaprojects.leetcode_tasks.sort_array_by_parity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortArrayByParity() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {2,4,1,3}, solution.sortArrayByParity(new int[] {3,1,2,4}));
        assertArrayEquals(new int[] {0}, solution.sortArrayByParity(new int[] {0}));
    }
}